package ald;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6223b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f6222a = i;
        this.f6223b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.Unit r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f6223b
            no.i2 r6 = (no.i2) r6
            boolean r0 = r7 instanceof no.h2
            if (r0 == 0) goto L17
            r0 = r7
            no.h2 r0 = (no.h2) r0
            int r1 = r0.f217783x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f217783x = r1
            goto L1c
        L17:
            no.h2 r0 = new no.h2
            r0.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f217783x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ho.t r6 = r0.u
            yhm.o.b(r7)
            goto L5a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            d4m.a r7 = r6.f217792a
            java.lang.Object r7 = r7.get()
            ho.t r7 = (ho.t) r7
            r0.u = r7
            r0.f217783x = r3
            no.g2 r2 = new no.g2
            r3 = 0
            r2.<init>(r6, r3)
            skm.p0 r6 = skm.p0.f264001a
            tkm.e r6 = zkm.o.f323119a
            tkm.e r6 = r6.e
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r4 = r7
            r7 = r6
            r6 = r4
        L5a:
            ho.n r7 = (ho.n) r7
            r6.e2(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ald.e.a(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ald.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
