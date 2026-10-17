package io.ktor.utils.io;

import com.fourthline.orca.internal.vi1;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f163069a = new m0(null);

    public static final void a(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        tVar.a(new IOException("Channel was cancelled"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r1.d(r7, r13) == r2) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.e0] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00db -> B:44:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.t r17, io.ktor.utils.io.e0 r18, long r19, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.b(io.ktor.utils.io.t, io.ktor.utils.io.e0, long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:26:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006b -> B:25:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.utils.io.t r13, long r14, gim.c r16) throws java.io.EOFException {
        /*
            r0 = r16
            boolean r1 = r0 instanceof io.ktor.utils.io.v
            if (r1 == 0) goto L15
            r1 = r0
            io.ktor.utils.io.v r1 = (io.ktor.utils.io.v) r1
            int r2 = r1.f163095y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f163095y = r2
            goto L1a
        L15:
            io.ktor.utils.io.v r1 = new io.ktor.utils.io.v
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f163094x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f163095y
            java.lang.String r4 = "<this>"
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 != r5) goto L33
            long r6 = r1.f163093w
            long r8 = r1.v
            java.lang.Object r13 = r1.u
            io.ktor.utils.io.t r13 = (io.ktor.utils.io.t) r13
            yhm.o.b(r0)
            goto L6e
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3b:
            yhm.o.b(r0)
            r6 = r14
            r3 = r1
            r0 = r6
        L41:
            r8 = 0
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L94
            boolean r8 = r13.e()
            if (r8 != 0) goto L94
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            jlm.a r8 = r13.c()
            r8.getClass()
            long r8 = r8.f175871c
            int r8 = (int) r8
            if (r8 != 0) goto L71
            r3.u = r13
            r3.v = r6
            r3.f163093w = r0
            r3.f163095y = r5
            java.lang.Object r8 = r13.d(r5, r3)
            if (r8 != r2) goto L6b
            return r2
        L6b:
            r8 = r6
            r6 = r0
            r1 = r3
        L6e:
            r3 = r1
            r0 = r6
            r6 = r8
        L71:
            jlm.a r8 = r13.c()
            long r8 = a1m.e.x(r8)
            long r8 = java.lang.Math.min(r0, r8)
            jlm.a r10 = r13.c()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r4)
            r10.a(r8)
            long r11 = a1m.e.x(r10)
            long r11 = java.lang.Math.min(r8, r11)
            r10.skip(r11)
            long r0 = r0 - r8
            goto L41
        L94:
            long r6 = r6 - r0
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.c(io.ktor.utils.io.t, long, gim.c):java.lang.Object");
    }

    public static final Object d(e0 e0Var, gim.c cVar) throws Throwable {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        m mVar = (m) e0Var;
        Throwable thB = mVar.b();
        if (thB != null) {
            throw thB;
        }
        if (!mVar.f163064a) {
            jlm.a aVarK = mVar.k();
            Intrinsics.checkNotNullParameter(aVarK, "<this>");
            aVarK.getClass();
            if (((int) aVarK.f175871c) < 1048576) {
                return Unit.f186387a;
            }
        }
        Object objH = mVar.h(cVar);
        return objH == fim.a.COROUTINE_SUSPENDED ? objH : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable e(io.ktor.utils.io.t r4, int r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.w
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.w r0 = (io.ktor.utils.io.w) r0
            int r1 = r0.f163097x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163097x = r1
            goto L18
        L13:
            io.ktor.utils.io.w r0 = new io.ktor.utils.io.w
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f163096w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163097x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r5 = r0.v
            java.lang.Object r4 = r0.u
            io.ktor.utils.io.t r4 = (io.ktor.utils.io.t) r4
            yhm.o.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            yhm.o.b(r6)
            boolean r6 = r4.e()
            if (r6 == 0) goto L3f
            goto L54
        L3f:
            r0.u = r4
            r0.v = r5
            r0.f163097x = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L56
        L54:
            r4 = 0
            return r4
        L56:
            jlm.a r4 = r4.c()
            jlm.e r4 = r4.peek()
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            byte[] r4 = jlm.l.e(r4, r5)
            java.lang.String r5 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            klm.a r5 = klm.b.Companion
            r5.getClass()
            java.lang.String r5 = "byteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            klm.b r5 = new klm.b
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.e(io.ktor.utils.io.t, int, gim.c):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(io.ktor.utils.io.t r5, byte[] r6, int r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.x
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.x r0 = (io.ktor.utils.io.x) r0
            int r1 = r0.f163100y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163100y = r1
            goto L18
        L13:
            io.ktor.utils.io.x r0 = new io.ktor.utils.io.x
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f163099x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163100y
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r7 = r0.f163098w
            byte[] r6 = r0.v
            java.lang.Object r5 = r0.u
            io.ktor.utils.io.t r5 = (io.ktor.utils.io.t) r5
            yhm.o.b(r8)
            goto L60
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            yhm.o.b(r8)
            boolean r8 = r5.e()
            if (r8 == 0) goto L47
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L47:
            jlm.a r8 = r5.c()
            boolean r8 = r8.J()
            if (r8 == 0) goto L60
            r0.u = r5
            r0.v = r6
            r0.f163098w = r7
            r0.f163100y = r4
            java.lang.Object r8 = r5.d(r4, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            boolean r8 = r5.e()
            if (r8 == 0) goto L6c
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L6c:
            jlm.a r5 = r5.c()
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            java.lang.String r8 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            r8 = 0
            int r5 = r5.u5(r8, r7, r6)
            if (r5 != r3) goto L82
            goto L83
        L82:
            r8 = r5
        L83:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.f(io.ktor.utils.io.t, byte[], int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(io.ktor.utils.io.t r4, gim.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.y
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.y r0 = (io.ktor.utils.io.y) r0
            int r1 = r0.f163102x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163102x = r1
            goto L18
        L13:
            io.ktor.utils.io.y r0 = new io.ktor.utils.io.y
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f163101w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163102x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            jlm.a r4 = r0.v
            java.lang.Object r2 = r0.u
            io.ktor.utils.io.t r2 = (io.ktor.utils.io.t) r2
            yhm.o.b(r5)
            r5 = r4
            r4 = r2
            goto L3f
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r5)
            jlm.a r5 = new jlm.a
            r5.<init>()
        L3f:
            boolean r2 = r4.e()
            if (r2 != 0) goto L59
            jlm.a r2 = r4.c()
            r5.h(r2)
            r0.u = r4
            r0.v = r5
            r0.f163102x = r3
            java.lang.Object r2 = r4.d(r3, r0)
            if (r2 != r1) goto L3f
            return r1
        L59:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L60
            return r5
        L60:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.g(io.ktor.utils.io.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:24:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:23:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(io.ktor.utils.io.p0 r11, int r12, gim.c r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.z
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.z r0 = (io.ktor.utils.io.z) r0
            int r1 = r0.f163105y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163105y = r1
            goto L18
        L13:
            io.ktor.utils.io.z r0 = new io.ktor.utils.io.z
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f163104x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163105y
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r11 = r0.f163103w
            jlm.a r12 = r0.v
            java.lang.Object r2 = r0.u
            io.ktor.utils.io.t r2 = (io.ktor.utils.io.t) r2
            yhm.o.b(r13)
            goto L64
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            yhm.o.b(r13)
            jlm.a r13 = new jlm.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L42:
            long r4 = r12.f175871c
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L96
            jlm.a r2 = r11.c()
            boolean r2 = r2.J()
            if (r2 == 0) goto L66
            r0.u = r11
            r0.v = r12
            r0.f163103w = r13
            r0.f163105y = r3
            java.lang.Object r2 = r11.d(r3, r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            r2 = r11
            r11 = r13
        L64:
            r13 = r11
            r11 = r2
        L66:
            boolean r2 = r11.e()
            if (r2 != 0) goto L96
            jlm.a r2 = r11.c()
            long r4 = a1m.e.x(r2)
            long r6 = (long) r13
            long r8 = r12.f175871c
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L88
            jlm.a r2 = r11.c()
            long r4 = r12.f175871c
            long r6 = r6 - r4
            r2.d(r12, r6)
            goto L42
        L88:
            jlm.a r2 = r11.c()
            long r4 = r2.i(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L42
        L96:
            long r0 = r12.f175871c
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9e
            return r12
        L9e:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Not enough data available, required "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = " bytes but only "
            r0.append(r13)
            long r12 = r12.f175871c
            r0.append(r12)
            java.lang.String r12 = " available"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.h(io.ktor.utils.io.p0, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(io.ktor.utils.io.t r4, gim.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.a0
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.a0 r0 = (io.ktor.utils.io.a0) r0
            int r1 = r0.f163033x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163033x = r1
            goto L18
        L13:
            io.ktor.utils.io.a0 r0 = new io.ktor.utils.io.a0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f163032w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163033x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            jlm.a r4 = r0.v
            java.lang.Object r2 = r0.u
            io.ktor.utils.io.t r2 = (io.ktor.utils.io.t) r2
            yhm.o.b(r5)
            r5 = r4
            r4 = r2
            goto L3f
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r5)
            jlm.a r5 = new jlm.a
            r5.<init>()
        L3f:
            boolean r2 = r4.e()
            if (r2 != 0) goto L59
            jlm.a r2 = r4.c()
            r5.h(r2)
            r0.u = r4
            r0.v = r5
            r0.f163033x = r3
            java.lang.Object r2 = r4.d(r3, r0)
            if (r2 != r1) goto L3f
            return r1
        L59:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L68
            r5.getClass()
            return r5
        L68:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.i(io.ktor.utils.io.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r16.d(1, r2) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0195, code lost:
    
        if (r13.f175871c >= r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
    
        r2.u = r9;
        r2.v = r15;
        r2.f163037w = r14;
        r2.f163038x = r13;
        r2.f163039y = r12;
        r2.z = r4;
        r2.A = r0;
        r6 = 3;
        r2.C = 3;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ad, code lost:
    
        if (r9.d(1, r2) != r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01af, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b7, code lost:
    
        r1 = "Line exceeds limit of " + r12 + " characters";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "message");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d7, code lost:
    
        throw new io.ktor.utils.io.charsets.TooLongLineException(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01fd: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: mra.d.l(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void throws java.lang.Exception (m)], block:B:85:0x01fd */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: all -> 0x0049, LOOP:0: B:38:0x00bd->B:65:0x018a, LOOP_START, TryCatch #0 {all -> 0x0049, blocks: (B:14:0x0042, B:36:0x00b7, B:38:0x00bd, B:40:0x00c7, B:42:0x00d3, B:44:0x00dd, B:49:0x00fd, B:51:0x010c, B:53:0x0118, B:55:0x0146, B:54:0x013e, B:58:0x0158, B:59:0x016c, B:61:0x016f, B:65:0x018a, B:66:0x0190, B:68:0x0197, B:72:0x01b7, B:73:0x01d7, B:74:0x01d8, B:78:0x01e4, B:80:0x01ea, B:21:0x0061), top: B:87:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:14:0x0042, B:36:0x00b7, B:38:0x00bd, B:40:0x00c7, B:42:0x00d3, B:44:0x00dd, B:49:0x00fd, B:51:0x010c, B:53:0x0118, B:55:0x0146, B:54:0x013e, B:58:0x0158, B:59:0x016c, B:61:0x016f, B:65:0x018a, B:66:0x0190, B:68:0x0197, B:72:0x01b7, B:73:0x01d7, B:74:0x01d8, B:78:0x01e4, B:80:0x01ea, B:21:0x0061), top: B:87:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01ad -> B:71:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(io.ktor.utils.io.t r16, java.lang.Appendable r17, int r18, int r19, gim.c r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.j(io.ktor.utils.io.t, java.lang.Appendable, int, int, gim.c):java.lang.Object");
    }

    public static final void k(int i, int i2) throws IOException {
        q0 q0Var = r0.Companion;
        if ((i | i2) == i) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) r0.a(i2)) + ", while expected " + ((Object) r0.a(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (c(r5, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(io.ktor.utils.io.t r5, klm.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.c0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.c0 r0 = (io.ktor.utils.io.c0) r0
            int r1 = r0.f163042x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163042x = r1
            goto L18
        L13:
            io.ktor.utils.io.c0 r0 = new io.ktor.utils.io.c0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f163041w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163042x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L67
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            klm.b r6 = r0.v
            java.lang.Object r5 = r0.u
            io.ktor.utils.io.t r5 = (io.ktor.utils.io.t) r5
            yhm.o.b(r7)
            goto L4f
        L3c:
            yhm.o.b(r7)
            byte[] r7 = r6.f185655a
            int r7 = r7.length
            r0.u = r5
            r0.v = r6
            r0.f163042x = r4
            java.lang.Comparable r7 = e(r5, r7, r0)
            if (r7 != r1) goto L4f
            goto L66
        L4f:
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            if (r7 == 0) goto L6a
            byte[] r6 = r6.f185655a
            int r6 = r6.length
            long r6 = (long) r6
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f163042x = r3
            java.lang.Object r5 = c(r5, r6, r0)
            if (r5 != r1) goto L67
        L66:
            return r1
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.l(io.ktor.utils.io.t, klm.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m(io.ktor.utils.io.t r4, gim.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.d0
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.d0 r0 = (io.ktor.utils.io.d0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            io.ktor.utils.io.d0 r0 = new io.ktor.utils.io.d0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.v = r3
            java.lang.Object r5 = g(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            jlm.a r5 = (jlm.a) r5
            long r0 = r5.f175871c
            int r4 = (int) r0
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            byte[] r4 = jlm.l.e(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.n0.m(io.ktor.utils.io.t, gim.c):java.io.Serializable");
    }

    public static Object n(e0 e0Var, Function1 function1, Continuation continuation) {
        m mVar = (m) e0Var;
        jlm.a aVarK = mVar.k();
        aVarK.getClass();
        jlm.i iVarJ = aVarK.j(1);
        byte[] data = iVarJ.f175881a;
        int i = iVarJ.f175883c;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data, i, data.length - i);
        Intrinsics.h(byteBufferWrap);
        ((vi1) function1).invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition == 1) {
            Intrinsics.checkNotNullParameter(data, "data");
            iVarJ.f175883c += iPosition;
            aVarK.f175871c += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > iVarJ.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + iPosition + ". Should be in 0.." + iVarJ.a()).toString());
            }
            if (iPosition != 0) {
                Intrinsics.checkNotNullParameter(data, "data");
                iVarJ.f175883c += iPosition;
                aVarK.f175871c += (long) iPosition;
            } else if (jlm.l.d(iVarJ)) {
                aVarK.g();
            }
        }
        Object objH = mVar.h((gim.c) continuation);
        return objH == fim.a.COROUTINE_SUSPENDED ? objH : Unit.f186387a;
    }
}
