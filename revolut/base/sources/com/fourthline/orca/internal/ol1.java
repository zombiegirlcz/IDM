package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ol1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ to f31692b;

    public /* synthetic */ ol1(to toVar, int i) {
        this.f31691a = i;
        this.f31692b = toVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31691a) {
            case 0:
                return eg.a(this.f31692b);
            case 1:
                return Integer.valueOf(eg.c(this.f31692b));
            case 2:
                return eg.d(this.f31692b);
            case 3:
                return eg.e(this.f31692b);
            case 4:
                return Integer.valueOf(eg.b(this.f31692b));
            default:
                return Integer.valueOf(nn.a(this.f31692b));
        }
    }
}
