package com.fourthline.vision.internal;

import android.content.Context;
import android.view.Display;

/* JADX INFO: loaded from: classes23.dex */
public final class h0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f36309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36310b;

    private h0(c0 c0Var, e4m.e eVar) {
        this.f36309a = c0Var;
        this.f36310b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Display get() {
        return a(this.f36309a, (Context) this.f36310b.get());
    }

    public static h0 a(c0 c0Var, e4m.e eVar) {
        return new h0(c0Var, eVar);
    }

    public static Display a(c0 c0Var, Context context) {
        Display displayProvideDisplay = c0Var.provideDisplay(context);
        vc.s.k(displayProvideDisplay);
        return displayProvideDisplay;
    }
}
