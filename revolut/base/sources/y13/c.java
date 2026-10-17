package y13;

import efm.d0;
import ffk.t;
import hy2.f;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;
import xy7.j;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic8.b f310284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f310285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f310286c;

    public c(ic8.b juniorCardRequestInteractor, f cardDesignInteractor, t pricingPlanRepository) {
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanRepository, "pricingPlanRepository");
        this.f310284a = juniorCardRequestInteractor;
        this.f310285b = cardDesignInteractor;
        this.f310286c = pricingPlanRepository;
    }

    public final d0 a(String cardRequestId, String walletId, b93.b selectedCardCode, boolean z) {
        Intrinsics.checkNotNullParameter(cardRequestId, "cardRequestId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(selectedCardCode, "selectedCardCode");
        d0 d0VarFirstOrError = m70.a.h(this.f310286c.v(h.f294642c), new x0b.h(21), null, new a(2), 2).switchMapSingle(new j(20, new w43.b(z, this, walletId, selectedCardCode, 3))).switchMap(new j(21, new xyc.j(this, cardRequestId, 10))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (((i98.e) r3).b(r7, r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (((i98.e) r3).d(false, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof y13.b
            if (r0 == 0) goto L13
            r0 = r9
            y13.b r0 = (y13.b) r0
            int r1 = r0.f310283x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310283x = r1
            goto L18
        L13:
            y13.b r0 = new y13.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f310283x
            ic8.b r3 = r6.f310284a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 == r4) goto L30
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            java.lang.Throwable r7 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L36
            goto L5e
        L36:
            r8 = move-exception
            goto L61
        L38:
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L4d
        L3c:
            r7 = move-exception
            goto L50
        L3e:
            yhm.o.b(r9)
            r0.f310283x = r5     // Catch: java.lang.Throwable -> L3c
            r9 = r3
            i98.e r9 = (i98.e) r9     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r7 = r9.b(r7, r8, r0)     // Catch: java.lang.Throwable -> L3c
            if (r7 != r1) goto L4d
            goto L5d
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L50:
            r0.u = r7     // Catch: java.lang.Exception -> L36
            r0.f310283x = r4     // Catch: java.lang.Exception -> L36
            i98.e r3 = (i98.e) r3     // Catch: java.lang.Exception -> L36
            r8 = 0
            java.lang.Object r8 = r3.d(r8, r0)     // Catch: java.lang.Exception -> L36
            if (r8 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L36
            goto L6b
        L61:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r8, r9)
        L6b:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Cannot approve card request on card order completion"
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y13.c.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
