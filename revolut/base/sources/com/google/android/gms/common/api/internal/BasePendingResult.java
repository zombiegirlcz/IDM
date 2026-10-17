package com.google.android.gms.common.api.internal;

import a0.d;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal zaa = new zaq();

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    public static final /* synthetic */ int f37758zad = 0;

    @KeepName
    private zas resultGuardian;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @NonNull
    protected final CallbackHandler f37759zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @NonNull
    protected final WeakReference f37760zac;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final Object f37761zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final CountDownLatch f37762zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final ArrayList f37763zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private ResultCallback f37764zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final AtomicReference f37765zai;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private Result f37766zaj;
    private Status zak;

    /* JADX INFO: renamed from: zal, reason: collision with root package name */
    private volatile boolean f37767zal;

    /* JADX INFO: renamed from: zam, reason: collision with root package name */
    private boolean f37768zam;
    private boolean zan;
    private ICancelToken zao;
    private volatile zada zap;
    private boolean zaq;

    @Deprecated
    public BasePendingResult() {
        this.f37761zae = new Object();
        this.f37762zaf = new CountDownLatch(1);
        this.f37763zag = new ArrayList();
        this.f37765zai = new AtomicReference();
        this.zaq = false;
        this.f37759zab = new CallbackHandler(Looper.getMainLooper());
        this.f37760zac = new WeakReference(null);
    }

    private final Result zaa() {
        Result result;
        synchronized (this.f37761zae) {
            Preconditions.checkState(!this.f37767zal, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            result = this.f37766zaj;
            this.f37766zaj = null;
            this.f37764zah = null;
            this.f37767zal = true;
        }
        zadb zadbVar = (zadb) this.f37765zai.getAndSet(null);
        if (zadbVar != null) {
            zadbVar.zaa.f37929zab.remove(this);
        }
        return (Result) Preconditions.checkNotNull(result);
    }

    private final void zab(Result result) {
        this.f37766zaj = result;
        this.zak = result.getStatus();
        zar zarVar = null;
        this.zao = null;
        this.f37762zaf.countDown();
        if (this.f37768zam) {
            this.f37764zah = null;
        } else {
            ResultCallback resultCallback = this.f37764zah;
            if (resultCallback != null) {
                this.f37759zab.removeMessages(2);
                this.f37759zab.zaa(resultCallback, zaa());
            } else if (this.f37766zaj instanceof Releasable) {
                this.resultGuardian = new zas(this, zarVar);
            }
        }
        ArrayList arrayList = this.f37763zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PendingResult.StatusListener) arrayList.get(i)).onComplete(this.zak);
        }
        this.f37763zag.clear();
    }

    public static void zal(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.f37761zae) {
            try {
                if (isReady()) {
                    statusListener.onComplete(this.zak);
                } else {
                    this.f37763zag.add(statusListener);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        Preconditions.checkState(!this.f37767zal, "Result has already been consumed");
        Preconditions.checkState(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.f37762zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.f37761zae) {
            if (!this.f37768zam && !this.f37767zal) {
                ICancelToken iCancelToken = this.zao;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.f37766zaj);
                this.f37768zam = true;
                zab(createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public abstract R createFailedResult(@NonNull Status status);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status) {
        synchronized (this.f37761zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.f37761zae) {
            z = this.f37768zam;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.f37762zaf.getCount() == 0;
    }

    @KeepForSdk
    public final void setCancelToken(@NonNull ICancelToken iCancelToken) {
        synchronized (this.f37761zae) {
            this.zao = iCancelToken;
        }
    }

    @KeepForSdk
    public final void setResult(@NonNull R r2) {
        synchronized (this.f37761zae) {
            try {
                if (this.zan || this.f37768zam) {
                    zal(r2);
                    return;
                }
                isReady();
                Preconditions.checkState(!isReady(), "Results have already been set");
                Preconditions.checkState(!this.f37767zal, "Result has already been consumed");
                zab(r2);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        synchronized (this.f37761zae) {
            try {
                if (resultCallback == null) {
                    this.f37764zah = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.f37767zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f37759zab.zaa(resultCallback, zaa());
                } else {
                    this.f37764zah = resultCallback;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> transformedResultThen;
        Preconditions.checkState(!this.f37767zal, "Result has already been consumed.");
        synchronized (this.f37761zae) {
            try {
                Preconditions.checkState(this.zap == null, "Cannot call then() twice.");
                Preconditions.checkState(this.f37764zah == null, "Cannot call then() if callbacks are set.");
                Preconditions.checkState(!this.f37768zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new zada(this.f37760zac);
                transformedResultThen = this.zap.then(resultTransform);
                if (isReady()) {
                    this.f37759zab.zaa(this.zap, zaa());
                } else {
                    this.f37764zah = this.zap;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return transformedResultThen;
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.f37761zae) {
            try {
                if (((GoogleApiClient) this.f37760zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zIsCanceled;
    }

    public final void zan(zadb zadbVar) {
        this.f37765zai.set(zadbVar);
    }

    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                } else {
                    d.n("Don't know how to handle message: ", i);
                    new Exception();
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.onResult(result);
            } catch (RuntimeException e) {
                BasePendingResult.zal(result);
                throw e;
            }
        }

        public final void zaa(@NonNull ResultCallback resultCallback, @NonNull Result result) {
            int i = BasePendingResult.f37758zad;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), result)));
        }

        public CallbackHandler(@NonNull Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(@NonNull Looper looper) {
        this.f37761zae = new Object();
        this.f37762zaf = new CountDownLatch(1);
        this.f37763zag = new ArrayList();
        this.f37765zai = new AtomicReference();
        this.zaq = false;
        this.f37759zab = new CallbackHandler(looper);
        this.f37760zac = new WeakReference(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await(long j2, @NonNull TimeUnit timeUnit) {
        if (j2 > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.checkState(!this.f37767zal, "Result has already been consumed.");
        Preconditions.checkState(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.f37762zaf.await(j2, timeUnit)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@NonNull ResultCallback<? super R> resultCallback, long j2, @NonNull TimeUnit timeUnit) {
        synchronized (this.f37761zae) {
            try {
                if (resultCallback == null) {
                    this.f37764zah = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.f37767zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f37759zab.zaa(resultCallback, zaa());
                } else {
                    this.f37764zah = resultCallback;
                    CallbackHandler callbackHandler = this.f37759zab;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j2));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.f37761zae = new Object();
        this.f37762zaf = new CountDownLatch(1);
        this.f37763zag = new ArrayList();
        this.f37765zai = new AtomicReference();
        this.zaq = false;
        this.f37759zab = new CallbackHandler(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.f37760zac = new WeakReference(googleApiClient);
    }

    @KeepForSdk
    public BasePendingResult(@NonNull CallbackHandler<R> callbackHandler) {
        this.f37761zae = new Object();
        this.f37762zaf = new CountDownLatch(1);
        this.f37763zag = new ArrayList();
        this.f37765zai = new AtomicReference();
        this.zaq = false;
        this.f37759zab = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.f37760zac = new WeakReference(null);
    }
}
