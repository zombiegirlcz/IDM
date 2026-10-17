package e0f;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vte.a f121687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f121688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f121689c;
    public final fk3.a d;
    public final n8b.a e;

    public t0(vte.a topUpInteractor, wsg.n walletInteractor, xoj.a featuresInteractor, fk3.a configurationInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f121687a = topUpInteractor;
        this.f121688b = walletInteractor;
        this.f121689c = featuresInteractor;
        this.d = configurationInteractor;
        this.e = countryInteractor;
    }

    public static FeatureCommand a(xi0.b bVar, TopUpConfig topUpConfig) {
        TopUpConfig.Companion companion = TopUpConfig.INSTANCE;
        TopUpConfig.PreselectedTopUpMethod preselectedTopUpMethod = topUpConfig.f90475c;
        TopUpTarget topUpTarget = topUpConfig.d;
        pte.a topUpFlow = topUpConfig.e;
        boolean z = topUpConfig.f;
        companion.getClass();
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
        return zh9.u0.f(new InitTopUpDestination(new TopUpConfig(bVar, null, preselectedTopUpMethod, topUpTarget, topUpFlow, z)));
    }

    public static final xi0.b c(t0 t0Var, AccountId accountId) {
        Set setEntrySet;
        Object next;
        wsg.n nVar = t0Var.f121688b;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        atg.v vVar = (atg.v) nVar.f299736b;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Map mapE = vVar.e(accountId);
        xi0.b bVarA = null;
        if (mapE != null && (setEntrySet = mapE.entrySet()) != null) {
            Iterator it8 = setEntrySet.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    long jLongValue = ((Number) ((Map.Entry) next).getValue()).longValue();
                    do {
                        Object next2 = it8.next();
                        long jLongValue2 = ((Number) ((Map.Entry) next2).getValue()).longValue();
                        if (jLongValue < jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                String str = (String) entry.getKey();
                xi0.b.Companion.getClass();
                bVarA = xi0.a.a(str);
            }
        }
        return bVarA == null ? nVar.D(accountId).d : bVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[Catch: all -> 0x002f, CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002a, B:39:0x00ae, B:43:0x00bb, B:42:0x00b7, B:22:0x0045, B:35:0x0083, B:31:0x0061), top: B:57:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(com.revolut.feature.topup_screen.api.config.TopUpConfig r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.t0.b(com.revolut.feature.topup_screen.api.config.TopUpConfig, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(xi0.b r22, xi0.b r23, com.revolut.feature.topup_screen.api.config.TopUpConfig r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.t0.d(xi0.b, xi0.b, com.revolut.feature.topup_screen.api.config.TopUpConfig, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xi0.b r8, com.revolut.feature.topup_screen.api.config.TopUpConfig r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof e0f.p0
            if (r0 == 0) goto L13
            r0 = r10
            e0f.p0 r0 = (e0f.p0) r0
            int r1 = r0.f121664x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121664x = r1
            goto L18
        L13:
            e0f.p0 r0 = new e0f.p0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121664x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.topup_screen.api.config.TopUpConfig r9 = r0.u
            yhm.o.b(r10)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            r0.u = r9
            r0.f121664x = r3
            java.io.Serializable r10 = r7.h(r8, r9, r0)
            if (r10 != r1) goto L3f
            return r1
        L3f:
            r3 = r10
            xi0.b r3 = (xi0.b) r3
            com.revolut.feature.topup_screen.api.config.TopUpConfig$PreselectedTopUpMethod r8 = r9.f90475c
            boolean r10 = r8 instanceof com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.ExternalPocket
            if (r10 == 0) goto L53
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$ExternalPocketId r10 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$ExternalPocketId
            com.revolut.feature.topup_screen.api.config.TopUpConfig$PreselectedTopUpMethod$ExternalPocket r8 = (com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.ExternalPocket) r8
            java.lang.String r8 = r8.f90477a
            r10.<init>(r8)
        L51:
            r4 = r10
            goto L87
        L53:
            boolean r10 = r8 instanceof com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.ExternalOneOff
            if (r10 == 0) goto L5f
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$OtherMethodType r10 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$OtherMethodType
            com.revolut.domain.models.topup.methods.TopupMethodType r8 = com.revolut.domain.models.topup.methods.TopupMethodType.EASY_BANK_TRANSFER
            r10.<init>(r8)
            goto L51
        L5f:
            boolean r10 = r8 instanceof com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.McyStoredMethod
            if (r10 == 0) goto L6d
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$StoredMethodId r10 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$StoredMethodId
            com.revolut.feature.topup_screen.api.config.TopUpConfig$PreselectedTopUpMethod$McyStoredMethod r8 = (com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.McyStoredMethod) r8
            java.lang.String r8 = r8.f90479a
            r10.<init>(r8)
            goto L51
        L6d:
            boolean r10 = r8 instanceof com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.PayNow
            if (r10 == 0) goto L79
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$OtherMethodType r10 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$OtherMethodType
            com.revolut.domain.models.topup.methods.TopupMethodType r8 = com.revolut.domain.models.topup.methods.TopupMethodType.PAYNOW
            r10.<init>(r8)
            goto L51
        L79:
            boolean r8 = r8 instanceof com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.GooglePay
            if (r8 == 0) goto L85
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$OtherMethodType r10 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$OtherMethodType
            com.revolut.domain.models.topup.methods.TopupMethodType r8 = com.revolut.domain.models.topup.methods.TopupMethodType.GOOGLE_PAY
            r10.<init>(r8)
            goto L51
        L85:
            r10 = 0
            goto L51
        L87:
            e0f.k0 r0 = new e0f.k0
            com.revolut.feature.topup_screen.common.TopUpTarget r1 = r9.d
            pte.a r2 = r9.e
            boolean r5 = r9.f
            dj0.d r6 = r9.f90474b
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.t0.e(xi0.b, com.revolut.feature.topup_screen.api.config.TopUpConfig, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.topup_screen.api.config.TopUpConfig r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e0f.q0
            if (r0 == 0) goto L13
            r0 = r9
            e0f.q0 r0 = (e0f.q0) r0
            int r1 = r0.f121671x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121671x = r1
            goto L18
        L13:
            e0f.q0 r0 = new e0f.q0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121671x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            yhm.o.b(r9)
            return r9
        L39:
            com.revolut.feature.topup_screen.api.config.TopUpConfig r8 = r0.u
            yhm.o.b(r9)
            goto L4d
        L3f:
            yhm.o.b(r9)
            r0.u = r8
            r0.f121671x = r5
            java.io.Serializable r9 = r7.b(r8, r0)
            if (r9 != r1) goto L4d
            goto L8c
        L4d:
            xi0.b r9 = (xi0.b) r9
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r2 = xi0.b.f306278p
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r2 == 0) goto L5f
            e0f.l0$a r8 = e0f.l0.a.f121634a
            return r8
        L5f:
            xi0.b r2 = r8.f90473a
            r5 = 0
            if (r2 == 0) goto L82
            com.revolut.feature.topup_screen.api.config.TopUpConfig$PreselectedTopUpMethod r2 = r8.f90475c
            if (r2 != 0) goto L82
            pte.a r2 = r8.e
            pte.a r6 = pte.a.STANDARD
            if (r2 == r6) goto L72
            pte.a r6 = pte.a.NESTED_TOP_UP
            if (r2 != r6) goto L82
        L72:
            boolean r2 = r8.f
            if (r2 != 0) goto L82
            r0.u = r5
            r0.f121671x = r4
            java.lang.Object r8 = r7.g(r9, r8, r0)
            if (r8 != r1) goto L81
            goto L8c
        L81:
            return r8
        L82:
            r0.u = r5
            r0.f121671x = r3
            java.lang.Object r8 = r7.e(r9, r8, r0)
            if (r8 != r1) goto L8d
        L8c:
            return r1
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.t0.f(com.revolut.feature.topup_screen.api.config.TopUpConfig, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(xi0.b r13, com.revolut.feature.topup_screen.api.config.TopUpConfig r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.t0.g(xi0.b, com.revolut.feature.topup_screen.api.config.TopUpConfig, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(xi0.b r7, com.revolut.feature.topup_screen.api.config.TopUpConfig r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof e0f.s0
            if (r0 == 0) goto L13
            r0 = r9
            e0f.s0 r0 = (e0f.s0) r0
            int r1 = r0.f121685x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121685x = r1
            goto L18
        L13:
            e0f.s0 r0 = new e0f.s0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121685x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r7 = r0.u
            yhm.o.b(r9)
            return r7
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r9)
            com.revolut.feature.topup_screen.api.config.TopUpConfig$PreselectedTopUpMethod r9 = r8.f90475c
            boolean r9 = r9 instanceof com.revolut.feature.topup_screen.api.config.TopUpConfig.PreselectedTopUpMethod.ExternalOneOff
            if (r9 == 0) goto L83
            int r9 = e71.d.f123023a
            com.revolut.feature.topup_screen.common.TopUpTarget r8 = r8.d
            com.revolut.core.model.account.AccountId r8 = e1f.c.a(r8)
            r0.u = r7
            r0.f121685x = r3
            vte.a r9 = r6.f121687a
            e0f.v0 r9 = (e0f.v0) r9
            r9.getClass()
            java.lang.String r2 = "account"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            w71.b r9 = r9.f121695c
            com.revolut.domain.models.topup.TopUpType r4 = com.revolut.domain.models.topup.TopUpType.EXTERNAL_POCKET_ONE_OFF_TOPUP
            e31.j r9 = (e31.j) r9
            r9.getClass()
            java.lang.String r5 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            a9j.k r2 = new a9j.k
            r5 = 7
            r2.<init>(r9, r5, r8, r4)
            pfm.n r8 = new pfm.n
            r8.<init>(r2, r3)
            java.lang.String r9 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            pfm.r r8 = te0.w.g0(r8)
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L7e
            goto L80
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L80:
            if (r8 != r1) goto L83
            return r1
        L83:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.t0.h(xi0.b, com.revolut.feature.topup_screen.api.config.TopUpConfig, gim.c):java.io.Serializable");
    }
}
