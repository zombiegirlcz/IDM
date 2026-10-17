package u1f;

import fmc.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f276408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k18.c f276409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6c.g f276410c;

    public g(z topUpRepository, k18.c featureInteractor, a6c.g fullRevPointsCheckoutExtension) {
        Intrinsics.checkNotNullParameter(topUpRepository, "topUpRepository");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(fullRevPointsCheckoutExtension, "fullRevPointsCheckoutExtension");
        this.f276408a = topUpRepository;
        this.f276409b = featureInteractor;
        this.f276410c = fullRevPointsCheckoutExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(u6c.t r12, u2f.n r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof u1f.e
            if (r0 == 0) goto L13
            r0 = r14
            u1f.e r0 = (u1f.e) r0
            int r1 = r0.f276404w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276404w = r1
            goto L18
        L13:
            u1f.e r0 = new u1f.e
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276404w
            a6c.g r3 = r11.f276410c
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r14)
            goto L5f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            yhm.o.b(r14)
            u2f.m r14 = r13.f276650g
            if (r14 == 0) goto La6
            u2f.q r13 = r13.f276649c
            u2f.q r2 = u2f.q.PENDING
            if (r13 != r2) goto La6
            com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.FullRevPointsPaymentInitiationParams r5 = new com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.FullRevPointsPaymentInitiationParams
            com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints$a r13 = com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints.INSTANCE
            java.math.BigDecimal r2 = r14.f276646c
            r13.getClass()
            long r6 = com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints.Companion.a(r2)
            java.lang.String r8 = r14.f276644a
            java.lang.String r9 = r14.f276645b
            r10 = r12
            r5.<init>(r6, r8, r9, r10)
            r0.f276404w = r4
            r12 = r3
            o8c.j r12 = (o8c.j) r12
            java.lang.Object r14 = r12.f3(r5, r0)
            if (r14 != r1) goto L5f
            return r1
        L5f:
            a6c.e r14 = (a6c.e) r14
            boolean r12 = r14 instanceof a6c.b
            if (r12 != 0) goto La6
            a6c.d r12 = a6c.d.f1601a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r14, r12)
            if (r12 == 0) goto L6e
            goto La6
        L6e:
            boolean r12 = r14 instanceof a6c.c
            if (r12 == 0) goto L92
            a6c.c r14 = (a6c.c) r14
            u6c.k r12 = r14.f1600a
            r13 = 0
            if (r12 == 0) goto L8c
            o8c.j r3 = (o8c.j) r3
            r3.getClass()
            java.lang.String r14 = "errorReason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r14)
            rdc.b r14 = r3.f223013p
            r14.getClass()
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = rdc.b.a(r13, r12)
        L8c:
            com.revolut.feature.trade_rev_points.impl.interactor.TradeRevPointsRevPayException r12 = new com.revolut.feature.trade_rev_points.impl.interactor.TradeRevPointsRevPayException
            r12.<init>(r13)
            throw r12
        L92:
            a6c.a r12 = a6c.a.f1597a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r14, r12)
            if (r12 == 0) goto La0
            com.revolut.feature.trade_rev_points.impl.interactor.TradeRevPointsRevPayAbandonedException r12 = new com.revolut.feature.trade_rev_points.impl.interactor.TradeRevPointsRevPayAbandonedException
            r12.<init>()
            throw r12
        La0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        La6:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u1f.g.a(u6c.t, u2f.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(u2f.p r13, u2f.j r14, gim.c r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof u1f.f
            if (r0 == 0) goto L13
            r0 = r15
            u1f.f r0 = (u1f.f) r0
            int r1 = r0.f276407y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276407y = r1
            goto L18
        L13:
            u1f.f r0 = new u1f.f
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f276405w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276407y
            fmc.z r4 = r12.f276408a
            r9 = 3
            r10 = 2
            r11 = 1
            r7 = 0
            if (r2 == 0) goto L45
            if (r2 == r11) goto L3f
            if (r2 == r10) goto L38
            if (r2 != r9) goto L30
            yhm.o.b(r15)
            return r15
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            u2f.n r13 = r0.v
            yhm.o.b(r15)
            goto Laa
        L3f:
            u2f.j r14 = r0.u
            yhm.o.b(r15)
            goto L73
        L45:
            yhm.o.b(r15)
            k18.c r15 = r12.f276409b
            java.lang.Object r15 = r15.f180140b
            gte.a r15 = (gte.a) r15
            com.revolut.feature.trade_rev_points.api.TradeRevPointsApi$Toggles$TradeRevPointsRevPayMigration r2 = com.revolut.feature.trade_rev_points.api.TradeRevPointsApi$Toggles$TradeRevPointsRevPayMigration.f91105c
            jte.d r15 = (jte.d) r15
            boolean r15 = r15.c(r2)
            if (r15 == 0) goto L5c
            java.lang.String r15 = "2"
            r6 = r15
            goto L5d
        L5c:
            r6 = r7
        L5d:
            r0.u = r14
            r0.f276407y = r11
            k0g.b r3 = new k0g.b
            r8 = 4
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r13, r3, r0)
            if (r15 != r1) goto L73
            goto Lc5
        L73:
            r13 = r15
            u2f.n r13 = (u2f.n) r13
            int[] r15 = u1f.d.f276403a
            int r14 = r14.ordinal()
            r14 = r15[r14]
            if (r14 == r11) goto L9b
            if (r14 == r10) goto L98
            if (r14 == r9) goto L95
            r13 = 4
            if (r14 == r13) goto L8d
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L8d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Product type is unknown"
            r13.<init>(r14)
            throw r13
        L95:
            u6c.t r14 = u6c.t.HOTELS_POINTS
            goto L9d
        L98:
            u6c.t r14 = u6c.t.TRAINS_POINTS
            goto L9d
        L9b:
            u6c.t r14 = u6c.t.AIR_MILES
        L9d:
            r0.u = r7
            r0.v = r13
            r0.f276407y = r10
            java.lang.Object r14 = r12.a(r14, r13, r0)
            if (r14 != r1) goto Laa
            goto Lc5
        Laa:
            java.lang.String r13 = r13.f276647a
            r0.u = r7
            r0.v = r7
            r0.f276407y = r9
            k1f.l r14 = k1f.m.Companion
            jsl.t0 r14 = new jsl.t0
            r15 = 21
            r14.<init>(r4, r13, r7, r15)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r14, r0)
            if (r13 != r1) goto Lc6
        Lc5:
            return r1
        Lc6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u1f.g.b(u2f.p, u2f.j, gim.c):java.lang.Object");
    }
}
