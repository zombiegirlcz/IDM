package com.fourthline.orca.internal;

import com.fourthline.orca.internal.dp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class wk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp f34731b;

    public /* synthetic */ wk1(dp dpVar, int i) {
        this.f34730a = i;
        this.f34731b = dpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f34730a) {
            case 0:
                return dp.n.a(this.f34731b);
            case 1:
                return dp.p.a(this.f34731b);
            case 2:
                return dp.o(this.f34731b);
            default:
                return dp.p(this.f34731b);
        }
    }
}
