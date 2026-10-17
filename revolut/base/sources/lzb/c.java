package lzb;

import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f200961l;

    public c(k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.f200961l = revPointsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof lzb.b
            if (r2 == 0) goto L17
            r2 = r1
            lzb.b r2 = (lzb.b) r2
            int r3 = r2.f200960w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f200960w = r3
            goto L1c
        L17:
            lzb.b r2 = new lzb.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f200960w
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L34
            if (r4 != r6) goto L2c
            yhm.o.b(r1)
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            l40.j r1 = new l40.j
            r4 = 17
            r1.<init>(r0, r5, r4)
            r2.f200960w = r6
            java.lang.Object r1 = r0.Y2(r2, r1)
            if (r1 != r3) goto L47
            return r3
        L47:
            nii.y0 r1 = new nii.y0
            nii.j0 r6 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.rev_points.api.R$string.rev_points_personalisation_bottom_sheet_title
            r3 = 14
            r7.<init>(r2, r5, r5, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.rev_points.api.R$string.rev_points_personalisation_bottom_sheet_subtitle
            r8.<init>(r2, r5, r5, r3)
            r17 = 0
            r18 = 4092(0xffc, float:5.734E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 0
            r3 = 5
            r1.<init>(r5, r6, r2, r3)
            kotlinx.coroutines.flow.Flow r1 = r0.L2(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lzb.c.Z2(gim.c):java.lang.Object");
    }
}
