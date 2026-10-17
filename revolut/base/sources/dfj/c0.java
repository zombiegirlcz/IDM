package dfj;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.y f113926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f113927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f113928c;

    public c0(nfj.y esimGiftingRepository, hj8.a juniorProfileInteractor, s3 esimSubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(esimGiftingRepository, "esimGiftingRepository");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        this.f113926a = esimGiftingRepository;
        this.f113927b = juniorProfileInteractor;
        this.f113928c = esimSubscriptionsInteractor;
    }

    public final Flow a(String subscriptionId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(this.f113928c.a(subscriptionId, loadingStrategy), new dcl.m0(this, loadingStrategy, 15));
    }

    public final akg.n b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(((nj8.n) this.f113927b).k(null, loadingStrategy), new dee.x(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, w4l.i r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof dfj.b0
            if (r0 == 0) goto L13
            r0 = r7
            dfj.b0 r0 = (dfj.b0) r0
            int r1 = r0.f113911w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113911w = r1
            goto L18
        L13:
            dfj.b0 r0 = new dfj.b0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113911w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L62
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            nfj.y r7 = r4.f113926a
            r7.getClass()
            java.lang.String r2 = "recipientUsername"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            x4l.c r7 = r7.e
            vkm.d r5 = r7.b(r5, r6)
            d83.i r6 = new d83.i
            r7 = 21
            r6.<init>(r5, r7)
            dee.a0 r5 = new dee.a0
            r7 = 3
            r5.<init>(r7)
            r7 = 0
            jhi.b r5 = mo3.a.g(r6, r7, r5, r3)
            r0.f113911w = r3
            java.lang.Object r7 = vkm.q.x(r5, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            dej.a0 r7 = (dej.a0) r7
            dej.z r5 = r7.f113482a
            dej.z r6 = dej.z.ELIGIBLE
            if (r5 != r6) goto L6b
            goto L6c
        L6b:
            r3 = 0
        L6c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.c0.c(java.lang.String, w4l.i, gim.c):java.lang.Object");
    }
}
