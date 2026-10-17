package ga0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf0.h;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v60.e f141977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f141978m;

    public d(h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f141977l = serverErrorsProvider;
        this.f141978m = serverErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    @Override // ga0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z2(java.lang.Throwable r26, ia0.c r27, kotlin.jvm.functions.Function0 r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "onDismiss"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r0.t2()
            r4 = 0
            if (r2 == 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = r4
        L1b:
            nii.y0 r6 = new nii.y0
            boolean r7 = tj0.a.a(r1)
            r8 = 14
            r9 = 0
            if (r7 == 0) goto L4c
            nii.e0 r10 = new nii.e0
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.kompot.common.R$string.common_offline_state_title
            r11.<init>(r1, r9, r9, r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.kompot.common.R$string.common_offline_state_description
            r12.<init>(r1, r9, r9, r8)
            if (r5 == 0) goto L41
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.kompot.common.R$string.common_offline_state_action
            r1.<init>(r5, r9, r9, r8)
            r13 = r1
            goto L42
        L41:
            r13 = r9
        L42:
            r16 = 0
            r17 = 980(0x3d4, float:1.373E-42)
            r14 = 0
            r15 = 1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto La4
        L4c:
            sf0.h r7 = r0.f141978m
            com.revolut.core.error.data.model.ServerError r1 = r7.a(r1)
            if (r1 == 0) goto L69
            int r1 = r1.f51362a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            v60.e r7 = r0.f141977l
            ao0.a r7 = (ao0.a) r7
            v60.c r1 = r7.b(r1)
            if (r1 == 0) goto L69
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = ofm.q.O(r1)
            goto L6a
        L69:
            r1 = r9
        L6a:
            nii.z r10 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.kompot.common.R$string.common_error_state_title
            r11.<init>(r7, r9, r9, r8)
            if (r1 != 0) goto L7e
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.kompot.common.R$string.common_error_state_description
            r7.<init>(r12, r9, r9, r8)
            r12 = r7
            goto L7f
        L7e:
            r12 = r1
        L7f:
            if (r5 == 0) goto L8c
            if (r1 != 0) goto L8c
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.kompot.common.R$string.common_error_state_action
            r1.<init>(r5, r9, r9, r8)
            r13 = r1
            goto L8d
        L8c:
            r13 = r9
        L8d:
            r23 = 0
            r24 = 32500(0x7ef4, float:4.5542E-41)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        La4:
            r1 = 4
            java.lang.String r5 = "ERROR_DIALOG_ID"
            r6.<init>(r5, r10, r4, r1)
            kotlinx.coroutines.flow.Flow r1 = r0.L2(r6)
            ga0.c r4 = new ga0.c
            r5 = 0
            r4.<init>(r2, r3, r9, r5)
            r2 = 3
            yji.n.j2(r0, r1, r9, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga0.d.Z2(java.lang.Throwable, ia0.c, kotlin.jvm.functions.Function0):void");
    }
}
