package com.revolut.feature.retail.cfd.impl.flows.order;

import b4b.r;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderFlowContract$Step;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r p0 = (r) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        h.t2(cVar, cVar.u, new CfdOrderFlowContract$Step.OrderReview(p0.f12239a, p0.f12240b, p0.f12241c, p0.d, p0.e, p0.f, p0.f12242g, p0.f12243h), true, null, false, 12);
        return Unit.f186387a;
    }
}
