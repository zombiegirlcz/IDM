package xmf;

import dtc.i;
import kotlin.jvm.internal.Intrinsics;
import zsc.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f307242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile h f307243b;

    public b(i transactionSearchFactory) {
        Intrinsics.checkNotNullParameter(transactionSearchFactory, "transactionSearchFactory");
        this.f307242a = transactionSearchFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r5, java.util.List r6, java.util.Set r7, zsc.h r8, gim.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof xmf.a
            if (r0 == 0) goto L13
            r0 = r9
            xmf.a r0 = (xmf.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xmf.a r0 = new xmf.a
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f307241y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            zsc.h r8 = r0.f307240x
            java.util.Set r5 = r0.f307239w
            r7 = r5
            java.util.Set r7 = (java.util.Set) r7
            java.util.List r5 = r0.v
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r0.u
            yhm.o.b(r9)
            goto L61
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            yhm.o.b(r9)
            zsc.h r9 = r4.f307243b
            if (r9 != 0) goto L65
            dtc.i r9 = r4.f307242a
            ufm.i r9 = r9.a()
            r0.u = r5
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            r0.v = r2
            r2 = r7
            java.util.Set r2 = (java.util.Set) r2
            r0.f307239w = r2
            r0.f307240x = r8
            r0.A = r3
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            zsc.h r9 = (zsc.h) r9
            r4.f307243b = r9
        L65:
            zsc.f r0 = new zsc.f
            if (r8 != 0) goto L6d
            r9.getClass()
            goto L7f
        L6d:
            zsc.h r1 = new zsc.h
            java.util.List r9 = r9.f324874a
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r8 = r8.f324874a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r8 = zhm.d0.E0(r8, r9)
            r1.<init>(r8)
            r9 = r1
        L7f:
            zsc.l r8 = zsc.m.Companion
            r8.getClass()
            zsc.m r5 = zsc.l.a(r5)
            r0.<init>(r9, r5)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L96:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb5
            java.lang.Object r8 = r6.next()
            r9 = r8
            tof.a3 r9 = (tof.a3) r9
            java.lang.String r1 = r9.f272581b
            boolean r1 = r7.contains(r1)
            if (r1 != 0) goto Lb1
            boolean r9 = r0.a(r9)
            if (r9 == 0) goto L96
        Lb1:
            r5.add(r8)
            goto L96
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xmf.b.a(java.lang.String, java.util.List, java.util.Set, zsc.h, gim.c):java.io.Serializable");
    }
}
