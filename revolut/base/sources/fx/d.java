package fx;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f138715a;

    public d(LifecycleCoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f138715a = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r15 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r15 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(dx.e r12, xv.m r13, java.util.LinkedHashSet r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof fx.b
            if (r0 == 0) goto L13
            r0 = r15
            fx.b r0 = (fx.b) r0
            int r1 = r0.f138711w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138711w = r1
            goto L18
        L13:
            fx.b r0 = new fx.b
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138711w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r15)
            goto La1
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r15)
            goto L64
        L37:
            yhm.o.b(r15)
            int r15 = r14.size()
            kotlinx.coroutines.CoroutineScope r2 = r11.f138715a
            r9 = 0
            if (r15 != r4) goto L69
            java.lang.Object r15 = zhm.d0.a0(r14)
            boolean r15 = r15 instanceof c00.e
            if (r15 == 0) goto L69
            java.lang.Object r14 = zhm.d0.a0(r14)
            boolean r15 = r14 instanceof c00.e
            if (r15 == 0) goto L56
            r9 = r14
            c00.e r9 = (c00.e) r9
        L56:
            if (r9 != 0) goto L5b
            zhm.f0 r12 = zhm.f0.f322471a
            return r12
        L5b:
            r0.f138711w = r4
            java.lang.Object r15 = r9.c(r12, r13, r2, r0)
            if (r15 != r1) goto L64
            goto La0
        L64:
            c00.c r15 = (c00.c) r15
            java.util.ArrayList r12 = r15.f20084a
            return r12
        L69:
            java.util.ArrayList r15 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r14, r4)
            r15.<init>(r4)
            java.util.Iterator r14 = r14.iterator()
        L78:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L98
            java.lang.Object r4 = r14.next()
            r6 = r4
            xv.p r6 = (xv.p) r6
            elm.g r4 = skm.p0.f264002b
            fx.c r5 = new fx.c
            r10 = 0
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.h0 r12 = skm.e0.g(r2, r4, r9, r5, r3)
            r15.add(r12)
            r12 = r7
            goto L78
        L98:
            r0.f138711w = r3
            java.lang.Object r15 = skm.e0.h(r15, r0)
            if (r15 != r1) goto La1
        La0:
            return r1
        La1:
            java.util.List r15 = (java.util.List) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.d.a(dx.e, xv.m, java.util.LinkedHashSet, gim.c):java.lang.Object");
    }

    public d(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f138715a = scope;
    }
}
