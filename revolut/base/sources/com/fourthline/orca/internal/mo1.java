package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mo1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k01 f31238b;

    public /* synthetic */ mo1(k01 k01Var, int i) {
        this.f31237a = i;
        this.f31238b = k01Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31237a) {
            case 0:
                return k01.a(this.f31238b);
            default:
                return k01.b(this.f31238b);
        }
    }
}
