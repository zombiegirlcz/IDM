package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzed {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzef f45130zza = new zzef(null);

    public final zzed zza(zzcv zzcvVar) {
        this.f45130zza.f45136zzf = zzcvVar;
        return this;
    }

    public final zzed zzb(ExposureConfiguration exposureConfiguration) {
        this.f45130zza.f45134zzd = exposureConfiguration;
        return this;
    }

    public final zzed zzc(List list) {
        this.f45130zza.f45133zzc = list;
        return this;
    }

    public final zzed zzd(IStatusCallback iStatusCallback) {
        this.f45130zza.f45132zzb = iStatusCallback;
        return this;
    }

    public final zzed zze(String str) {
        this.f45130zza.f45135zze = str;
        return this;
    }

    public final zzef zzf() {
        return this.f45130zza;
    }
}
