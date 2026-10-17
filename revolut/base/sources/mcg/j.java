package mcg;

import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.direct.debit.account_selection.models.DirectDebitPreviousMandate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.sso.impl.ui.auth.n;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mfl.o;
import n38.d0;
import nii.c0;
import oul.r;
import tjh.h0;
import vzk.u;
import wjh.t;
import x8j.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f204355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj2, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d dVar, Continuation continuation) {
        super(1, continuation);
        this.u = 1;
        this.f204355w = obj2;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) this.v, (HotelsProperty) this.f204355w, continuation, 0);
            case 1:
                return new j(this.f204355w, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) this.v, continuation);
            case 2:
                return new j((o) this.v, (wbl.j) this.f204355w, continuation, 2);
            case 3:
                return new j((tji.f) this.v, (c0) this.f204355w, continuation, 3);
            case 4:
                return new j((n) this.v, (mm0.b) this.f204355w, continuation, 4);
            case 5:
                return new j((r) this.v, (com.revolut.trading.orders.ui.invest.placement.target_price.b) this.f204355w, continuation, 5);
            case 6:
                return new j((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.v, (f0) this.f204355w, continuation, 6);
            case 7:
                return new j((com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) this.v, (FreelancerInvoice) this.f204355w, continuation, 7);
            case 8:
                return new j((u8) this.v, (p1g.m) this.f204355w, continuation, 8);
            case 9:
                return new j((com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.v, (WhoToTransferFilter) this.f204355w, continuation, 9);
            case 10:
                return new j((s38.n) this.v, (d0) this.f204355w, continuation, 10);
            case 11:
                return new j((yof.b) this.v, (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f204355w, continuation, 11);
            case 12:
                return new j((h0) this.v, (t) this.f204355w, continuation, 12);
            case 13:
                return new j((ty4.o) this.v, (DirectDebitPreviousMandate) this.f204355w, continuation, 13);
            case 14:
                return new j((v4a.m) this.v, (WhoToTransferFilter) this.f204355w, continuation, 14);
            case 15:
                return new j(this.v, (v4a.m) this.f204355w, continuation, 15);
            case 16:
                return new j((ved.o) this.v, (ty0.a) this.f204355w, continuation, 16);
            case 17:
                return new j((u) this.v, (Data) this.f204355w, continuation, 17);
            case 18:
                return new j((u) this.v, (wi0.b) this.f204355w, continuation, 18);
            case 19:
                return new j((wed.f0) this.v, (ty0.a) this.f204355w, continuation, 19);
            case 20:
                return new j((ww2.i) this.v, (f0) this.f204355w, continuation, 20);
            case 21:
                return new j((g0) this.v, (CryptoExchangeDestination) this.f204355w, continuation, 21);
            case 22:
                return new j((g0) this.v, (xi0.b) this.f204355w, continuation, 22);
            case 23:
                return new j((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.v, (String) this.f204355w, continuation, 23);
            case 24:
                return new j((z0k.o) this.v, (rzj.j) this.f204355w, continuation, 24);
            case 25:
                return new j((z0k.o) this.v, (rzj.f) this.f204355w, continuation, 25);
            default:
                return new j((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.v, (String) this.f204355w, continuation, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0861  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 2950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mcg.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = obj2;
        this.f204355w = obj3;
    }
}
