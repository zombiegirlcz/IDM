package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xg f31263b;

    public /* synthetic */ mt1(xg xgVar, int i) {
        this.f31262a = i;
        this.f31263b = xgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31262a) {
            case 0:
                return xg.b(this.f31263b, (ag) obj2);
            default:
                return xg.a(this.f31263b, (ag) obj2);
        }
    }
}
