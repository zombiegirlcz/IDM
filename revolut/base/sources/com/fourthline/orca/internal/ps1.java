package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ps1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8 f32038b;

    public /* synthetic */ ps1(d8 d8Var, int i) {
        this.f32037a = i;
        this.f32038b = d8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32037a) {
            case 0:
                return v00.a(this.f32038b);
            default:
                return w00.a(this.f32038b);
        }
    }
}
