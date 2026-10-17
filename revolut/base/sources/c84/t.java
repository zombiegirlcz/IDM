package c84;

import c5a.m0;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class t extends oki.h implements yki.g {
    public final e84.e o;

    public t(e84.e pluginControllerResolver) {
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.o = pluginControllerResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r5 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(c84.t r5, gim.c r6) {
        /*
            e84.e r0 = r5.o
            boolean r1 = r6 instanceof c84.q
            if (r1 == 0) goto L15
            r1 = r6
            c84.q r1 = (c84.q) r1
            int r2 = r1.f22102w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f22102w = r2
            goto L1a
        L15:
            c84.q r1 = new c84.q
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r5 = r1.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f22102w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r5)
            goto L80
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r5)
            goto L59
        L38:
            yhm.o.b(r5)
            java.lang.Object r5 = r0.d
            gte.a r5 = (gte.a) r5
            com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab r2 = com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab.f89768c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r2)
            if (r5 != 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4c:
            java.lang.Object r5 = r0.f123573h
            hy3.j r5 = (hy3.j) r5
            r1.f22102w = r4
            java.lang.Object r5 = r5.f(r1)
            if (r5 != r6) goto L59
            goto L7f
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L64
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L64:
            java.lang.Object r5 = r0.i
            vie.i r5 = (vie.i) r5
            r1.f22102w = r3
            boolean r0 = r5.a()
            if (r0 == 0) goto L7b
            r0 = 0
            java.lang.Object r5 = r5.c(r0, r1)
            if (r5 != r6) goto L78
            goto L7d
        L78:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            goto L7d
        L7b:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L7d:
            if (r5 != r6) goto L80
        L7f:
            return r6
        L80:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c84.t.I2(c84.t, gim.c):java.lang.Object");
    }

    public static void J2(t tVar, boolean z, String str, tg4.b bVar, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        if (tVar.L2()) {
            tVar.C2(new m(z, str));
        } else {
            if (((g) tVar.o.f123570b).Z2(z, str, bVar)) {
                return;
            }
            tVar.K2(null);
        }
    }

    public static /* synthetic */ Object N2(t tVar, it3.d dVar, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            dVar = null;
        }
        return tVar.M2(dVar, false, continuation);
    }

    public final void K2(NaviCommand naviCommand) {
        if (L2()) {
            C2(new n(naviCommand));
        } else if (naviCommand != null) {
            C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommand)));
        } else {
            ((g) this.o.f123570b).b3();
        }
    }

    public final boolean L2() {
        return !((PluginFlowContract$Input) this.o.f123569a).getF67969b().f66896j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (c84.g.f3(r1, r8, null, r9, r5, 10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(it3.d r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof c84.s
            if (r0 == 0) goto L14
            r0 = r10
            c84.s r0 = (c84.s) r0
            int r1 = r0.f22106w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f22106w = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            c84.s r0 = new c84.s
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f22106w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r10)
            goto L70
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r10)
            goto L50
        L38:
            yhm.o.b(r10)
            boolean r10 = r7.L2()
            e84.e r1 = r7.o
            if (r10 == 0) goto L5d
            java.lang.Object r9 = r1.f123570b
            c84.g r9 = (c84.g) r9
            r5.f22106w = r3
            java.lang.Object r10 = r9.c3(r8, r5)
            if (r10 != r0) goto L50
            goto L6f
        L50:
            it3.d r10 = (it3.d) r10
            c84.o r8 = new c84.o
            r8.<init>(r10)
            r7.C2(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L5d:
            java.lang.Object r10 = r1.f123570b
            r1 = r10
            c84.g r1 = (c84.g) r1
            r5.f22106w = r2
            r3 = 0
            r6 = 10
            r2 = r8
            r4 = r9
            java.lang.Object r8 = c84.g.f3(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c84.t.M2(it3.d, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void O2(NaviCommand naviCommand, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (L2()) {
            C2(new l(naviCommand));
            return;
        }
        int i = 1;
        l2(new m0(i, this, new a3i.q(this, null, 27), applicationId, naviCommand, null), new yi5.b(26));
    }

    @Override // yji.l
    public boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ((xa4.a) this.o.f123571c).Z2(throwable, new bwc.i(1, this, t.class, "exit", "exit(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 9));
    }
}
