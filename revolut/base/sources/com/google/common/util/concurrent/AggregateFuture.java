package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    private static final LazyLogger logger = new LazyLogger(AggregateFuture.class);
    private final boolean allMustSucceed;
    private final boolean collectsValues;
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AggregateFuture(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z3) {
        super(immutableCollection.size());
        this.futures = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.allMustSucceed = z;
        this.collectsValues = z3;
    }

    private static boolean addCausalChain(Set<Throwable> set, Throwable th10) {
        while (th10 != null) {
            if (!set.add(th10)) {
                return false;
            }
            th10 = th10.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int i, Future<? extends InputT> future) {
        try {
            collectOneValue(i, Uninterruptibles.getUninterruptibly(future));
        } catch (ExecutionException e) {
            handleException(e.getCause());
        } catch (Throwable th10) {
            handleException(th10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decrementCountAndMaybeComplete, reason: merged with bridge method [inline-methods] */
    public void lambda$init$1(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        int iDecrementRemainingAndGet = decrementRemainingAndGet();
        Preconditions.checkState(iDecrementRemainingAndGet >= 0, "Less than 0 remaining futures");
        if (iDecrementRemainingAndGet == 0) {
            processCompleted(immutableCollection);
        }
    }

    private void handleException(Throwable th10) {
        Preconditions.checkNotNull(th10);
        if (this.allMustSucceed && !setException(th10) && addCausalChain(getOrInitSeenExceptions(), th10)) {
            log(th10);
        } else if (th10 instanceof Error) {
            log(th10);
        }
    }

    private static void log(Throwable th10) {
        logger.get().log(Level.SEVERE, th10 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processAllMustSucceedDoneFuture, reason: merged with bridge method [inline-methods] */
    public void lambda$init$0(int i, ListenableFuture<? extends InputT> listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i, listenableFuture);
            }
            lambda$init$1(null);
        } catch (Throwable th10) {
            lambda$init$1(null);
            throw th10;
        }
    }

    private void processCompleted(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator<? extends Future<? extends InputT>> it8 = immutableCollection.iterator();
            int i = 0;
            while (it8.hasNext()) {
                Future<? extends InputT> next = it8.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i, next);
                }
                i++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    public final void addInitialException(Set<Throwable> set) {
        Preconditions.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thTryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
        Objects.requireNonNull(thTryInternalFastPathGetFailure);
        addCausalChain(set, thTryInternalFastPathGetFailure);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        super.afterDone();
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        releaseResources(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zWasInterrupted = wasInterrupted();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it8 = immutableCollection.iterator();
            while (it8.hasNext()) {
                it8.next().cancel(zWasInterrupted);
            }
        }
    }

    public abstract void collectOneValue(int i, @ParametricNullness InputT inputt);

    public abstract void handleAllCompleted();

    public final void init() {
        Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
            return;
        }
        if (!this.allMustSucceed) {
            ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.collectsValues ? this.futures : null;
            h hVar = new h(this, immutableCollection, 0);
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it8 = this.futures.iterator();
            while (it8.hasNext()) {
                ListenableFuture<? extends InputT> next = it8.next();
                if (next.isDone()) {
                    lambda$init$1(immutableCollection);
                } else {
                    next.addListener(hVar, MoreExecutors.directExecutor());
                }
            }
            return;
        }
        UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it9 = this.futures.iterator();
        int i = 0;
        while (it9.hasNext()) {
            ListenableFuture<? extends InputT> next2 = it9.next();
            int i2 = i + 1;
            if (next2.isDone()) {
                lambda$init$0(i, next2);
            } else {
                next2.addListener(new g(this, i, next2), MoreExecutors.directExecutor());
            }
            i = i2;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        if (immutableCollection == null) {
            return super.pendingToString();
        }
        return "futures=" + immutableCollection;
    }

    public void releaseResources(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.futures = null;
    }
}
