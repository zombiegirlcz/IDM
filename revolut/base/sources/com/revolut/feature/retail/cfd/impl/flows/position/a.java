package com.revolut.feature.retail.cfd.impl.flows.position;

import bfl.g;
import com.revolut.feature.retail.cfd.impl.flows.position.CfdPositionFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import d9.e1;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import oki.h;
import y2b.b;
import y2b.c;
import y2b.d;
import y2b.e;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(e input) {
        FlowStep orderReview;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof d) {
            d dVar = (d) input;
            orderReview = new CfdPositionFlowContract$Step.Positions(dVar.f310615b, dVar.f310616c, dVar.d, dVar.f310614a);
        } else {
            if (!(input instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = (c) input;
            BigDecimal bigDecimal = cVar.f310612b;
            String str = cVar.f310613c;
            n nVar = cVar.f310611a;
            String str2 = cVar.d;
            BigDecimal bigDecimalAbs = bigDecimal.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            orderReview = new CfdPositionFlowContract$Step.OrderReview(str, nVar, str2, bigDecimalAbs, e1.G(bigDecimal) ? g.SELL : g.BUY);
        }
        this.o = cp5.d.a(this, orderReview, f0.f322471a, new xwd.a(this, 16));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
