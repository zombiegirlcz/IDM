package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzhj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final boolean f39129zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Unsafe f39130zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Class f39131zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final boolean f39132zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final zzhi f39133zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final boolean f39134zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final boolean f39135zzg;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhj.<clinit>():void");
    }

    private zzhj() {
    }

    public static double zza(Object obj2, long j2) {
        return f39133zze.zza(obj2, j2);
    }

    public static float zzb(Object obj2, long j2) {
        return f39133zze.zzb(obj2, j2);
    }

    public static int zzc(Object obj2, long j2) {
        return f39133zze.f39128zza.getInt(obj2, j2);
    }

    public static long zzd(Object obj2, long j2) {
        return f39133zze.f39128zza.getLong(obj2, j2);
    }

    public static Object zze(Class cls) {
        try {
            return f39130zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj2, long j2) {
        return f39133zze.f39128zza.getObject(obj2, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th10) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th10.toString()));
    }

    public static /* synthetic */ void zzi(Object obj2, long j2, boolean z) {
        zzhi zzhiVar = f39133zze;
        long j3 = (-4) & j2;
        int i = zzhiVar.f39128zza.getInt(obj2, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zzhiVar.f39128zza.putInt(obj2, j3, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    public static /* synthetic */ void zzj(Object obj2, long j2, boolean z) {
        zzhi zzhiVar = f39133zze;
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        zzhiVar.f39128zza.putInt(obj2, j3, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzhiVar.f39128zza.getInt(obj2, j3)));
    }

    public static void zzk(Object obj2, long j2, boolean z) {
        f39133zze.zzc(obj2, j2, z);
    }

    public static void zzl(Object obj2, long j2, double d) {
        f39133zze.zzd(obj2, j2, d);
    }

    public static void zzm(Object obj2, long j2, float f) {
        f39133zze.zze(obj2, j2, f);
    }

    public static void zzn(Object obj2, long j2, int i) {
        f39133zze.f39128zza.putInt(obj2, j2, i);
    }

    public static void zzo(Object obj2, long j2, long j3) {
        f39133zze.f39128zza.putLong(obj2, j2, j3);
    }

    public static void zzp(Object obj2, long j2, Object obj3) {
        f39133zze.f39128zza.putObject(obj2, j2, obj3);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj2, long j2) {
        return ((byte) ((f39133zze.f39128zza.getInt(obj2, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj2, long j2) {
        return ((byte) ((f39133zze.f39128zza.getInt(obj2, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i = zzds.f38996zza;
        try {
            Class cls2 = f39131zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzt(Object obj2, long j2) {
        return f39133zze.zzf(obj2, j2);
    }

    public static boolean zzu() {
        return f39135zzg;
    }

    public static boolean zzv() {
        return f39134zzf;
    }

    private static int zzw(Class cls) {
        if (f39135zzg) {
            return f39133zze.f39128zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (f39135zzg) {
            return f39133zze.f39128zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i = zzds.f38996zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, "address");
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
