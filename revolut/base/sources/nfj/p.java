package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimDataPlanService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements k {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimDataPlanService f215011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f215012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215013c;
    public final gte.a d;
    public final cej.b e;
    public final dfj.k0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tsk.t f215014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f215015h;

    public p(EsimDataPlanService api2, ne0.j memoryCache, ue0.c storage, gte.a featureToggle, cej.b mobilePlansFeatureAvailabilityInteractor, dfj.k0 esimInstallationStateInteractor, tsk.t esimUsernameHasher) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimUsernameHasher, "esimUsernameHasher");
        this.f215011a = api2;
        this.f215012b = memoryCache;
        this.f215013c = storage;
        this.d = featureToggle;
        this.e = mobilePlansFeatureAvailabilityInteractor;
        this.f = esimInstallationStateInteractor;
        this.f215014g = esimUsernameHasher;
        Continuation continuation = null;
        this.f215015h = new x4l.c(new mtj.k(this, continuation, 10), new l(this, 0), new n8i.e(this, 15), new naf.j(this, continuation, 9), new lp6.g(this, continuation, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r5.f215015h.d(r2, false, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nfj.o
            if (r0 == 0) goto L13
            r0 = r6
            nfj.o r0 = (nfj.o) r0
            int r1 = r0.f215005y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215005y = r1
            goto L18
        L13:
            nfj.o r0 = new nfj.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f215003w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215005y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L7f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r8 = r0.u
            java.lang.String r7 = r0.v
            yhm.o.b(r6)
            goto L62
        L3a:
            yhm.o.b(r6)
            if (r8 == 0) goto L49
            ue0.c r6 = r5.f215013c
            r6.clear()
            ne0.j r6 = r5.f215012b
            r6.clear()
        L49:
            cej.b r6 = r5.e
            efj.d r6 = (efj.d) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L65
            r0.v = r7
            r0.u = r8
            r0.f215005y = r4
            dfj.k0 r6 = r5.f
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L62
            goto L7e
        L62:
            java.util.List r6 = (java.util.List) r6
            goto L67
        L65:
            zhm.f0 r6 = zhm.f0.f322471a
        L67:
            nfj.n r2 = new nfj.n
            r4 = 13
            r2.<init>(r6, r7, r4)
            r6 = 0
            r0.v = r6
            r0.u = r8
            r0.f215005y = r3
            r6 = 0
            x4l.c r7 = r5.f215015h
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.p.b(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    public final String c(n nVar) {
        String strK0;
        String strK02;
        if (((efj.d) this.e).a()) {
            strK0 = zhm.d0.k0(nVar.f214995a, ",", "id=[", "]", 0, null, 56);
            strK02 = zhm.d0.k0(nVar.f214996b, ",", "sim-profile-id=[", "]", 0, null, 56);
        } else {
            strK0 = null;
            strK02 = null;
        }
        String str = nVar.f214997c;
        String strConcat = str != null ? "upgradesFromMobilePlanId=".concat(str) : null;
        String str2 = nVar.d;
        String strConcat2 = str2 != null ? "changesFromMobilePlanId=".concat(str2) : null;
        String str3 = nVar.e;
        String[] elements = {"DATA_PLAN_KEY", strK0, strK02, strConcat, strConcat2, str3 != null ? j6.a.q("recipientUsername=", this.f215014g.m(str3)) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }
}
