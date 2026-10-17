package mwl;

import io.f;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.a2;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f209546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f209547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f209548c;
    public final d4m.a d;
    public final d4m.a e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile a2 f209549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f209550h;
    public volatile m0j.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Boolean f209551j;
    public volatile Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f209552l;

    public e(d4m.a appStartupTracker, d4m.a checkLocaleInteractor, CoroutineScope coroutineScope, d4m.a userOnboardingInteractor, d4m.a userInteractor, d4m.a revolutSsoOnClientLaunchedInteractor) {
        Intrinsics.checkNotNullParameter(appStartupTracker, "appStartupTracker");
        Intrinsics.checkNotNullParameter(checkLocaleInteractor, "checkLocaleInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoOnClientLaunchedInteractor, "revolutSsoOnClientLaunchedInteractor");
        this.f209546a = appStartupTracker;
        this.f209547b = checkLocaleInteractor;
        this.f209548c = coroutineScope;
        this.d = userOnboardingInteractor;
        this.e = userInteractor;
        this.f = revolutSsoOnClientLaunchedInteractor;
        this.f209550h = new AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mwl.e r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mwl.c
            if (r0 == 0) goto L13
            r0 = r5
            mwl.c r0 = (mwl.c) r0
            int r1 = r0.f209544w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209544w = r1
            goto L18
        L13:
            mwl.c r0 = new mwl.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f209544w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L57
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.e0.p(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f209550h
            r5.incrementAndGet()
            d4m.a r5 = r4.e
            java.lang.Object r5 = r5.get()
            ylg.b r5 = (ylg.b) r5
            ang.f r5 = (ang.f) r5
            zmg.d r5 = r5.d
            efm.k r5 = r5.c()
            r0.f209544w = r3
            java.lang.Object r5 = nim.a.i(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            do3.n r5 = (do3.n) r5
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f209550h
            r0.incrementAndGet()
            r0 = 0
            if (r5 == 0) goto L78
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L78
            java.lang.String r5 = r5.getCountry()
            if (r5 == 0) goto L78
            d4m.a r1 = r4.f209547b
            java.lang.Object r1 = r1.get()
            dl0.a r1 = (dl0.a) r1
            boolean r5 = r1.a(r5)
            goto L79
        L78:
            r5 = r0
        L79:
            if (r5 != 0) goto L82
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.k = r5
            goto L87
        L82:
            r4.f209552l = r3
            r4.c(r0)
        L87:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mwl.e.a(mwl.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(mwl.e r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mwl.d
            if (r0 == 0) goto L13
            r0 = r5
            mwl.d r0 = (mwl.d) r0
            int r1 = r0.f209545w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209545w = r1
            goto L18
        L13:
            mwl.d r0 = new mwl.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f209545w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L64
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.e0.p(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f209550h
            r5.incrementAndGet()
            d4m.a r5 = r4.d
            java.lang.Object r5 = r5.get()
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            fwj.p r5 = (fwj.p) r5
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            skm.e0.p(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r4.f209550h
            r2.incrementAndGet()
            ufm.i r5 = r5.b()
            r0.f209545w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L64
            return r1
        L64:
            m0j.a r5 = (m0j.a) r5
            m0j.a r0 = m0j.a.FINISHED
            if (r5 != r0) goto L6d
            r4.i = r5
            goto L73
        L6d:
            r4.f209552l = r3
            r5 = 0
            r4.c(r5)
        L73:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mwl.e.b(mwl.e, gim.c):java.lang.Object");
    }

    public final void c(boolean z) {
        a2 a2Var = this.f209549g;
        if (a2Var != null) {
            a2Var.f(null);
            this.f209549g = null;
            if (z) {
                if (this.i != null && this.f209551j != null && this.k != null) {
                    ((f) ((io.c) this.f209546a.get())).a("completed", "preLoginPrefetch");
                    return;
                }
                ((f) ((io.c) this.f209546a.get())).a(a0.d.n("interruptedOnStep", this.f209550h.get()), "preLoginPrefetch");
            }
        }
    }
}
