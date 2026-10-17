package ekg;

import akg.j;
import akg.n;
import akg.o;
import akl.s;
import bp0.r;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import vkm.q;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements wjg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gkg.d f127160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final akg.b f127161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f127162c;
    public final vjg.g d;
    public final h01.b e;
    public final c90.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k70.a f127163g;

    public g(gkg.d themeModeView, akg.b repository, l80.e dateProvider, vjg.g themeCatalog, h01.b sensitiveDataManager, c90.c uiResources, k70.a themeCompatibilityProvider) {
        Intrinsics.checkNotNullParameter(themeModeView, "themeModeView");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(themeCompatibilityProvider, "themeCompatibilityProvider");
        this.f127160a = themeModeView;
        this.f127161b = repository;
        this.f127162c = dateProvider;
        this.d = themeCatalog;
        this.e = sensitiveDataManager;
        this.f = uiResources;
        this.f127163g = themeCompatibilityProvider;
    }

    public static h01.a p(boolean z) {
        if (z) {
            return h01.a.ACTIVE;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return h01.a.INACTIVE;
    }

    public final n c() {
        o oVar = (o) this.f127161b;
        mk0.a aVar = oVar.f;
        akg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter("SEASONAL_STYLE", "id");
        return nim.a.v(q.Q(new n(mo3.a.e(aVar.f(new tk0.f("SEASONAL_STYLE")), new akg.d(0), new akg.d(1)), oVar, 0), new a((Continuation) null, this, 0)), new s(this, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r10 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r10 = r9;
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r10 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        if (skm.e0.J(r9, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dkg.a r9, dkg.a r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekg.g.d(dkg.a, dkg.a, gim.c):java.lang.Object");
    }

    public final void e() {
        mk0.a aVar = ((o) this.f127161b).f;
        o.Companion.getClass();
        tk0.b.b("FLIP_GESTURE_ENABLED");
        Boolean bool = (Boolean) aVar.a(tk0.b.a("FLIP_GESTURE_ENABLED"));
        this.e.d(p(bool != null ? bool.booleanValue() : false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (d(r2, r11, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r8, xjg.m r9, xjg.j r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof ekg.c
            if (r0 == 0) goto L13
            r0 = r11
            ekg.c r0 = (ekg.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ekg.c r0 = new ekg.c
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f127155y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r11)
            goto Lc4
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            dkg.a r8 = r0.f127154x
            xjg.j r10 = r0.f127153w
            xjg.m r9 = r0.v
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r2 = r0.u
            yhm.o.b(r11)
            r11 = r8
            r8 = r2
            goto L89
        L41:
            yhm.o.b(r11)
            dkg.a r11 = r7.i()
            if (r8 == 0) goto L91
            vjg.f r2 = r8.e2()
            if (r2 != 0) goto L91
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r2 = r11.f115516a
            vjg.f r2 = r2.e2()
            if (r2 == 0) goto L91
            r0.u = r8
            r0.v = r9
            r0.f127153w = r10
            r0.f127154x = r11
            r0.A = r4
            akg.b r2 = r7.f127161b
            akg.o r2 = (akg.o) r2
            mk0.a r2 = r2.f
            akg.a r4 = akg.b.Companion
            r4.getClass()
            java.lang.String r4 = "id"
            java.lang.String r5 = "SEASONAL_STYLE"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            tk0.f r4 = new tk0.f
            r4.<init>(r5)
            java.util.Map r5 = zhm.r0.g()
            java.lang.Object r2 = r2.e(r4, r5, r0)
            if (r2 != r1) goto L84
            goto L86
        L84:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L86:
            if (r2 != r1) goto L89
            goto Lc3
        L89:
            dkg.a r2 = r7.i()
            r6 = r2
            r2 = r11
            r11 = r6
            goto L92
        L91:
            r2 = r11
        L92:
            if (r8 != 0) goto L96
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r8 = r11.f115516a
        L96:
            if (r9 != 0) goto L9a
            xjg.m r9 = r11.f115517b
        L9a:
            if (r10 != 0) goto L9e
            xjg.j r10 = r11.f115518c
        L9e:
            java.lang.String r11 = "theme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r11)
            java.lang.String r11 = "themeMode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            java.lang.String r11 = "accent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r11)
            dkg.a r11 = new dkg.a
            r11.<init>(r8, r9, r10)
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f127153w = r8
            r0.f127154x = r8
            r0.A = r3
            java.lang.Object r8 = r7.d(r2, r11, r0)
            if (r8 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ekg.g.f(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, xjg.m, xjg.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (d(r2, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ekg.d
            if (r0 == 0) goto L13
            r0 = r7
            ekg.d r0 = (ekg.d) r0
            int r1 = r0.f127157x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127157x = r1
            goto L18
        L13:
            ekg.d r0 = new ekg.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127157x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L82
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            dkg.a r2 = r0.u
            yhm.o.b(r7)
            goto L72
        L38:
            yhm.o.b(r7)
            dkg.a r2 = r6.i()
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7 = r2.f115516a
            vjg.f r7 = r7.e2()
            if (r7 == 0) goto L85
            r0.u = r2
            r0.f127157x = r4
            akg.b r7 = r6.f127161b
            akg.o r7 = (akg.o) r7
            mk0.a r7 = r7.f
            akg.a r4 = akg.b.Companion
            r4.getClass()
            java.lang.String r4 = "id"
            java.lang.String r5 = "SEASONAL_STYLE"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            tk0.f r4 = new tk0.f
            r4.<init>(r5)
            java.util.Map r5 = zhm.r0.g()
            java.lang.Object r7 = r7.e(r4, r5, r0)
            if (r7 != r1) goto L6d
            goto L6f
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L6f:
            if (r7 != r1) goto L72
            goto L81
        L72:
            dkg.a r7 = r6.i()
            r4 = 0
            r0.u = r4
            r0.f127157x = r3
            java.lang.Object r7 = r6.d(r2, r7, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L85:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ekg.g.g(gim.c):java.lang.Object");
    }

    public final jhi.b h() {
        return mo3.a.h(c(), new r(this, 1), new akg.d(19), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dkg.a i() {
        /*
            r5 = this;
            akg.b r0 = r5.f127161b
            akg.o r0 = (akg.o) r0
            mk0.a r1 = r0.f
            akg.a r2 = akg.b.Companion
            r2.getClass()
            java.lang.String r2 = "SEASONAL_STYLE"
            java.lang.String r3 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            tk0.f r4 = new tk0.f
            r4.<init>(r2)
            java.lang.Object r1 = r1.a(r4)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L3c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L26
            goto L3c
        L26:
            java.lang.String r2 = "theme"
            java.lang.Object r2 = zhm.r0.h(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            vjg.g r4 = r0.d
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r2 = r4.a(r2)
            if (r2 != 0) goto L37
            goto L3c
        L37:
            dkg.a r1 = r0.a(r1)
            goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 == 0) goto L4a
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r2 = r1.f115516a
            l80.e r4 = r5.f127162c
            boolean r2 = r2.K5(r4)
            if (r2 == 0) goto L4a
            return r1
        L4a:
            mk0.a r1 = r0.f
            java.lang.String r2 = "APP_STYLE"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            tk0.f r3 = new tk0.f
            r3.<init>(r2)
            java.lang.Object r1 = r1.a(r3)
            java.util.Map r1 = (java.util.Map) r1
            dkg.a r0 = r0.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ekg.g.i():dkg.a");
    }

    public final AppTheme j() {
        return pd.b.u(i(), this.f127163g);
    }

    public final AppTheme k(AppTheme appTheme) {
        Intrinsics.checkNotNullParameter(appTheme, "appTheme");
        return pd.b.u(new dkg.a(appTheme.f94561a, appTheme.f94562b, appTheme.f94563c), this.f127163g);
    }

    public final Object l(boolean z, i iVar) throws Throwable {
        o oVar = (o) this.f127161b;
        oVar.getClass();
        j jVar = new j(oVar, z, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, jVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object m(List list, i iVar) throws Throwable {
        o oVar = (o) this.f127161b;
        oVar.getClass();
        ad4.c cVar = new ad4.c(oVar, list, null, 24);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object n(GlobalThemeDeclaration globalThemeDeclaration, gim.c cVar) {
        Object objB = wjg.a.b(this, globalThemeDeclaration, null, null, cVar, 6);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ekg.f
            if (r0 == 0) goto L13
            r0 = r6
            ekg.f r0 = (ekg.f) r0
            int r1 = r0.f127159w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127159w = r1
            goto L18
        L13:
            ekg.f r0 = new ekg.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127159w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            vjg.g r6 = r4.d
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r5 = r6.a(r5)
            if (r5 != 0) goto L3d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3d:
            com.revolut.feature.uipersonalisation.api.models.AppTheme r6 = r4.j()
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r6 = r6.f94561a
            java.lang.String r6 = r6.getId()
            java.lang.String r2 = r5.getId()
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 != 0) goto L5a
            r0.f127159w = r3
            java.lang.Object r5 = r4.n(r5, r0)
            if (r5 != r1) goto L5b
            return r1
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ekg.g.o(java.lang.String, gim.c):java.lang.Object");
    }
}
