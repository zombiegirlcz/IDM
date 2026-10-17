package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pr1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc0 f32031b;

    public /* synthetic */ pr1(pc0 pc0Var, int i) {
        this.f32030a = i;
        this.f32031b = pc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32030a) {
            case 0:
                return r00.b(this.f32031b);
            case 1:
                return r00.a(this.f32031b);
            default:
                return r00.c(this.f32031b);
        }
    }
}
