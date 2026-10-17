package cuc;

import auc.b1;
import auc.t0;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.api.models.WealthProtectionSuggestedAmount;
import com.revolut.feature.security_hub.impl.network.SecurityHubService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f108982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f108983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecurityHubService f108984c;
    public final x4l.c d;
    public final x4l.c e;

    public z(ue0.c storage, ne0.j memoryCache, SecurityHubService service, com.revolut.feature.security_hub.impl.repository.b outboundLimitMapper, f0 wealthProtectionFeatureDetailsMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(outboundLimitMapper, "outboundLimitMapper");
        Intrinsics.checkNotNullParameter(wealthProtectionFeatureDetailsMapper, "wealthProtectionFeatureDetailsMapper");
        this.f108982a = storage;
        this.f108983b = memoryCache;
        this.f108984c = service;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new b6a.d(this, continuation, 29), new Function1(this) { // from class: cuc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f108975b;

            {
                this.f108975b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        qtc.k it8 = (qtc.k) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (WealthProtectionFeatureDetails) this.f108975b.f108983b.get(z.b(it8));
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (List) this.f108975b.f108983b.get("TRANSACTIONS_DAY_NIGHT_LIMITS_KEY");
                }
            }
        }, new Function2(this) { // from class: cuc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f108977b;

            {
                this.f108977b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        qtc.k feature = (qtc.k) obj2;
                        WealthProtectionFeatureDetails domain = (WealthProtectionFeatureDetails) obj3;
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f108977b.f108983b.f(z.b(feature), domain);
                        break;
                    default:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f108977b.f108983b.f("TRANSACTIONS_DAY_NIGHT_LIMITS_KEY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ck7.j(this, continuation, 23), new bwb.n(this, continuation, 16));
        final int i2 = 1;
        this.e = new x4l.c(new a09.o(this, continuation, 26), new Function1(this) { // from class: cuc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f108975b;

            {
                this.f108975b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        qtc.k it8 = (qtc.k) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (WealthProtectionFeatureDetails) this.f108975b.f108983b.get(z.b(it8));
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (List) this.f108975b.f108983b.get("TRANSACTIONS_DAY_NIGHT_LIMITS_KEY");
                }
            }
        }, new Function2(this) { // from class: cuc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f108977b;

            {
                this.f108977b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        qtc.k feature = (qtc.k) obj2;
                        WealthProtectionFeatureDetails domain = (WealthProtectionFeatureDetails) obj3;
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f108977b.f108983b.f(z.b(feature), domain);
                        break;
                    default:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f108977b.f108983b.f("TRANSACTIONS_DAY_NIGHT_LIMITS_KEY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new co7.c(this, continuation, 9), new awd.b(this, continuation, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cuc.z r4, qtc.k r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof cuc.y
            if (r0 == 0) goto L16
            r0 = r6
            cuc.y r0 = (cuc.y) r0
            int r1 = r0.f108981w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f108981w = r1
            goto L1b
        L16:
            cuc.y r0 = new cuc.y
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108981w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L48
            goto L43
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L48
            x4l.c r4 = r4.d     // Catch: java.lang.Throwable -> L48
            r0.f108981w = r3     // Catch: java.lang.Throwable -> L48
            r6 = 0
            java.lang.Object r4 = r4.d(r5, r6, r0)     // Catch: java.lang.Throwable -> L48
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L48
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L48
            goto L4f
        L48:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
        L4f:
            java.lang.Throwable r4 = yhm.m.a(r4)
            if (r4 == 0) goto L65
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L64
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r6, r0, r0, r4, r5)
            goto L65
        L64:
            throw r4
        L65:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cuc.z.a(cuc.z, qtc.k, gim.c):java.lang.Object");
    }

    public static String b(qtc.k kVar) {
        return j6.a.q("WEALTH_PROTECTION_FEATURE_DETAILS_KEY_", kVar.name());
    }

    public static WealthProtectionFeatureState c(b1 b1Var) {
        if (b1Var == null) {
            return WealthProtectionFeatureState.NotVisible.f85443a;
        }
        xi0.a aVar = xi0.b.Companion;
        String currency = b1Var.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        Long minimumAmount = b1Var.getMinimumAmount();
        dj0.d dVar = minimumAmount != null ? new dj0.d(minimumAmount.longValue(), bVarA) : null;
        t0 suggestedAmount = b1Var.getSuggestedAmount();
        WealthProtectionSuggestedAmount wealthProtectionSuggestedAmountS = suggestedAmount != null ? boh.f.s(suggestedAmount, bVarA) : null;
        if (!b1Var.getEnabled()) {
            return new WealthProtectionFeatureState.Visible.Disabled(bVarA, dVar, wealthProtectionSuggestedAmountS);
        }
        b1.a dailyAllowance = b1Var.getDailyAllowance();
        Intrinsics.h(dailyAllowance);
        return new WealthProtectionFeatureState.Visible.Enabled(new dj0.d(dailyAllowance.getMaxAmount(), bVarA), new dj0.d(b1Var.getDailyAllowance().getUsedAmount(), bVarA), dVar, wealthProtectionSuggestedAmountS);
    }
}
