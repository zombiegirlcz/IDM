package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ar1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f26890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kd1 f26891c;

    public /* synthetic */ ar1(Function1 function1, kd1 kd1Var, int i) {
        this.f26889a = i;
        this.f26890b = function1;
        this.f26891c = kd1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26889a) {
            case 0:
                return p9.a(this.f26890b, this.f26891c);
            default:
                return wg0.a(this.f26890b, this.f26891c);
        }
    }
}
