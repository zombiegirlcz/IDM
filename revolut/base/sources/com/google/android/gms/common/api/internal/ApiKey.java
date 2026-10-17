package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Api f37749zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Api.ApiOptions f37750zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final String f37751zad;

    private ApiKey(Api api2, Api.ApiOptions apiOptions, String str) {
        this.f37749zab = api2;
        this.f37750zac = apiOptions;
        this.f37751zad = str;
        this.zaa = Objects.hashCode(api2, apiOptions, str);
    }

    @NonNull
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@NonNull Api<O> api2, O o, String str) {
        return new ApiKey<>(api2, o, str);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj2;
        return Objects.equal(this.f37749zab, apiKey.f37749zab) && Objects.equal(this.f37750zac, apiKey.f37750zac) && Objects.equal(this.f37751zad, apiKey.f37751zad);
    }

    public final int hashCode() {
        return this.zaa;
    }

    @NonNull
    public final String zaa() {
        return this.f37749zab.zad();
    }
}
