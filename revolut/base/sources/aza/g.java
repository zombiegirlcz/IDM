package aza;

import b9d.n;
import be3.m;
import bl6.l;
import blh.q;
import bnh.c0;
import bpe.k;
import bpl.j;
import bs4.t;
import bt9.w;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f11421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11421w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e) this.f11421w, continuation, 0);
            case 1:
                return new g((b41.e) this.f11421w, continuation, 1);
            case 2:
                return new g((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f11421w, continuation, 2);
            case 3:
                return new g((com.revolut.feature.joint.impl.ui.invite_flow.d) this.f11421w, continuation, 3);
            case 4:
                return new g((com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a) this.f11421w, continuation, 4);
            case 5:
                return new g((n) this.f11421w, continuation, 5);
            case 6:
                return new g((AccountInformationScreen) this.f11421w, continuation, 6);
            case 7:
                return new g((com.revolut.feature_retail_user_declarations.bank_terms.a) this.f11421w, continuation, 7);
            case 8:
                return new g((bam.a) this.f11421w, continuation, 8);
            case 9:
                return new g((com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b) this.f11421w, continuation, 9);
            case 10:
                return new g((bbc.i) this.f11421w, continuation, 10);
            case 11:
                return new g((m) this.f11421w, continuation, 11);
            case 12:
                return new g((com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) this.f11421w, continuation, 12);
            case 13:
                return new g((com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) this.f11421w, continuation, 13);
            case 14:
                return new g((com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b) this.f11421w, continuation, 14);
            case 15:
                return new g((l) this.f11421w, continuation, 15);
            case 16:
                return new g((q) this.f11421w, continuation, 16);
            case 17:
                return new g((bmk.q) this.f11421w, continuation, 17);
            case 18:
                return new g((bn4.b) this.f11421w, continuation, 18);
            case 19:
                return new g((com.revolut.feature.crypto.tfr.validation.impl.pob.a) this.f11421w, continuation, 19);
            case 20:
                return new g((c0) this.f11421w, continuation, 20);
            case 21:
                return new g((bpc.c) this.f11421w, continuation, 21);
            case 22:
                return new g((k) this.f11421w, continuation, 22);
            case 23:
                return new g((j) this.f11421w, continuation, 23);
            case 24:
                return new g((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.f11421w, continuation, 24);
            case 25:
                return new g((bq7.l) this.f11421w, continuation, 25);
            case 26:
                return new g((com.revolut.sso.impl.ui.signin_sessions_flow.a) this.f11421w, continuation, 26);
            case 27:
                return new g((t) this.f11421w, continuation, 27);
            case 28:
                return new g((w) this.f11421w, continuation, 28);
            default:
                return new g((bu4.m) this.f11421w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:347:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aza.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
