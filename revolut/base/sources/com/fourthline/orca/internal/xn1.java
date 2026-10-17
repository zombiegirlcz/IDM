package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class xn1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d5 f35050b;

    public /* synthetic */ xn1(d5 d5Var, int i) {
        this.f35049a = i;
        this.f35050b = d5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35049a) {
            case 0:
                return j00.d(this.f35050b);
            case 1:
                return j00.a(this.f35050b);
            case 2:
                return j00.b(this.f35050b);
            default:
                return j00.c(this.f35050b);
        }
    }
}
