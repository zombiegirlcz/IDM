package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class aq1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hc1 f26872b;

    public /* synthetic */ aq1(hc1 hc1Var, int i) {
        this.f26871a = i;
        this.f26872b = hc1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26871a) {
            case 0:
                return n00.a(this.f26872b);
            case 1:
                return s00.a(this.f26872b);
            case 2:
                return t00.a(this.f26872b);
            case 3:
                return v00.a(this.f26872b);
            default:
                return x00.a(this.f26872b);
        }
    }
}
