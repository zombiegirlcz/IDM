package oxe;

import cli.y;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends oki.h implements dli.b {
    public final CvvScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f230797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f230798q;

    public n(cli.n stateMapper, CvvScreenContract$InputData inputData, y51.a externalCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        this.o = inputData;
        this.f230797p = externalCardsInteractor;
        this.f230798q = mra.d.b(this, h.f230790a, stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(oxe.n r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof oxe.m
            if (r0 == 0) goto L13
            r0 = r7
            oxe.m r0 = (oxe.m) r0
            int r1 = r0.f230796w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230796w = r1
            goto L18
        L13:
            oxe.m r0 = new oxe.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230796w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L8b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            y51.a r5 = r5.f230797p
            e0f.z r5 = (e0f.z) r5
            r5.getClass()
            java.lang.String r7 = "externalCardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            p71.a r7 = r5.f121703a
            u21.k r7 = (u21.k) r7
            r7.getClass()
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            w4l.f r7 = r7.f276538g
            efm.r r6 = r7.e(r6, r4)
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$ExternalCardsAvailability r7 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.ExternalCardsAvailability.f90465c
            gte.a r2 = r5.f121707h
            boolean r7 = r2.a(r7)
            if (r7 == 0) goto L76
            e0f.l r7 = new e0f.l
            r2 = 1
            r7.<init>(r5, r2)
            e0f.k r5 = new e0f.k
            r2 = 5
            r5.<init>(r7, r2)
            efm.r r6 = r6.map(r5)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
        L76:
            ox5.d0 r5 = new ox5.d0
            r7 = 9
            r5.<init>(r7)
            r7 = 0
            efm.r r5 = m70.a.g(r6, r7, r5, r3)
            r0.f230796w = r3
            java.lang.Object r7 = nim.a.c(r5, r0)
            if (r7 != r1) goto L8b
            return r1
        L8b:
            java.lang.String r5 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oxe.n.I2(oxe.n, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new omg.e(this, null, 17), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f230798q;
    }
}
