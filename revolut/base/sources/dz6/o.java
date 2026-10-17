package dz6;

import aw0.n6;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import e0a.c0;
import e0a.w;
import e0f.r1;
import e50.u;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.l0;
import mx0.b4;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f121254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f121255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.f121255x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((q) this.f121254w, this.f121255x, continuation, 0);
            case 1:
                return new o((dzb.i) this.f121254w, (l0) this.f121255x, continuation, 1);
            case 2:
                return new o((dzd.g) this.f121254w, (String) this.f121255x, continuation, 2);
            case 3:
                return new o((b4) this.f121254w, (e0a.l) this.f121255x, continuation, 3);
            case 4:
                return new o((e0a.l) this.f121254w, (fu9.a) this.f121255x, continuation, 4);
            case 5:
                return new o((e0a.q) this.f121254w, (cu9.m) this.f121255x, continuation, 5);
            case 6:
                return new o((e0a.q) this.f121254w, (cu9.b) this.f121255x, continuation, 6);
            case 7:
                return new o((eu9.e) this.f121254w, (w) this.f121255x, continuation, 7);
            case 8:
                return new o((w) this.f121254w, (du9.a) this.f121255x, continuation, 8);
            case 9:
                return new o((w) this.f121254w, (P2PChatItem) this.f121255x, continuation, 9);
            case 10:
                return new o((c0) this.f121254w, (zm3.a) this.f121255x, continuation, 10);
            case 11:
                o oVar = new o((r1) this.f121254w, continuation, 11);
                oVar.f121255x = obj2;
                return oVar;
            case 12:
                return new o((e1a.f) this.f121254w, (String) this.f121255x, continuation, 12);
            case 13:
                return new o((com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) this.f121254w, (n6) this.f121255x, continuation, 13);
            case 14:
                return new o((com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) this.f121254w, (String) this.f121255x, continuation, 14);
            case 15:
                return new o((e2l.g) this.f121254w, (String) this.f121255x, continuation, 15);
            case 16:
                return new o((e31.j) this.f121254w, (dj0.d) this.f121255x, continuation, 16);
            case 17:
                return new o((e44.b) this.f121254w, (h1) this.f121255x, continuation, 17);
            case 18:
                return new o((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f121255x, continuation);
            case 19:
                o oVar2 = new o((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f121254w, continuation, 19);
                oVar2.f121255x = obj2;
                return oVar2;
            case 20:
                return new o((u) this.f121254w, this.f121255x, continuation, 20);
            case 21:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) this.f121254w, (CharSequence) this.f121255x, continuation, 21);
            case 22:
                return new o((e56.c) this.f121254w, (i56.g) this.f121255x, continuation, 22);
            case 23:
                return new o((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a) this.f121254w, (g65.f) this.f121255x, continuation, 23);
            case 24:
                return new o((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a) this.f121254w, (String) this.f121255x, continuation, 24);
            case 25:
                return new o((e75.o) this.f121254w, (LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable) this.f121255x, continuation, 25);
            case 26:
                return new o((e7b.h) this.f121254w, (String) this.f121255x, continuation, 26);
            case 27:
                return new o((e7e.a) this.f121254w, (k6e.d) this.f121255x, continuation, 27);
            case 28:
                return new o((com.revolut.feature.apm.multibanco.impl.ui.pay.a) this.f121254w, (String) this.f121255x, continuation, 28);
            default:
                return new o((com.revolut.feature.global_markets.impl.ui.flow.index_details.b) this.f121254w, (String) this.f121255x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:498:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz6.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121254w = obj2;
        this.f121255x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121254w = obj2;
    }
}
