package rmf;

import akf.r0;
import ekf.c1;
import ekf.j;
import ekf.z0;
import elf.s0;
import jlf.l;
import kkf.d0;
import kkf.i7;
import kkf.j2;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.o1;
import kkf.x;
import klf.h0;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import nof.i;
import tlf.m;
import vkm.q;
import xkf.e1;
import xkf.q1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends hmf.a {
    public static final /* synthetic */ int E = 0;
    public final clf.a A;
    public final i7 B;
    public final k7 C;
    public final l8 D;
    public final h0 e;
    public final m1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f255284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f255285h;
    public final kbb.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.a f255286j;
    public final amf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final akf.c f255287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f255288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f255289n;
    public final c1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xkf.b f255290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kkf.e f255291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f255292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f255293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f255294t;
    public final o1 u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xkf.c1 f255295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e1 f255296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ykf.b f255297y;
    public final q1 z;

    public e(h0 commonDataSource, m1 juniorDataSource, i transactionStatisticsProvider, l paymentLinkClickHandler, kbb.c paymentLinkHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, j cancelPaymentLinkActionProvider, r0 juniorBlockInboundTransferSenderActionProvider, c1 sharePaymentLinkActionProvider, xkf.b activePaymentLinkBlockProvider, kkf.e analyticsBlockProvider, x chargesBlockProvider, d0 confirmationBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, j2 juniorUnblockInboundTransferSenderBlockProvider, xkf.c1 paymentLinkNoteBlockProvider, e1 paymentLinkStatusAndBeneficiaryBlockProvider, ykf.b paymentLinkWidgetBlockProvider, q1 paymentsTrackingWidgetBlockProvider, clf.a slotBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, l8 toAccountBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(paymentLinkClickHandler, "paymentLinkClickHandler");
        Intrinsics.checkNotNullParameter(paymentLinkHeaderProvider, "paymentLinkHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(cancelPaymentLinkActionProvider, "cancelPaymentLinkActionProvider");
        Intrinsics.checkNotNullParameter(juniorBlockInboundTransferSenderActionProvider, "juniorBlockInboundTransferSenderActionProvider");
        Intrinsics.checkNotNullParameter(sharePaymentLinkActionProvider, "sharePaymentLinkActionProvider");
        Intrinsics.checkNotNullParameter(activePaymentLinkBlockProvider, "activePaymentLinkBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(juniorUnblockInboundTransferSenderBlockProvider, "juniorUnblockInboundTransferSenderBlockProvider");
        Intrinsics.checkNotNullParameter(paymentLinkNoteBlockProvider, "paymentLinkNoteBlockProvider");
        Intrinsics.checkNotNullParameter(paymentLinkStatusAndBeneficiaryBlockProvider, "paymentLinkStatusAndBeneficiaryBlockProvider");
        Intrinsics.checkNotNullParameter(paymentLinkWidgetBlockProvider, "paymentLinkWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        this.e = commonDataSource;
        this.f = juniorDataSource;
        this.f255284g = transactionStatisticsProvider;
        this.f255285h = paymentLinkClickHandler;
        this.i = paymentLinkHeaderProvider;
        this.f255286j = adjustForAnalyticsMenuOptionProvider;
        this.k = hideTransactionMenuOptionProvider;
        this.f255287l = adjustForAnalyticsActionProvider;
        this.f255288m = cancelPaymentLinkActionProvider;
        this.f255289n = juniorBlockInboundTransferSenderActionProvider;
        this.o = sharePaymentLinkActionProvider;
        this.f255290p = activePaymentLinkBlockProvider;
        this.f255291q = analyticsBlockProvider;
        this.f255292r = chargesBlockProvider;
        this.f255293s = confirmationBlockProvider;
        this.f255294t = fromBlockProvider;
        this.u = getHelpBlockProvider;
        this.v = juniorUnblockInboundTransferSenderBlockProvider;
        this.f255295w = paymentLinkNoteBlockProvider;
        this.f255296x = paymentLinkStatusAndBeneficiaryBlockProvider;
        this.f255297y = paymentLinkWidgetBlockProvider;
        this.z = paymentsTrackingWidgetBlockProvider;
        this.A = slotBlockProvider;
        this.B = statisticsBlockProvider;
        this.C = statusBlockProvider;
        this.D = toAccountBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return q.Q(this.f.a(), new r3k.c(null, this, 9));
    }

    @Override // hmf.b0
    public final Flow b() {
        kbb.c cVar = this.i;
        Flow flowA0 = ((jt0.b) cVar.f182549b).A0(false);
        h0 h0Var = (h0) cVar.f182550c;
        return ta6.a.h(flowA0, h0Var.d(), h0Var.e(), new m(cVar, null));
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.f255285h;
    }

    @Override // hmf.b0
    public final Flow d() {
        c1 c1Var = this.o;
        cmf.f fVar = new cmf.f(new t38.e(c1Var.f127054l.d(), 24, new dfj.f(c1Var.f127055m.a(), 13), new z0(3, null)), u.c(c1Var), "SharePaymentLink");
        j jVar = this.f255288m;
        cmf.f fVar2 = new cmf.f(new t38.e(jVar.f127091l.d(), 24, jVar.f127092m.a(), new ekf.i(3, 4, j.class, jVar, "buildAction", "buildAction(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;")), u.c(jVar), "CancelPaymentLink");
        cmf.f fVarZ2 = this.f255287l.Z2();
        r0 r0Var = this.f255289n;
        return f(v.k(fVar, fVar2, fVarZ2, new cmf.f(new a3i.i((SharedFlow) r0Var.f5890b.f185505g.getValue(), r0Var, 12), u.c(r0Var.f5891c), "JuniorBlockInboundTransferSender")));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f255286j.a(), this.k.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
