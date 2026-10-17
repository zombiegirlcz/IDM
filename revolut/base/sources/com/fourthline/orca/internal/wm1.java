package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class wm1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r70 f34746b;

    public /* synthetic */ wm1(r70 r70Var, int i) {
        this.f34745a = i;
        this.f34746b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f34745a) {
            case 0:
                return h50.a(this.f34746b);
            case 1:
                return ol.b(this.f34746b);
            case 2:
                return tg1.b(this.f34746b);
            case 3:
                return Long.valueOf(xd.c(this.f34746b));
            default:
                return xd.b(this.f34746b);
        }
    }
}
