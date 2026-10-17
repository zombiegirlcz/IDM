package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import sx2.r;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hr6.b p0 = (hr6.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        cVar.getClass();
        if (p0 == null) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.l2(new r(cVar, p0, null, 19), new su0.c(1, cVar, q7e.b.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 14));
        return Unit.f186387a;
    }
}
