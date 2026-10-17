package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bs1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ge0 f27220b;

    public /* synthetic */ bs1(ge0 ge0Var, int i) {
        this.f27219a = i;
        this.f27220b = ge0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27219a) {
            case 0:
                return s00.a(this.f27220b);
            default:
                return s00.b(this.f27220b);
        }
    }
}
