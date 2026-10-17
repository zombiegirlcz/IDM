package t72;

import cli.y;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import sqd.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements dli.b {
    public final MultibancoExternalEnrollmentCardScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l72.b f268419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y72.a f268420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f268421r;

    public m(MultibancoExternalEnrollmentCardScreenContract$InputData inputData, l72.b multibancoCardImageInteractor, y72.a searchResultProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multibancoCardImageInteractor, "multibancoCardImageInteractor");
        Intrinsics.checkNotNullParameter(searchResultProvider, "searchResultProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f268419p = multibancoCardImageInteractor;
        this.f268420q = searchResultProvider;
        this.f268421r = mra.d.b(this, new e(null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(t72.m r6, gim.c r7) {
        /*
            com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreenContract$InputData r0 = r6.o
            boolean r1 = r7 instanceof t72.l
            if (r1 == 0) goto L15
            r1 = r7
            t72.l r1 = (t72.l) r1
            int r2 = r1.f268418w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f268418w = r2
            goto L1a
        L15:
            t72.l r1 = new t72.l
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f268418w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            l72.b r7 = r6.f268419p
            java.lang.String r3 = r0.f62585a
            r1.f268418w = r4
            java.lang.Object r7 = r7.a(r3, r1)
            if (r7 != r2) goto L41
            return r2
        L41:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            r1 = 14
            r2 = 0
            if (r7 == 0) goto L4f
            com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage r6 = new com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage
            r3 = 0
            r6.<init>(r7, r3, r2, r1)
            goto L58
        L4f:
            y72.a r6 = r6.f268420q
            r6.getClass()
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r6 = y72.a.a()
        L58:
            boolean r7 = r0.f62586b
            if (r7 == 0) goto L63
            int r7 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_matching_card_title
            int r0 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_matching_card_subtitle
            int r3 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_matching_card_action_link
            goto L69
        L63:
            int r7 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_non_multibanco_matching_card_title
            int r0 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_non_multibanco_matching_card_subtitle
            int r3 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_non_multibanco_matching_card_action_link
        L69:
            t72.f r4 = new t72.f
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r5.<init>(r7, r2, r2, r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r7.<init>(r0, r2, r2, r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r0.<init>(r3, r2, r2, r1)
            r4.<init>(r5, r7, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.m.I2(t72.m, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new h0(this, null, 15), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f268421r;
    }
}
