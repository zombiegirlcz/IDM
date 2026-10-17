package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f32044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a01 f32045c;

    public /* synthetic */ pt1(y2 y2Var, a01 a01Var, int i) {
        this.f32043a = i;
        this.f32044b = y2Var;
        this.f32045c = a01Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f32043a) {
            case 0:
                return y2.a(this.f32044b, this.f32045c, (s2) obj2);
            default:
                return y2.b(this.f32044b, this.f32045c, (s2) obj2);
        }
    }
}
