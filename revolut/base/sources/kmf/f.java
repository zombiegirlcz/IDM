package kmf;

import akf.l0;
import amf.l;
import amf.o;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i;
import kkf.i7;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.o1;
import kkf.o2;
import kkf.x;
import kkf.y0;
import kkf.z4;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import oi3.g;
import okf.c0;
import okf.k;
import okf.u;
import okf.w;
import okf.z;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends hmf.a {
    public final clf.a A;
    public final u B;
    public final w C;
    public final z D;
    public final h0 e;
    public final kge.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f185837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f185838h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f185839j;
    public final k7 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f185840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f185841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f185842n;
    public final kkf.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z4 f185843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f185844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f185845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i9 f185846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f185847t;
    public final x u;
    public final o1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f185848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o2 f185849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i7 f185850y;
    public final nof.i z;

    public f(h0 commonDataSource, kge.d creditCardInstalmentHeaderProvider, l0 createInstalmentActionProvider, amf.a adjustForAnalyticsMenuOptionProvider, l uploadReceiptMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, d0 confirmationBlockProvider, k1 fromBlockProvider, i cardBlockProvider, kkf.e analyticsBlockProvider, z4 receiptsBlockProvider, c0 creditTransferDescriptionBlockProvider, k creditCardInstalmentBlockProvider, i9 userCommentBlockProvider, o userCommentMenuOptionProvider, x chargesBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, i7 statisticsBlockProvider, nof.i transactionStatisticsProvider, clf.a slotBlockProvider, u creditRepaymentLinkedTransactionBlockProvider, w creditRepaymentRevPointsAccountsBlockProvider, z creditRepaymentRevPointsRedemptionBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditCardInstalmentHeaderProvider, "creditCardInstalmentHeaderProvider");
        Intrinsics.checkNotNullParameter(createInstalmentActionProvider, "createInstalmentActionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(uploadReceiptMenuOptionProvider, "uploadReceiptMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(cardBlockProvider, "cardBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(receiptsBlockProvider, "receiptsBlockProvider");
        Intrinsics.checkNotNullParameter(creditTransferDescriptionBlockProvider, "creditTransferDescriptionBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentBlockProvider, "creditCardInstalmentBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(creditRepaymentLinkedTransactionBlockProvider, "creditRepaymentLinkedTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(creditRepaymentRevPointsAccountsBlockProvider, "creditRepaymentRevPointsAccountsBlockProvider");
        Intrinsics.checkNotNullParameter(creditRepaymentRevPointsRedemptionBlockProvider, "creditRepaymentRevPointsRedemptionBlockProvider");
        this.e = commonDataSource;
        this.f = creditCardInstalmentHeaderProvider;
        this.f185837g = createInstalmentActionProvider;
        this.f185838h = adjustForAnalyticsMenuOptionProvider;
        this.i = uploadReceiptMenuOptionProvider;
        this.f185839j = hideTransactionMenuOptionProvider;
        this.k = statusBlockProvider;
        this.f185840l = confirmationBlockProvider;
        this.f185841m = fromBlockProvider;
        this.f185842n = cardBlockProvider;
        this.o = analyticsBlockProvider;
        this.f185843p = receiptsBlockProvider;
        this.f185844q = creditTransferDescriptionBlockProvider;
        this.f185845r = creditCardInstalmentBlockProvider;
        this.f185846s = userCommentBlockProvider;
        this.f185847t = userCommentMenuOptionProvider;
        this.u = chargesBlockProvider;
        this.v = getHelpBlockProvider;
        this.f185848w = equivalentBlockProvider;
        this.f185849x = limitExceededBlockProvider;
        this.f185850y = statisticsBlockProvider;
        this.z = transactionStatisticsProvider;
        this.A = slotBlockProvider;
        this.B = creditRepaymentLinkedTransactionBlockProvider;
        this.C = creditRepaymentRevPointsAccountsBlockProvider;
        this.D = creditRepaymentRevPointsRedemptionBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.A.Z2();
        p pVarZ22 = this.f185849x.Z2();
        p pVarA = this.f185848w.a();
        u uVar = this.B;
        p pVar = new p(new g((SharedFlow) uVar.f226033a.d.getValue(), uVar, 5), new ok7.b(8), zhm.u.c(uVar.f226035c), "CreditRepaymentLinkedTransaction");
        p pVarA2 = this.k.a();
        p pVarZ23 = this.f185842n.Z2();
        p pVarZ24 = this.f185841m.Z2();
        w wVar = this.C;
        SharedFlow sharedFlow = (SharedFlow) wVar.f226037m.d.getValue();
        h0 h0Var = wVar.f226036l;
        p pVarA3 = k0.a(pVarA2, pVarZ23, pVarZ24, new p(ta6.a.h(sharedFlow, h0Var.d(), (Flow) h0Var.f185499q.getValue(), new b9k.a(4, wVar, w.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/CreditRepaymentRevPointsContext;Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/transactiondetails/account_detector/AccountDetector$Accounts;)Ljava/util/List;", 4, 9)), new ok7.b(9), v.k(wVar, wVar.o), "CreditRepaymentRevPointsAccounts"), this.f185840l.a());
        z zVar = this.D;
        g gVar = new g(zVar.f226040a.c(), zVar, 6);
        ok7.b bVar = new ok7.b(10);
        f0 f0Var = f0.f322471a;
        p pVar2 = new p(gVar, bVar, f0Var, "CreditRepaymentRevPointsRedemption");
        p pVarD = this.u.d(new kjk.x(7));
        p pVarZ25 = this.o.Z2();
        p pVarA4 = k0.a(this.f185846s.a(), this.f185843p.a(new kjk.x(19)));
        p pVarZ26 = this.f185850y.Z2(this.z);
        p pVarZ27 = this.f185845r.Z2();
        c0 c0Var = this.f185844q;
        return h(v.k(pVarZ2, pVarZ22, pVarA, pVar, pVarA3, pVar2, pVarD, pVarZ25, pVarA4, pVarZ26, pVarZ27, new p(new g(c0Var.f226006a.d(), c0Var, 7), new ok7.b(11), f0Var, "CreditTransferDescription"), this.v.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.s();
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.f185837g.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f185847t.a(new ah1.p(29)), this.i.a(new amf.i(0)), this.f185838h.a(), this.f185839j.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
