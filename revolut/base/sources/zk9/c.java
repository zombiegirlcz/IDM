package zk9;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.pay_later.api.models.PayLaterFaqKey;
import com.revolut.feature.pay_later.api.navigation.OverdueInfoDescriptor;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ej9.e0;
import grl.r2;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements wk9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f322924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an4.i f322925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ti9.h f322926c;
    public final qi9.d d;
    public final xh9.a e;
    public final gte.a f;

    public c(sri.m navigator, an4.i payLaterProductCommandFactory, ti9.h payLaterProductFeatureTogglesInteractor, qi9.d payLaterNavigationCommandFactory, xh9.a payLaterInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(payLaterProductCommandFactory, "payLaterProductCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureTogglesInteractor, "payLaterProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f322924a = navigator;
        this.f322925b = payLaterProductCommandFactory;
        this.f322926c = payLaterProductFeatureTogglesInteractor;
        this.d = payLaterNavigationCommandFactory;
        this.e = payLaterInteractor;
        this.f = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "pay-later") || Intrinsics.f(cVar.e(2), "pay-later");
    }

    public final d0 b(jf0.c deeplink, boolean z) {
        Object next;
        int i;
        d0 d0VarL;
        q.Companion.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        n nVar = new n("revolut://app/pay-later/plans/(.*)/instalments/([0-9]+)", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        k kVar = new k("revolut://app/pay-later/plans/([^/\\s?#]+).*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g gVar = new g("revolut://app/pay-later/application.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        o oVar = new o("revolut://app/pay-later/repayments.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p pVar = new p("revolut://app/pay-later/repayment-explainer.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        m mVar = new m("revolut://app/pay-later/repay.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        l lVar = new l("revolut://app/pay-later/plans.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i("revolut://app/pay-later/faq.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        f fVar = new f("revolut://app/pay-later/account-details.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        h hVar = new h("revolut://app/pay-later/deactivate.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        j jVar = new j("revolut://app/pay-later/overdue-balance.*", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        int i2 = 4;
        int i3 = 5;
        Iterator it8 = v.k(nVar, kVar, gVar, oVar, pVar, mVar, lVar, iVar, fVar, hVar, jVar, new e("revolut://app/pay-later.*|^revolut://app/credit/pay-later$", deeplink)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((q) next).f322927a.matches()) {
                break;
            }
        }
        q qVar = (q) next;
        boolean z3 = qVar instanceof n;
        an4.i iVar2 = this.f322925b;
        w4l.h loadingStrategy = w4l.h.f294642c;
        if (z3) {
            Matcher matcher = ((n) qVar).f322927a;
            String strB = hx7.a.b(matcher, 0);
            d0VarL = d0.m(new CompositeCommand(new FeatureCommand(new PayLaterKompotFeatureConfig.PlanDetails(strB)), new FeatureCommand(new PayLaterKompotFeatureConfig.RepaymentDetails(strB, Integer.parseInt(hx7.a.b(matcher, 1))))));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof k) {
            d0VarL = d0.m(new FeatureCommand(new PayLaterKompotFeatureConfig.PlanDetails(hx7.a.b(((k) qVar).f322927a, 0))));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof g) {
            d0VarL = d0.m(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.DEEPLINK, ft3.d.INSTANCE, wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, 16370)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof e) {
            d0VarL = iVar2.a(loadingStrategy);
        } else if (qVar instanceof m) {
            d0VarL = d0.m(new FeatureCommand(new PayLaterKompotFeatureConfig.RepayAmount(0)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof l) {
            d0VarL = d0.m(new FeatureCommand(new PayLaterKompotFeatureConfig.PlansList(0)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof o) {
            d0VarL = d0.m(new FeatureCommand(new PayLaterKompotFeatureConfig.RepaymentsList(0)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof p) {
            d0VarL = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination(true), false, (Integer) null, 0, 61)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else if (qVar instanceof i) {
            d0VarL = d0.m(this.d.f(PayLaterFaqKey.GENERAL_TOPIC));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else {
            if (!(qVar instanceof f)) {
                if (qVar instanceof h) {
                    ti9.g gVar2 = (ti9.g) this.e;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    d0 d0VarFirstOrError = m70.a.g(rd0.e.c(((e0) gVar2.f271456a).a(loadingStrategy), kotlin.coroutines.g.f186406a), null, new zk1.p(i2), 1).firstOrError();
                    i = 1;
                    zii.e eVar = new zii.e(new zg8.d(1, this, c.class, "getDeactivationCommandBy", "getDeactivationCommandBy(Lcom/revolut/feature/pay_later/api/models/PayLaterAccountConfig;)Lcom/revolut/retail/core/navigation/NaviCommand;", 0, 3), i3);
                    d0VarFirstOrError.getClass();
                    d0VarL = new ufm.i(d0VarFirstOrError, eVar, 1);
                    Intrinsics.checkNotNullExpressionValue(d0VarL, "map(...)");
                } else {
                    i = 1;
                    if (qVar instanceof j) {
                        d0VarL = d0.m(new FeatureCommand(new KompotOverlayFeatureConfig(new ControllerDestination.Modal(OverdueInfoDescriptor.f78820a, ModalDestination.Style.POPUP.f98311a), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
                        Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
                    } else {
                        if (qVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0VarL = d0.l(new IllegalArgumentException(p.a.p("Deeplink uri=", deeplink.f173629c, " wasn't handled")));
                        Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
                    }
                }
                if (z || qVar == null || (qVar instanceof e)) {
                    return d0VarL;
                }
                d0 d0VarA = iVar2.a(loadingStrategy);
                a aVar = a.f;
                return d0.D(d0VarA, d0VarL, new zii.f(i));
            }
            d0VarL = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) PayLaterKompotFeatureConfig.AccountDetailsNavigationDestination.f78822a, false, (Integer) null, 0, 61)));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        }
        i = 1;
        return z ? d0VarL : d0VarL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zk9.b
            if (r0 == 0) goto L13
            r0 = r9
            zk9.b r0 = (zk9.b) r0
            int r1 = r0.f322923x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322923x = r1
            goto L1a
        L13:
            zk9.b r0 = new zk9.b
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322923x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            goto L82
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            jf0.c r8 = r0.u
            yhm.o.b(r9)
            goto L6a
        L3b:
            yhm.o.b(r9)
            ti9.h r9 = r7.f322926c
            qx4.f r9 = (qx4.f) r9
            cxe.u r9 = r9.j()
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r9 = rd0.e.c(r9, r2)
            zk1.p r2 = new zk1.p
            r6 = 3
            r2.<init>(r6)
            efm.r r9 = m70.a.g(r9, r5, r2, r4)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.u = r8
            r0.f322923x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L6a
            goto L81
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L73
            return r5
        L73:
            efm.d0 r8 = r7.b(r8, r4)
            r0.u = r5
            r0.f322923x = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L82
        L81:
            return r1
        L82:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r8.<init>(r9)
            q06.h r9 = new q06.h
            r9.<init>(r8, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zk9.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = m70.a.g(rd0.e.c(this.f322926c.j(), kotlin.coroutines.g.f186406a), null, new zk1.p(2), 1).switchMapCompletable(new zii.e(new wo5.a(this, deeplink, z, 10), 3)).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return ue0.e.F(zVarD, Boolean.FALSE);
    }
}
