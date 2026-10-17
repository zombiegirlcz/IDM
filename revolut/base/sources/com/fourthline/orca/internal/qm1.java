package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qm1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v10 f32492b;

    public /* synthetic */ qm1(v10 v10Var, int i) {
        this.f32491a = i;
        this.f32492b = v10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32491a) {
            case 0:
                return gw0.a(this.f32492b);
            case 1:
                return rm.a(this.f32492b);
            case 2:
                return uh.a(this.f32492b);
            case 3:
                return ww0.a(this.f32492b);
            default:
                return yr0.a(this.f32492b);
        }
    }
}
