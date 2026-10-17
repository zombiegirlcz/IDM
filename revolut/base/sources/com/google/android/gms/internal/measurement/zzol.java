package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzol {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final long f40549zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final boolean f40550zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Unsafe f40551zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Class f40552zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final boolean f40553zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final zzok f40554zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final boolean f40555zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final boolean f40556zzh;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzol.<clinit>():void");
    }

    private zzol() {
    }

    private static int zzA(Class cls) {
        if (f40556zzh) {
            return f40554zzf.f40548zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzkr.f40391zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj2, long j2, byte b4) {
        Unsafe unsafe = f40554zzf.f40548zza;
        long j3 = (-4) & j2;
        int i = unsafe.getInt(obj2, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj2, j3, ((255 & b4) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj2, long j2, byte b4) {
        Unsafe unsafe = f40554zzf.f40548zza;
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        unsafe.putInt(obj2, j3, ((255 & b4) << i) | (unsafe.getInt(obj2, j3) & (~(255 << i))));
    }

    public static double zza(Object obj2, long j2) {
        return f40554zzf.zza(obj2, j2);
    }

    public static float zzb(Object obj2, long j2) {
        return f40554zzf.zzb(obj2, j2);
    }

    public static int zzc(Object obj2, long j2) {
        return f40554zzf.f40548zza.getInt(obj2, j2);
    }

    public static long zzd(Object obj2, long j2) {
        return f40554zzf.f40548zza.getLong(obj2, j2);
    }

    public static Object zze(Class cls) {
        try {
            return f40551zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj2, long j2) {
        return f40554zzf.f40548zza.getObject(obj2, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzoh());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th10) {
        Logger.getLogger(zzol.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th10.toString()));
    }

    public static void zzm(Object obj2, long j2, boolean z) {
        f40554zzf.zzc(obj2, j2, z);
    }

    public static void zzn(byte[] bArr, long j2, byte b4) {
        f40554zzf.zzd(bArr, f40549zza + j2, b4);
    }

    public static void zzo(Object obj2, long j2, double d) {
        f40554zzf.zze(obj2, j2, d);
    }

    public static void zzp(Object obj2, long j2, float f) {
        f40554zzf.zzf(obj2, j2, f);
    }

    public static void zzq(Object obj2, long j2, int i) {
        f40554zzf.f40548zza.putInt(obj2, j2, i);
    }

    public static void zzr(Object obj2, long j2, long j3) {
        f40554zzf.f40548zza.putLong(obj2, j2, j3);
    }

    public static void zzs(Object obj2, long j2, Object obj3) {
        f40554zzf.f40548zza.putObject(obj2, j2, obj3);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj2, long j2) {
        return ((byte) ((f40554zzf.f40548zza.getInt(obj2, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj2, long j2) {
        return ((byte) ((f40554zzf.f40548zza.getInt(obj2, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class cls) {
        int i = zzkr.f40391zza;
        try {
            Class cls2 = f40552zzd;
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

    public static boolean zzw(Object obj2, long j2) {
        return f40554zzf.zzg(obj2, j2);
    }

    public static boolean zzx() {
        return f40556zzh;
    }

    public static boolean zzy() {
        return f40555zzg;
    }

    private static int zzz(Class cls) {
        if (f40556zzh) {
            return f40554zzf.f40548zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
