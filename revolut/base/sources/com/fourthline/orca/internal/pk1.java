package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d01 f31989b;

    public /* synthetic */ pk1(d01 d01Var, int i) {
        this.f31988a = i;
        this.f31989b = d01Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31988a) {
            case 0:
                return d01.b(this.f31989b);
            default:
                return d01.a(this.f31989b);
        }
    }
}
