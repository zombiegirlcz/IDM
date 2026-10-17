package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes16.dex */
public class Response<T extends Result> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Result f37741zza;

    public Response() {
    }

    @NonNull
    public T getResult() {
        return (T) this.f37741zza;
    }

    public void setResult(@NonNull T t2) {
        this.f37741zza = t2;
    }

    public Response(@NonNull T t2) {
        this.f37741zza = t2;
    }
}
