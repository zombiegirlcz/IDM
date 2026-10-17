package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class xq1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nt f35078b;

    public /* synthetic */ xq1(nt ntVar, int i) {
        this.f35077a = i;
        this.f35078b = ntVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35077a) {
            case 0:
                return p00.f(this.f35078b);
            case 1:
                return p00.a(this.f35078b);
            case 2:
                return p00.b(this.f35078b);
            case 3:
                return p00.d(this.f35078b);
            case 4:
                return p00.e(this.f35078b);
            default:
                return p00.c(this.f35078b);
        }
    }
}
