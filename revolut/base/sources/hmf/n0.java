package hmf;

import kkf.i7;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.o1;
import kkf.q3;
import kkf.u1;
import kkf.y0;
import kkf.y1;
import kkf.z3;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xkf.c2;
import xkf.q1;
import xkf.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends a {
    public final dlf.k A;
    public final u1 B;
    public final mkf.l C;
    public final dlf.e D;
    public final dlf.d E;
    public final x0 F;
    public final twg.c G;
    public final kkf.e H;
    public final i7 I;
    public final q3 J;
    public final dlf.m K;
    public final dlf.f L;
    public final vkf.j M;
    public final z3 N;
    public final zkf.n O;
    public final zkf.b P;
    public final o1 Q;
    public final y0 R;
    public final clf.a S;
    public final kkf.m0 T;
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nof.i f153859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153860h;
    public final amf.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f153861j;
    public final ikf.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final akf.c f153862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ikf.h f153863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zkf.k f153864n;
    public final vkf.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1 f153865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dlf.q f153866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k7 f153867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dlf.b f153868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y1 f153869t;
    public final k1 u;
    public final l8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kkf.d0 f153870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xkf.y0 f153871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dlf.j f153872y;
    public final c2 z;

    public n0(klf.h0 commonDataSource, jt0.b commonHeaderProvider, nof.i transactionStatisticsProvider, amf.o userCommentMenuOptionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, ikf.j payerDetailsActionProvider, akf.c adjustForAnalyticsActionProvider, ikf.h cancelDepositActionProvider, zkf.k pixRefundActionProvider, vkf.f incomeSorterActionProvider, q1 paymentsTrackingWidgetBlockProvider, dlf.q topUpSpecialStatusBlockProvider, k7 statusBlockProvider, dlf.b checkPictureBlockProvider, y1 initiatorBlockProvider, k1 fromAccountBlockProvider, l8 toAccountBlockProvider, kkf.d0 confirmationBlockProvider, xkf.y0 payToTopUpLinkedAccountDetailsBlockProvider, dlf.j paymentCounterpartyInfoBlockProvider, c2 speiTrackingCellBlockProvider, dlf.k topUpChargesBlockProvider, u1 gstInvoiceBlockProvider, mkf.l bankTransferFooterLogoBlockProvider, dlf.e issuingBankBlockProvider, dlf.d externalCardBlockProvider, x0 payIdItemBlockProvider, twg.c payerDetailsBlockProvider, kkf.e analyticsBlockProvider, i7 statisticsBlockProvider, q3 manageSubscriptionBlockProvider, dlf.m topUpNoteBlockProvider, dlf.f modifiedDetailsReferenceProvider, vkf.j incomeSorterBannerBlockProvider, z3 originalTransactionBlockProvider, zkf.n pixRefundBlockProvider, zkf.b brazilPixTransactionTypeBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider, kkf.m0 detailsFieldsBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(payerDetailsActionProvider, "payerDetailsActionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(cancelDepositActionProvider, "cancelDepositActionProvider");
        Intrinsics.checkNotNullParameter(pixRefundActionProvider, "pixRefundActionProvider");
        Intrinsics.checkNotNullParameter(incomeSorterActionProvider, "incomeSorterActionProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(topUpSpecialStatusBlockProvider, "topUpSpecialStatusBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(checkPictureBlockProvider, "checkPictureBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(fromAccountBlockProvider, "fromAccountBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(payToTopUpLinkedAccountDetailsBlockProvider, "payToTopUpLinkedAccountDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfoBlockProvider, "paymentCounterpartyInfoBlockProvider");
        Intrinsics.checkNotNullParameter(speiTrackingCellBlockProvider, "speiTrackingCellBlockProvider");
        Intrinsics.checkNotNullParameter(topUpChargesBlockProvider, "topUpChargesBlockProvider");
        Intrinsics.checkNotNullParameter(gstInvoiceBlockProvider, "gstInvoiceBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferFooterLogoBlockProvider, "bankTransferFooterLogoBlockProvider");
        Intrinsics.checkNotNullParameter(issuingBankBlockProvider, "issuingBankBlockProvider");
        Intrinsics.checkNotNullParameter(externalCardBlockProvider, "externalCardBlockProvider");
        Intrinsics.checkNotNullParameter(payIdItemBlockProvider, "payIdItemBlockProvider");
        Intrinsics.checkNotNullParameter(payerDetailsBlockProvider, "payerDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(manageSubscriptionBlockProvider, "manageSubscriptionBlockProvider");
        Intrinsics.checkNotNullParameter(topUpNoteBlockProvider, "topUpNoteBlockProvider");
        Intrinsics.checkNotNullParameter(modifiedDetailsReferenceProvider, "modifiedDetailsReferenceProvider");
        Intrinsics.checkNotNullParameter(incomeSorterBannerBlockProvider, "incomeSorterBannerBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(pixRefundBlockProvider, "pixRefundBlockProvider");
        Intrinsics.checkNotNullParameter(brazilPixTransactionTypeBlockProvider, "brazilPixTransactionTypeBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(detailsFieldsBlockProvider, "detailsFieldsBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153859g = transactionStatisticsProvider;
        this.f153860h = userCommentMenuOptionProvider;
        this.i = adjustForAnalyticsMenuOptionProvider;
        this.f153861j = hideTransactionMenuOptionProvider;
        this.k = payerDetailsActionProvider;
        this.f153862l = adjustForAnalyticsActionProvider;
        this.f153863m = cancelDepositActionProvider;
        this.f153864n = pixRefundActionProvider;
        this.o = incomeSorterActionProvider;
        this.f153865p = paymentsTrackingWidgetBlockProvider;
        this.f153866q = topUpSpecialStatusBlockProvider;
        this.f153867r = statusBlockProvider;
        this.f153868s = checkPictureBlockProvider;
        this.f153869t = initiatorBlockProvider;
        this.u = fromAccountBlockProvider;
        this.v = toAccountBlockProvider;
        this.f153870w = confirmationBlockProvider;
        this.f153871x = payToTopUpLinkedAccountDetailsBlockProvider;
        this.f153872y = paymentCounterpartyInfoBlockProvider;
        this.z = speiTrackingCellBlockProvider;
        this.A = topUpChargesBlockProvider;
        this.B = gstInvoiceBlockProvider;
        this.C = bankTransferFooterLogoBlockProvider;
        this.D = issuingBankBlockProvider;
        this.E = externalCardBlockProvider;
        this.F = payIdItemBlockProvider;
        this.G = payerDetailsBlockProvider;
        this.H = analyticsBlockProvider;
        this.I = statisticsBlockProvider;
        this.J = manageSubscriptionBlockProvider;
        this.K = topUpNoteBlockProvider;
        this.L = modifiedDetailsReferenceProvider;
        this.M = incomeSorterBannerBlockProvider;
        this.N = originalTransactionBlockProvider;
        this.O = pixRefundBlockProvider;
        this.P = brazilPixTransactionTypeBlockProvider;
        this.Q = getHelpBlockProvider;
        this.R = equivalentBlockProvider;
        this.S = slotBlockProvider;
        this.T = detailsFieldsBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.S.Z2();
        cmf.p pVarZ22 = this.M.Z2();
        cmf.p pVarZ23 = this.f153865p.Z2();
        cmf.p pVarA = this.R.a();
        dlf.q qVar = this.f153866q;
        klf.h0 h0Var = qVar.f115758l;
        cmf.p pVar = new cmf.p(ta6.a.g(h0Var.d(), h0Var.c(), new dfj.f(qVar.f115759m.a(), 2), h0Var.i(), new amf.g(5, qVar, dlf.q.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;ZLorg/joda/time/DateTime;)Ljava/util/List;", 4, 1)), new dkd.a(19), zhm.u.c(qVar), "TopUpSpecialStatus");
        cmf.p pVarA2 = this.f153867r.a();
        zkf.b bVar = this.P;
        klf.h0 h0Var2 = bVar.f322951a;
        t38.e eVar = new t38.e(h0Var2.d(), 24, h0Var2.c(), new qkf.r(3, bVar, zkf.b.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 3));
        zhm.f0 f0Var = zhm.f0.f322471a;
        cmf.p pVar2 = new cmf.p(eVar, new chc.c0(23), f0Var, "BrazilPixTransactionType");
        dlf.b bVar2 = this.f153868s;
        cmf.p pVarA3 = k0.a(pVarA2, pVar2, new cmf.p(new cqh.m(bVar2.f115734l.d(), bVar2, 9), new dkd.a(11), zhm.u.c(bVar2), "CheckPicture"), this.f153869t.a(), this.u.Z2(), this.v.Z2(), this.f153870w.a());
        xkf.y0 y0Var = this.f153871x;
        klf.h0 h0Var3 = y0Var.f306800a;
        cmf.p pVar3 = new cmf.p(new t38.e(h0Var3.c(), 24, h0Var3.d(), new wvg.i(y0Var, null, 18)), new xkf.c(6), f0Var, "PayToTopUpLinkedAccountDetails");
        cmf.p pVarA4 = this.f153872y.a();
        c2 c2Var = this.z;
        cmf.p pVar4 = new cmf.p(new wyd.f(c2Var.f306689l.c(), c2Var, 13), new xkf.c(13), zhm.u.c(c2Var), "SpeiTrackingCell");
        dlf.k kVar = this.A;
        klf.h0 h0Var4 = kVar.f115747a;
        cmf.p pVar5 = new cmf.p(new t38.e(h0Var4.c(), 24, h0Var4.d(), new bwb.n(kVar, null, 23)), new dkd.a(17), zhm.u.c(kVar.f115749c), "TopUpCharges");
        dlf.e eVar2 = this.D;
        klf.h0 h0Var5 = eVar2.f115738a;
        cmf.p pVar6 = new cmf.p(new t38.e(h0Var5.d(), 24, h0Var5.c(), new ael.l0(3, eVar2, dlf.e.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 4)), new dkd.a(13), f0Var, "IssuingBank");
        dlf.d dVar = this.E;
        cmf.p pVarA5 = k0.a(pVar6, new cmf.p(new cqh.m(dVar.f115737a.c(), dVar, 10), new dkd.a(12), f0Var, "ExternalCard"));
        x0 x0Var = this.F;
        cmf.p pVar7 = new cmf.p(new wyd.f(x0Var.f306795a.d(), x0Var, 7), new xkf.c(5), f0Var, "PayIdItem");
        twg.c cVar = this.G;
        klf.h0 h0Var6 = (klf.h0) cVar.f275017a;
        cmf.p pVar8 = new cmf.p(ta6.a.h(h0Var6.c(), h0Var6.d(), ((m1) cVar.f275018b).a(), new dlf.g(cVar, null, 0)), new dkd.a(15), f0Var, "PayerDetails");
        kkf.m0 m0Var = this.T;
        cmf.p pVar9 = new cmf.p(new kh4.f(m0Var.f184818a.c(), m0Var, 5), new chc.c0(23), f0Var, "DetailsFields");
        cmf.p pVarA6 = k0.a(this.H.Z2(), this.I.Z2(this.f153859g), this.J.a());
        cmf.p pVarB3 = this.N.b3(true);
        zkf.n nVar = this.O;
        cmf.p pVar10 = new cmf.p(new ymk.u(nVar.f322969l.c(), nVar, 9), new chc.c0(23), zhm.u.c(nVar), "PixRefund");
        cmf.p pVarZ24 = this.B.Z2();
        dlf.m mVar = this.K;
        cmf.p pVar11 = new cmf.p(new cqh.m(mVar.f115751a.d(), mVar, 12), new dkd.a(18), zhm.u.c(mVar.f115753c), "TopUpNote");
        dlf.f fVar = this.L;
        klf.h0 h0Var7 = fVar.f115739a;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarZ23, pVarA, pVar, pVarA3, pVar3, pVarA4, pVar4, pVar5, pVarA5, pVar7, pVar8, pVar9, pVarA6, pVarB3, pVar10, pVarZ24, pVar11, new cmf.p(new t38.e(h0Var7.d(), 24, h0Var7.c(), new ael.l0(3, fVar, dlf.f.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 5)), new dkd.a(14), f0Var, "ModifiedDetailsReference"), this.Q.a(), this.C.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        ikf.j jVar = this.k;
        klf.h0 h0Var = jVar.f161959l;
        cmf.f fVar = new cmf.f(ta6.a.h(h0Var.c(), h0Var.d(), jVar.f161960m.a(), new ikf.i(jVar, null)), zhm.u.c(jVar), "PayerDetailsActions");
        cmf.f fVarZ2 = this.f153862l.Z2();
        cmf.f fVarZ22 = this.o.Z2();
        zkf.k kVar = this.f153864n;
        klf.h0 h0Var2 = kVar.f322962l;
        cmf.f fVar2 = new cmf.f(ta6.a.h(h0Var2.d(), h0Var2.c(), kVar.f322963m.a(), new zkf.j(4, 4, zkf.k.class, kVar, "buildAction", "buildAction(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;")), zhm.u.c(kVar), "PixRefundAction");
        ikf.h hVar = this.f153863m;
        return f(zhm.v.k(fVar, fVarZ2, fVarZ22, fVar2, new cmf.f(rd0.e.e(vkm.q.Q(hVar.f161955s, new eh9.j(null, hVar, 21)), zhm.h0.f322473a, new ikf.d(3, null)), zhm.u.c(hVar), "CancelDepositActions")));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153860h.a(new ah1.p(29)), this.i.a(), this.f153861j.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
