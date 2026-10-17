package om4;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class y3 implements al4.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.o0 f226759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f226760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.p f226761c;

    public y3(dp4.o0 repository, wsg.b walletInteractor, ang.f userInteractor, al4.p creditCardProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        this.f226759a = repository;
        this.f226760b = walletInteractor;
        this.f226761c = creditCardProductFeatureTogglesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.v3
            if (r0 == 0) goto L13
            r0 = r7
            om4.v3 r0 = (om4.v3) r0
            int r1 = r0.f226725w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226725w = r1
            goto L18
        L13:
            om4.v3 r0 = new om4.v3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226725w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            w4l.j r7 = w4l.j.f294644c
            kotlinx.coroutines.flow.Flow r6 = r5.e(r7, r6)
            zhm.h0 r7 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r7)
            ol6.b r2 = new ol6.b
            r4 = 14
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            vkm.y r6 = rd0.e.d(r6, r7)
            r0.f226725w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L5e
            zhm.f0 r6 = zhm.f0.f322471a
            return r6
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.y3.d(boolean, gim.c):java.lang.Object");
    }

    public final Flow e(w4l.k loadingStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new w3(zhm.f0.f322471a, null, this, loadingStrategy, z), ((qx4.f) this.f226761c).j());
    }

    public final akg.n f(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(e(loadingStrategy, false), new t3(facilityId, 0));
    }

    public final vkm.v1 g(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        return vkm.q.R(nim.a.v(e(w4l.j.f294644c, true), new t3(pocketId, 1)), new hr4.b(3, 10, null));
    }

    public final Flow h() {
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.q0 q0VarN = rd0.e.n(nim.a.v(e(loadingStrategy, true), new l3(5)), zhm.h0.f322473a);
        Intrinsics.checkNotNullParameter(q0VarN, "<this>");
        return vkm.q.q(mo3.a.g(new zfd.e(q0VarN, 3), null, new ol6.b(12), 1));
    }

    public final Flow i(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        return vkm.q.q(mo3.a.g(nim.a.A(rd0.e.n(nim.a.v(f(facilityId, w4l.j.f294644c), new l3(6)), zhm.h0.f322473a), new l3(7)), null, new ol6.b(13), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        if (r7.f226760b.f(true, r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.y3.j(java.lang.String, gim.c):java.lang.Object");
    }
}
