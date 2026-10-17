package n28;

import akg.n;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import klf.l1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0c.v;
import n1j.t;
import rd0.e;
import tzg.m;
import vkm.q;
import ybl.i;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f211453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f211454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f211455c;

    public d(xoj.a featuresInteractor, i productGroupAvailabilityInteractor, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f211453a = featuresInteractor;
        this.f211454b = productGroupAvailabilityInteractor;
        this.f211455c = wealthAccountsInteractor;
    }

    public final Object a(Function1 function1, gim.c cVar) {
        int i = 3;
        n nVarC = m.c(this.f211455c, null, null, 3);
        h0 h0Var = h0.f322473a;
        return q.x(e.e(mo3.a.g(q.r(new v(7), nim.a.v(e.n(nVarC, h0Var), new js7.c(8, function1))), null, new v(8), 1), h0Var, new l1(i, 29, null)), cVar);
    }

    public final Object b(e38.c cVar) {
        n nVarA = m.a(this.f211455c, WealthAccountType.MARGIN);
        h0 h0Var = h0.f322473a;
        return q.x(e.e(mo3.a.g(nim.a.v(e.n(nVarA, h0Var), new t(3)), null, new v(10), 1), h0Var, new b(3, 0, null)), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n28.c
            if (r0 == 0) goto L13
            r0 = r6
            n28.c r0 = (n28.c) r0
            int r1 = r0.f211452w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211452w = r1
            goto L18
        L13:
            n28.c r0 = new n28.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211452w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            yoj.c r6 = yoj.c.WEALTH_TRADING
            yoj.d r2 = yoj.d.DISABLED
            xoj.a r4 = r5.f211453a
            cpj.b r4 = (cpj.b) r4
            ufm.i r6 = r4.f(r6, r2)
            r0.f211452w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n28.d.c(gim.c):java.lang.Object");
    }

    public final Object d(WealthAccountType wealthAccountType, gim.c cVar) {
        return a(new a(wealthAccountType, 0), cVar);
    }

    public final Object e(gim.c cVar) {
        int i = 3;
        n nVarC = m.c(this.f211455c, null, null, 3);
        h0 h0Var = h0.f322473a;
        return q.x(e.e(mo3.a.g(nim.a.v(e.n(nVarC, h0Var), new t(5)), null, new v(11), 1), h0Var, new b(i, 2, null)), cVar);
    }

    public final Object f(gim.c cVar) {
        int i = 3;
        n nVarC = m.c(this.f211455c, null, null, 3);
        h0 h0Var = h0.f322473a;
        return q.x(e.e(mo3.a.g(nim.a.v(e.n(nVarC, h0Var), new t(2)), null, new v(9), 1), h0Var, new b(i, 3, null)), cVar);
    }
}
