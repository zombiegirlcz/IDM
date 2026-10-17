package n8f;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlc.o f213384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nmc.d f213385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7f.g f213386c;
    public final cli.n d;
    public final r6f.j e;
    public final d1h.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aw0.e f213387g;

    public q(jlc.o projectionChartMapper, nmc.d roboPortfolioUIMapper, b7f.g performanceMapper, cli.n allocationMapper, r6f.j feesMapper, d1h.h disclaimersMapper) {
        Intrinsics.checkNotNullParameter(projectionChartMapper, "projectionChartMapper");
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(feesMapper, "feesMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f213384a = projectionChartMapper;
        this.f213385b = roboPortfolioUIMapper;
        this.f213386c = performanceMapper;
        this.d = allocationMapper;
        this.e = feesMapper;
        this.f = disclaimersMapper;
        this.f213387g = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.managed_portfolios_strategy_overview_begin_investing, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r9) {
        /*
            r8 = this;
            n8f.h r9 = (n8f.h) r9
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            n8f.o r0 = new n8f.o
            com.revolut.data.model.Data r1 = r9.f213370a
            if (r1 == 0) goto L28
            n5k.c r2 = new n5k.c
            r3 = 23
            r2.<init>(r3)
            n87.r r3 = new n87.r
            r4 = 4
            r3.<init>(r4)
            n8f.p r4 = new n8f.p
            r5 = 1
            r4.<init>(r8)
            java.lang.Object r2 = iii.c.f(r1, r2, r3, r4)
            n8f.n r2 = (n8f.n) r2
            if (r2 != 0) goto L2a
        L28:
            n8f.m r2 = n8f.m.f213378a
        L2a:
            if (r1 == 0) goto L48
            n5k.c r3 = new n5k.c
            r4 = 24
            r3.<init>(r4)
            n87.r r4 = new n87.r
            r5 = 5
            r4.<init>(r5)
            mig.a r5 = new mig.a
            r6 = 26
            r5.<init>(r6)
            java.lang.Object r3 = iii.c.f(r1, r3, r4, r5)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L4a
        L48:
            zhm.f0 r3 = zhm.f0.f322471a
        L4a:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r1 == 0) goto L6a
            n5k.c r4 = new n5k.c
            r5 = 25
            r4.<init>(r5)
            n87.r r5 = new n87.r
            r6 = 2
            r5.<init>(r6)
            m88.c r6 = new m88.c
            r7 = 23
            r6.<init>(r8, r9, r7)
            java.lang.Object r9 = iii.c.f(r1, r4, r5, r6)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L6c
        L6a:
            zhm.f0 r9 = zhm.f0.f322471a
        L6c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r9 = zhm.d0.E0(r9, r3)
            if (r1 == 0) goto L8e
            n5k.c r3 = new n5k.c
            r4 = 22
            r3.<init>(r4)
            n87.r r4 = new n87.r
            r5 = 3
            r4.<init>(r5)
            n8f.p r5 = new n8f.p
            r6 = 0
            r5.<init>(r8)
            java.lang.Object r1 = iii.c.f(r1, r3, r4, r5)
            aw0.e r1 = (aw0.e) r1
            goto L8f
        L8e:
            r1 = 0
        L8f:
            r0.<init>(r2, r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n8f.q.c(cli.j):cli.o");
    }
}
