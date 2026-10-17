package th6;

import com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkExternalInstitutionsService f271282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f271283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vfg.p f271284c;
    public final x4l.c d;

    public m(LinkExternalInstitutionsService linkExternalInstitutionsService, sf0.h serverErrorParser, vfg.p accountLinkLimitErrorParser) {
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsService, "linkExternalInstitutionsService");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(accountLinkLimitErrorParser, "accountLinkLimitErrorParser");
        this.f271282a = linkExternalInstitutionsService;
        this.f271283b = serverErrorParser;
        this.f271284c = accountLinkLimitErrorParser;
        Continuation continuation = null;
        this.d = new x4l.c(new pti.d(this, continuation, 29), new tfh.a(6), new tc6.b(25), new rp1.c(2, 7, continuation), new nfj.i(3, 22, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.util.List r7, qe6.a r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof th6.l
            if (r0 == 0) goto L13
            r0 = r9
            th6.l r0 = (th6.l) r0
            int r1 = r0.f271281w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271281w = r1
            goto L18
        L13:
            th6.l r0 = new th6.l
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271281w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L8a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r9)
            yh6.d0 r9 = new yh6.d0
            if (r8 == 0) goto L45
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            com.revolut.data.network.models.openbanking.AccountLinkingExpirationRequestDto r2 = new com.revolut.data.network.models.openbanking.AccountLinkingExpirationRequestDto
            java.lang.Long r4 = r8.f245084a
            java.lang.String r8 = r8.f245085b
            r2.<init>(r4, r8)
            goto L46
        L45:
            r2 = 0
        L46:
            r9.<init>(r6, r7, r2)
            com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService$a r6 = com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService.INSTANCE
            wj0.b r6 = new wj0.b
            java.lang.String r7 = "RELINK_EXTERNAL_INSTITUTION_IDEMPOTENCY_KEY"
            r6.<init>(r7)
            com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService r7 = r5.f271282a
            efm.d0 r6 = r7.relink(r9, r6)
            tfh.a r7 = new tfh.a
            r8 = 5
            r7.<init>(r8)
            tcg.q r8 = new tcg.q
            r9 = 27
            r8.<init>(r9, r7)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r7.<init>(r6, r8, r3)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            th6.j r6 = new th6.j
            r6.<init>(r5, r3)
            zhm.h0 r8 = zhm.h0.f322473a
            pfm.z r6 = ue0.e.I(r7, r8, r6)
            ufm.n r6 = te0.w.i0(r6)
            r0.f271281w = r3
            java.lang.Object r9 = nim.a.b(r6, r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: th6.m.a(java.lang.String, java.util.List, qe6.a, gim.c):java.lang.Object");
    }
}
