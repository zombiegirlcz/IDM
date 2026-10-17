package hrj;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import g48.r0;
import grj.i;
import hhm.f;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.j;
import pfm.z;
import skm.p0;
import sri.m;
import te0.w;
import ue0.e;
import ufm.p;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements rzi.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f154829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f154830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o38.a f154831c;
    public final pzi.a d;
    public final pzi.b e;

    public d(m navigator, r0 jointAccountsInteractor, o38.a jointNavigationProvider, pzi.a budgetOverviewInteractor, pzi.b budgetingInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointNavigationProvider, "jointNavigationProvider");
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        this.f154829a = navigator;
        this.f154830b = jointAccountsInteractor;
        this.f154831c = jointNavigationProvider;
        this.d = budgetOverviewInteractor;
        this.e = budgetingInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "budgeting");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hrj.d.b(jf0.c, gim.c):java.lang.Object");
    }

    public final z c(AccountId accountId) {
        h hVarE = ((i) this.e).e(accountId, true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j jVarZ = hVarE.z(5L, timeUnit, f.f152430b);
        Intrinsics.checkNotNullExpressionValue(jVarZ, "timeout(...)");
        p pVarT = e.v(jVarZ).g(((grj.f) this.d).a(accountId)).firstOrError().t(5L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return e.I(pVarT, h0.f322473a, new hqk.a(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hrj.c
            if (r0 == 0) goto L13
            r0 = r7
            hrj.c r0 = (hrj.c) r0
            int r1 = r0.f154828w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154828w = r1
            goto L1a
        L13:
            hrj.c r0 = new hrj.c
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154828w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            java.lang.String r7 = r6.e(r3)
            java.lang.String r2 = "budgeting"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 != 0) goto L42
            return r4
        L42:
            r0.f154828w = r3
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r6.<init>(r7)
            q06.h r7 = new q06.h
            r7.<init>(r6, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hrj.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        return !y.D(cVar, "deeplink", 1, "budgeting") ? d0.m(Boolean.FALSE) : w.o0(p0.f264003c, new gsh.w(this, cVar, null, 28));
    }
}
