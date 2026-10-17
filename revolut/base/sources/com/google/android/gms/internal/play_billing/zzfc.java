package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzfc extends zzem {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final /* synthetic */ int f45984zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final boolean f45985zzc = zzii.zzx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object f45986zza;

    private zzfc() {
        throw null;
    }

    public static int zzx(zzhb zzhbVar) {
        int iZzn = zzhbVar.zzn();
        return zzy(iZzn) + iZzn;
    }

    public static int zzy(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzz(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b4) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzf(int i, zzev zzevVar) throws IOException;

    public abstract void zzg(zzev zzevVar) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j2) throws IOException;

    public abstract void zzk(long j2) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(zzhb zzhbVar) throws IOException;

    public abstract void zzo(int i, zzhb zzhbVar) throws IOException;

    public abstract void zzp(int i, zzev zzevVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzr(String str) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i, int i2) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j2) throws IOException;

    public abstract void zzw(long j2) throws IOException;

    public /* synthetic */ zzfc(zzfb zzfbVar) {
    }
}
