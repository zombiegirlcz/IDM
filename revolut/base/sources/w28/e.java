package w28;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import dsh.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tzg.m;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements t28.g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f293973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.f f293974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f293975c;

    public e(m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f293973a = wealthAccountsInteractor;
        this.f293974b = zel.f.CFD;
        this.f293975c = new TextLocalisedClause(R$string.wealth_invest_widget_popular_cfds_error_title, null, null, 14);
    }

    @Override // t28.g
    public final List a(dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        r.a aVar = r.Companion;
        aVar.getClass();
        return u.c(r.a.a(aVar, inputConfig, null, String.valueOf(r.a.b(inputConfig, 2)), 6));
    }

    @Override // t28.g
    public final zel.f c() {
        return this.f293974b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t28.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof w28.d
            if (r0 == 0) goto L13
            r0 = r8
            w28.d r0 = (w28.d) r0
            int r1 = r0.f293972w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293972w = r1
            goto L18
        L13:
            w28.d r0 = new w28.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293972w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L62
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.lang.String r8 = "PopularCFDsDynamic"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r7 == 0) goto L91
            tzg.m r7 = r6.f293973a
            r8 = 0
            r2 = 3
            akg.n r7 = tzg.m.c(r7, r8, r8, r2)
            w2.d r4 = new w2.d
            r5 = 4
            r4.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r8, r4, r3)
            uyd.e0 r4 = new uyd.e0
            r5 = 9
            r4.<init>(r2, r5, r8)
            zhm.h0 r8 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r8, r4)
            r0.f293972w = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L72
            r7 = r8
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L72
            goto L91
        L72:
            java.util.Iterator r7 = r8.iterator()
        L76:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L91
            java.lang.Object r8 = r7.next()
            com.revolut.feature.wealth.api.domain.model.WealthAccount r8 = (com.revolut.feature.wealth.api.domain.model.WealthAccount) r8
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r0 = r8.T0()
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r1 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.MARGIN
            if (r0 != r1) goto L76
            boolean r8 = r8.Q2()
            if (r8 == 0) goto L76
            goto L92
        L91:
            r3 = 0
        L92:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w28.e.d(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // t28.g
    public final TextLocalisedClause e() {
        return this.f293975c;
    }

    @Override // t28.g
    public final v28.c f(dsh.e eVar) {
        r.Companion.getClass();
        return new v28.b(r.a.b(eVar, 2), new TextLocalisedClause(R$string.wealth_invest_widget_popular_cfds_widget_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_widget_popular_cfds_action_see_all, null, null, 14));
    }
}
