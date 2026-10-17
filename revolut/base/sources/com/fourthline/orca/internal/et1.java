package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class et1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n91 f28266b;

    public /* synthetic */ et1(n91 n91Var, int i) {
        this.f28265a = i;
        this.f28266b = n91Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28265a) {
            case 0:
                return x00.b(this.f28266b);
            default:
                return x00.a(this.f28266b);
        }
    }
}
