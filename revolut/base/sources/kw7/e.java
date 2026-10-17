package kw7;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kvg.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw7.c f190301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f190302b;

    public e(mw7.c tilesRepository, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(tilesRepository, "tilesRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f190301a = tilesRepository;
        this.f190302b = pricingPlanInteractor;
    }

    public static Flow a(e eVar) {
        return boh.f.e(nim.a.v(rd0.e.b(eVar.f190302b.q()), new j(11)), new kv7.g(eVar, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kw7.d
            if (r0 == 0) goto L13
            r0 = r7
            kw7.d r0 = (kw7.d) r0
            int r1 = r0.f190300w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190300w = r1
            goto L18
        L13:
            kw7.d r0 = new kw7.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190300w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)
            goto L79
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            yhm.o.b(r7)
            goto L4e
        L37:
            yhm.o.b(r7)
            ffk.t r7 = r6.f190302b
            efm.r r7 = r7.q()
            r2 = 3
            efm.r r7 = m70.a.g(r7, r5, r5, r2)
            r0.f190300w = r4
            java.lang.Object r7 = nim.a.e(r7, r0)
            if (r7 != r1) goto L4e
            goto L6b
        L4e:
            hha.d r7 = (hha.d) r7
            if (r7 == 0) goto L6c
            java.lang.String r7 = r7.f152287a
            r0.f190300w = r3
            mw7.c r2 = r6.f190301a
            x4l.c r2 = r2.d
            mw7.b r3 = new mw7.b
            r3.<init>(r7)
            r7 = 0
            java.lang.Object r7 = r2.d(r3, r7, r0)
            if (r7 != r1) goto L67
            goto L69
        L67:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L69:
            if (r7 != r1) goto L79
        L6b:
            return r1
        L6c:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Unable to observe current pricing plan"
            java.lang.String r2 = "InsuranceHomeLayoutInteractorImpl"
            rd0.d.a(r0, r2, r1, r5, r7)
        L79:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kw7.e.b(gim.c):java.lang.Object");
    }
}
