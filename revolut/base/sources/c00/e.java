package c00;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xv.i;
import xv.m;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20088a;

    public e(ArrayList validatorsExecutionLists) {
        Intrinsics.checkNotNullParameter(validatorsExecutionLists, "validatorsExecutionLists");
        this.f20088a = validatorsExecutionLists;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, i iVar, m mVar) {
        throw new IllegalStateException("Use method with scope");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xv.i r9, xv.m r10, kotlinx.coroutines.CoroutineScope r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof c00.b
            if (r0 == 0) goto L13
            r0 = r12
            c00.b r0 = (c00.b) r0
            int r1 = r0.f20083w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20083w = r1
            goto L18
        L13:
            c00.b r0 = new c00.b
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20083w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L69
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            java.util.ArrayList r4 = r8.f20088a
            int r2 = zhm.w.t(r4, r2)
            r12.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r2.next()
            java.util.List r4 = (java.util.List) r4
            elm.g r5 = skm.p0.f264002b
            c00.d r6 = new c00.d
            r7 = 0
            r6.<init>(r4, r7, r9, r10)
            r4 = 2
            skm.h0 r4 = skm.e0.g(r11, r5, r7, r6, r4)
            r12.add(r4)
            goto L43
        L60:
            r0.f20083w = r3
            java.lang.Object r12 = skm.e0.h(r12, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r9 = zhm.w.u(r12)
            c00.c r10 = new c00.c
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c00.e.c(xv.i, xv.m, kotlinx.coroutines.CoroutineScope, gim.c):java.lang.Object");
    }
}
