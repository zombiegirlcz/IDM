package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bx0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qj1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bx0 f32464b;

    public /* synthetic */ qj1(bx0 bx0Var, int i) {
        this.f32463a = i;
        this.f32464b = bx0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32463a) {
            case 0:
                return bx0.b.a(this.f32464b);
            default:
                return bx0.e.a(this.f32464b);
        }
    }
}
