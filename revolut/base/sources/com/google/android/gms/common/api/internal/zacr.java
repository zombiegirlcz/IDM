package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zacr implements Runnable {
    final /* synthetic */ com.google.android.gms.signin.internal.zak zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zact f37912zab;

    public zacr(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.f37912zab = zactVar;
        this.zaa = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.f37912zab, this.zaa);
    }
}
