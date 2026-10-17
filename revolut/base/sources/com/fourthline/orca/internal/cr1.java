package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class cr1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf0 f27541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf0 f27542c;

    public /* synthetic */ cr1(mf0 mf0Var, hf0 hf0Var, int i) {
        this.f27540a = i;
        this.f27541b = mf0Var;
        this.f27542c = hf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27540a) {
            case 0:
                return pd0.a(this.f27541b, this.f27542c);
            default:
                return zb0.a(this.f27541b, this.f27542c);
        }
    }
}
