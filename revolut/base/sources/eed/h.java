package eed;

import com.revolut.feature.retail.savings.api.SavingsAccountApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements lbd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ubd.i f125186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f125187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final odd.a f125188c;
    public final lob.a d;
    public final pak.h e;

    public h(ubd.i savingsAccountInteractor, mbd.b savingsVaultMapper, d savingsVaultConverter, odd.a vaultsInteractor, lob.a sharedSavingsToggles, nd.n savingsAccountBalanceOperationHandler, pak.h savingsAccountClosureHandler) {
        Intrinsics.checkNotNullParameter(savingsAccountInteractor, "savingsAccountInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultMapper, "savingsVaultMapper");
        Intrinsics.checkNotNullParameter(savingsVaultConverter, "savingsVaultConverter");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(sharedSavingsToggles, "sharedSavingsToggles");
        Intrinsics.checkNotNullParameter(savingsAccountBalanceOperationHandler, "savingsAccountBalanceOperationHandler");
        Intrinsics.checkNotNullParameter(savingsAccountClosureHandler, "savingsAccountClosureHandler");
        this.f125186a = savingsAccountInteractor;
        this.f125187b = savingsVaultConverter;
        this.f125188c = vaultsInteractor;
        this.d = sharedSavingsToggles;
        this.e = savingsAccountClosureHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:16:0x0035, B:32:0x006b, B:26:0x0053, B:29:0x0066), top: B:42:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof eed.e
            if (r0 == 0) goto L13
            r0 = r8
            eed.e r0 = (eed.e) r0
            int r1 = r0.f125180w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125180w = r1
            goto L18
        L13:
            eed.e r0 = new eed.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125180w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L39
            goto L6b
        L39:
            r7 = move-exception
            goto L6e
        L3b:
            yhm.o.b(r8)
            goto L53
        L3f:
            yhm.o.b(r8)
            boolean r8 = r6.c()
            if (r8 == 0) goto L7b
            r0.f125180w = r5
            ubd.i r8 = r6.f125186a
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L53
            goto L8b
        L53:
            pak.h r7 = r6.e     // Catch: java.lang.Exception -> L39
            r0.f125180w = r4     // Catch: java.lang.Exception -> L39
            java.lang.Object r7 = r7.f234573b     // Catch: java.lang.Exception -> L39
            wsg.n r7 = (wsg.n) r7     // Catch: java.lang.Exception -> L39
            efm.b r7 = r7.l0(r5)     // Catch: java.lang.Exception -> L39
            java.lang.Object r7 = nim.a.a(r7, r0)     // Catch: java.lang.Exception -> L39
            if (r7 != r1) goto L66
            goto L68
        L66:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L39
        L68:
            if (r7 != r1) goto L6b
            goto L8b
        L6b:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L39
            goto L78
        L6e:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r7, r8)
        L78:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7b:
            odd.a r8 = r6.f125188c
            eed.n r8 = (eed.n) r8
            pfm.a r7 = r8.b(r7)
            r0.f125180w = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L8c
        L8b:
            return r1
        L8c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eed.h.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(pcd.u r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof eed.f
            if (r0 == 0) goto L13
            r0 = r12
            eed.f r0 = (eed.f) r0
            int r1 = r0.f125182x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125182x = r1
            goto L18
        L13:
            eed.f r0 = new eed.f
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125182x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r12)
            goto L9d
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            yhm.o.b(r12)
            return r12
        L3b:
            eed.d r11 = r0.u
            yhm.o.b(r12)
            goto L76
        L41:
            yhm.o.b(r12)
            boolean r12 = r10.c()
            if (r12 == 0) goto L8c
            java.lang.String r12 = r11.f234897c
            if (r12 == 0) goto L84
            pcd.t r11 = r11.f234898g
            if (r11 == 0) goto L5e
            com.revolut.feature.shared.savings.models.account.SavingsAccountCreate$Challenge r2 = new com.revolut.feature.shared.savings.models.account.SavingsAccountCreate$Challenge
            java.lang.String r3 = r11.f234892a
            long r7 = r11.f234893b
            java.lang.String r11 = r11.f234894c
            r2.<init>(r3, r7, r11)
            goto L5f
        L5e:
            r2 = r6
        L5f:
            com.revolut.feature.shared.savings.models.account.SavingsAccountCreate r11 = new com.revolut.feature.shared.savings.models.account.SavingsAccountCreate
            r11.<init>(r12, r2)
            eed.d r12 = r10.f125187b
            r0.u = r12
            r0.f125182x = r5
            ubd.i r2 = r10.f125186a
            java.lang.Object r11 = r2.b(r11, r0)
            if (r11 != r1) goto L73
            goto L9c
        L73:
            r9 = r12
            r12 = r11
            r11 = r9
        L76:
            lcd.i r12 = (lcd.i) r12
            r0.u = r6
            r0.f125182x = r4
            java.io.Serializable r11 = r11.b(r12, r0)
            if (r11 != r1) goto L83
            goto L9c
        L83:
            return r11
        L84:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            r11.<init>(r12)
            throw r11
        L8c:
            odd.a r12 = r10.f125188c
            eed.n r12 = (eed.n) r12
            ufm.i r11 = r12.c(r11)
            r0.f125182x = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L9d
        L9c:
            return r1
        L9d:
            kotlin.jvm.internal.Intrinsics.h(r12)
            pcd.s r12 = (pcd.s) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eed.h.b(pcd.u, gim.c):java.lang.Object");
    }

    public final boolean c() {
        return ((jte.d) this.d.f197444a).c(SavingsAccountApi$Toggles.SavingsMoneyboxAgnosticApi.f83073c);
    }
}
