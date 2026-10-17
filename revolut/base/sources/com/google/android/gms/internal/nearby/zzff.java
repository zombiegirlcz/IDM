package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzff {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Class f45156zza;

    public zzff(GoogleApi googleApi, Api.ApiOptions apiOptions) {
        this.f45156zza = googleApi.getClass();
    }

    public final boolean equals(Object obj2) {
        return obj2 != null && (obj2 instanceof zzff) && Objects.equal(this.f45156zza, ((zzff) obj2).f45156zza) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45156zza, null);
    }
}
