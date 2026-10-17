package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzlk extends zzkv {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final /* synthetic */ int f40418zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Logger f40419zzc = Logger.getLogger(zzlk.class.getName());

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final boolean f40420zzd = zzol.zzx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    zzll f40421zza;

    private zzlk() {
        throw null;
    }

    public static int zzA(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i, zznh zznhVar, zzns zznsVar) {
        int iZzz = zzz(i << 3);
        return ((zzko) zznhVar).zzca(zznsVar) + iZzz + iZzz;
    }

    public static int zzx(zznh zznhVar, zzns zznsVar) {
        int iZzca = ((zzko) zznhVar).zzca(zznsVar);
        return zzz(iZzca) + iZzca;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzoo.zzc(str);
        } catch (zzon unused) {
            length = str.getBytes(zzmk.f40465zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzon zzonVar) throws IOException {
        f40419zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzonVar);
        byte[] bytes = str.getBytes(zzmk.f40465zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b4) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzld zzldVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j2) throws IOException;

    public abstract void zzi(long j2) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, zznh zznhVar, zzns zznsVar) throws IOException;

    public abstract void zzn(int i, zznh zznhVar) throws IOException;

    public abstract void zzo(int i, zzld zzldVar) throws IOException;

    public abstract void zzp(int i, String str) throws IOException;

    public abstract void zzr(int i, int i2) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i) throws IOException;

    public abstract void zzu(int i, long j2) throws IOException;

    public abstract void zzv(long j2) throws IOException;

    public /* synthetic */ zzlk(zzlj zzljVar) {
    }
}
