package ty1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f275452b;

    public /* synthetic */ a(b bVar, int i) {
        this.f275451a = i;
        this.f275452b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.f275451a
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L49;
                case 2: goto L28;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "isEnabled"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L22
            ty1.b r2 = r1.f275452b
            gte.a r2 = r2.f275454b
            com.revolut.feature.apm.core.api.ApmToggles$WeroPaymentsQR r0 = com.revolut.feature.apm.core.api.ApmToggles$WeroPaymentsQR.f61806c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r0)
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L28:
            java.lang.String r0 = "isWeroEnabled"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L43
            ty1.b r2 = r1.f275452b
            gte.a r2 = r2.f275454b
            com.revolut.feature.apm.core.api.ApmToggles$WeroHome r0 = com.revolut.feature.apm.core.api.ApmToggles$WeroHome.f61805c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r0)
            if (r2 == 0) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L49:
            java.lang.String r0 = "featureEnabled"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L64
            ty1.b r2 = r1.f275452b
            gte.a r2 = r2.f275454b
            com.revolut.feature.apm.core.api.ApmToggles$PixApmMigration r0 = com.revolut.feature.apm.core.api.ApmToggles$PixApmMigration.f61799c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r0)
            if (r2 == 0) goto L64
            r2 = 1
            goto L65
        L64:
            r2 = 0
        L65:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L6a:
            java.lang.String r0 = "enabled"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L85
            ty1.b r2 = r1.f275452b
            gte.a r2 = r2.f275454b
            com.revolut.feature.apm.core.api.ApmToggles$BlikEea r0 = com.revolut.feature.apm.core.api.ApmToggles$BlikEea.f61791c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r0)
            if (r2 == 0) goto L85
            r2 = 1
            goto L86
        L85:
            r2 = 0
        L86:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ty1.a.invoke(java.lang.Object):java.lang.Object");
    }
}
