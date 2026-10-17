package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eo f27894b;

    public /* synthetic */ dp1(eo eoVar, int i) {
        this.f27893a = i;
        this.f27894b = eoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27893a) {
            case 0:
                return l00.a(this.f27894b);
            case 1:
                return l00.b(this.f27894b);
            case 2:
                return t00.a(this.f27894b);
            default:
                return x00.a(this.f27894b);
        }
    }
}
