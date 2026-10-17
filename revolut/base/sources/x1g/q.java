package x1g;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.terms.api.model.Terms;
import com.youTransactor.uCube.rpc.Constants;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f302435b;

    public /* synthetic */ q(c0 c0Var, int i) {
        this.f302434a = i;
        this.f302435b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = this.f302434a;
        c0 c0Var = this.f302435b;
        switch (i) {
            case 0:
                s3g.e output = (s3g.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                c0Var.H2(c0Var.I, new x0b.c(output, 8));
                return Unit.f186387a;
            case 1:
                od0.i terms = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                return terms.d() ? pre.c.b(c0Var.f302406s, ((Terms) terms.c()).f90355a) : pfm.m.f235744a;
            case 2:
                iub.a it8 = (iub.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                c0Var.H.a();
                return Unit.f186387a;
            default:
                c0 c0Var2 = this.f302435b;
                cli.y yVar = c0Var2.I;
                String screenTag = c0Var2.E;
                w6c.e output2 = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof w6c.b) && !(output2 instanceof w6c.a)) {
                    if (output2 instanceof w6c.d) {
                        w6c.h hVar = ((w6c.d) output2).f295414a;
                        if (hVar == null) {
                            Intrinsics.checkNotNullExpressionValue(screenTag, "screenTag");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, screenTag, "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                        } else {
                            dj0.d dVarA = p.a((i) ((j2) yVar.f22677a).getValue());
                            yji.l.a1(c0Var2, c0Var2.z.f(new u6c.p(hVar.f295415a, (String) null, (u6c.u) null, c0Var2.F, Long.valueOf(dVarA.f115082a), dVarA.f115083b, false, Constants.TAG_POWER_OFF_TIMEOUT), hVar.f295416b, hVar.f295417c), null, null, new z(c0Var2, hVar, null), 3);
                        }
                    } else {
                        if (!(output2 instanceof w6c.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PaymentMethod paymentMethod = ((w6c.c) output2).f295413a;
                        boolean z = paymentMethod instanceof PaymentMethod.Pocket;
                        PaymentMethod.Pocket pocket = z ? (PaymentMethod.Pocket) paymentMethod : null;
                        if (pocket != null) {
                            c0Var2.H2(yVar, new dmj.f0(pocket, 3));
                        } else {
                            if (paymentMethod instanceof PaymentMethod.Card) {
                                str = "Card";
                            } else if (z) {
                                str = "Pocket";
                            } else if (paymentMethod instanceof PaymentMethod.RevolutAccount) {
                                str = "Revolut account";
                            } else {
                                if (!(paymentMethod instanceof PaymentMethod.BankAccount)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "BankAccount";
                            }
                            Intrinsics.checkNotNullExpressionValue(screenTag, "screenTag");
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, screenTag, "Error while payment method selection. Selected type is: ".concat(str), null, h0Var2);
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
