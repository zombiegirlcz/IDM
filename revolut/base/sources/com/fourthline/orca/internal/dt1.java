package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wl0 f27917b;

    public /* synthetic */ dt1(wl0 wl0Var, int i) {
        this.f27916a = i;
        this.f27917b = wl0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f27916a) {
            case 0:
                return wl0.b(this.f27917b, (sl0) obj2);
            case 1:
                return wl0.d(this.f27917b, (sl0) obj2);
            case 2:
                return wl0.e(this.f27917b, (sl0) obj2);
            case 3:
                return wl0.a(this.f27917b, (sl0) obj2);
            default:
                return wl0.c(this.f27917b, (sl0) obj2);
        }
    }
}
