package ej9;

import dj9.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.g0;
import zh9.g1;
import zh9.h1;
import zh9.i1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.q implements Function1 {
    public static final y f = new y();

    public y() {
        super(1, cj9.d.class, "toDomain", "toDomain(Lcom/revolut/feature/pay_later/impl/network/models/PayLaterStateDto;)Lcom/revolut/feature/pay_later/api/models/PayLaterState;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g0 g0Var;
        jo3.a minPurchaseAmount;
        dj9.u p0 = (dj9.u) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        if (p0 instanceof u.b) {
            u.b bVar = (u.b) p0;
            return new i1(bVar.getEndTime(), bVar.getDuration(), bVar.getTerm());
        }
        if (!(p0 instanceof u.a)) {
            throw new NoWhenBranchMatchedException();
        }
        u.a aVar = (u.a) p0;
        Integer reasonCode = aVar.getReasonCode();
        if (reasonCode != null && reasonCode.intValue() == 52004) {
            g0Var = zh9.a0.f322249a;
        } else if (reasonCode != null && reasonCode.intValue() == 52008) {
            g0Var = zh9.f0.f322265a;
        } else if (reasonCode != null && reasonCode.intValue() == 52003) {
            g0Var = zh9.d0.f322258a;
        } else if (reasonCode != null && reasonCode.intValue() == 52002) {
            g0Var = zh9.e0.f322262a;
        } else {
            zh9.c0 c0Var = null;
            if (reasonCode != null && reasonCode.intValue() == 52009 && (minPurchaseAmount = aVar.getMinPurchaseAmount()) != null) {
                c0Var = new zh9.c0(mo3.a.o(minPurchaseAmount));
            }
            g0Var = c0Var;
        }
        if (g0Var != null) {
            return new g1(g0Var);
        }
        Integer reasonCode2 = aVar.getReasonCode();
        return new h1(reasonCode2 == null || reasonCode2.intValue() != 52001);
    }
}
