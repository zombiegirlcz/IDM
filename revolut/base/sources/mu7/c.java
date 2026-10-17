package mu7;

import boh.f;
import ffk.t;
import hu7.j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import w4l.h;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f208995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f208996b;

    public c(j detailRepository, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(detailRepository, "detailRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f208995a = detailRepository;
        this.f208996b = pricingPlanInteractor;
    }

    public static Flow a(c cVar, String insuranceProduct, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return f.e(nim.a.v(rd0.e.b(cVar.f208996b.q()), new msb.c(22)), new l1.e(cVar, insuranceProduct, z, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mu7.b
            if (r0 == 0) goto L13
            r0 = r7
            mu7.b r0 = (mu7.b) r0
            int r1 = r0.f208994y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208994y = r1
            goto L18
        L13:
            mu7.b r0 = new mu7.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f208992w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f208994y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)
            goto L85
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            boolean r9 = r0.v
            java.lang.String r8 = r0.u
            yhm.o.b(r7)
            goto L56
        L3b:
            yhm.o.b(r7)
            ffk.t r7 = r6.f208996b
            efm.r r7 = r7.q()
            r2 = 3
            efm.r r7 = m70.a.g(r7, r5, r5, r2)
            r0.u = r8
            r0.v = r9
            r0.f208994y = r4
            java.lang.Object r7 = nim.a.e(r7, r0)
            if (r7 != r1) goto L56
            goto L77
        L56:
            hha.d r7 = (hha.d) r7
            if (r7 == 0) goto L78
            java.lang.String r7 = r7.f152287a
            r0.u = r5
            r0.v = r9
            r0.f208994y = r3
            hu7.j r2 = r6.f208995a
            x4l.c r2 = r2.e
            hu7.f r3 = new hu7.f
            r3.<init>(r8, r7, r9)
            r7 = 0
            java.lang.Object r7 = r2.d(r3, r7, r0)
            if (r7 != r1) goto L73
            goto L75
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L75:
            if (r7 != r1) goto L85
        L77:
            return r1
        L78:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            java.lang.String r9 = "Unable to observe current pricing plan"
            java.lang.String r0 = "InsuranceDetailsLayoutInteractor"
            rd0.d.a(r8, r0, r9, r5, r7)
        L85:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mu7.c.b(gim.c, java.lang.String, boolean):java.lang.Object");
    }
}
