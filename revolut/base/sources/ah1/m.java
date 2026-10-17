package ah1;

import bke.x;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.feature.onboarding.impl.onboarding.v;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.shared.cards.model.SharedRevolutCard;
import dfj.g3;
import eh9.z;
import ft4.i0;
import g9j.t;
import gcg.e0;
import j2g.y;
import k4l.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4866w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(v vVar, Continuation continuation, Function1 function1) {
        super(1, continuation);
        this.u = 14;
        this.v = vVar;
        this.f4866w = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b) this.v, (SharedRevolutCard) this.f4866w, continuation, 0);
            case 1:
                return new m((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.v, (MarginQuote) this.f4866w, continuation, 1);
            case 2:
                return new m((com.revolut.feature_move_money.impl.amount.c) this.v, (s6i.e) this.f4866w, continuation, 2);
            case 3:
                return new m((beg.s) this.v, (cgi.o) this.f4866w, continuation, 3);
            case 4:
                return new m((x) this.v, (dt5.a) this.f4866w, continuation, 4);
            case 5:
                return new m((jai.e) this.v, (plc.i) this.f4866w, continuation, 5);
            case 6:
                return new m((Subaccount) this.v, (c7e.n) this.f4866w, continuation, 6);
            case 7:
                return new m((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.v, (r0) this.f4866w, continuation, 7);
            case 8:
                return new m((g3) this.v, (EsimProfile) this.f4866w, continuation, 8);
            case 9:
                return new m((u8) this.v, (ebg.p) this.f4866w, continuation, 9);
            case 10:
                return new m((yof.b) this.v, (z) this.f4866w, continuation, 10);
            case 11:
                return new m((i0) this.v, (a3) this.f4866w, continuation, 11);
            case 12:
                return new m((t) this.v, (CryptoExchangeDestination) this.f4866w, continuation, 12);
            case 13:
                return new m((v) this.v, (rbi.c) this.f4866w, continuation, 13);
            case 14:
                return new m((v) this.v, continuation, (gim.i) this.f4866w);
            case 15:
                return new m((e0) this.v, (jxf.a) this.f4866w, continuation, 15);
            case 16:
                return new m((u8) this.v, (e0) this.f4866w, continuation, 16);
            case 17:
                return new m((gh1.i) this.v, (SharedRevolutCard) this.f4866w, continuation, 17);
            case 18:
                return new m((com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b) this.v, (bp9.f) this.f4866w, continuation, 18);
            case 19:
                return new m((ec5.c) this.v, (ii5.g) this.f4866w, continuation, 19);
            case 20:
                return new m((isl.m) this.v, (isl.f) this.f4866w, continuation, 20);
            case 21:
                return new m((u8) this.v, (y) this.f4866w, continuation, 21);
            case 22:
                return new m((j7j.k) this.v, (j7j.b) this.f4866w, continuation, 22);
            case 23:
                return new m((sfe.m) this.v, (jd3.h) this.f4866w, continuation, 23);
            case 24:
                return new m((String) this.v, (jgd.x) this.f4866w, continuation, 24);
            case 25:
                return new m((yof.b) this.v, (jt1.z) this.f4866w, continuation, 25);
            case 26:
                return new m((jta.v) this.v, (com.revolut.feature.raffle.impl.data.models.b) this.f4866w, continuation, 26);
            case 27:
                return new m((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.v, (String) this.f4866w, continuation, 27);
            case 28:
                return new m((kd3.m) this.v, (String) this.f4866w, continuation, 28);
            default:
                return new m((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.v, (SlotChecklist) this.f4866w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039a  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r8v21, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.revolut.feature.onboarding.impl.onboarding.v] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = obj2;
        this.f4866w = obj3;
    }
}
