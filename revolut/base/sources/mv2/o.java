package mv2;

import cli.y;
import e0f.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends oki.h implements g {

    @NotNull
    public static final j Companion = new j();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f209106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n3i.b f209107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f209108r;

    public o(cli.n stateMapper, d inputData, y51.a externalCardsInteractor, n3i.b externalCardsMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        this.o = inputData;
        this.f209106p = externalCardsInteractor;
        this.f209107q = externalCardsMapper;
        this.f209108r = mra.d.b(this, new c("", null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(m70.a.g(((z) this.f209106p).c(this.o.f209095a, w4l.j.f294644c), null, null, 3)), null, null, new mkk.q(this, null, 24), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(t61.b r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof mv2.m
            if (r3 == 0) goto L19
            r3 = r2
            mv2.m r3 = (mv2.m) r3
            int r4 = r3.f209105w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f209105w = r4
            goto L1e
        L19:
            mv2.m r3 = new mv2.m
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f209105w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L6f
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            mv2.d r2 = r0.o
            boolean r2 = r2.f209096b
            if (r2 == 0) goto L75
            y51.a r2 = r0.f209106p
            e0f.z r2 = (e0f.z) r2
            r2.getClass()
            java.lang.String r5 = "cardVerificationData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            p71.a r2 = r2.f121703a
            u21.k r2 = (u21.k) r2
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            rzc.b r5 = new rzc.b
            r7 = 22
            r5.<init>(r2, r1, r7)
            pfm.h r1 = new pfm.h
            r2 = 2
            r1.<init>(r5, r2)
            java.lang.String r2 = "fromAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.f209105w = r6
            java.lang.Object r1 = nim.a.a(r1, r3)
            if (r1 != r4) goto L6f
            return r4
        L6f:
            mv2.e$b r1 = mv2.e.b.f209098a
            r0.C2(r1)
            goto Lc2
        L75:
            nii.y0 r2 = new nii.y0
            nii.j0 r3 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.card.verification.impl.R$string.cnp_card_verification_result_success_title
            t61.g r1 = r1.f268129a
            java.lang.String r6 = "··"
            n3i.b r7 = r0.f209107q
            java.lang.String r1 = r7.b(r6, r1)
            java.util.List r1 = zhm.u.c(r1)
            r6 = 12
            r7 = 0
            r4.<init>(r5, r1, r7, r6)
            nii.v1 r8 = new nii.v1
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.card.verification.impl.R$string.cnp_card_verification_result_success_button
            r6 = 14
            r1.<init>(r5, r7, r7, r6)
            r8.<init>(r1, r7)
            r14 = 0
            r15 = 4078(0xfee, float:5.714E-42)
            r5 = 0
            r6 = 0
            r1 = r7
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            r5 = 5
            r2.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r2 = r0.X1(r2)
            mv2.n r4 = new mv2.n
            r4.<init>(r0, r1)
            r5 = 3
            r1 = r2
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
        Lc2:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.o.I2(t61.b, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f209108r;
    }
}
