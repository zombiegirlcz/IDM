package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ot1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31767b;

    public /* synthetic */ ot1(int i, Function1 function1) {
        this.f31766a = i;
        this.f31767b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31766a) {
            case 0:
                return xo.d(this.f31767b);
            case 1:
                return xo.e(this.f31767b);
            case 2:
                return xo.f(this.f31767b);
            case 3:
                return xo.a(this.f31767b);
            case 4:
                return yq.a(this.f31767b);
            case 5:
                return z30.a(this.f31767b);
            default:
                return zw0.a(this.f31767b);
        }
    }
}
