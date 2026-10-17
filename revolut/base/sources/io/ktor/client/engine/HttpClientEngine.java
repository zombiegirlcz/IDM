package io.ktor.client.engine;

import java.io.Closeable;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public interface HttpClientEngine extends CoroutineScope, Closeable {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object O5(io.ktor.client.engine.HttpClientEngine r7, fem.e r8, gim.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof ydm.a
            if (r0 == 0) goto L16
            r0 = r9
            ydm.a r0 = (ydm.a) r0
            int r1 = r0.f312712x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f312712x = r1
            goto L1b
        L16:
            ydm.a r0 = new ydm.a
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312712x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r8 = r0.u
            fem.e r8 = (fem.e) r8
            yhm.o.b(r9)
            goto L7f
        L3d:
            yhm.o.b(r9)
            kotlinx.coroutines.Job r9 = r8.e
            r0.u = r8
            r0.f312712x = r4
            skm.b0 r2 = ydm.g.f312721a
            skm.h1 r2 = new skm.h1
            r2.<init>(r9)
            kotlin.coroutines.CoroutineContext r9 = r7.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r2)
            skm.b0 r5 = ydm.g.f312721a
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r5)
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.g1 r6 = skm.g1.f263979a
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            if (r5 != 0) goto L6a
            goto L7c
        L6a:
            ydm.j r6 = new ydm.j
            r6.<init>(r2, r4)
            skm.r0 r4 = r5.o(r4, r4, r6)
            ydm.j r5 = new ydm.j
            r6 = 0
            r5.<init>(r4, r6)
            r2.k(r5)
        L7c:
            if (r9 != r1) goto L7f
            goto L9e
        L7f:
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            ydm.i r2 = new ydm.i
            r2.<init>(r9)
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r2)
            ydm.b r2 = new ydm.b
            r4 = 0
            r2.<init>(r7, r8, r4)
            skm.h0 r7 = skm.e0.g(r7, r9, r4, r2, r3)
            r0.u = r4
            r0.f312712x = r3
            java.lang.Object r7 = r7.y(r0)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.HttpClientEngine.O5(io.ktor.client.engine.HttpClientEngine, fem.e, gim.c):java.lang.Object");
    }

    Set N3();
}
