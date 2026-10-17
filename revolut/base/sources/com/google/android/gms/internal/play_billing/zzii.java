package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzii {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final long f46125zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final boolean f46126zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Unsafe f46127zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Class f46128zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final boolean f46129zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final zzih f46130zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final boolean f46131zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final boolean f46132zzh;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzii.<clinit>():void");
    }

    private zzii() {
    }

    private static int zzA(Class cls) {
        if (f46132zzh) {
            return f46130zzf.f46124zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzei.f45956zza;
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
        Unsafe unsafe = f46130zzf.f46124zza;
        long j3 = (-4) & j2;
        int i = unsafe.getInt(obj2, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj2, j3, ((255 & b4) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj2, long j2, byte b4) {
        Unsafe unsafe = f46130zzf.f46124zza;
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        unsafe.putInt(obj2, j3, ((255 & b4) << i) | (unsafe.getInt(obj2, j3) & (~(255 << i))));
    }

    public static double zza(Object obj2, long j2) {
        return f46130zzf.zza(obj2, j2);
    }

    public static float zzb(Object obj2, long j2) {
        return f46130zzf.zzb(obj2, j2);
    }

    public static int zzc(Object obj2, long j2) {
        return f46130zzf.f46124zza.getInt(obj2, j2);
    }

    public static long zzd(Object obj2, long j2) {
        return f46130zzf.f46124zza.getLong(obj2, j2);
    }

    public static Object zze(Class cls) {
        try {
            return f46127zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj2, long j2) {
        return f46130zzf.f46124zza.getObject(obj2, j2);
    }

    public static Unsafe zzg() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzie());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzii.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th10) {
        Logger.getLogger(zzii.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th10.toString()));
    }

    public static void zzm(Object obj2, long j2, boolean z) {
        f46130zzf.zzc(obj2, j2, z);
    }

    public static void zzn(byte[] bArr, long j2, byte b4) {
        f46130zzf.zzd(bArr, f46125zza + j2, b4);
    }

    public static void zzo(Object obj2, long j2, double d) {
        f46130zzf.zze(obj2, j2, d);
    }

    public static void zzp(Object obj2, long j2, float f) {
        f46130zzf.zzf(obj2, j2, f);
    }

    public static void zzq(Object obj2, long j2, int i) {
        f46130zzf.f46124zza.putInt(obj2, j2, i);
    }

    public static void zzr(Object obj2, long j2, long j3) {
        f46130zzf.f46124zza.putLong(obj2, j2, j3);
    }

    public static void zzs(Object obj2, long j2, Object obj3) {
        f46130zzf.f46124zza.putObject(obj2, j2, obj3);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj2, long j2) {
        return ((byte) ((f46130zzf.f46124zza.getInt(obj2, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj2, long j2) {
        return ((byte) ((f46130zzf.f46124zza.getInt(obj2, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class cls) {
        int i = zzei.f45956zza;
        try {
            Class cls2 = f46128zzd;
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
        return f46130zzf.zzg(obj2, j2);
    }

    public static boolean zzx() {
        return f46132zzh;
    }

    public static boolean zzy() {
        return f46131zzg;
    }

    private static int zzz(Class cls) {
        if (f46132zzh) {
            return f46130zzf.f46124zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
