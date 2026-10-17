package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zzur;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class UwbAddress {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzur f48245zza = zzur.zzh().zze(":", 2);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte[] f48246zzb;

    public UwbAddress(@NonNull byte[] bArr) {
        this.f48246zzb = bArr;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof UwbAddress) {
            return Arrays.equals(this.f48246zzb, ((UwbAddress) obj2).f48246zzb);
        }
        return false;
    }

    @NonNull
    public byte[] getAddress() {
        return this.f48246zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f48246zzb);
    }

    @NonNull
    public String toString() {
        zzur zzurVar = f48245zza;
        byte[] bArr = this.f48246zzb;
        return zzurVar.zzi(bArr, 0, bArr.length);
    }

    public UwbAddress(@NonNull String str) {
        this.f48246zzb = f48245zza.zzj(str);
    }
}
