package dl2;

import akg.n;
import ang.f;
import kotlin.jvm.internal.Intrinsics;
import kpj.c;
import w4l.h;
import w4l.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f115694a;

    public a(f userInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f115694a = userInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f115694a = userInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f115694a = userInteractor;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rnb.d
            if (r0 == 0) goto L13
            r0 = r7
            rnb.d r0 = (rnb.d) r0
            int r1 = r0.f255551w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255551w = r1
            goto L18
        L13:
            rnb.d r0 = new rnb.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255551w
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r7)
            goto L5c
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            ang.f r7 = r6.f115694a
            zmg.d r7 = r7.d
            efm.k r7 = r7.c()
            rnb.e r2 = rnb.e.f
            q2j.k r2 = new q2j.k
            r5 = 23
            r2.<init>(r5)
            rfm.m r5 = new rfm.m
            r5.<init>(r7, r2, r4)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            rfm.f r7 = ue0.e.G(r5, r3)
            r0.f255551w = r4
            java.lang.Object r7 = nim.a.i(r7, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L61
            return r3
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.a.a(gim.c):java.lang.Object");
    }

    public n b(boolean z) {
        return nim.a.v(this.f115694a.j(z ? i.f294643c : h.f294642c), c.f);
    }
}
