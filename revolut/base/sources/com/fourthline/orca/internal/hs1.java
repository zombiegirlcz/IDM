package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class hs1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn0 f29399b;

    public /* synthetic */ hs1(dn0 dn0Var, int i) {
        this.f29398a = i;
        this.f29399b = dn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29398a) {
            case 0:
                return t00.a(this.f29399b);
            case 1:
                return t00.b(this.f29399b);
            default:
                return t00.c(this.f29399b);
        }
    }
}
