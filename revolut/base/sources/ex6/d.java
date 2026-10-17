package ex6;

import kotlin.jvm.internal.Intrinsics;
import sf0.h;
import v60.e;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f130355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f130356m;

    public d(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f130355l = serverErrorParser;
        this.f130356m = serverErrorsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z2(java.lang.Throwable r20, kotlin.jvm.functions.Function1 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "onDialogResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            sf0.h r3 = r0.f130355l
            com.revolut.core.error.data.model.ServerError r1 = r3.a(r1)
            v60.e r3 = r0.f130356m
            if (r1 == 0) goto L29
            int r1 = r1.f51362a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = r3
            ao0.a r4 = (ao0.a) r4
            v60.c r1 = r4.b(r1)
            if (r1 != 0) goto L33
        L29:
            ao0.a r3 = (ao0.a) r3
            r3.getClass()
            v60.b r1 = new v60.b
            r1.<init>()
        L33:
            nii.y0 r3 = new nii.y0
            nii.z r4 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = ofm.q.O(r1)
            r17 = 0
            r18 = 32766(0x7ffe, float:4.5915E-41)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 0
            r5 = 4
            java.lang.String r6 = "ERROR_STATUS_DIALOG_ID"
            r3.<init>(r6, r4, r1, r5)
            kotlinx.coroutines.flow.Flow r1 = r0.L2(r3)
            ex6.c r3 = new ex6.c
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5, r2)
            r2 = 3
            yji.n.j2(r0, r1, r5, r3, r2)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex6.d.Z2(java.lang.Throwable, kotlin.jvm.functions.Function1):boolean");
    }
}
