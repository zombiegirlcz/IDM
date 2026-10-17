package nyb;

import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements eub.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f220774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f220775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y21.c f220776c;
    public final eub.a d;

    public b0(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, y21.c optOutRepository, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f220774a = featureToggleInteractor;
        this.f220775b = productCatalogueInteractor;
        this.f220776c = optOutRepository;
        this.d = revPointsAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nyb.w
            if (r0 == 0) goto L13
            r0 = r6
            nyb.w r0 = (nyb.w) r0
            int r1 = r0.f220840w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220840w = r1
            goto L18
        L13:
            nyb.w r0 = new nyb.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220840w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L63
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            boolean r6 = r5.b()
            if (r6 == 0) goto L3b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L3b:
            com.revolut.data.network.models.security.SecuritySettings r6 = com.revolut.data.network.models.security.SecuritySettings.PERSONALIZED_THIRD_PARTY_PROMOTION
            w4l.h r2 = w4l.h.f294642c
            y21.c r4 = r5.f220776c
            efm.r r6 = r4.b(r6, r2)
            nsl.d r2 = new nsl.d
            r4 = 21
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f220840w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            od0.i r6 = (od0.i) r6
            java.lang.Object r6 = r6.f224257a
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L70
            boolean r6 = r6.booleanValue()
            goto L71
        L70:
            r6 = 0
        L71:
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nyb.b0.a(gim.c):java.lang.Object");
    }

    public final boolean b() {
        if (((b) this.d).f()) {
            return ((jte.d) this.f220774a).c(RevPointsApi$Toggles.RevPointsPersonalisation.f83468c) && this.f220775b.d("LOYALTY_PERSONALISATION", null) == bla.c.ENABLED;
        }
        return false;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        boolean zB = b();
        y21.c cVar = this.f220776c;
        jla.h hVar = this.f220775b;
        if (zB && hVar.d("LOYALTY_PERSONALISATION.transactions_usage", null) == bla.c.ENABLED && cVar.a(SecuritySettings.TRANSACTIONS_USAGE).d()) {
            return true;
        }
        if (b() && hVar.d("LOYALTY_PERSONALISATION.revolut_products_usage", null) == bla.c.ENABLED && cVar.a(SecuritySettings.REVOLUT_PRODUCTS_USAGE).d()) {
            return true;
        }
        return b() && hVar.d("LOYALTY_PERSONALISATION.revpoints_profile_usage", null) == bla.c.ENABLED && cVar.a(SecuritySettings.REVPOINTS_PROFILE_USAGE).d();
    }

    public final d78.c d() {
        return new d78.c(new go.g(Boolean.valueOf(b()), 2), 1);
    }
}
