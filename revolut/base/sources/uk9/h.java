package uk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ukk.p;
import vb2.s;
import vv8.q;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f280704w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f280704w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((k) this.f280704w, continuation, 0);
            case 1:
                return new h((p) this.f280704w, continuation, 1);
            case 2:
                return new h((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f280704w, continuation, 2);
            case 3:
                return new h((com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b) this.f280704w, continuation, 3);
            case 4:
                return new h((com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) this.f280704w, continuation, 4);
            case 5:
                return new h((com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a) this.f280704w, continuation, 5);
            case 6:
                return new h((uy1.j) this.f280704w, continuation, 6);
            case 7:
                return new h((com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f280704w, continuation, 7);
            case 8:
                return new h((s) this.f280704w, continuation, 8);
            case 9:
                return new h((vdl.h) this.f280704w, continuation, 9);
            case 10:
                return new h((ve1.g) this.f280704w, continuation, 10);
            case 11:
                return new h((ve4.s) this.f280704w, continuation, 11);
            case 12:
                return new h((vg6.k) this.f280704w, continuation, 12);
            case 13:
                return new h((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f280704w, continuation, 13);
            case 14:
                return new h((com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) this.f280704w, continuation, 14);
            case 15:
                return new h((Function1) this.f280704w, continuation, 15);
            case 16:
                return new h((com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b) this.f280704w, continuation, 16);
            case 17:
                return new h((com.revolut.feature.rfi_tool.impl.navigation.b) this.f280704w, continuation, 17);
            case 18:
                return new h((vlg.s) this.f280704w, continuation, 18);
            case 19:
                return new h((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f280704w, continuation, 19);
            case 20:
                return new h((vu5.h) this.f280704w, continuation, 20);
            case 21:
                return new h((q) this.f280704w, continuation, 21);
            case 22:
                return new h((com.revolut.feature.joint.impl.ui.deeplink.a) this.f280704w, continuation, 22);
            case 23:
                return new h((w75.l) this.f280704w, continuation, 23);
            case 24:
                return new h((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.f280704w, continuation, 24);
            case 25:
                return new h((w8a.j) this.f280704w, continuation, 25);
            case 26:
                return new h((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.f280704w, continuation, 26);
            case 27:
                return new h((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) this.f280704w, continuation, 27);
            case 28:
                return new h((wkg.f) this.f280704w, continuation, 28);
            default:
                return new h((wlh.k) this.f280704w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk9.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
