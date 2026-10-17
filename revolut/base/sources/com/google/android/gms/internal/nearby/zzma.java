package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzma {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzmc f45437zza = new zzmc(null);

    public final zzma zza(byte[] bArr) {
        this.f45437zza.f45440zzc = bArr;
        return this;
    }

    public final zzma zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.f45437zza.f45441zzd = parcelFileDescriptor;
        return this;
    }

    public final zzma zzc(String str) {
        this.f45437zza.zzm = str;
        return this;
    }

    public final zzma zzd(long j2) {
        this.f45437zza.f45438zza = j2;
        return this;
    }

    public final zzma zze(boolean z) {
        this.f45437zza.f45447zzj = z;
        return this;
    }

    public final zzma zzf(String str) {
        this.f45437zza.f45442zze = str;
        return this;
    }

    public final zzma zzg(long j2) {
        this.f45437zza.f45443zzf = j2;
        return this;
    }

    public final zzma zzh(long j2) {
        this.f45437zza.f45446zzi = j2;
        return this;
    }

    public final zzma zzi(String str) {
        this.f45437zza.zzn = str;
        return this;
    }

    public final zzma zzj(long j2) {
        this.f45437zza.f45449zzl = 0L;
        return this;
    }

    public final zzma zzk(zzly zzlyVar) {
        this.f45437zza.f45448zzk = zzlyVar;
        return this;
    }

    public final zzma zzl(ParcelFileDescriptor parcelFileDescriptor) {
        this.f45437zza.f45444zzg = parcelFileDescriptor;
        return this;
    }

    public final zzma zzm(int i) {
        this.f45437zza.f45439zzb = i;
        return this;
    }

    public final zzmc zzn() {
        return this.f45437zza;
    }
}
