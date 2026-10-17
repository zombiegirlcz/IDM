package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zabq f37878zab;

    public zabn(zabq zabqVar, int i) {
        this.f37878zab = zabqVar;
        this.zaa = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37878zab.zaI(this.zaa);
    }
}
