package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzft {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzfs f39067zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfs f39068zzb;

    static {
        zzfs zzfsVar = null;
        try {
            zzfsVar = (zzfs) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39067zza = zzfsVar;
        f39068zzb = new zzfs();
    }

    public static zzfs zza() {
        return f39067zza;
    }

    public static zzfs zzb() {
        return f39068zzb;
    }
}
