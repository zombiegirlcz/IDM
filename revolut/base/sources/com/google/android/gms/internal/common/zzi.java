package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
public class zzi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Class f39244zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f39245zzb;

    private zzi(Class cls, Object obj2) {
        this.f39244zza = cls;
        this.f39245zzb = obj2;
    }

    public static zzi zzb(Class cls, Object obj2) {
        return new zzi(cls, obj2);
    }

    public final Class zzc() {
        return this.f39244zza;
    }

    public final Object zzd() {
        return this.f39245zzb;
    }

    public /* synthetic */ zzi(Class cls, Object obj2, byte[] bArr) {
        this(cls, obj2);
    }
}
