package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class uq1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf1 f34164b;

    public /* synthetic */ uq1(gf1 gf1Var, int i) {
        this.f34163a = i;
        this.f34164b = gf1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f34163a) {
            case 0:
                return oh1.c(this.f34164b);
            case 1:
                return zg1.d(this.f34164b);
            default:
                return zg1.b(this.f34164b);
        }
    }
}
