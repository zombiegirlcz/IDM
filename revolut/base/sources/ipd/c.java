package ipd;

import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.tracking.v3.AnalyticsAccountContext;
import grl.v;
import no.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements k {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f167732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f167733c;
    public AnalyticsAccountsSelection d;
    public v e;
    public h3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AnalyticsContext f167734g;

    public static final class a {
        private a() {
        }
    }

    public c() {
        this(null);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f167734g = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getU() {
        return this.f167734g;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.analytics.tracking.v3.AnalyticsContext a(java.lang.Integer r7, java.lang.String r8) {
        /*
            r6 = this;
            grl.v r0 = r6.e
            r1 = 0
            if (r0 != 0) goto L6
            goto La
        L6:
            com.google.protobuf.h3 r2 = r6.f
            if (r2 != 0) goto Lb
        La:
            return r1
        Lb:
            com.revolut.analytics.tracking.v3.AnalyticsContext r3 = r6.f167734g
            if (r3 == 0) goto L12
            com.google.protobuf.w0 r3 = r3.f50296a
            goto L13
        L12:
            r3 = r1
        L13:
            boolean r4 = r3 instanceof com.revolut.tracking.v3.AnalyticsAccountContext
            if (r4 == 0) goto L1a
            r1 = r3
            com.revolut.tracking.v3.AnalyticsAccountContext r1 = (com.revolut.tracking.v3.AnalyticsAccountContext) r1
        L1a:
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r3 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.revolut.tracking.v3.AnalyticsAccountContext$c r4 = com.revolut.tracking.v3.AnalyticsAccountContext.newBuilder()
            r4.c()
            com.google.protobuf.w0 r5 = r4.f49761b
            com.revolut.tracking.v3.AnalyticsAccountContext r5 = (com.revolut.tracking.v3.AnalyticsAccountContext) r5
            com.revolut.tracking.v3.AnalyticsAccountContext.g(r5, r0)
            r4.c()
            com.google.protobuf.w0 r0 = r4.f49761b
            com.revolut.tracking.v3.AnalyticsAccountContext r0 = (com.revolut.tracking.v3.AnalyticsAccountContext) r0
            com.revolut.tracking.v3.AnalyticsAccountContext.h(r0, r2)
            if (r1 == 0) goto L9a
            if (r8 == 0) goto L52
            java.util.Map r0 = r1.getAnalyticsPeriodSizesMap()
            java.lang.String r2 = "getAnalyticsPeriodSizesMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r6.f167731a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r2, r8)
            java.util.Map r8 = zhm.r0.q(r0, r5)
            if (r8 != 0) goto L56
        L52:
            java.util.Map r8 = r1.getAnalyticsPeriodSizesMap()
        L56:
            r4.c()
            com.google.protobuf.w0 r0 = r4.f49761b
            com.revolut.tracking.v3.AnalyticsAccountContext r0 = (com.revolut.tracking.v3.AnalyticsAccountContext) r0
            java.util.Map r0 = com.revolut.tracking.v3.AnalyticsAccountContext.e(r0)
            r0.putAll(r8)
            if (r7 == 0) goto L88
            int r7 = r7.intValue()
            java.util.Map r8 = r1.getAnalyticsPeriodsFromCurrentMap()
            java.lang.String r0 = "getAnalyticsPeriodsFromCurrentMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            int r0 = r6.f167731a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r7)
            java.util.Map r7 = zhm.r0.q(r8, r2)
            if (r7 != 0) goto L8c
        L88:
            java.util.Map r7 = r1.getAnalyticsPeriodsFromCurrentMap()
        L8c:
            r4.c()
            com.google.protobuf.w0 r8 = r4.f49761b
            com.revolut.tracking.v3.AnalyticsAccountContext r8 = (com.revolut.tracking.v3.AnalyticsAccountContext) r8
            java.util.Map r8 = com.revolut.tracking.v3.AnalyticsAccountContext.f(r8)
            r8.putAll(r7)
        L9a:
            java.lang.Boolean r7 = r6.f167733c
            if (r7 == 0) goto Lac
            boolean r7 = r7.booleanValue()
            r4.c()
            com.google.protobuf.w0 r8 = r4.f49761b
            com.revolut.tracking.v3.AnalyticsAccountContext r8 = (com.revolut.tracking.v3.AnalyticsAccountContext) r8
            com.revolut.tracking.v3.AnalyticsAccountContext.i(r8, r7)
        Lac:
            com.google.protobuf.w0 r7 = r4.a()
            r3.getClass()
            com.google.protobuf.w0 r7 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r7)
            com.revolut.analytics.tracking.v3.AnalyticsContext r8 = new com.revolut.analytics.tracking.v3.AnalyticsContext
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ipd.c.a(java.lang.Integer, java.lang.String):com.revolut.analytics.tracking.v3.AnalyticsContext");
    }

    public final AnalyticsContext b() {
        h3 h3Var;
        v vVar = this.e;
        if (vVar == null || (h3Var = this.f) == null) {
            return null;
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        AnalyticsAccountContext.c cVarNewBuilder = AnalyticsAccountContext.newBuilder();
        cVarNewBuilder.c();
        ((AnalyticsAccountContext) cVarNewBuilder.f49761b).setAnalyticsAccountType(vVar);
        cVarNewBuilder.c();
        ((AnalyticsAccountContext) cVarNewBuilder.f49761b).setAnalyticsSelectedAccounts(h3Var);
        cVarNewBuilder.c();
        ((AnalyticsAccountContext) cVarNewBuilder.f49761b).getMutableAnalyticsPeriodSizesMap().clear();
        cVarNewBuilder.c();
        ((AnalyticsAccountContext) cVarNewBuilder.f49761b).getMutableAnalyticsPeriodsFromCurrentMap().clear();
        w0 w0VarA = cVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    public c(AnalyticsAccountsSelection analyticsAccountsSelection) {
        this.d = analyticsAccountsSelection;
        this.e = analyticsAccountsSelection != null ? i.a(analyticsAccountsSelection) : null;
        this.f = analyticsAccountsSelection != null ? i.b(analyticsAccountsSelection) : null;
        this.f167734g = b();
    }
}
