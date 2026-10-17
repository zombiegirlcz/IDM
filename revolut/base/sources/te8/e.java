package te8;

import kotlin.jvm.internal.Intrinsics;
import q97.g3;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f270062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff8.a f270063b;

    public e(ang.f userInteractor, ff8.a repository) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f270062a = userInteractor;
        this.f270063b = repository;
    }

    public static wkm.l b(e eVar, w4l.k loadingStrategy) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(new g3(mo3.a.g(eVar.f270062a.j(loadingStrategy), null, new tc6.b(9), 1), 17), new sdi.a(null, eVar, loadingStrategy, 4));
    }

    public final akg.n a(String userId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(b(this, loadingStrategy), new sef.j(userId, 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof te8.d
            if (r0 == 0) goto L13
            r0 = r10
            te8.d r0 = (te8.d) r0
            int r1 = r0.f270060y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270060y = r1
            goto L18
        L13:
            te8.d r0 = new te8.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f270058w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270060y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r10)
            goto L82
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            boolean r9 = r0.u
            ff8.a r2 = r0.v
            yhm.o.b(r10)
            goto L6a
        L3b:
            yhm.o.b(r10)
            w4l.h r10 = w4l.h.f294642c
            ang.f r2 = r8.f270062a
            akg.n r10 = r2.j(r10)
            tc6.b r2 = new tc6.b
            r6 = 9
            r2.<init>(r6)
            jhi.b r10 = mo3.a.g(r10, r3, r2, r5)
            q97.g3 r2 = new q97.g3
            r6 = 17
            r2.<init>(r10, r6)
            ff8.a r10 = r8.f270063b
            r0.v = r10
            r0.u = r9
            r0.f270060y = r5
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto L67
            goto L81
        L67:
            r7 = r2
            r2 = r10
            r10 = r7
        L6a:
            java.lang.String r10 = (java.lang.String) r10
            r0.v = r3
            r0.u = r9
            r0.f270060y = r4
            ff8.d r2 = (ff8.d) r2
            x4l.c r2 = r2.d
            java.lang.Object r9 = r2.d(r10, r9, r0)
            if (r9 != r1) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L7f:
            if (r9 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: te8.e.c(boolean, gim.c):java.lang.Object");
    }
}
