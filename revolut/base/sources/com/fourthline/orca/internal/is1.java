package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class is1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv0 f29702b;

    public /* synthetic */ is1(dv0 dv0Var, int i) {
        this.f29701a = i;
        this.f29702b = dv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29701a) {
            case 0:
                return u00.c(this.f29702b);
            case 1:
                return u00.b(this.f29702b);
            case 2:
                return u00.a(this.f29702b);
            case 3:
                return u00.e(this.f29702b);
            case 4:
                return u00.d(this.f29702b);
            case 5:
                return u00.g(this.f29702b);
            default:
                return u00.f(this.f29702b);
        }
    }
}
