package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dq1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f27897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gi f27898c;

    public /* synthetic */ dq1(Function1 function1, gi giVar, int i) {
        this.f27896a = i;
        this.f27897b = function1;
        this.f27898c = giVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f27896a) {
            case 0:
                return ni.a(this.f27897b, this.f27898c, ((Integer) obj2).intValue());
            default:
                return ni.a(this.f27897b, this.f27898c, ((Boolean) obj2).booleanValue());
        }
    }
}
