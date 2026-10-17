package e4k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.us_send_checks.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import ip0.ck0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BankTransferAmountScreen bankTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "ITEM_FEE_OPTIONS_ID");
        Continuation continuation = null;
        BankTransferAmountScreen bankTransferAmountScreen = this.v;
        if (zF) {
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2();
            kq2.f fVar = aVar2.F2().f122656b;
            List list = fVar != null ? fVar.f188309m : null;
            int i = 2;
            if (fVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("SwiftOur: no exchange rate information");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                aVar2.n2(new b1(i, aVar2, continuation), new whi.b(6));
            } else if (ue0.e.n(list)) {
                IllegalStateException illegalStateException2 = new IllegalStateException("SwiftOur: no transfer fee options: " + fVar.f188309m);
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                aVar2.n2(new b1(i, aVar2, continuation), new whi.b(6));
            } else {
                x1k.a aVar3 = aVar2.u;
                od0.h hVar = od0.i.Companion;
                kq2.c cVar = aVar2.G2().k;
                hVar.getClass();
                rp0.y yVarB = ((f2k.k) aVar3).b(list, od0.h.a(cVar));
                aVar2.F.Q();
                aVar2.E.x(yVarB);
            }
        } else if (Intrinsics.f(str, "ITEM_NOTE_INPUT_ID")) {
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar4 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2();
            BankTransferAmountScreenContract$InputData bankTransferAmountScreenContract$InputData = aVar4.f102080p;
            f5j.r rVar = bankTransferAmountScreenContract$InputData.getF102077a().f132335l;
            if ((rVar == null ? -1 : s0.f122636b[rVar.ordinal()]) == 1) {
                j60.a aVar5 = aVar4.E;
                ((rlg.a) aVar4.K).getClass();
                rp0.l lVar = rp0.l.WINDOW;
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.send_checks_amount_reference_dialog_title, null, null, 14), null, null, 30);
                TextDelegate.Model model2 = new TextDelegate.Model("ID_REFERENCE_INFO_FIELD", new TextLocalisedClause(R$string.send_checks_amount_reference_dialog_description, null, null, 14), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.send_checks_amount_reference_dialog_cta_button, null, null, 14);
                int i2 = R$attr.uikit_dp16;
                aVar5.x(new rp0.y(zhm.v.k(model2, new LargeActionButtonDelegate.Model("ID_CONFIRM_FIELD", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i2, i2, i2, 496)), tVar, lVar, null, null, null, 1016));
            } else {
                IllegalStateException illegalStateException3 = new IllegalStateException("Beneficiary type is not supported: " + bankTransferAmountScreenContract$InputData.getF102077a().f132335l);
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
            }
        }
        return Unit.f186387a;
    }
}
