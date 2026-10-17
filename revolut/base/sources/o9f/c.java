package o9f;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferCreateRequest;
import gsh.w;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9f.e f223260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f223261b;

    public c(h9f.e repository, g transferInvestmentsProgressInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(transferInvestmentsProgressInteractor, "transferInvestmentsProgressInteractor");
        this.f223260a = repository;
        this.f223261b = transferInvestmentsProgressInteractor;
    }

    public final Object a(TransferCreateRequest transferCreateRequest, String str, gim.i iVar) throws Throwable {
        h9f.e eVar = this.f223260a;
        eVar.getClass();
        w wVar = new w(eVar, transferCreateRequest, str, null, 18);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, wVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r14 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r14, java.lang.String r15, com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInPriceUpdateRequest r16, gim.c r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof o9f.b
            if (r1 == 0) goto L15
            r1 = r0
            o9f.b r1 = (o9f.b) r1
            int r2 = r1.f223259x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f223259x = r2
            goto L1a
        L15:
            o9f.b r1 = new o9f.b
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f223259x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L2d
            goto L81
        L2d:
            r0 = move-exception
            r14 = r0
            goto L86
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            java.lang.String r14 = r1.u
            yhm.o.b(r0)
            goto L64
        L3e:
            yhm.o.b(r0)
            r1.u = r14
            r1.f223259x = r5
            h9f.e r8 = r13.f223260a
            r8.getClass()
            g0a.e r7 = new g0a.e
            r12 = 0
            r10 = r14
            r11 = r15
            r9 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r15, r7, r1)
            if (r15 != r2) goto L5f
            goto L61
        L5f:
            kotlin.Unit r15 = kotlin.Unit.f186387a
        L61:
            if (r15 != r2) goto L64
            goto L80
        L64:
            yhm.m$a r15 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d
            o9f.g r15 = r13.f223261b     // Catch: java.lang.Throwable -> L2d
            r1.u = r6     // Catch: java.lang.Throwable -> L2d
            r1.f223259x = r4     // Catch: java.lang.Throwable -> L2d
            h9f.d r15 = r15.f223265a     // Catch: java.lang.Throwable -> L2d
            x4l.c r15 = r15.d     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r14 = r15.d(r14, r5, r1)     // Catch: java.lang.Throwable -> L2d
            if (r14 != r2) goto L77
            goto L79
        L77:
            kotlin.Unit r14 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
        L79:
            if (r14 != r2) goto L7c
            goto L7e
        L7c:
            kotlin.Unit r14 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
        L7e:
            if (r14 != r2) goto L81
        L80:
            return r2
        L81:
            kotlin.Unit r14 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            yhm.m$a r15 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d
            goto L8c
        L86:
            yhm.m$a r15 = yhm.m.INSTANCE
            yhm.n r14 = yhm.o.a(r14)
        L8c:
            java.lang.Throwable r14 = yhm.m.a(r14)
            if (r14 == 0) goto La1
            java.lang.String r15 = "TransferInteractorImpl"
            java.lang.String r0 = "error reloading transfer request."
            java.util.Set r15 = m72.b.w(r15, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r6, r6, r14, r15)
        La1:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o9f.c.b(java.lang.String, java.lang.String, com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInPriceUpdateRequest, gim.c):java.lang.Object");
    }
}
