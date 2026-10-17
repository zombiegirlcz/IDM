package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class hq1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bl0 f29381b;

    public /* synthetic */ hq1(bl0 bl0Var, int i) {
        this.f29380a = i;
        this.f29381b = bl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29380a) {
            case 0:
                return o00.a(this.f29381b);
            default:
                return o00.b(this.f29381b);
        }
    }
}
