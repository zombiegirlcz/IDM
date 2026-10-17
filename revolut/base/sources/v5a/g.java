package v5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe7.a f286181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f286182b;

    public g(qe7.a incentiveExperimentInteractor, pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(incentiveExperimentInteractor, "incentiveExperimentInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f286181a = incentiveExperimentInteractor;
        this.f286182b = termsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v5a.d
            if (r0 == 0) goto L13
            r0 = r6
            v5a.d r0 = (v5a.d) r0
            int r1 = r0.f286178w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286178w = r1
            goto L18
        L13:
            v5a.d r0 = new v5a.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286178w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L59
        L2a:
            r6 = move-exception
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L44
        L38:
            yhm.o.b(r6)
            r0.f286178w = r4
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L44
            goto L58
        L44:
            com.revolut.feature.terms.api.model.Terms r6 = (com.revolut.feature.terms.api.model.Terms) r6
            if (r6 == 0) goto L66
            pre.c r2 = r5.f286182b     // Catch: java.lang.Exception -> L2a
            java.lang.String r6 = r6.f90355a     // Catch: java.lang.Exception -> L2a
            pfm.r r6 = pre.c.b(r2, r6)     // Catch: java.lang.Exception -> L2a
            r0.f286178w = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = nim.a.a(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2a
            goto L66
        L5c:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v5a.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof v5a.e
            if (r0 == 0) goto L13
            r0 = r5
            v5a.e r0 = (v5a.e) r0
            int r1 = r0.f286179w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286179w = r1
            goto L18
        L13:
            v5a.e r0 = new v5a.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286179w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            pre.c r5 = r4.f286182b     // Catch: java.lang.Exception -> L27
            com.revolut.feature.terms.api.model.TermsScope$a r2 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE     // Catch: java.lang.Exception -> L27
            r2.getClass()     // Catch: java.lang.Exception -> L27
            com.revolut.feature.terms.api.model.TermsScope r2 = com.revolut.feature.terms.api.model.TermsScope.p0     // Catch: java.lang.Exception -> L27
            ufm.i r5 = r5.j(r2)     // Catch: java.lang.Exception -> L27
            r0.f286179w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = nim.a.b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L4a
            return r1
        L4a:
            od0.i r5 = (od0.i) r5     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.f224257a     // Catch: java.lang.Exception -> L27
            com.revolut.feature.terms.api.model.Terms r5 = (com.revolut.feature.terms.api.model.Terms) r5     // Catch: java.lang.Exception -> L27
            return r5
        L51:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v5a.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v5a.f
            if (r0 == 0) goto L13
            r0 = r6
            v5a.f r0 = (v5a.f) r0
            int r1 = r0.f286180w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286180w = r1
            goto L18
        L13:
            v5a.f r0 = new v5a.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286180w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L46
        L36:
            yhm.o.b(r6)
            r0.f286180w = r4
            qe7.a r6 = r5.f286181a
            ue7.c r6 = (ue7.c) r6
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L46
            goto L56
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5a
            r0.f286180w = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r4 = 0
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v5a.g.c(gim.c):java.lang.Object");
    }
}
