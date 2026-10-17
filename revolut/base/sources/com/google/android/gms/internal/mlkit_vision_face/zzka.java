package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public enum zzka implements zzcs {
    UNKNOWN_LANDMARKS(0),
    NO_LANDMARKS(1),
    ALL_LANDMARKS(2);


    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final int f44219zze;

    zzka(int i) {
        this.f44219zze = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.f44219zze;
    }
}
