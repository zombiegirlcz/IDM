package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;

/* JADX INFO: loaded from: classes23.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f163062a = new g0();

    public static final void a(e0 e0Var, Throwable th10) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        if (th10 != null) {
            ((m) e0Var).a(th10);
            return;
        }
        h0 h0Var = new h0(1, e0Var, e0.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        alm.a.b(f163062a, h0Var);
    }

    public static final Object b(e0 e0Var, byte[] bArr, int i, gim.c cVar) throws Throwable {
        m mVar = (m) e0Var;
        mVar.k().k(i, bArr);
        Object objD = n0.d(mVar, cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.ktor.utils.io.e0, io.ktor.utils.io.m, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.utils.io.e0 r16, jlm.k r17, gim.c r18) throws java.io.EOFException {
        /*
            r0 = r18
            boolean r1 = r0 instanceof io.ktor.utils.io.i0
            if (r1 == 0) goto L15
            r1 = r0
            io.ktor.utils.io.i0 r1 = (io.ktor.utils.io.i0) r1
            int r2 = r1.f163057x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f163057x = r2
            goto L1a
        L15:
            io.ktor.utils.io.i0 r1 = new io.ktor.utils.io.i0
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f163056w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f163057x
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            jlm.k r3 = r1.v
            java.lang.Object r5 = r1.u
            io.ktor.utils.io.e0 r5 = (io.ktor.utils.io.e0) r5
            yhm.o.b(r0)
            r0 = r3
            r3 = r1
            r1 = r0
            r0 = r5
            goto L43
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            yhm.o.b(r0)
            r0 = r16
            r3 = r1
            r1 = r17
        L43:
            boolean r5 = r1.J()
            if (r5 != 0) goto Lbe
            io.ktor.utils.io.m r0 = (io.ktor.utils.io.m) r0
            jlm.a r5 = r0.k()
            long r6 = a1m.e.x(r1)
            r5.getClass()
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto La1
            r10 = r6
        L62:
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 <= 0) goto L94
            long r12 = r1.j2(r5, r10)
            r14 = -1
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 == 0) goto L72
            long r10 = r10 - r12
            goto L62
        L72:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Source exhausted before reading "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " bytes. Only "
            r1.append(r2)
            long r6 = r6 - r10
            r1.append(r6)
            java.lang.String r2 = " were read."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L94:
            r3.u = r0
            r3.v = r1
            r3.f163057x = r4
            java.lang.Object r5 = io.ktor.utils.io.n0.d(r0, r3)
            if (r5 != r2) goto L43
            return r2
        La1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount ("
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ") < 0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lbe:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k0.c(io.ktor.utils.io.e0, jlm.k, gim.c):java.lang.Object");
    }

    public static g1m.c d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 block, int i) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f186406a;
        }
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        final m channel = new m(false);
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        a2 a2VarC = skm.e0.C(coroutineScope, coroutineContext, null, new j0(block, channel, null), 2);
        a2VarC.k(new Function1() { // from class: io.ktor.utils.io.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                m mVar = channel;
                Throwable th10 = (Throwable) obj2;
                if (th10 != null && mVar._closedCause == null) {
                    mVar.a(th10);
                }
                return Unit.f186387a;
            }
        });
        return new g1m.c(channel, a2VarC);
    }
}
