package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2e.t f127326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ny1.a f127327n;

    public g(klf.h0 commonDataSource, g2e.t apmTransferDataSource, ny1.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(apmTransferDataSource, "apmTransferDataSource");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f127325l = commonDataSource;
        this.f127326m = apmTransferDataSource;
        this.f127327n = apmNavigationProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof elf.f
            if (r0 == 0) goto L13
            r0 = r6
            elf.f r0 = (elf.f) r0
            int r1 = r0.f127321w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127321w = r1
            goto L18
        L13:
            elf.f r0 = new elf.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127321w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f127325l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f127321w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L54
        L48:
            tof.a3 r6 = (tof.a3) r6
            r0.f127321w = r3
            g2e.t r2 = r5.f127326m
            java.lang.Object r6 = r2.k(r6, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            com.revolut.feature.apm.core.models.recipients.ApmContact r6 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r6
            if (r6 != 0) goto L6b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "openApmContactDetails without valid ApmContact"
            r6.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            goto L84
        L6b:
            ny1.a r0 = r5.f127327n
            oy1.b r0 = (oy1.b) r0
            r0.getClass()
            java.lang.String r0 = "recipient"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination r0 = new com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ApmTransferRecipient r1 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ApmTransferRecipient
            r1.<init>(r6)
            r0.<init>(r1)
            r5.A2(r0)
        L84:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.g.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_NAV_BAR_ICON") ? Z2((gim.c) continuation) : Boolean.FALSE;
    }
}
