package com.revolut.feature.apm.core.impl.crypto;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();
    public static final Charset e = Charsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e02.b f61860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ww1.a f61861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl0.a f61862c;
    public final kg.o d;

    public d(e02.b config, ww1.a keyProvider, tl0.a base64Wrapper, kg.o gson) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f61860a = config;
        this.f61861b = keyProvider;
        this.f61862c = base64Wrapper;
        this.d = gson;
    }

    public static String b(String str) {
        return d0.G0(a0.E(a0.E(str, '+', CoreConstants.DASH_CHAR), '/', '_'), '=');
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, gim.c r9) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.revolut.feature.apm.core.impl.crypto.c
            if (r0 == 0) goto L13
            r0 = r9
            com.revolut.feature.apm.core.impl.crypto.c r0 = (com.revolut.feature.apm.core.impl.crypto.c) r0
            int r1 = r0.f61859x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61859x = r1
            goto L18
        L13:
            com.revolut.feature.apm.core.impl.crypto.c r0 = new com.revolut.feature.apm.core.impl.crypto.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f61859x
            ww1.a r3 = r7.f61861b
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L41
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            r0.u = r8
            r0.f61859x = r4
            java.lang.Object r9 = r3.i(r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            java.security.KeyPair r9 = (java.security.KeyPair) r9
            java.lang.String r0 = r3.b(r9)
            com.revolut.feature.apm.core.impl.crypto.a r1 = new com.revolut.feature.apm.core.impl.crypto.a
            e02.b r2 = r7.f61860a
            java.lang.String r3 = r2.f121378c
            java.lang.String r4 = r2.d
            r1.<init>(r0, r3, r4)
            kg.o r0 = r7.d
            java.lang.String r0 = r0.k(r1)
            kotlin.jvm.internal.Intrinsics.h(r0)
            java.nio.charset.Charset r1 = com.revolut.feature.apm.core.impl.crypto.d.e
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r3 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            tl0.a r4 = r7.f61862c
            java.lang.String r0 = r4.d(r0)
            java.lang.String r0 = b(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r6 = "."
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            byte[] r1 = r5.getBytes(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r2 = r2.f121377b
            java.security.Signature r2 = java.security.Signature.getInstance(r2)
            java.security.PrivateKey r9 = r9.getPrivate()
            r2.initSign(r9)
            r2.update(r1)
            byte[] r9 = r2.sign()
            kotlin.jvm.internal.Intrinsics.h(r9)
            java.lang.String r9 = r4.d(r9)
            java.lang.String r9 = b(r9)
            java.lang.String r8 = com.google.android.gms.internal.mlkit_vision_face.a.p(r0, r6, r8, r6, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.impl.crypto.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
