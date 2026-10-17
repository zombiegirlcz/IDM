package q1a;

import e1a.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements v0a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u71.a f241408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vv9.c f241409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f241410c;

    public b(u71.a splitBillRepository, vv9.c moneyRequestInteractor, f splitBillLinkRepository) {
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(splitBillLinkRepository, "splitBillLinkRepository");
        this.f241408a = splitBillRepository;
        this.f241409b = moneyRequestInteractor;
        this.f241410c = splitBillLinkRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r5.f241410c.b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q1a.a
            if (r0 == 0) goto L13
            r0 = r7
            q1a.a r0 = (q1a.a) r0
            int r1 = r0.f241407w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241407w = r1
            goto L18
        L13:
            q1a.a r0 = new q1a.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241407w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L48
        L36:
            yhm.o.b(r7)
            u71.a r7 = r5.f241408a
            efm.b r6 = r7.cancelSplitBill(r6)
            r0.f241407w = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L48
            goto L52
        L48:
            r0.f241407w = r3
            e1a.f r6 = r5.f241410c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1a.b.a(java.lang.String, gim.c):java.lang.Object");
    }
}
