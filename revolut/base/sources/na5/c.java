package na5;

import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import jf0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n87.r;
import n8i.q0;
import q06.k;
import rd0.e;
import sri.m;
import ufm.f;
import ufm.i;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f213797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ra5.b f213798b;

    public c(m navigator, ra5.b creditPostTerminationPlanInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditPostTerminationPlanInteractor, "creditPostTerminationPlanInteractor");
        this.f213797a = navigator;
        this.f213798b = creditPostTerminationPlanInteractor;
    }

    public static FeatureCommand c(a aVar) {
        ha5.d dVar = aVar.f213794a;
        CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = aVar.f213795b;
        if (dVar instanceof ha5.b) {
            return vhi.c.c(new CreditPostTerminationPlanEntryPoint.PlanDetailsFlow(xam.a.a(((ha5.b) dVar).f150453a), creditPostTerminationPlanDetails), yhi.b.SOLID, null, false, 12);
        }
        if (dVar instanceof ha5.c) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CreditPostTerminationPlanEntryPoint.PlanDetailsFlow(xam.a.a(((ha5.c) dVar).f150453a), creditPostTerminationPlanDetails), false, (Integer) null, 0, 61));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ha5.d.Companion.getClass();
        return ha5.a.a(deeplink) != null;
    }

    public final d0 b(jf0.c cVar) {
        String strA;
        ha5.d.Companion.getClass();
        ha5.d dVarA = ha5.a.a(cVar);
        if (dVarA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (dVarA instanceof ha5.b) {
            strA = xam.a.a(((ha5.b) dVarA).f150453a);
        } else {
            if (!(dVarA instanceof ha5.c)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = xam.a.a(((ha5.c) dVarA).f150453a);
        }
        d0 d0VarFirstOrError = m70.a.g(nim.a.w(e.c(ra5.b.b(this.f213798b, strA), g.f186406a), new n7h.c(dVarA, 10)), null, new r(9), 1).cast(a.class).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof na5.b
            if (r0 == 0) goto L13
            r0 = r6
            na5.b r0 = (na5.b) r0
            int r1 = r0.f213796w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213796w = r1
            goto L1a
        L13:
            na5.b r0 = new na5.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213796w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            efm.d0 r5 = r4.b(r5)
            r0.f213796w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            na5.a r6 = (na5.a) r6
            ha5.d r5 = r6.f213794a
            boolean r0 = r5 instanceof ha5.b
            if (r0 == 0) goto L53
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r6 = c(r6)
            r5.<init>(r6)
            goto L67
        L53:
            boolean r0 = r5 instanceof ha5.c
            if (r0 == 0) goto L75
            com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint$PlanDetailsFlow r0 = new com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint$PlanDetailsFlow
            ha5.c r5 = (ha5.c) r5
            java.util.regex.Matcher r5 = r5.f150453a
            java.lang.String r5 = xam.a.a(r5)
            com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails r6 = r6.f213795b
            r0.<init>(r5, r6)
            r5 = r0
        L67:
            q06.h r6 = new q06.h
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r2 = 0
            r0.<init>(r1, r2)
            r6.<init>(r5, r0)
            return r6
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: na5.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        FeatureCommand featureCommandA = z ? jbb.a.a(ibb.c.f160140a, null, null, null, 12) : null;
        d0 d0VarB = b(deeplink);
        na1.e eVar = new na1.e(26, new ec9.a(featureCommandA, this, 5));
        d0VarB.getClass();
        i iVar = new i(new f(new i(d0VarB, eVar, 1), new na1.e(27, new v9(1, this.f213797a, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 24)), 3), new na1.e(28, new q0(6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
