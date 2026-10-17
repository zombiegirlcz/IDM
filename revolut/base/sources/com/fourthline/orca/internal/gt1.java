package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class gt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x40 f28999b;

    public /* synthetic */ gt1(x40 x40Var, int i) {
        this.f28998a = i;
        this.f28999b = x40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f28998a) {
            case 0:
                return x40.a(this.f28999b, (aem.h) obj2);
            default:
                return x40.a(this.f28999b, (vdm.e) obj2);
        }
    }
}
