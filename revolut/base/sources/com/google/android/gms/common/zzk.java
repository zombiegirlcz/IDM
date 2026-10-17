package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends zzj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final byte[] f38350zza;

    public zzk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f38350zza = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzc() {
        return this.f38350zza;
    }
}
