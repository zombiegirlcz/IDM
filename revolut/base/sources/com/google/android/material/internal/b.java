package com.google.android.material.internal;

import android.view.View;
import kli.c;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f49104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f49105c;

    public /* synthetic */ b(View view, boolean z, int i) {
        this.f49103a = i;
        this.f49104b = view;
        this.f49105c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49103a) {
            case 0:
                ViewUtils.showKeyboard(this.f49104b, this.f49105c);
                break;
            case 1:
                c.c(this.f49104b, this.f49105c);
                break;
            case 2:
                if (this.f49105c) {
                    this.f49104b.setVisibility(0);
                }
                break;
            default:
                if (!this.f49105c) {
                    this.f49104b.setVisibility(8);
                }
                break;
        }
    }

    public /* synthetic */ b(boolean z, View view, int i) {
        this.f49103a = i;
        this.f49105c = z;
        this.f49104b = view;
    }
}
