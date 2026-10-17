package un8;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import unc.b0;
import up5.a0;
import urd.x;
import uv1.d0;
import uv6.l;
import uwa.q;
import uwi.u;
import uy1.o;
import uyd.h0;
import uz.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f281371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f281372x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 25;
        this.f281371w = iVar;
        this.f281372x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v50, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((k) this.f281371w, (String) this.f281372x, continuation, 0);
            case 1:
                return new j((b0) this.f281372x, continuation, 1);
            case 2:
                return new j((uoe.c) this.f281371w, (String) this.f281372x, continuation, 2);
            case 3:
                return new j((com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) this.f281371w, (SwitchOutReview) this.f281372x, continuation, 3);
            case 4:
                j jVar = new j((com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c) this.f281372x, continuation, 4);
                jVar.f281371w = obj2;
                return jVar;
            case 5:
                return new j((a0) this.f281371w, (CryptoAddress) this.f281372x, continuation, 5);
            case 6:
                return new j((com.revolut.feature.insurance_common.ui.screen.documents.a) this.f281371w, (rr7.b) this.f281372x, continuation, 6);
            case 7:
                return new j((x) this.f281371w, (String) this.f281372x, continuation, 7);
            case 8:
                return new j((com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b) this.f281371w, (lui.e) this.f281372x, continuation, 8);
            case 9:
                return new j((com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b) this.f281371w, (vti.d) this.f281372x, continuation, 9);
            case 10:
                return new j((uu8.d) this.f281371w, (ty0.a) this.f281372x, continuation, 10);
            case 11:
                return new j((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.f281371w, (InvestOrderContract$InputData) this.f281372x, continuation, 11);
            case 12:
                return new j((d0) this.f281371w, (Alias) this.f281372x, continuation, 12);
            case 13:
                return new j((l) this.f281371w, (hha.d) this.f281372x, continuation, 13);
            case 14:
                return new j((q) this.f281371w, (String) this.f281372x, continuation, 14);
            case 15:
                j jVar2 = new j((uwe.j) this.f281372x, continuation, 15);
                jVar2.f281371w = obj2;
                return jVar2;
            case 16:
                return new j((u) this.f281371w, (String) this.f281372x, continuation, 16);
            case 17:
                return new j((com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f281371w, (String) this.f281372x, continuation, 17);
            case 18:
                return new j((com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f281371w, (gw6.d) this.f281372x, continuation, 18);
            case 19:
                return new j((com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.a) this.f281371w, (String) this.f281372x, continuation, 19);
            case 20:
                return new j((uy1.j) this.f281371w, (ResolveAlias) this.f281372x, continuation, 20);
            case 21:
                return new j((uy1.j) this.f281371w, (zz1.k) this.f281372x, continuation, 21);
            case 22:
                return new j((o) this.f281371w, (ResolveAlias) this.f281372x, continuation, 22);
            case 23:
                return new j((h0) this.f281371w, (wi0.b) this.f281372x, continuation, 23);
            case 24:
                return new j((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f281371w, (hwe.k) this.f281372x, continuation, 24);
            case 25:
                return new j((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f281371w, (Function1) this.f281372x, continuation);
            case 26:
                return new j((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f281371w, (String) this.f281372x, continuation, 26);
            case 27:
                return new j((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f281371w, (bzh.f) this.f281372x, continuation, 27);
            case 28:
                return new j((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f281371w, (wd6.h) this.f281372x, continuation, 28);
            default:
                return new j((StateFlow) this.f281371w, (c0) this.f281372x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04af  */
    /* JADX WARN: Type inference failed for: r10v27, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un8.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281371w = obj2;
        this.f281372x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281372x = obj2;
    }
}
