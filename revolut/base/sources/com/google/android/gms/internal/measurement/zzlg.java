package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public class zzlg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f40413zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile int f40414zzb = 100;

    public /* synthetic */ zzlg(zzlf zzlfVar) {
    }

    public static int zzb(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzc(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }
}
