package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class lm1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gb f30682b;

    public /* synthetic */ lm1(gb gbVar, int i) {
        this.f30681a = i;
        this.f30682b = gbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30681a) {
            case 0:
                return gb.d(this.f30682b, (wb) obj2);
            case 1:
                return gb.b(this.f30682b, (wb) obj2);
            case 2:
                return gb.a(this.f30682b, (wb) obj2);
            case 3:
                return gb.e(this.f30682b, (wb) obj2);
            case 4:
                return gb.c(this.f30682b, (wb) obj2);
            case 5:
                return gb.f(this.f30682b, (wb) obj2);
            case 6:
                return gb.h(this.f30682b, (wb) obj2);
            default:
                return gb.g(this.f30682b, (wb) obj2);
        }
    }
}
