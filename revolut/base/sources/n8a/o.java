package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.impl.data.network.AliasManagementService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasManagementService f213340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f213341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f213342c;
    public final x4l.c d;

    public o(AliasManagementService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f213340a = service;
        this.f213341b = storage;
        this.f213342c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new mtj.k(this, continuation, 4), new n7h.c(this, 3), new mz3.r(this, 27), new mx5.g(this, continuation, 26), new lp6.g(this, continuation, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n8a.o r6, com.revolut.core.model.account.AccountId r7, java.lang.String r8, gim.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof n8a.h
            if (r0 == 0) goto L16
            r0 = r9
            n8a.h r0 = (n8a.h) r0
            int r1 = r0.f213321y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f213321y = r1
            goto L1b
        L16:
            n8a.h r0 = new n8a.h
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f213319w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213321y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.revolut.feature.pix.api.model.AliasDeletionResult$Success r6 = r0.v
            yhm.o.b(r9)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            com.revolut.feature.pix.api.model.AliasDeletionResult$Success r7 = r0.v
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            com.revolut.core.model.account.AccountId r7 = r0.u
            yhm.o.b(r9)
            goto L5d
        L42:
            yhm.o.b(r9)
            n3j.w r9 = new n3j.w
            r2 = 11
            r9.<init>(r6, r8, r5, r2)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            r0.u = r7
            r0.v = r5
            r0.f213321y = r4
            java.lang.Object r9 = skm.e0.J(r8, r9, r0)
            if (r9 != r1) goto L5d
            goto L75
        L5d:
            com.revolut.feature.pix.api.model.AliasDeletionResult r9 = (com.revolut.feature.pix.api.model.AliasDeletionResult) r9
            boolean r8 = r9 instanceof com.revolut.feature.pix.api.model.AliasDeletionResult.Success
            if (r8 == 0) goto L76
            x4l.c r6 = r6.d
            r0.u = r5
            r8 = r9
            com.revolut.feature.pix.api.model.AliasDeletionResult$Success r8 = (com.revolut.feature.pix.api.model.AliasDeletionResult.Success) r8
            r0.v = r8
            r0.f213321y = r3
            r8 = 0
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.a(n8a.o, com.revolut.core.model.account.AccountId, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(n8a.o r11, com.revolut.core.model.account.AccountId r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof n8a.i
            if (r0 == 0) goto L13
            r0 = r15
            n8a.i r0 = (n8a.i) r0
            int r1 = r0.f213324y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213324y = r1
            goto L18
        L13:
            n8a.i r0 = new n8a.i
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f213322w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213324y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult$Success r11 = r0.v
            yhm.o.b(r15)
            return r11
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            com.revolut.core.model.account.AccountId r12 = r0.u
            yhm.o.b(r15)
            r6 = r11
            goto L57
        L3c:
            yhm.o.b(r15)
            n8a.j r5 = new n8a.j
            r10 = 0
            r6 = r11
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.u = r12
            r0.f213324y = r4
            java.lang.Object r15 = skm.e0.J(r11, r5, r0)
            if (r15 != r1) goto L57
            goto L6f
        L57:
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult r15 = (com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult) r15
            boolean r11 = r15 instanceof com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult.Success
            if (r11 == 0) goto L70
            x4l.c r11 = r6.d
            r0.u = r9
            r13 = r15
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult$Success r13 = (com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult.Success) r13
            r0.v = r13
            r0.f213324y = r3
            r13 = 0
            java.lang.Object r11 = r11.d(r12, r13, r0)
            if (r11 != r1) goto L70
        L6f:
            return r1
        L70:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.b(n8a.o, com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(n8a.o r11, com.revolut.core.model.account.AccountId r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof n8a.k
            if (r0 == 0) goto L16
            r0 = r15
            n8a.k r0 = (n8a.k) r0
            int r1 = r0.f213330y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f213330y = r1
            goto L1b
        L16:
            n8a.k r0 = new n8a.k
            r0.<init>(r11, r15)
        L1b:
            java.lang.Object r15 = r0.f213328w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213330y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult$Success r11 = r0.v
            yhm.o.b(r15)
            return r11
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            com.revolut.core.model.account.AccountId r12 = r0.u
            yhm.o.b(r15)
            r6 = r11
            goto L5a
        L3f:
            yhm.o.b(r15)
            n8a.j r5 = new n8a.j
            r10 = 1
            r6 = r11
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.u = r12
            r0.f213330y = r4
            java.lang.Object r15 = skm.e0.J(r11, r5, r0)
            if (r15 != r1) goto L5a
            goto L72
        L5a:
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult r15 = (com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult) r15
            boolean r11 = r15 instanceof com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult.Success
            if (r11 == 0) goto L73
            x4l.c r11 = r6.d
            r0.u = r9
            r13 = r15
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult$Success r13 = (com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult.Success) r13
            r0.v = r13
            r0.f213330y = r3
            r13 = 0
            java.lang.Object r11 = r11.d(r12, r13, r0)
            if (r11 != r1) goto L73
        L72:
            return r1
        L73:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.c(n8a.o, com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(n8a.o r11, com.revolut.core.model.account.AccountId r12, java.lang.String r13, java.lang.String r14, gim.c r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof n8a.l
            if (r0 == 0) goto L16
            r0 = r15
            n8a.l r0 = (n8a.l) r0
            int r1 = r0.f213333y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f213333y = r1
            goto L1b
        L16:
            n8a.l r0 = new n8a.l
            r0.<init>(r11, r15)
        L1b:
            java.lang.Object r15 = r0.f213331w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213333y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.revolut.feature.pix.api.model.AliasRegistrationResult$Success r11 = r0.v
            yhm.o.b(r15)
            return r11
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            com.revolut.core.model.account.AccountId r12 = r0.u
            yhm.o.b(r15)
            r6 = r11
            goto L5a
        L3f:
            yhm.o.b(r15)
            n8a.j r5 = new n8a.j
            r10 = 2
            r6 = r11
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.u = r12
            r0.f213333y = r4
            java.lang.Object r15 = skm.e0.J(r11, r5, r0)
            if (r15 != r1) goto L5a
            goto L72
        L5a:
            com.revolut.feature.pix.api.model.AliasRegistrationResult r15 = (com.revolut.feature.pix.api.model.AliasRegistrationResult) r15
            boolean r11 = r15 instanceof com.revolut.feature.pix.api.model.AliasRegistrationResult.Success
            if (r11 == 0) goto L73
            x4l.c r11 = r6.d
            r0.u = r9
            r13 = r15
            com.revolut.feature.pix.api.model.AliasRegistrationResult$Success r13 = (com.revolut.feature.pix.api.model.AliasRegistrationResult.Success) r13
            r0.v = r13
            r0.f213333y = r3
            r13 = 0
            java.lang.Object r11 = r11.d(r12, r13, r0)
            if (r11 != r1) goto L73
        L72:
            return r1
        L73:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.d(n8a.o, com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public static String h(AccountId accountId) {
        String strA = vca.a.a(accountId);
        if (strA == null) {
            strA = "personal";
        }
        return "pix_aliases_".concat(strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.core.model.account.AccountId r12, com.revolut.feature.pix.api.model.PixKey r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof n8a.c
            if (r0 == 0) goto L13
            r0 = r14
            n8a.c r0 = (n8a.c) r0
            int r1 = r0.f213301x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213301x = r1
            goto L18
        L13:
            n8a.c r0 = new n8a.c
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213301x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            return r14
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            com.revolut.core.model.account.AccountId r12 = r0.u
            yhm.o.b(r14)
            r7 = r12
            goto L58
        L3a:
            yhm.o.b(r14)
            mll.c0 r5 = new mll.c0
            r10 = 27
            r6 = r11
            r8 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            r0.u = r8
            r0.f213301x = r4
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)
            if (r14 != r1) goto L57
            r6 = r11
            goto L6e
        L57:
            r7 = r8
        L58:
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            n8a.d r5 = new n8a.d
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r9
            r0.f213301x = r3
            com.revolut.feature.pix.api.model.AliasDeletionResult$Pending r12 = com.revolut.feature.pix.api.model.AliasDeletionResult.Pending.f80381a
            java.lang.Object r12 = r11.j(r12, r5, r0)
            if (r12 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.e(com.revolut.core.model.account.AccountId, com.revolut.feature.pix.api.model.PixKey, gim.c):java.lang.Object");
    }

    public final Object f(AccountId accountId, PixKey pixKey, String str, Function2 function2, gim.i iVar) {
        String f80413a;
        PixKeyStatus f80406b = pixKey.getF80406b();
        PixKeyStatus.UnderPortability underPortability = f80406b instanceof PixKeyStatus.UnderPortability ? (PixKeyStatus.UnderPortability) f80406b : null;
        if (underPortability == null || (f80413a = underPortability.getF80413a()) == null) {
            throw new IllegalStateException("Key is not under portability");
        }
        f fVar = new f(function2, f80413a, this, accountId, str, null);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, fVar, iVar);
    }

    public final t38.e g(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        vkm.d dVarB = this.d.b(accountId, w4l.i.f294643c);
        String strA = vca.a.a(accountId);
        if (strA == null) {
            strA = "personal";
        }
        return new t38.e(dVarB, 24, ue0.e.R(this.f213341b, "FAVORITE_KEY_".concat(strA), wim.z.d(o0.b(String.class))), new g(3, 0, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.core.model.account.AccountId r13, com.revolut.feature.pix.api.model.PortabilityRequestArgsModel r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof n8a.m
            if (r0 == 0) goto L13
            r0 = r15
            n8a.m r0 = (n8a.m) r0
            int r1 = r0.f213336y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213336y = r1
            goto L18
        L13:
            n8a.m r0 = new n8a.m
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f213334w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213336y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r15)
            r6 = r12
            goto L77
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            com.revolut.feature.pix.api.model.PortabilityRequestArgsModel r14 = r0.v
            com.revolut.core.model.account.AccountId r13 = r0.u
            yhm.o.b(r15)
            r7 = r13
            r8 = r14
            goto L60
        L3e:
            yhm.o.b(r15)
            mll.c0 r5 = new mll.c0
            r10 = 28
            r6 = r12
            r8 = r13
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            r0.u = r8
            r0.v = r7
            r0.f213336y = r4
            java.lang.Object r13 = skm.e0.J(r13, r5, r0)
            if (r13 != r1) goto L5d
            r6 = r12
            goto L76
        L5d:
            r11 = r8
            r8 = r7
            r7 = r11
        L60:
            mh1.d r5 = new mh1.d
            r10 = 12
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r9
            r0.v = r9
            r0.f213336y = r3
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult$Pending r13 = com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult.Pending.f80543a
            java.lang.Object r15 = r12.j(r13, r5, r0)
            if (r15 != r1) goto L77
        L76:
            return r1
        L77:
            java.lang.String r13 = "null cannot be cast to non-null type com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult.Success"
            kotlin.jvm.internal.Intrinsics.i(r15, r13)
            com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult$Success r15 = (com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult.Success) r15
            com.revolut.feature.pix.api.model.PixKey r13 = r15.f80544a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.i(com.revolut.core.model.account.AccountId, com.revolut.feature.pix.api.model.PortabilityRequestArgsModel, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b9 -> B:26:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r12, kotlin.jvm.functions.Function1 r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.o.j(java.lang.Object, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
