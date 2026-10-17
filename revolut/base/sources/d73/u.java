package d73;

import ha3.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import tfm.n4;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f111803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f111804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f111805c;
    public final hy2.f d;
    public final zf8.k e;
    public final ne0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eub.a f111806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fk3.a f111807h;

    static {
        Intrinsics.checkNotNullParameter("CARDS_REACTIVATION_TIP_SHOWN", "id");
        Intrinsics.checkNotNullParameter("HIDE_GLOBAL_DEBIT_CARDS_INFO", "id");
        Intrinsics.checkNotNullParameter("HIDE_REV_POINTS_OPT_IN_BANNER", "id");
    }

    public u(ue0.c cardScreenStorage, mk0.a personalisationStorage, w39.b locationInteractor, l93.f revolutCardsInteractor, hy2.f cardDesignInteractor, zf8.k juniorAccountInfoProvider, ne0.j toastMemoryCache, eub.a revPointsAvailabilityInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(cardScreenStorage, "cardScreenStorage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(toastMemoryCache, "toastMemoryCache");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f111803a = cardScreenStorage;
        this.f111804b = personalisationStorage;
        this.f111805c = revolutCardsInteractor;
        this.d = cardDesignInteractor;
        this.e = juniorAccountInfoProvider;
        this.f = toastMemoryCache;
        this.f111806g = revPointsAvailabilityInteractor;
        this.f111807h = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof d73.p
            if (r0 == 0) goto L13
            r0 = r7
            d73.p r0 = (d73.p) r0
            int r1 = r0.f111799w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111799w = r1
            goto L18
        L13:
            d73.p r0 = new d73.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111799w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L69
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            fk3.a r2 = r6.f111807h
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r4 = e7l.g.b.f123407a
            efm.r r7 = r2.l(r4, r7)
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            d6j.b r2 = new d6j.b
            r4 = 9
            r2.<init>(r4)
            d73.n r4 = new d73.n
            r5 = 0
            r4.<init>(r2, r5)
            efm.r r7 = r7.map(r4)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            efm.r r7 = r7.onErrorReturnItem(r2)
            java.lang.String r2 = "onErrorReturnItem(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f111799w = r3
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d73.u.a(gim.c):java.lang.Object");
    }

    public final efm.r b(List walletIds, b93.d cardScope, String str) {
        Intrinsics.checkNotNullParameter(walletIds, "walletIds");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        b93.k kVar = b93.k.CREATED_DATE;
        x xVar = (x) this.f111805c;
        n4 n4VarE = xVar.w(walletIds, cardScope, true, kVar).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        efm.r map = n4VarE.flatMap(new n(new m(this, 0), 1)).map(new n(new d6j.b(10), 2));
        efm.r rVarR = (cardScope == b93.d.ALL || cardScope == b93.d.RETAIL) ? nz8.d.r(p0.f264003c, new d3i.g(this, null, 5)) : zi0.c.j(Boolean.FALSE);
        efm.r rVarY = xVar.y();
        Intrinsics.h(map);
        efm.r rVarDistinctUntilChanged = gj7.b.e(n4VarE, rVarY, map, rVarR).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return pd.b.r(rVarDistinctUntilChanged, new d3i.k(str, this, 12));
    }
}
