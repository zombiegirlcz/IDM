package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public enum zzkb implements zzcs {
    UNKNOWN_PERFORMANCE(0),
    FAST(1),
    ACCURATE(2);


    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final int f44224zze;

    zzkb(int i) {
        this.f44224zze = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.f44224zze;
    }
}
