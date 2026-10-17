package v5a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6a.e f286175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f286176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mt8.d f286177c;

    public c(b6a.e repository, gte.a featureToggleInteractor, mt8.d kycInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        this.f286175a = repository;
        this.f286176b = featureToggleInteractor;
        this.f286177c = kycInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof v5a.b
            if (r0 == 0) goto L13
            r0 = r5
            v5a.b r0 = (v5a.b) r0
            int r1 = r0.f286174w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286174w = r1
            goto L18
        L13:
            v5a.b r0 = new v5a.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286174w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            gte.a r5 = r4.f286176b
            com.revolut.feature.payments_migration.api.PaymentsMigrationApi$Toggles$PaymentsMigration r2 = com.revolut.feature.payments_migration.api.PaymentsMigrationApi$Toggles$PaymentsMigration.f80203c
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L3f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3f:
            mt8.d r5 = r4.f286177c
            ufm.b r5 = r5.getKyc()
            r0.f286174w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            yt8.c r5 = (yt8.c) r5
            yt8.i r5 = r5.f316662a
            boolean r5 = ngm.n.p(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v5a.c.a(gim.c):java.lang.Object");
    }
}
