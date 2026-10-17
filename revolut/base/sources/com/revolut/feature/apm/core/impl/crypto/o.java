package com.revolut.feature.apm.core.impl.crypto;

import java.nio.charset.Charset;
import java.security.KeyPair;
import java.security.MessageDigest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements ww1.a {

    @NotNull
    public static final i Companion = new i();
    public static final Charset e = Charsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e02.b f61875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f61876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmKeyGenerator f61877c;
    public final tl0.a d;

    public o(e02.b config, ang.f userInteractor, ApmKeyGenerator keyGenerator, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(keyGenerator, "keyGenerator");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f61875a = config;
        this.f61876b = userInteractor;
        this.f61877c = keyGenerator;
        this.d = base64Wrapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (skm.e0.J(elm.f.f127540b, r3, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.revolut.feature.apm.core.impl.crypto.k
            if (r0 == 0) goto L13
            r0 = r7
            com.revolut.feature.apm.core.impl.crypto.k r0 = (com.revolut.feature.apm.core.impl.crypto.k) r0
            int r1 = r0.f61869x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61869x = r1
            goto L1a
        L13:
            com.revolut.feature.apm.core.impl.crypto.k r0 = new com.revolut.feature.apm.core.impl.crypto.k
            gim.c r7 = (gim.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f61869x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L66
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator r2 = r0.u
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator r2 = r6.f61877c
            r0.u = r2
            r0.f61869x = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L4a
            goto L65
        L4a:
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            r0.u = r4
            r0.f61869x = r3
            r2.getClass()
            ck7.j r3 = new ck7.j
            r5 = 8
            r3.<init>(r2, r7, r4, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.impl.crypto.o.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ww1.a
    public final String b(KeyPair key) {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] bArrDigest = MessageDigest.getInstance(this.f61875a.e).digest(key.getPublic().getEncoded());
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return kotlin.collections.d.a0(bArrDigest, "", null, null, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(1), 30);
    }

    public final String c(KeyPair key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = j.f61867a[this.f61875a.f121379g.ordinal()];
        tl0.a aVar = this.d;
        if (i == 1) {
            byte[] encoded = key.getPublic().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            String strE = aVar.e(encoded);
            Charset charset = e;
            byte[] bytes = strE.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new String(aVar.c(bytes), charset);
        }
        if (i == 2) {
            byte[] encoded2 = key.getPublic().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded2, "getEncoded(...)");
            return aVar.e(encoded2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        byte[] encoded3 = key.getPublic().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded3, "getEncoded(...)");
        return p.a.p("-----BEGIN PUBLIC KEY-----\n", d0.k0(f0.M0(64, aVar.d(encoded3)), "\n", null, null, 0, null, 62), "\n-----END PUBLIC KEY-----");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.revolut.feature.apm.core.impl.crypto.l
            if (r0 == 0) goto L13
            r0 = r5
            com.revolut.feature.apm.core.impl.crypto.l r0 = (com.revolut.feature.apm.core.impl.crypto.l) r0
            int r1 = r0.f61870w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61870w = r1
            goto L18
        L13:
            com.revolut.feature.apm.core.impl.crypto.l r0 = new com.revolut.feature.apm.core.impl.crypto.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f61870w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f61876b
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f61870w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            e02.b r0 = r4.f61875a
            java.lang.String r0 = r0.f121376a
            java.lang.String r5 = r5.f116408a
            java.lang.String r1 = "_"
            java.lang.String r5 = com.google.android.gms.internal.mlkit_vision_face.a.o(r0, r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.impl.crypto.o.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.revolut.feature.apm.core.impl.crypto.n
            if (r0 == 0) goto L13
            r0 = r6
            com.revolut.feature.apm.core.impl.crypto.n r0 = (com.revolut.feature.apm.core.impl.crypto.n) r0
            int r1 = r0.f61874x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61874x = r1
            goto L1a
        L13:
            com.revolut.feature.apm.core.impl.crypto.n r0 = new com.revolut.feature.apm.core.impl.crypto.n
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f61874x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator r0 = r0.u
            yhm.o.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator r6 = r5.f61877c
            r0.u = r6
            r0.f61874x = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L43
            return r1
        L43:
            r4 = r0
            r0 = r6
            r6 = r4
        L46:
            java.lang.String r6 = (java.lang.String) r6
            r0.getClass()
            java.lang.String r1 = "alias"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            chc.c0 r0 = r0.f61851b     // Catch: java.lang.Exception -> L61
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Exception -> L61
            java.security.KeyStore r0 = (java.security.KeyStore) r0     // Catch: java.lang.Exception -> L61
            r1 = 0
            r0.load(r1)     // Catch: java.lang.Exception -> L61
            boolean r6 = r0.containsAlias(r6)     // Catch: java.lang.Exception -> L61
            goto L78
        L61:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error checking existing keys: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator.b(r0, r6)
            r6 = 0
        L78:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.impl.crypto.o.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ww1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.revolut.feature.apm.core.impl.crypto.m
            if (r0 == 0) goto L13
            r0 = r6
            com.revolut.feature.apm.core.impl.crypto.m r0 = (com.revolut.feature.apm.core.impl.crypto.m) r0
            int r1 = r0.f61872x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61872x = r1
            goto L18
        L13:
            com.revolut.feature.apm.core.impl.crypto.m r0 = new com.revolut.feature.apm.core.impl.crypto.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f61872x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator r2 = r0.u
            yhm.o.b(r6)
            goto L48
        L38:
            yhm.o.b(r6)
            com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator r2 = r5.f61877c
            r0.u = r2
            r0.f61872x = r4
            java.lang.Object r6 = r5.d(r0)
            if (r6 != r1) goto L48
            goto L61
        L48:
            java.lang.String r6 = (java.lang.String) r6
            r4 = 0
            r0.u = r4
            r0.f61872x = r3
            r2.getClass()
            com.revolut.feature.apm.core.impl.crypto.g r3 = new com.revolut.feature.apm.core.impl.crypto.g
            r3.<init>(r2, r6, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r3, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.impl.crypto.o.i(gim.c):java.lang.Object");
    }
}
