package lem;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final klm.b f194617a = new klm.b(a1m.e.O("\r\n", Charsets.UTF_8), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final klm.b f194618b;

    static {
        byte[] byteArray = {45, 45};
        Intrinsics.checkNotNullParameter(byteArray, "bytes");
        klm.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        f194618b = new klm.b(byteArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
    
        if (((io.ktor.utils.io.m) r5).h(r6) != r7) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(klm.b r29, io.ktor.utils.io.p0 r30, io.ktor.utils.io.m r31, lem.d r32, long r33, gim.c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lem.n.a(klm.b, io.ktor.utils.io.p0, io.ktor.utils.io.m, lem.d, long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.p0 r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof lem.l
            if (r0 == 0) goto L13
            r0 = r10
            lem.l r0 = (lem.l) r0
            int r1 = r0.f194615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194615w = r1
            goto L18
        L13:
            lem.l r0 = new lem.l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194615w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r9 = r0.u
            mem.e r9 = (mem.e) r9
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r10 = move-exception
            goto L6a
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r10)
            mem.e r10 = new mem.e
            r10.<init>()
            r0.u = r10     // Catch: java.lang.Throwable -> L68
            r0.f194615w = r4     // Catch: java.lang.Throwable -> L68
            java.util.Set r2 = lem.h.f194607a     // Catch: java.lang.Throwable -> L68
            mem.i r2 = new mem.i     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            r2.f204799a = r3     // Catch: java.lang.Throwable -> L68
            r2.f204800b = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r9 = lem.h.d(r9, r10, r2, r0)     // Catch: java.lang.Throwable -> L68
            if (r9 != r1) goto L54
            return r1
        L54:
            r8 = r10
            r10 = r9
            r9 = r8
        L57:
            lem.d r10 = (lem.d) r10     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L5c
            return r10
        L5c:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            throw r10     // Catch: java.lang.Throwable -> L2c
        L64:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L6a
        L68:
            r9 = move-exception
            goto L64
        L6a:
            xem.c r0 = r9.f204793a
            java.util.ArrayList r1 = r9.f204794b
            r2 = 0
            if (r1 == 0) goto L84
            r9.f204795c = r2
            int r5 = r1.size()
            r6 = r3
        L78:
            if (r6 >= r5) goto L8d
            java.lang.Object r7 = r1.get(r6)
            r0.d5(r7)
            int r6 = r6 + 1
            goto L78
        L84:
            char[] r1 = r9.f204795c
            if (r1 == 0) goto L8b
            r0.d5(r1)
        L8b:
            r9.f204795c = r2
        L8d:
            r9.e = r4
            r9.f204794b = r2
            r9.d = r2
            r9.f204796g = r3
            r9.f = r3
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lem.n.b(io.ktor.utils.io.p0, gim.c):java.lang.Object");
    }

    public static final void c(Ref$IntRef ref$IntRef, byte[] bArr, byte b4) throws IOException {
        int i = ref$IntRef.f186408a;
        if (i >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        ref$IntRef.f186408a = i + 1;
        bArr[i] = b4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.t r4, klm.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof lem.m
            if (r0 == 0) goto L13
            r0 = r6
            lem.m r0 = (lem.m) r0
            int r1 = r0.f194616w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194616w = r1
            goto L18
        L13:
            lem.m r0 = new lem.m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194616w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            klm.b r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f194616w = r3
            java.lang.Object r6 = io.ktor.utils.io.n0.l(r4, r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4c
            byte[] r4 = r5.f185655a
            int r4 = r4.length
            long r4 = (long) r4
            goto L4e
        L4c:
            r4 = 0
        L4e:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lem.n.d(io.ktor.utils.io.t, klm.b, gim.c):java.lang.Object");
    }
}
