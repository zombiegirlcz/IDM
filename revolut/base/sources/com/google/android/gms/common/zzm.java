package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class zzm extends zzj {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final WeakReference f38354zzb = new WeakReference(null);

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private WeakReference f38355zza;

    public zzm(byte[] bArr) {
        super(bArr);
        this.f38355zza = f38354zzb;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzc() {
        byte[] bArrZzb;
        synchronized (this) {
            try {
                bArrZzb = (byte[]) this.f38355zza.get();
                if (bArrZzb == null) {
                    bArrZzb = zzb();
                    this.f38355zza = new WeakReference(bArrZzb);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bArrZzb;
    }
}
