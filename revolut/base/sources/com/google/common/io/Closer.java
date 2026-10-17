package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Closer implements Closeable {
    private static final Suppressor SUPPRESSING_SUPPRESSOR = new a();
    private final Deque<Closeable> stack = new ArrayDeque(4);

    @VisibleForTesting
    final Suppressor suppressor;
    private Throwable thrown;

    @VisibleForTesting
    public interface Suppressor {
        void suppress(Closeable closeable, Throwable th10, Throwable th11);
    }

    @VisibleForTesting
    public Closer(Suppressor suppressor) {
        this.suppressor = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    public static Closer create() {
        return new Closer(SUPPRESSING_SUPPRESSOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Closeable closeable, Throwable th10, Throwable th11) {
        if (th10 == th11) {
            return;
        }
        try {
            th10.addSuppressed(th11);
        } catch (Throwable unused) {
            Closeables.logger.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th10 = this.thrown;
        while (!this.stack.isEmpty()) {
            Closeable closeableRemoveFirst = this.stack.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th11) {
                if (th10 == null) {
                    th10 = th11;
                } else {
                    this.suppressor.suppress(closeableRemoveFirst, th10, th11);
                }
            }
        }
        if (this.thrown != null || th10 == null) {
            return;
        }
        Throwables.throwIfInstanceOf(th10, IOException.class);
        Throwables.throwIfUnchecked(th10);
        throw new AssertionError(th10);
    }

    @ParametricNullness
    public <C extends Closeable> C register(@ParametricNullness C c2) {
        if (c2 != null) {
            this.stack.addFirst(c2);
        }
        return c2;
    }

    public RuntimeException rethrow(Throwable th10) throws Throwable {
        Preconditions.checkNotNull(th10);
        this.thrown = th10;
        Throwables.throwIfInstanceOf(th10, IOException.class);
        Throwables.throwIfUnchecked(th10);
        throw new RuntimeException(th10);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th10, Class<X> cls) throws Exception {
        Preconditions.checkNotNull(th10);
        this.thrown = th10;
        Throwables.throwIfInstanceOf(th10, IOException.class);
        Throwables.throwIfInstanceOf(th10, cls);
        Throwables.throwIfUnchecked(th10);
        throw new RuntimeException(th10);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th10, Class<X1> cls, Class<X2> cls2) throws Exception {
        Preconditions.checkNotNull(th10);
        this.thrown = th10;
        Throwables.throwIfInstanceOf(th10, IOException.class);
        Throwables.throwIfInstanceOf(th10, cls);
        Throwables.throwIfInstanceOf(th10, cls2);
        Throwables.throwIfUnchecked(th10);
        throw new RuntimeException(th10);
    }
}
