package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes16.dex */
final class zzat extends zzcu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ DiagnosisKeyFileProvider f45090zza;

    public zzat(zzax zzaxVar, DiagnosisKeyFileProvider diagnosisKeyFileProvider) {
        this.f45090zza = diagnosisKeyFileProvider;
    }

    @Override // com.google.android.gms.internal.nearby.zzcv
    public final ParcelFileDescriptor zzb() {
        try {
            return ParcelFileDescriptor.open(this.f45090zza.zza(), 268435456);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzcv
    public final boolean zzc() {
        return this.f45090zza.zzb();
    }
}
