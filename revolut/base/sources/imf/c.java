package imf;

import akf.k;
import akf.s1;
import cmf.p;
import elf.g;
import elf.s0;
import hmf.k0;
import kkf.d0;
import kkf.e7;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.s8;
import kkf.y0;
import kkf.z7;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.h;
import lkf.m;
import lkf.z;
import vkm.q;
import xkf.a1;
import xkf.q1;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends hmf.a {
    public final kkf.e A;
    public final o1 B;
    public final s8 C;
    public final h0 e;
    public final kbb.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f162400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f162401h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f162402j;
    public final s1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f162403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final clf.a f162404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o2 f162405n;
    public final y0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1 f162406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f162407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f162408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n7 f162409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k7 f162410t;
    public final k1 u;
    public final l8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f162411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a1 f162412x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e7 f162413y;
    public final e84.e z;

    public c(h0 commonDataSource, kbb.c apmTransferHeaderProvider, g apmTransferClickHandler, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, k apmTransferActionProvider, s1 splitBillActionProvider, h apmDisclaimerBlockProvider, clf.a slotBlockProvider, o2 limitExceededBlockProvider, y0 equivalentBlockProvider, q1 paymentsTrackingWidgetBlockProvider, m apmNoteBlockProvider, z apmTransferBlockProvider, n7 statusWithNoticeBlockProvider, k7 statusBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, d0 confirmationBlockProvider, a1 paymentBreakdownProvider, e7 splitBillBlockProvider, e84.e groupBillBlockProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, s8 transferReasonCatalogueBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(apmTransferHeaderProvider, "apmTransferHeaderProvider");
        Intrinsics.checkNotNullParameter(apmTransferClickHandler, "apmTransferClickHandler");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(apmTransferActionProvider, "apmTransferActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(apmDisclaimerBlockProvider, "apmDisclaimerBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(apmNoteBlockProvider, "apmNoteBlockProvider");
        Intrinsics.checkNotNullParameter(apmTransferBlockProvider, "apmTransferBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(paymentBreakdownProvider, "paymentBreakdownProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonCatalogueBlockProvider, "transferReasonCatalogueBlockProvider");
        this.e = commonDataSource;
        this.f = apmTransferHeaderProvider;
        this.f162400g = apmTransferClickHandler;
        this.f162401h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f162402j = apmTransferActionProvider;
        this.k = splitBillActionProvider;
        this.f162403l = apmDisclaimerBlockProvider;
        this.f162404m = slotBlockProvider;
        this.f162405n = limitExceededBlockProvider;
        this.o = equivalentBlockProvider;
        this.f162406p = paymentsTrackingWidgetBlockProvider;
        this.f162407q = apmNoteBlockProvider;
        this.f162408r = apmTransferBlockProvider;
        this.f162409s = statusWithNoticeBlockProvider;
        this.f162410t = statusBlockProvider;
        this.u = fromBlockProvider;
        this.v = toAccountBlockProvider;
        this.f162411w = confirmationBlockProvider;
        this.f162412x = paymentBreakdownProvider;
        this.f162413y = splitBillBlockProvider;
        this.z = groupBillBlockProvider;
        this.A = analyticsBlockProvider;
        this.B = getHelpBlockProvider;
        this.C = transferReasonCatalogueBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        h hVar = this.f162403l;
        z7 z7Var = new z7(hVar.f196382a.d(), hVar, 27);
        lh9.b bVar = new lh9.b(21);
        f0 f0Var = f0.f322471a;
        p pVar = new p(z7Var, bVar, f0Var, "ApmDisclaimerBlockProvider");
        p pVarZ2 = this.f162404m.Z2();
        p pVarZ22 = this.f162405n.Z2();
        p pVarA = this.o.a();
        p pVarZ23 = this.f162406p.Z2();
        m mVar = this.f162407q;
        p pVar2 = new p(new z7(mVar.f196393a.d(), mVar, 29), new lh9.b(23), f0Var, "ApmNoteBlockProvider");
        p pVarB3 = this.C.b3();
        p pVarA2 = this.f162409s.a(false);
        p pVarA3 = k0.a(this.f162410t.a(), this.u.Z2(), this.v.Z2(), this.f162411w.a());
        z zVar = this.f162408r;
        return h(v.k(pVar, pVarZ2, pVarZ22, pVarA, pVarZ23, pVar2, pVarB3, pVarA2, pVarA3, new p(new lkf.v(zVar.f196417a.d(), zVar, 1), new lh9.b(27), f0Var, "ApmTransferBlock"), this.f162412x.a(), this.f162413y.b3(), this.z.c(true), this.A.Z2(), this.B.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        kbb.c cVar = this.f;
        return q.q(new t38.e(((jt0.b) cVar.f182549b).A0(true), 24, ((h0) cVar.f182550c).d(), new olf.a(cVar, null)));
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.f162400g;
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(v.k(this.f162402j.b3(), this.k.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f162401h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
