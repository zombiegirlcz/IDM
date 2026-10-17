package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdk
public final class AuthProxyOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final AuthProxyOptions f37300zza = new AuthProxyOptions(new Bundle(), null);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Bundle f37301zzb;

    public /* synthetic */ AuthProxyOptions(Bundle bundle, zzb zzbVar) {
        this.f37301zzb = bundle;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof AuthProxyOptions) {
            return Objects.checkBundlesEquality(this.f37301zzb, ((AuthProxyOptions) obj2).f37301zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37301zzb);
    }

    @NonNull
    public final Bundle zza() {
        return new Bundle(this.f37301zzb);
    }
}
