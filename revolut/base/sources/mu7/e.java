package mu7;

import boh.f;
import bu7.k;
import hu7.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pfk.p0;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dha.c f208999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f209000b;

    public e(dha.c pricingPlansRepository, l planComparisonRepository) {
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(planComparisonRepository, "planComparisonRepository");
        this.f208999a = pricingPlansRepository;
        this.f209000b = planComparisonRepository;
    }

    public final Flow a(k coverageGroup, boolean z) {
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        return q.q(f.e(rd0.e.b(nim.a.w(((p0) this.f208999a).b(), new msb.c(24))), new l1.e(this, coverageGroup, z, 12)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(bu7.k r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof mu7.d
            if (r0 == 0) goto L13
            r0 = r10
            mu7.d r0 = (mu7.d) r0
            int r1 = r0.f208998x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208998x = r1
            goto L18
        L13:
            mu7.d r0 = new mu7.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f208998x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            goto La7
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            bu7.k r9 = r0.u
            yhm.o.b(r10)
            goto L86
        L3a:
            yhm.o.b(r10)
            dha.c r10 = r8.f208999a
            pfk.p0 r10 = (pfk.p0) r10
            efm.r r10 = r10.b()
            msb.c r2 = new msb.c
            r6 = 25
            r2.<init>(r6)
            efm.r r10 = nim.a.w(r10, r2)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            zg6.c r2 = new zg6.c
            r6 = 20
            r2.<init>(r6)
            zh7.a r6 = new zh7.a
            r7 = 9
            r6.<init>(r7, r2)
            efm.r r10 = r10.filter(r6)
            java.lang.String r2 = "filter(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            vkm.d r10 = rd0.e.b(r10)
            mqg.a r2 = new mqg.a
            r6 = 25
            r2.<init>(r6)
            jhi.b r10 = mo3.a.g(r10, r5, r2, r4)
            r0.u = r9
            r0.f208998x = r4
            java.lang.Object r10 = vkm.q.z(r10, r0)
            if (r10 != r1) goto L86
            goto La6
        L86:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L8d
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L8d:
            r0.u = r5
            r0.f208998x = r3
            hu7.l r2 = r8.f209000b
            x4l.c r2 = r2.d
            hu7.k r3 = new hu7.k
            r3.<init>(r9, r10)
            r9 = 0
            java.lang.Object r9 = r2.d(r3, r9, r0)
            if (r9 != r1) goto La2
            goto La4
        La2:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        La4:
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mu7.e.b(bu7.k, gim.c):java.lang.Object");
    }
}
