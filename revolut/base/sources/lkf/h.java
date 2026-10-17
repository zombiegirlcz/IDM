package lkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f196382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2e.t f196383b;

    public h(klf.h0 commonDataSource, g2e.t apmTransferDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(apmTransferDataSource, "apmTransferDataSource");
        this.f196382a = commonDataSource;
        this.f196383b = apmTransferDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(lkf.h r13, tof.a3 r14, gim.c r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof lkf.f
            if (r0 == 0) goto L16
            r0 = r15
            lkf.f r0 = (lkf.f) r0
            int r1 = r0.f196374w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f196374w = r1
            goto L1b
        L16:
            lkf.f r0 = new lkf.f
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196374w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L40
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            yhm.o.b(r15)
            g2e.t r13 = r13.f196383b
            r0.f196374w = r3
            java.lang.Object r15 = r13.k(r14, r0)
            if (r15 != r1) goto L40
            return r1
        L40:
            com.revolut.feature.apm.core.models.recipients.ApmContact r15 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r15
            boolean r13 = r15 instanceof com.revolut.feature.apm.core.models.recipients.BizumContact
            if (r13 == 0) goto L8d
            com.revolut.feature.apm.core.models.recipients.BizumContact r15 = (com.revolut.feature.apm.core.models.recipients.BizumContact) r15
            boolean r13 = r15.b()
            if (r13 != 0) goto L51
            zhm.f0 r13 = zhm.f0.f322471a
            return r13
        L51:
            com.revolut.core.ui_kit.delegates.sa r0 = new com.revolut.core.ui_kit.delegates.sa
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.transactions.impl.R$string.transaction_details_bizum_pending_invite_widget_title
            r14 = 0
            r15 = 14
            r2.<init>(r13, r14, r14, r15)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.transactions.impl.R$string.transaction_details_bizum_pending_invite_widget_subtitle
            r3.<init>(r13, r14, r14, r15)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_info
            r11 = 0
            r12 = 254(0xfe, float:3.56E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r9 = 4056(0xfd8, float:5.684E-42)
            java.lang.String r1 = "BIZUM_INVITE_ID"
            r6 = r4
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = 0
            r7 = 63
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            yp0.b.l(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.List r13 = zhm.u.c(r0)
            return r13
        L8d:
            zhm.f0 r13 = zhm.f0.f322471a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lkf.h.a(lkf.h, tof.a3, gim.c):java.lang.Object");
    }
}
