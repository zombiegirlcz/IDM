package com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review;

import ax4.d;
import ax4.j;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.u1;
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import f8l.f;
import hx7.e;
import io3.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import kl.t1;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o7.b;
import oki.h;
import om4.a4;
import om4.l3;
import om4.z3;
import qg7.p;
import s6e.v;
import ss4.z;
import su4.i;
import su4.k;
import su4.m;
import su4.o;
import vkm.j2;
import vkm.q;
import vkm.t0;
import zh9.u0;
import zhm.a1;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements k, d {
    public final CreditCardRepayPaymentReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z3 f69618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i1j.a f69619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cx4.a f69620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f69621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final su4.b f69622t;
    public final t1 u;
    public final wj0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vt4.b f69623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final uu4.b f69624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69625y;
    public final y z;

    public a(CreditCardRepayPaymentReviewScreenContract$InputData inputData, z3 creditCardRepayInteractor, i1j.a balancesFilterInteractor, cx4.a creditScreenConstructorControllerExtension, b orderQuoteInteractor, su4.b dialogFactory, t1 currencyRateNaviProvider, wj0.a idempotencyKeyHolder, vt4.b creditCardDialogMapper, uu4.b creditCardRepayRetryableErrorHandler, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardRepayInteractor, "creditCardRepayInteractor");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardRepayRetryableErrorHandler, "creditCardRepayRetryableErrorHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69618p = creditCardRepayInteractor;
        this.f69619q = balancesFilterInteractor;
        this.f69620r = creditScreenConstructorControllerExtension;
        this.f69621s = orderQuoteInteractor;
        this.f69622t = dialogFactory;
        this.u = currencyRateNaviProvider;
        this.v = idempotencyKeyHolder;
        this.f69623w = creditCardDialogMapper;
        this.f69624x = creditCardRepayRetryableErrorHandler;
        this.f69625y = e.a(this, new scl.h(this, 28));
        this.z = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static OrderQuoteParams I2(su4.h hVar) {
        xi0.b bVar;
        j1j.d dVar = hVar.f265643c;
        if (dVar == null || (bVar = dVar.f170618b) == null) {
            return null;
        }
        xi0.b bVar2 = hVar.b().f115083b;
        if (bVar.equals(bVar2)) {
            return null;
        }
        f8l.e eVar = f8l.e.MARKET;
        dj0.d dVarB = hVar.b();
        return new OrderQuoteParams(bVar, bVar2, eVar, new BigDecimal(BigInteger.valueOf(dVarB.f115082a), dVarB.f115083b.c()), f8l.b.TO, f8l.b.FROM, null, false, null, f.RETAIL, null, null, null, null, 15616);
    }

    public static su4.h L2(su4.h hVar) {
        dj0.d dVar = hVar.d;
        if (dVar == null) {
            return su4.h.a(hVar, null, null, false, true, null, null, 8095);
        }
        long j2 = dVar.f115082a;
        xi0.b bVar = dVar.f115083b;
        dj0.d dVarB = hVar.b();
        xi0.b bVar2 = dVarB.f115083b;
        if (Intrinsics.f(bVar, bVar2)) {
            return su4.h.a(hVar, null, null, j2 < dVarB.f115082a, false, null, null, 8095);
        }
        CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = hVar.k;
        if (creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData == null || !Intrinsics.f(creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69611a, bVar) || !Intrinsics.f(creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69612b, bVar2)) {
            creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = null;
        }
        if (creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData == null) {
            return su4.h.a(hVar, null, null, false, true, null, null, 8095);
        }
        return su4.h.a(hVar, null, null, j2 < creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.d.f115082a, false, null, null, 8095);
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f69620r).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f69620r.B1(config);
    }

    @Override // ax4.d
    public final void C(j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f69620r).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f69620r).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f69620r.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f69620r).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f69620r.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f69620r).I(info, function1);
    }

    @Override // yji.l
    public final void I1() {
        this.v.a("credit_card_repay_payment_idempotency_key_tag");
        J2();
    }

    public final void J2() {
        a4 a4Var = (a4) this.f69618p;
        a4Var.getClass();
        k1j.d dVar = k1j.d.RETAIL;
        l lVar = l.CURRENT;
        j8l.a aVar = j8l.a.CREDIT_CARD;
        Set setK = a1.k(((n7i.a) a4Var.f226519c).a(aVar, x5i.d.SOURCE), u.c(yoj.b.y(aVar)));
        h0 h0Var = h0.f322473a;
        BalancesInteractor$InputData balancesInteractor$InputData = new BalancesInteractor$InputData(dVar, lVar, setK, h0Var, null, null, null, null, 240);
        Continuation continuation = null;
        int i = 0;
        yji.l.b1(this, nim.a.v(rd0.e.n(u0.m(nim.a.v(rd0.e.b(a4Var.f226517a.e(balancesInteractor$InputData, null)), new l3(8)), ngm.n.K(new su4.n(this, continuation, i))), h0Var), new m(this, i)), null, new o(this, continuation, i), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69625y;
    }

    public final void K2() {
        j1j.d dVar;
        String str;
        String strB;
        su4.h hVar = (su4.h) ((i) ((j2) this.z.f22677a).getValue()).f265649a.getContent();
        if (hVar == null || (dVar = hVar.f265643c) == null || (str = dVar.f170617a) == null || hVar.f || hVar.f265644g || (strB = this.v.b("credit_card_repay_payment_idempotency_key_tag")) == null) {
            return;
        }
        n2(new p(this, str, hVar, strB, (Continuation) null, 28), new whi.b(6));
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f69620r.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f69620r).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f69620r.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(q.q(new v(new t0(this.z.B(new z(7)), 1), this, 13)), new s9b.n(continuation, this, 10)), null, new o(this, continuation, 1), 3);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f69620r.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f69620r).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f69620r).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f69620r.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f69620r).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f69620r.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f69620r.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f69620r).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f69620r.e2(documentItem);
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f69620r).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        su4.h hVar;
        CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
        j1j.d dVar;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        boolean zF = Intrinsics.f(actionId, "id_credit_card_repay_balance_row_click_action");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f69625y;
        y yVar = this.z;
        if (!zF) {
            if (!Intrinsics.f(actionId, "id_credit_card_repay_exchange_rate_click_action") || (hVar = (su4.h) ((i) ((j2) yVar.f22677a).getValue()).f265649a.getContent()) == null || (creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = hVar.k) == null) {
                return;
            }
            h.y2(aVar, new CreditCardRepayPaymentReviewScreenContract$ModalStep.ExchangedAmount(creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData), bottom_dialog);
            return;
        }
        su4.h hVar2 = (su4.h) ((i) ((j2) yVar.f22677a).getValue()).f265649a.getContent();
        String str = (hVar2 == null || (dVar = hVar2.f265643c) == null) ? null : dVar.f170617a;
        a4 a4Var = (a4) this.f69618p;
        a4Var.getClass();
        j8l.a aVar2 = j8l.a.CREDIT_CARD;
        h.v2(aVar, new CreditCardRepayPaymentReviewScreenContract$ModalStep.BalancePicker(new BalanceSelector$InputData(a1.k(((n7i.a) a4Var.f226519c).a(aVar2, x5i.d.SOURCE), u.c(yoj.b.y(aVar2))), k1j.d.RETAIL, l.CURRENT, null, null, null, null, str, null, 376)), bottom_dialog);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f69620r).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f69620r.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f69620r).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f69620r.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(dx4.t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f69620r).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f69620r.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f69620r.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f69620r.x1(document);
    }
}
