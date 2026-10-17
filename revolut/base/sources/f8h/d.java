package f8h;

import do3.q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import qe0.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f132778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f132779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f132780c;
    public final x4l.c d;
    public final x4l.c e;
    public final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f132781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f132782h;

    public d(ue0.c storage, d4m.a storageBorrowingInterest, j memoryCacheBorrowingInterest, x4l.c wealthMarginBorrowingStatusDod, x4l.c wealthMarginBorrowingInterestDod, x4l.c wealthMarginInstrumentBorrowingLimitDod, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(storageBorrowingInterest, "storageBorrowingInterest");
        Intrinsics.checkNotNullParameter(memoryCacheBorrowingInterest, "memoryCacheBorrowingInterest");
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingStatusDod, "wealthMarginBorrowingStatusDod");
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingInterestDod, "wealthMarginBorrowingInterestDod");
        Intrinsics.checkNotNullParameter(wealthMarginInstrumentBorrowingLimitDod, "wealthMarginInstrumentBorrowingLimitDod");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f132778a = storage;
        this.f132779b = storageBorrowingInterest;
        this.f132780c = memoryCacheBorrowingInterest;
        this.d = wealthMarginBorrowingStatusDod;
        this.e = wealthMarginBorrowingInterestDod;
        this.f = appCoroutineScope;
        this.f132781g = q.f(wealthMarginBorrowingStatusDod, appCoroutineScope);
        this.f132782h = q.f(wealthMarginInstrumentBorrowingLimitDod, appCoroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof f8h.a
            if (r0 == 0) goto L13
            r0 = r7
            f8h.a r0 = (f8h.a) r0
            int r1 = r0.f132774w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132774w = r1
            goto L18
        L13:
            f8h.a r0 = new f8h.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132774w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ne0.j r7 = r6.f132780c
            r7.clear()
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            f8h.b r2 = new f8h.b
            r4 = 0
            r5 = 0
            r2.<init>(r6, r4, r5)
            r0.f132774w = r3
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            f7l.c r7 = new f7l.c
            r7.<init>(r3)
            x4l.c r0 = r6.d
            x4l.c.a(r0, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f8h.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f8h.c
            if (r0 == 0) goto L13
            r0 = r8
            f8h.c r0 = (f8h.c) r0
            int r1 = r0.f132777y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132777y = r1
            goto L18
        L13:
            f8h.c r0 = new f8h.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f132775w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132777y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r2 = r0.v
            java.util.Iterator r5 = r0.u
            yhm.o.b(r8)
            goto L5a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            yhm.o.b(r8)
            goto L50
        L3a:
            yhm.o.b(r8)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            f8h.b r2 = new f8h.b
            r5 = 0
            r2.<init>(r7, r5, r4)
            r0.f132777y = r4
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L50
            goto L74
        L50:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r5 = r8
        L5a:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r5.next()
            t7h.s r8 = (t7h.s) r8
            r0.u = r5
            r0.v = r2
            r0.f132777y = r3
            x4l.c r6 = r7.d
            java.lang.Object r8 = r6.d(r8, r4, r0)
            if (r8 != r1) goto L5a
        L74:
            return r1
        L75:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f8h.d.b(gim.c):java.lang.Object");
    }
}
