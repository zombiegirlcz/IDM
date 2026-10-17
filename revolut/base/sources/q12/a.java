package q12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f241310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f241311b;

    public a(sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f241310a = serverErrorParser;
        this.f241311b = serverErrorsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nii.z a(java.lang.Throwable r21, boolean r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r1 instanceof com.revolut.core.network.exceptions.HandledNetworkException
            r3 = 0
            if (r2 == 0) goto Lf
            return r3
        Lf:
            boolean r2 = r1 instanceof retrofit2.HttpException
            if (r2 == 0) goto L26
            r2 = r1
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2
            retrofit2.Response r2 = r2.response()
            if (r2 == 0) goto L26
            int r2 = r2.code()
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L25
            goto L26
        L25:
            throw r1
        L26:
            sf0.h r2 = r0.f241310a
            com.revolut.core.error.data.model.ServerError r1 = r2.a(r1)
            r2 = 14
            if (r1 == 0) goto L62
            int r1 = r1.f51362a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            v60.e r4 = r0.f241311b
            ao0.a r4 = (ao0.a) r4
            v60.c r1 = r4.b(r1)
            if (r1 != 0) goto L41
            goto L62
        L41:
            nii.z r4 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = ofm.q.O(r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r1 = 2131961942(0x7f132856, float:1.9560595E38)
            r7.<init>(r1, r3, r3, r2)
            r17 = 0
            r18 = 32758(0x7ff6, float:4.5904E-41)
            r6 = 0
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
            goto L63
        L62:
            r4 = r3
        L63:
            if (r4 == 0) goto L66
            return r4
        L66:
            if (r22 == 0) goto L8e
            nii.z r5 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r1 = 2131961980(0x7f13287c, float:1.9560672E38)
            r6.<init>(r1, r3, r3, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r1 = 2131970735(0x7f134aaf, float:1.957843E38)
            r7.<init>(r1, r3, r3, r2)
            r18 = 0
            r19 = 32764(0x7ffc, float:4.5912E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.a.a(java.lang.Throwable, boolean):nii.z");
    }
}
