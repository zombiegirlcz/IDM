package ugc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phc.a f280020a;

    public n(phc.a rewardsRepository) {
        Intrinsics.checkNotNullParameter(rewardsRepository, "rewardsRepository");
        this.f280020a = rewardsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, long r7, int r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof ugc.l
            if (r0 == 0) goto L13
            r0 = r10
            ugc.l r0 = (ugc.l) r0
            int r1 = r0.f280017w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280017w = r1
            goto L18
        L13:
            ugc.l r0 = new ugc.l
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280017w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L64
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r10)
            r10 = 0
            kotlin.ranges.IntRange r9 = kotlin.ranges.f.o(r10, r9)
            v0f.p r10 = new v0f.p
            r2 = 7
            r10.<init>(r9, r2)
            ugc.m r9 = new ugc.m
            r2 = 0
            r4 = 0
            r9.<init>(r7, r2, r4)
            vkm.q0 r7 = new vkm.q0
            r8 = 1
            r7.<init>(r10, r9, r8)
            t38.e r8 = new t38.e
            r9 = 10
            r8.<init>(r7, r9, r5, r6)
            twb.b0 r7 = new twb.b0
            r7.<init>(r8, r4, r6)
            vkm.v1 r6 = new vkm.v1
            r6.<init>(r7)
            r0.f280017w = r3
            java.lang.Object r10 = vkm.q.z(r6, r0)
            if (r10 != r1) goto L64
            return r1
        L64:
            ggc.b r10 = (ggc.b) r10
            if (r10 == 0) goto L69
            return r10
        L69:
            ggc.a r6 = ggc.a.f143605a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ugc.n.a(java.lang.String, long, int, gim.c):java.lang.Object");
    }
}
