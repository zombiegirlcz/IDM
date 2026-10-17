package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzgk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f39097zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Class f39098zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzgz f39099zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzgz f39100zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgz zzgzVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f39098zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgzVar = (zzgz) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f39099zzc = zzgzVar;
        f39100zzd = new zzhb();
    }

    public static zzgz zza() {
        return f39099zzc;
    }

    public static zzgz zzb() {
        return f39100zzd;
    }

    public static Object zzc(Object obj2, int i, int i2, Object obj3, zzgz zzgzVar) {
        if (obj3 == null) {
            obj3 = zzgzVar.zza(obj2);
        }
        zzgzVar.zzd(obj3, i, i2);
        return obj3;
    }

    public static void zzd(zzgz zzgzVar, Object obj2, Object obj3) {
        zzgzVar.zzf(obj2, zzgzVar.zzc(zzgzVar.zzb(obj2), zzgzVar.zzb(obj3)));
    }

    public static void zze(Class cls) {
        Class cls2;
        if (!zzev.class.isAssignableFrom(cls) && (cls2 = f39098zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzf(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }
}
