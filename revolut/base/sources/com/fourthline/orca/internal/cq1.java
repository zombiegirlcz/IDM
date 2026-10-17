package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class cq1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xk f27533b;

    public /* synthetic */ cq1(xk xkVar, int i) {
        this.f27532a = i;
        this.f27533b = xkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27532a) {
            case 0:
                return n00.b(this.f27533b);
            default:
                return n00.a(this.f27533b);
        }
    }
}
