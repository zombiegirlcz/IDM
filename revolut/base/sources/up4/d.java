package up4;

import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountRootFlow;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$Step;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.kompot.common.ModalDestination;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y0;
import uk4.e;
import wk4.b;
import yhm.m;
import yhm.o;
import yhm.r;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c f281836b;

    public /* synthetic */ d(com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar, int i) {
        this.f281835a = i;
        this.f281836b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        j1j.d dVar;
        int i = this.f281835a;
        int i2 = 1;
        CreditCardSetupAutopayFlowContract$Step.ConfirmAutoPay confirmAutoPay = CreditCardSetupAutopayFlowContract$Step.ConfirmAutoPay.f69081a;
        int i3 = 0;
        int i5 = 18;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar = this.f281836b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar2 = this.f281836b;
                cVar2.f69090q.getClass();
                yji.l.a1(cVar2, cVar2.X1(new y0(null, vt4.b.a(), false, 5)), null, null, new uea.e(cVar2, objArr == true ? 1 : 0, i5), 3);
                return Boolean.TRUE;
            case 1:
                wk4.b output = (wk4.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof wk4.c) {
                    cVar.O2(new l54.d(output, i2));
                    cVar.M2(CreditCardSetupAutopayFlowContract$Step.SetAmount.f69086a);
                } else {
                    if (!(output instanceof b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(cVar.A);
                }
                return Unit.f186387a;
            case 2:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                CreditCardAutopayConfig creditCardAutopayConfig = (CreditCardAutopayConfig) rVar.f314201a;
                CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) rVar.f314202b;
                wi0.b bVar = (wi0.b) rVar.f314203c;
                lb5.b bVar2 = cVar.f69089p;
                CreditAutopaySourceConfig creditAutopaySourceConfigC = ((yb5.e) bVar2).c(zhm.y0.b(creditCardAutopayPayments.f70724c));
                return nim.a.v(((yb5.e) bVar2).d(creditAutopaySourceConfigC), new sc7.b(creditCardAutopayConfig, creditCardAutopayPayments, creditAutopaySourceConfigC, bVar, 10));
            case 3:
                g1j.b result = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    dVar = result.f139686a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = o.a(th10);
                }
                for (Object obj3 : cVar.N2().f69077g) {
                    if (Intrinsics.f(((RepaymentSource) obj3).getF68556a(), dVar.f170617a)) {
                        cVar.O2(new um7.d((RepaymentSource) obj3, 14));
                        objA = Unit.f186387a;
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 4:
                ik4.c outputData = (ik4.c) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof ik4.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ik4.b bVar3 = (ik4.b) outputData;
                CreditCardAutopayPayment.PaymentAmount paymentAmountC = com.revolut.feature.credit_card.autopay.api.models_v3.d.c(bVar3.f161891a);
                if (bVar3.f161892b != null) {
                    cVar.O2(new uif.d(paymentAmountC, outputData, 9));
                } else {
                    cVar.O2(new um7.d(paymentAmountC, 16));
                }
                CreditCardAutopayType creditCardAutopayType = cVar.N2().d;
                if (creditCardAutopayType instanceof CreditCardAutopayType.RevolutPocket) {
                    cVar.M2(confirmAutoPay);
                    Unit unit = Unit.f186387a;
                } else if (creditCardAutopayType == null) {
                    try {
                        m.Companion companion3 = yhm.m.INSTANCE;
                        throw new IllegalArgumentException("Payment type is null");
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th11) {
                        m.Companion companion4 = yhm.m.INSTANCE;
                        Throwable thA2 = yhm.m.a(o.a(th11));
                        if (thA2 != null) {
                            hx7.e.n(thA2);
                        }
                    }
                } else {
                    try {
                        m.Companion companion5 = yhm.m.INSTANCE;
                        throw new IllegalArgumentException("Unsupported payment type: " + o0.f186429a.b(creditCardAutopayType.getClass()).m());
                    } catch (CancellationException e4) {
                        throw e4;
                    } catch (Throwable th12) {
                        m.Companion companion6 = yhm.m.INSTANCE;
                        Throwable thA3 = yhm.m.a(o.a(th12));
                        if (thA3 != null) {
                            hx7.e.n(thA3);
                        }
                    }
                }
                return Unit.f186387a;
            case 5:
                yja.b outputData2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                int i6 = f.f281839a[outputData2.ordinal()];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    cVar.M2(CreditCardSetupAutopayFlowContract$Step.SelectPaymentMethod.f69085a);
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(cVar.A);
                }
                return Unit.f186387a;
            case 6:
                ir4.i result2 = (ir4.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof ir4.h) {
                    cVar.K2();
                } else {
                    if (!(result2 instanceof ir4.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(cVar.A);
                }
                return Unit.f186387a;
            case 7:
                ywc.a result3 = (ywc.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof ywc.b) {
                    cVar.O2(new um7.d(result3, 15));
                }
                cVar.M2(confirmAutoPay);
                return Unit.f186387a;
            case 8:
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a outputData3 = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof a.C0475a) {
                    cVar.l2(new j(cVar, objArr2 == true ? 1 : 0, i3), new yi5.b(26));
                } else if (outputData3 instanceof a.c) {
                    cVar.M2(CreditCardSetupAutopayFlowContract$Step.SetupBackupCard.f69088a);
                } else {
                    if (!(outputData3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(cVar.A, CreditCardSetupAutopayFlowContract$Step.Picker.f69083a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                }
                return Unit.f186387a;
            default:
                uk4.e output2 = (uk4.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, e.c.f280679a)) {
                    cVar.O2(new umc.c(i5));
                    cVar.M2(CreditCardSetupAutopayFlowContract$Step.SetDate.f69087a);
                } else if (Intrinsics.f(output2, e.b.f280678a)) {
                    cVar.O2(new umc.c(19));
                    cVar.M2(CreditCardSetupAutopayFlowContract$Step.DirectDebit.f69082a);
                } else {
                    if (!Intrinsics.f(output2, e.a.f280677a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(cVar.A);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar, SetAmountRootFlow setAmountRootFlow) {
        this.f281835a = 4;
        this.f281836b = cVar;
    }
}
