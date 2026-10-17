package rmf;

import akf.r0;
import akf.s1;
import amf.o;
import c9k.k;
import chc.c0;
import cmf.p;
import com.revolut.data.network.models.security.SecuritySettings;
import efm.r;
import ej9.t;
import ekf.i0;
import ekf.v;
import ekf.y;
import elf.s0;
import hmf.k0;
import kkf.d0;
import kkf.e7;
import kkf.h6;
import kkf.i7;
import kkf.j2;
import kkf.k1;
import kkf.k7;
import kkf.k9;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.q3;
import kkf.s7;
import kkf.s8;
import kkf.y0;
import kkf.y1;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import nof.i;
import tif.g;
import tlf.n;
import vkf.j;
import vkm.q;
import w4l.h;
import wkm.l;
import xkf.a1;
import xkf.f0;
import xkf.m0;
import xkf.q1;
import xkf.s;
import xkf.v0;
import xkf.w;
import y07.m;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends hmf.a {
    public final s A;
    public final j2 B;
    public final o2 C;
    public final w D;
    public final q3 E;
    public final f0 F;
    public final a1 G;
    public final m0 H;
    public final v0 I;
    public final q1 J;
    public final h6 K;
    public final e7 L;
    public final i7 M;
    public final k7 N;
    public final n7 O;
    public final s7 P;
    public final l8 Q;
    public final s8 R;
    public final k9 S;
    public final clf.a T;
    public final jlf.e U;
    public final b V;
    public final h0 e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tlf.i f255270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f255271h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f255272j;
    public final akf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vkf.f f255273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f255274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f255275n;
    public final i0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s1 f255276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f255277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kkf.e f255278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f255279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rhf.d f255280t;
    public final y0 u;
    public final k1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o1 f255281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e84.e f255282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f255283y;
    public final y1 z;

    public d(h0 commonDataSource, i transactionStatisticsProvider, tlf.i p2pTransferHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, o userCommentMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, vkf.f incomeSorterActionProvider, r0 juniorBlockInboundTransferSenderActionProvider, v juniorP2PTransferActionProvider, i0 p2pActionsProvider, s1 splitBillActionProvider, y p2pActionsMapper, kkf.e analyticsBlockProvider, d0 confirmationBlockProvider, rhf.d entryPoint, y0 equivalentBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, e84.e groupBillBlockProvider, j incomeSorterBannerBlockProvider, y1 initiatorBlockProvider, s juniorP2PTransferRequestBlockProvider, j2 juniorUnblockInboundTransferSenderBlockProvider, o2 limitExceededBlockProvider, w linkedPaymentLinkTransactionBlockProvider, q3 manageSubscriptionBlockProvider, f0 p2pNoteBlockProvider, a1 paymentBreakdownBlockProvider, m0 p2pPhoneNumberBlockProvider, v0 p2pScheduledPaymentBlockProvider, q1 paymentsTrackingWidgetBlockProvider, h6 securityDelayBlockProvider, e7 splitBillBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, s7 suspiciousTransactionBlockProvider, l8 toAccountBlockProvider, s8 transferReasonCatalogueBlockProvider, k9 warrantBlockProvider, clf.a slotBlockProvider, jlf.e p2pIconNavbarClickHandler, b p2pTransferAdditionalFiltersProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(p2pTransferHeaderProvider, "p2pTransferHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(incomeSorterActionProvider, "incomeSorterActionProvider");
        Intrinsics.checkNotNullParameter(juniorBlockInboundTransferSenderActionProvider, "juniorBlockInboundTransferSenderActionProvider");
        Intrinsics.checkNotNullParameter(juniorP2PTransferActionProvider, "juniorP2PTransferActionProvider");
        Intrinsics.checkNotNullParameter(p2pActionsProvider, "p2pActionsProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(p2pActionsMapper, "p2pActionsMapper");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(incomeSorterBannerBlockProvider, "incomeSorterBannerBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(juniorP2PTransferRequestBlockProvider, "juniorP2PTransferRequestBlockProvider");
        Intrinsics.checkNotNullParameter(juniorUnblockInboundTransferSenderBlockProvider, "juniorUnblockInboundTransferSenderBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(linkedPaymentLinkTransactionBlockProvider, "linkedPaymentLinkTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(manageSubscriptionBlockProvider, "manageSubscriptionBlockProvider");
        Intrinsics.checkNotNullParameter(p2pNoteBlockProvider, "p2pNoteBlockProvider");
        Intrinsics.checkNotNullParameter(paymentBreakdownBlockProvider, "paymentBreakdownBlockProvider");
        Intrinsics.checkNotNullParameter(p2pPhoneNumberBlockProvider, "p2pPhoneNumberBlockProvider");
        Intrinsics.checkNotNullParameter(p2pScheduledPaymentBlockProvider, "p2pScheduledPaymentBlockProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(securityDelayBlockProvider, "securityDelayBlockProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonCatalogueBlockProvider, "transferReasonCatalogueBlockProvider");
        Intrinsics.checkNotNullParameter(warrantBlockProvider, "warrantBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(p2pIconNavbarClickHandler, "p2pIconNavbarClickHandler");
        Intrinsics.checkNotNullParameter(p2pTransferAdditionalFiltersProvider, "p2pTransferAdditionalFiltersProvider");
        this.e = commonDataSource;
        this.f = transactionStatisticsProvider;
        this.f255270g = p2pTransferHeaderProvider;
        this.f255271h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f255272j = userCommentMenuOptionProvider;
        this.k = adjustForAnalyticsActionProvider;
        this.f255273l = incomeSorterActionProvider;
        this.f255274m = juniorBlockInboundTransferSenderActionProvider;
        this.f255275n = juniorP2PTransferActionProvider;
        this.o = p2pActionsProvider;
        this.f255276p = splitBillActionProvider;
        this.f255277q = p2pActionsMapper;
        this.f255278r = analyticsBlockProvider;
        this.f255279s = confirmationBlockProvider;
        this.f255280t = entryPoint;
        this.u = equivalentBlockProvider;
        this.v = fromBlockProvider;
        this.f255281w = getHelpBlockProvider;
        this.f255282x = groupBillBlockProvider;
        this.f255283y = incomeSorterBannerBlockProvider;
        this.z = initiatorBlockProvider;
        this.A = juniorP2PTransferRequestBlockProvider;
        this.B = juniorUnblockInboundTransferSenderBlockProvider;
        this.C = limitExceededBlockProvider;
        this.D = linkedPaymentLinkTransactionBlockProvider;
        this.E = manageSubscriptionBlockProvider;
        this.F = p2pNoteBlockProvider;
        this.G = paymentBreakdownBlockProvider;
        this.H = p2pPhoneNumberBlockProvider;
        this.I = p2pScheduledPaymentBlockProvider;
        this.J = paymentsTrackingWidgetBlockProvider;
        this.K = securityDelayBlockProvider;
        this.L = splitBillBlockProvider;
        this.M = statisticsBlockProvider;
        this.N = statusBlockProvider;
        this.O = statusWithNoticeBlockProvider;
        this.P = suspiciousTransactionBlockProvider;
        this.Q = toAccountBlockProvider;
        this.R = transferReasonCatalogueBlockProvider;
        this.S = warrantBlockProvider;
        this.T = slotBlockProvider;
        this.U = p2pIconNavbarClickHandler;
        this.V = p2pTransferAdditionalFiltersProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.T.Z2();
        p pVarC3 = this.K.c3();
        p pVarZ22 = this.S.Z2();
        p pVarZ23 = this.P.Z2();
        f0 f0Var = this.F;
        h0 h0Var = f0Var.f306704a;
        Continuation continuation = null;
        p pVar = new p(new t38.e(h0Var.d(), 24, h0Var.j(), new wvg.i(f0Var, continuation, 17)), new xkf.c(2), u.c(f0Var.f306706c), "P2PNote");
        p pVarZ24 = this.C.Z2();
        p pVarA = this.u.a();
        p pVarZ25 = this.f255283y.Z2();
        s sVar = this.A;
        h0 h0Var2 = sVar.f306766a;
        l lVarQ = q.Q(new t38.e(h0Var2.d(), 24, h0Var2.j(), new wa7.j(3, 12, continuation)), new x18.e(continuation, sVar, 12));
        xkf.c cVar = new xkf.c(1);
        zhm.f0 f0Var2 = zhm.f0.f322471a;
        p pVar2 = new p(lVarQ, cVar, f0Var2, "JuniorP2PTransferRequest");
        j2 j2Var = this.B;
        p pVar3 = new p(new kh4.f((SharedFlow) j2Var.f184769b.f185505g.getValue(), j2Var, 16), new kkf.i0(12), u.c(j2Var.f184770c), "JuniorUnblockInboundTransferSender");
        p pVarB3 = this.R.b3();
        p pVarA2 = this.O.a(false);
        p pVarA3 = k0.a(this.N.a(), this.v.Z2(), this.Q.Z2(), this.z.a(), this.f255279s.a());
        w wVar = this.D;
        p pVar4 = new p(q.Q(wVar.f306787a.h(new xif.c(19)), new x18.e((Continuation) null, wVar, 13)), new c0(23), f0Var2, "LinkedPaymentLinkTransaction");
        p pVarZ26 = this.J.Z2();
        m0 m0Var = this.H;
        p pVar5 = new p(new wyd.f(m0Var.f306732a.d(), m0Var, 6), new xkf.c(3), f0Var2, "P2PPhoneNumber");
        p pVarA4 = this.G.a();
        v0 v0Var = this.I;
        p pVar6 = new p(ta6.a.h(v0Var.f306779l.d(), (SharedFlow) v0Var.f306780m.f185624h.getValue(), new vy5.d0(v0Var.f306781n.a(), 22), new gce.l(v0Var, null)), new xkf.c(4), u.c(v0Var), "P2PScheduledPayment");
        p pVarB32 = this.L.b3();
        p pVarA5 = k0.a(this.f255278r.Z2(), this.M.Z2(this.f), this.E.a());
        rhf.d dVar = rhf.d.PAYMENT_GROUP_WIDGET;
        rhf.d dVar2 = this.f255280t;
        return h(zhm.v.k(pVarZ2, pVarC3, pVarZ22, pVarZ23, pVar, pVarZ24, pVarA, pVarZ25, pVar2, pVar3, pVarB3, pVarA2, pVarA3, pVar4, pVarZ26, pVar5, pVarA4, pVar6, pVarB32, pVarA5, this.f255282x.c((dVar2 == dVar || dVar2 == rhf.d.PAYMENT_GROUP_DETAILS) ? false : true), this.f255281w.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        tlf.i iVar = this.f255270g;
        h0 h0Var = iVar.f272072a;
        SharedFlow sharedFlowD = h0Var.d();
        SharedFlow sharedFlowE = h0Var.e();
        SharedFlow sharedFlowA = iVar.f272073b.a();
        jpc.e eVar = iVar.e;
        l lVarQ = q.Q(((h0) eVar.f177257c).d(), new tik.b((Continuation) null, eVar, 1));
        tc6.d dVar = new tc6.d(3, 7, null);
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        vkm.y yVarE = rd0.e.e(lVarQ, h0Var2, dVar);
        Flow flowJ = h0Var.j();
        vkm.y yVarI = iVar.d.i();
        ryc.a aVar = iVar.f;
        r rVarSwitchMap = ((wif.a) aVar.f258289a).d(wog.a.BILL_ACCOUNTS).switchMap(new tjf.m0(new tjf.e(aVar, 8), 2));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return new s6e.v(yh5.b.f(sharedFlowD, sharedFlowE, sharedFlowA, yVarE, flowJ, yVarI, rd0.e.e(rd0.e.b(rVarSwitchMap), h0Var2, new tc6.d(3, 5, null)), rd0.e.b(((njf.j) iVar.f272075g).c()), rd0.e.e(mo3.a.g(nim.a.v(rd0.e.b(osg.b.e(iVar.i.f203347a, false, io3.l.MERCHANT, null, io3.i.INTERNAL, null, null, null, 116)), new n(0)), null, new tj9.d(13), 1), h0Var2, new tc6.d(3, 8, null)), h0Var.g(), rd0.e.b(ue0.e.H(cl3.a.a(iVar.f272077j), h0Var2, new g(29)))), iVar, 28);
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.U;
    }

    @Override // hmf.b0
    public final Flow d() {
        cmf.f fVarZ2 = this.k.Z2();
        i0 i0Var = this.o;
        ekf.m0 m0Var = i0Var.f127085m;
        h0 h0Var = m0Var.f127104a;
        SharedFlow sharedFlowD = h0Var.d();
        Flow flowJ = h0Var.j();
        SharedFlow sharedFlowC = h0Var.c();
        SharedFlow sharedFlowA = m0Var.f127105b.a();
        Continuation continuation = null;
        vkm.y yVarE = rd0.e.e(new a87.b(mo3.a.g(rd0.e.b(nim.a.w(m0Var.f127106c.b(SecuritySettings.INCOGNITO, h.f294642c), new m(28))), null, new t(14), 1), 13), zhm.h0.f322473a, new k(3, 24, null));
        cw9.d dVar = (cw9.d) m0Var.d;
        cmf.f fVar = new cmf.f(new cqh.m(ta6.a.e(sharedFlowD, flowJ, sharedFlowC, sharedFlowA, ta6.a.g(yVarE, dVar.e(), dVar.d(), dVar.f109573b.A("TRANSFER.scheduled"), ekf.k0.f127098a), new e7f.a(1, null)), i0Var, 27), u.c(i0Var), "P2PActions");
        cmf.f fVarZ22 = this.f255276p.Z2();
        v vVar = this.f255275n;
        h0 h0Var2 = vVar.f127129l;
        cmf.f fVar2 = new cmf.f(q.Q(ta6.a.h(h0Var2.d(), h0Var2.j(), vVar.f127130m.a(), new ahe.h0(4, 3, continuation)), new dz6.n(continuation, vVar, 14)), u.c(vVar), "JuniorP2PTransfer");
        r0 r0Var = this.f255274m;
        return new qna.n(yh5.b.d(f(zhm.v.k(fVarZ2, fVar, fVarZ22, fVar2, new cmf.f(new a3i.i((SharedFlow) r0Var.f5890b.f185505g.getValue(), r0Var, 12), u.c(r0Var.f5891c), "JuniorBlockInboundTransferSender"), this.f255273l.Z2())), this.e.h(new rm2.s(10))), this, 20);
    }

    @Override // hmf.b0
    public final Flow e() {
        this.V.getClass();
        return g(zhm.v.k(this.f255272j.a(new rhj.m(24)), this.f255271h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
