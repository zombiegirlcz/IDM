package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ep7.g p0 = (ep7.g) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        j jVar = (j) this.receiver;
        jVar.getClass();
        if (!(p0 instanceof ep7.f)) {
            throw new NoWhenBranchMatchedException();
        }
        jVar.l2(new b(jVar, p0, null), new mm7.h(1, jVar, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 0));
        return Unit.f186387a;
    }
}
