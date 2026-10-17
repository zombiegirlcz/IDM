package com.revolut.core.ui_kit.delegates;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m8 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ty0.a p0 = (ty0.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ihm.f) this.receiver).onNext(p0);
        return Unit.f186387a;
    }
}
