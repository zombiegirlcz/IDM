package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: loaded from: classes16.dex */
public enum RSAAlgorithm implements Algorithm {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f38596zzb;

    RSAAlgorithm(int i) {
        this.f38596zzb = i;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public int getAlgoValue() {
        return this.f38596zzb;
    }
}
