package cvd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements utd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dwd.c f109334a;

    public c(dwd.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f109334a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cvd.b
            if (r0 == 0) goto L13
            r0 = r7
            cvd.b r0 = (cvd.b) r0
            int r1 = r0.f109333x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109333x = r1
            goto L18
        L13:
            cvd.b r0 = new cvd.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109333x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L65
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            dwd.c r7 = r5.f109334a
            r7.getClass()
            java.lang.String r2 = "stakingPocketId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            x4l.c r7 = r7.f120372c
            vkm.d r7 = r7.b(r6, r4)
            ds4.b r2 = new ds4.b
            r4 = 24
            r2.<init>(r4)
            akg.n r7 = nim.a.v(r7, r2)
            zfd.e r7 = zi0.c.w(r7)
            r0.u = r6
            r0.f109333x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r7 = r7.getContent()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lb6
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Collection r7 = ue0.e.M(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lb6
            tof.i7$c r0 = tof.i7.Companion
            tof.ua r1 = new tof.ua
            r1.<init>(r6)
            tof.eb r6 = new tof.eb
            io3.l r2 = io3.l.STAKING_PROXY
            r6.<init>(r2)
            tof.ca r2 = new tof.ca
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r7 = zhm.d0.i1(r7)
            r2.<init>(r7)
            tof.y6 r7 = tof.y6.COLLECTION_EXCHANGE
            tof.y6[] r7 = new tof.y6[]{r7}
            r0.getClass()
            tof.cc r7 = tof.i7.c.d(r7)
            tof.na r7 = tof.fc.b(r7)
            r0 = 4
            tof.i7[] r0 = new tof.i7[r0]
            r4 = 0
            r0[r4] = r1
            r0[r3] = r6
            r6 = 2
            r0[r6] = r2
            r6 = 3
            r0[r6] = r7
            tof.q7 r6 = tof.i7.c.a(r0)
            return r6
        Lb6:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cvd.c.a(java.lang.String, gim.c):java.io.Serializable");
    }
}
