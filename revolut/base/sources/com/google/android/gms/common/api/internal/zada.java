package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final WeakReference f37926zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final zacz f37927zah;
    private ResultTransform zaa = null;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private zada f37921zab = null;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private volatile ResultCallbacks f37922zac = null;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private PendingResult f37923zad = null;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final Object f37924zae = new Object();

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private Status f37925zaf = null;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private boolean f37928zai = false;

    public zada(WeakReference weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.f37926zag = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
        this.f37927zah = new zacz(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaj(Status status) {
        synchronized (this.f37924zae) {
            this.f37925zaf = status;
            zal(status);
        }
    }

    private final void zak() {
        if (this.zaa == null && this.f37922zac == null) {
            return;
        }
        GoogleApiClient googleApiClient = (GoogleApiClient) this.f37926zag.get();
        if (!this.f37928zai && this.zaa != null && googleApiClient != null) {
            googleApiClient.zao(this);
            this.f37928zai = true;
        }
        Status status = this.f37925zaf;
        if (status != null) {
            zal(status);
            return;
        }
        PendingResult pendingResult = this.f37923zad;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    private final void zal(Status status) {
        synchronized (this.f37924zae) {
            try {
                ResultTransform resultTransform = this.zaa;
                if (resultTransform != null) {
                    ((zada) Preconditions.checkNotNull(this.f37921zab)).zaj((Status) Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
                } else if (zam()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.f37922zac)).onFailure(status);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private final boolean zam() {
        return (this.f37922zac == null || ((GoogleApiClient) this.f37926zag.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zan(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.f37924zae) {
            Preconditions.checkState(this.f37922zac == null, "Cannot call andFinally() twice.");
            Preconditions.checkState(this.zaa == null, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f37922zac = resultCallbacks;
            zak();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result) {
        synchronized (this.f37924zae) {
            try {
                if (!result.getStatus().isSuccess()) {
                    zaj(result.getStatus());
                    zan(result);
                } else if (this.zaa != null) {
                    zaco.zaa().submit(new zacy(this, result));
                } else if (zam()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.f37922zac)).onSuccess(result);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zada zadaVar;
        synchronized (this.f37924zae) {
            Preconditions.checkState(this.zaa == null, "Cannot call then() twice.");
            Preconditions.checkState(this.f37922zac == null, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zaa = resultTransform;
            zadaVar = new zada(this.f37926zag);
            this.f37921zab = zadaVar;
            zak();
        }
        return zadaVar;
    }

    public final void zah() {
        this.f37922zac = null;
    }

    public final void zai(PendingResult pendingResult) {
        synchronized (this.f37924zae) {
            this.f37923zad = pendingResult;
            zak();
        }
    }
}
