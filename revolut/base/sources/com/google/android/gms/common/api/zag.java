package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes16.dex */
final class zag<R extends Result> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final Result f37963zae;

    public zag(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.f37963zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.f37963zae;
    }
}
