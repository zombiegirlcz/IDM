package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes16.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final Result f37962zae;

    public zaf(Result result) {
        super(Looper.getMainLooper());
        this.f37962zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.f37962zae.getStatus().getStatusCode()) {
            return (R) this.f37962zae;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
