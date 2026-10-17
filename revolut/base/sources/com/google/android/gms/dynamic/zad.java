package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes16.dex */
final class zad implements zah {
    final /* synthetic */ FrameLayout zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ LayoutInflater f38409zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ ViewGroup f38410zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ Bundle f38411zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    final /* synthetic */ DeferredLifecycleHelper f38412zae;

    public zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f38412zae = deferredLifecycleHelper;
        this.zaa = frameLayout;
        this.f38409zab = layoutInflater;
        this.f38410zac = viewGroup;
        this.f38411zad = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        this.zaa.removeAllViews();
        this.zaa.addView(this.f38412zae.zaa.onCreateView(this.f38409zab, this.f38410zac, this.f38411zad));
    }
}
