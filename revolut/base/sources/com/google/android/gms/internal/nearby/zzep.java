package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzep {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzer f45142zza = new zzer(null);

    public final zzep zza(DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        this.f45142zza.f45144zzb = diagnosisKeysDataMapping;
        return this;
    }

    public final zzep zzb(IStatusCallback iStatusCallback) {
        this.f45142zza.f45143zza = iStatusCallback;
        return this;
    }

    public final zzer zzc() {
        return this.f45142zza;
    }
}
