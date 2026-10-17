package kq;

import hx7.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f188277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.c f188278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f188279c;
    public final AtomicReference d;
    public final AtomicLong e;

    public h(phm.a storageProvider, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f188277a = storageProvider;
        this.f188278b = sessionProvider;
        this.f188279c = hlm.d.a();
        this.d = new AtomicReference();
        this.e = new AtomicLong(Long.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.h.a(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kq.b
            if (r0 == 0) goto L13
            r0 = r6
            kq.b r0 = (kq.b) r0
            int r1 = r0.f188270x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188270x = r1
            goto L18
        L13:
            kq.b r0 = new kq.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188270x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r6 = r4.f()
            if (r6 == 0) goto L6b
            r0.u = r5
            r0.f188270x = r3
            java.io.Serializable r6 = r4.e(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r0 = r6.length
            r1 = 0
        L49:
            if (r1 >= r0) goto L5a
            r2 = r6[r1]
            r3 = r2
            kq.i r3 = (kq.i) r3
            int r3 = r3.getId()
            if (r3 != r5) goto L57
            goto L5b
        L57:
            int r1 = r1 + 1
            goto L49
        L5a:
            r2 = 0
        L5b:
            kq.i r2 = (kq.i) r2
            if (r2 == 0) goto L66
            java.util.Map r5 = r2.getUserSettings()
            if (r5 == 0) goto L66
            return r5
        L66:
            java.util.Map r5 = zhm.r0.g()
            return r5
        L6b:
            java.util.Map r5 = zhm.r0.g()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.h.b(int, gim.c):java.lang.Object");
    }

    public final ue0.c c() {
        Object obj2 = this.f188277a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (ue0.c) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof kq.c
            if (r0 == 0) goto L13
            r0 = r10
            kq.c r0 = (kq.c) r0
            int r1 = r0.f188271w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188271w = r1
            goto L18
        L13:
            kq.c r0 = new kq.c
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188271w
            r3 = -9223372036854775808
            java.util.concurrent.atomic.AtomicLong r5 = r9.e
            r6 = 1
            if (r2 == 0) goto L33
            if (r2 != r6) goto L2b
            yhm.o.b(r10)
            goto L52
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            yhm.o.b(r10)
            long r7 = r5.get()
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 != 0) goto L5b
            kq.d r10 = new kq.d
            r2 = 0
            r7 = 0
            r10.<init>(r9, r7, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f188271w = r6
            java.lang.Object r10 = skm.e0.J(r2, r10, r0)
            if (r10 != r1) goto L52
            return r1
        L52:
            java.lang.Number r10 = (java.lang.Number) r10
            long r7 = r10.longValue()
            r5.compareAndSet(r3, r7)
        L5b:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.h.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Serializable, kq.i[]] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Serializable, java.lang.Object, kq.i[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kq.e
            if (r0 == 0) goto L13
            r0 = r6
            kq.e r0 = (kq.e) r0
            int r1 = r0.f188272w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188272w = r1
            goto L18
        L13:
            kq.e r0 = new kq.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188272w
            java.util.concurrent.atomic.AtomicReference r3 = r5.d
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r3.get()
            kq.i[] r6 = (kq.i[]) r6
            if (r6 != 0) goto L54
            kq.d r6 = new kq.d
            r2 = 0
            r6.<init>(r5, r2, r4)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f188272w = r4
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            kq.i[] r6 = (kq.i[]) r6
            kii.e.z(r3, r6)
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.h.e(gim.c):java.io.Serializable");
    }

    public final boolean f() {
        boolean zE = q.e(((cn0.g) this.f188278b).d());
        if (!zE) {
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e()) {
                throw new IllegalStateException("Widget data cannot be updated");
            }
        }
        return zE;
    }
}
