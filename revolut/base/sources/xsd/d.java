package xsd;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.w;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import xlb.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y45.h f308449a;

    public d(y45.h loanProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        this.f308449a = loanProductFeatureTogglesInteractor;
    }

    public static FeatureCommand a() {
        return new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.TOTAL_WEALTH, w.INSTANCE, null, null, null, null, 16378));
    }

    public final Object b(gim.c cVar) {
        return q.x(q.H(new a(2, 0, null), mo3.a.g(this.f308449a.m(), null, new l(25), 1)), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xsd.b
            if (r0 == 0) goto L13
            r0 = r5
            xsd.b r0 = (xsd.b) r0
            int r1 = r0.f308447w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308447w = r1
            goto L18
        L13:
            xsd.b r0 = new xsd.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308447w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f308447w = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L55
            com.revolut.feature.credit.api.navigation.GetCreditDestination r5 = new com.revolut.feature.credit.api.navigation.GetCreditDestination
            grl.r2 r0 = grl.r2.TOTAL_WEALTH
            r5.<init>(r0)
            yhi.b r0 = yhi.b.SOLID
            r1 = 0
            r2 = 12
            r3 = 0
            com.revolut.retail.core.navigation.FeatureCommand r5 = vhi.c.c(r5, r0, r3, r1, r2)
            return r5
        L55:
            com.revolut.retail.core.navigation.FeatureCommand r5 = a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xsd.d.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xsd.c
            if (r0 == 0) goto L13
            r0 = r5
            xsd.c r0 = (xsd.c) r0
            int r1 = r0.f308448w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308448w = r1
            goto L18
        L13:
            xsd.c r0 = new xsd.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308448w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f308448w = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4b
            com.revolut.feature.credit.api.navigation.GetCreditDestination r5 = new com.revolut.feature.credit.api.navigation.GetCreditDestination
            grl.r2 r0 = grl.r2.TOTAL_WEALTH
            r5.<init>(r0)
            return r5
        L4b:
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = a()
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xsd.d.d(gim.c):java.lang.Object");
    }
}
