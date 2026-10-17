package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class hj1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ax0 f29307b;

    public /* synthetic */ hj1(ax0 ax0Var, int i) {
        this.f29306a = i;
        this.f29307b = ax0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f29306a) {
            case 0:
                return ax0.a(this.f29307b, (rw0) obj2);
            default:
                return ax0.b(this.f29307b, (rw0) obj2);
        }
    }
}
