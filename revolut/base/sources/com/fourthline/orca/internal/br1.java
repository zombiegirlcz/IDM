package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class br1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gj f27213b;

    public /* synthetic */ br1(gj gjVar, int i) {
        this.f27212a = i;
        this.f27213b = gjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27212a) {
            case 0:
                return Boolean.valueOf(pd0.a(this.f27213b));
            case 1:
                return r91.c(this.f27213b);
            default:
                return Boolean.valueOf(rj.c(this.f27213b));
        }
    }
}
