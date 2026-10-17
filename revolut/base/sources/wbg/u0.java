package wbg;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a f296209b;

    public /* synthetic */ u0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar, int i) {
        this.f296208a = i;
        this.f296209b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f296208a;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar = this.f296209b;
        switch (i) {
            case 0:
                iub.a it8 = (iub.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aVar.N.a();
                return Unit.f186387a;
            case 1:
                od0.i termsToAccept = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
                return termsToAccept.d() ? pre.c.b(aVar.f93906r, ((Terms) termsToAccept.c()).f90355a) : pfm.m.f235744a;
            case 2:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = this.f296209b;
                e eVar = aVar2.f93909w;
                w6c.e output = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if ((output instanceof w6c.b) || (output instanceof w6c.a)) {
                    Unit unit = Unit.f186387a;
                } else {
                    if (output instanceof w6c.d) {
                        w6c.h hVar = ((w6c.d) output).f295414a;
                        if (hVar != null) {
                            yji.l.a1(aVar2, ((s) eVar).a(hVar, (dj0.d) ((g0) ((j2) aVar2.O.f22677a).getValue()).f296170c.getContent()), null, null, null, 7);
                        } else {
                            String strM = kotlin.jvm.internal.o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a.class).m();
                            String str = strM != null ? strM : "Stays";
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, str, "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                            Unit unit2 = Unit.f186387a;
                        }
                    } else {
                        if (!(output instanceof w6c.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                        if (pocket != null) {
                            j2 j2Var = ((s) eVar).i;
                            od0.i.Companion.getClass();
                            od0.i iVarA = od0.h.a(pocket);
                            j2Var.getClass();
                            j2Var.g(null, iVarA);
                        } else {
                            String strM2 = kotlin.jvm.internal.o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a.class).m();
                            foh.i.p(paymentMethod, strM2 != null ? strM2 : "Stays");
                        }
                        Unit unit3 = Unit.f186387a;
                    }
                }
                return Unit.f186387a;
            default:
                zbg.c output2 = (zbg.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                e eVar2 = aVar.f93909w;
                RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = output2.f320885a;
                j2 j2Var2 = ((s) eVar2).f296201h;
                od0.i.Companion.getClass();
                od0.i iVarA2 = od0.h.a(revolutCardWithBalanceCheck);
                j2Var2.getClass();
                j2Var2.g(null, iVarA2);
                return Unit.f186387a;
        }
    }
}
