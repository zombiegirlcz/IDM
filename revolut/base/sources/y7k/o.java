package y7k;

import aw0.f4;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$ModalStep;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentLinksAmountScreen f311561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(PaymentLinksAmountScreen paymentLinksAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311561w = paymentLinksAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f311561w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f311561w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f311561w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(this.f311561w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            default:
                o oVar5 = new o(this.f311561w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((h9i.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311561w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarF3 = paymentLinksAmountScreen.R2();
                Intrinsics.h(menuItemId);
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) yVarF3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("LIST_ID_OUTGOING_MR_WARNING_DISCLAIMER_ICON")) {
                    oki.h.v2(aVar2.I, PaymentLinksAmountScreenContract$ModalStep.WarningBottomDialog.f102207a, bottom_dialog);
                }
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar5 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) paymentLinksAmountScreen.R2();
                aVar5.getClass();
                String simpleName = null;
                if (Intrinsics.f(aVar3 != null ? aVar3.f275445a : null, "ID_FEE_DISCLAIMER_FOOTER_CLICK")) {
                    oki.h.v2(aVar5.I, PaymentLinksAmountScreenContract$ModalStep.FeesDisclaimerBottomDialog.f102206a, bottom_dialog);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.c cVar = rd0.c.DEBUG;
                    String str = aVar3 != null ? aVar3.f275445a : null;
                    String str2 = aVar3 != null ? aVar3.f275446b : null;
                    boolean z = (aVar3 != null ? aVar3.f275447c : null) != null;
                    if (aVar3 != null && (obj3 = aVar3.d) != null) {
                        simpleName = obj3.getClass().getSimpleName();
                    }
                    StringBuilder sbM = v0.a.m("Unsupported clickData: id=", str, ", text=", str2, ", hasClause=");
                    sbM.append(z);
                    sbM.append(", parcelType=");
                    sbM.append(simpleName);
                    rd0.d.b(cVar, "PaymentLinksAmountScreenModel", sbM.toString(), null, null, 16);
                }
                break;
            case 2:
                h9i.c item = (h9i.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarF32 = paymentLinksAmountScreen.R2();
                Intrinsics.h(item);
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar7 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) yVarF32;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                aVar7.O2(new fr8.p(item, 1));
                break;
            case 3:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarF33 = paymentLinksAmountScreen.R2();
                String amount = charSequence.toString();
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar9 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) yVarF33;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                aVar9.O2(new g0(aVar9, amount));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarF34 = paymentLinksAmountScreen.R2();
                Intrinsics.h(focusData);
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar11 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) yVarF34;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                aVar11.D.b(focusData);
                break;
        }
        return Unit.f186387a;
    }
}
