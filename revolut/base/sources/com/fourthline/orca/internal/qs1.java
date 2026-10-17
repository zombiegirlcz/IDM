package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qs1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c11 f32531b;

    public /* synthetic */ qs1(c11 c11Var, int i) {
        this.f32530a = i;
        this.f32531b = c11Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32530a) {
            case 0:
                return v00.b(this.f32531b);
            default:
                return v00.a(this.f32531b);
        }
    }
}
