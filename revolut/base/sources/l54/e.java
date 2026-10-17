package l54;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$Step;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a;
import com.revolut.feature.full_screen_prompt.c;
import ek4.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0c.s;
import qk4.b;
import vkm.j2;
import wk4.b;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b f192154b;

    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar, int i) {
        this.f192153a = i;
        this.f192154b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f192153a) {
            case 0:
                wk4.b output = (wk4.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof wk4.c;
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar = this.f192154b;
                if (z) {
                    bVar.H2(bVar.v, new d(output, 0));
                    oki.h.t2(bVar, bVar.f67138w, CreditCardApplicationAutopayFlowContract$Step.SetAmount.f67130a, true, null, false, 12);
                } else if (output instanceof b.a) {
                    bVar.f67138w.e(false);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar2 = this.f192154b;
                qki.d dVar = bVar2.v;
                qk4.b outputData = (qk4.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean zF = Intrinsics.f(outputData, b.c.f246964a);
                CreditCardApplicationAutopayFlowContract$Step.SetDate setDate = CreditCardApplicationAutopayFlowContract$Step.SetDate.f67131a;
                if (zF) {
                    bVar2.H2(dVar, new l2d.a(23));
                    oki.h.t2(bVar2, bVar2.f67138w, setDate, true, null, false, 12);
                } else if (Intrinsics.f(outputData, b.C1350b.f246963a)) {
                    bVar2.H2(dVar, new l2d.a(24));
                    oki.h.t2(bVar2, bVar2.f67138w, setDate, true, null, false, 12);
                } else if (Intrinsics.f(outputData, b.a.f246962a)) {
                    bVar2.f67138w.e(false);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a outputData2 = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof a.C0475a) {
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar3 = this.f192154b;
                    bVar3.l2(new i(bVar3, null, 0), new e(bVar3, 6));
                    return Unit.f186387a;
                }
                if ((outputData2 instanceof a.c) || (outputData2 instanceof a.b)) {
                    throw new IllegalStateException("Unsupported operation: Picker step is not implemented in this flow");
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar4 = this.f192154b;
                qki.d dVar2 = bVar4.v;
                ik4.c outputData3 = (ik4.c) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (!(outputData3 instanceof ik4.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar4.H2(dVar2, new s(outputData3, 12));
                yki.a aVar = bVar4.f67138w;
                int i = f.f192155a[((CreditCardApplicationAutopayFlowContract$State) ((j2) dVar2.f22677a).getValue()).f.ordinal()];
                if (i == 1) {
                    oki.h.t2(bVar4, aVar, CreditCardApplicationAutopayFlowContract$Step.ConfirmAutoPay.f67127a, true, null, false, 12);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(bVar4, aVar, CreditCardApplicationAutopayFlowContract$Step.AddExternalAccount.f67125a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.full_screen_prompt.c outputData4 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                boolean z3 = outputData4 instanceof c.C0497c;
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar5 = this.f192154b;
                if (z3) {
                    oki.h.t2(bVar5, bVar5.f67138w, CreditCardApplicationAutopayFlowContract$Step.SelectPaymentMethod.f67129a, true, null, false, 12);
                } else if (outputData4 instanceof c.d) {
                    bVar5.l2(new i(bVar5, null, 3), new yi5.b(26));
                } else if (outputData4 instanceof c.a) {
                    t.J2(bVar5, false, null, null, 7);
                }
                return Unit.f186387a;
            case 5:
                ek4.c output2 = (ek4.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean z4 = output2 instanceof ek4.b;
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar6 = this.f192154b;
                if (z4) {
                    bVar6.H2(bVar6.v, new c(output2, 0));
                    oki.h.t2(bVar6, bVar6.f67138w, CreditCardApplicationAutopayFlowContract$Step.ConfirmAutoPay.f67127a, true, null, false, 12);
                } else {
                    if (!(output2 instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar6.f67138w.e(false);
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar7 = this.f192154b;
                bVar7.f67134q.getClass();
                bVar7.X1(wj4.a.a());
                return Boolean.TRUE;
        }
    }
}
