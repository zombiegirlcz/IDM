package stj;

import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import kotlin.jvm.internal.Intrinsics;
import mtj.q;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtj.e f265610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f265611b;

    public h(mtj.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f265610a = repository;
        this.f265611b = ta6.a.a(0);
    }

    public final vkm.d a(RewardsHubChallengeDetailsParams requestParam, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = (q) this.f265610a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qVar.f208897h.b(requestParam, loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r10.f265611b.emit((d0j.h) r13, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof stj.g
            if (r0 == 0) goto L13
            r0 = r13
            stj.g r0 = (stj.g) r0
            int r1 = r0.f265609w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f265609w = r1
            goto L18
        L13:
            stj.g r0 = new stj.g
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f265609w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L64
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L57
        L36:
            yhm.o.b(r13)
            r0.f265609w = r4
            mtj.e r13 = r10.f265610a
            r5 = r13
            mtj.q r5 = (mtj.q) r5
            r5.getClass()
            mtj.p r4 = new mtj.p
            r9 = 0
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r4, r0)
            if (r13 != r1) goto L57
            goto L63
        L57:
            d0j.h r13 = (d0j.h) r13
            r0.f265609w = r3
            vkm.z1 r11 = r10.f265611b
            java.lang.Object r11 = r11.emit(r13, r0)
            if (r11 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: stj.h.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
