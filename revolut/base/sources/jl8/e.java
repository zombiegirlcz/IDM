package jl8;

import kotlin.jvm.internal.Intrinsics;
import te8.y;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl8.d f175643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f175644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq.a f175645c;

    public e(fl8.d repository, y juniorPollingInteractor, zq.a juniorRemoteLoginInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(juniorPollingInteractor, "juniorPollingInteractor");
        Intrinsics.checkNotNullParameter(juniorRemoteLoginInteractor, "juniorRemoteLoginInteractor");
        this.f175643a = repository;
        this.f175644b = juniorPollingInteractor;
        this.f175645c = juniorRemoteLoginInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (te8.y.c(r8.f175644b, r2, r3, r4, r5, 8) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, dl8.a r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof jl8.d
            if (r0 == 0) goto L14
            r0 = r11
            jl8.d r0 = (jl8.d) r0
            int r1 = r0.f175642x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f175642x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            jl8.d r0 = new jl8.d
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f175642x
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L34
            if (r1 != r3) goto L2c
            yhm.o.b(r11)
            goto L94
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.String r9 = r5.u
            yhm.o.b(r11)
            goto L60
        L3a:
            yhm.o.b(r11)
            od0.a r11 = od0.a.f224253a
            boolean r11 = od0.a.g()
            if (r11 != 0) goto L97
            r5.u = r9
            r5.f175642x = r2
            fl8.d r11 = r8.f175643a
            com.revolut.feature.junior_remote_login.impl.data.service.JuniorRemoteLoginService r11 = r11.f135905a
            el8.c r1 = new el8.c
            java.lang.String r10 = r10.f115714a
            r1.<init>(r10)
            java.lang.Object r10 = r11.confirmIdentity(r1, r5)
            if (r10 != r0) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L5d:
            if (r10 != r0) goto L60
            goto L93
        L60:
            pe8.e r2 = new pe8.e
            kotlin.time.b$a r10 = kotlin.time.b.INSTANCE
            r10 = 5
            pkm.e r11 = pkm.e.SECONDS
            long r10 = kotlin.time.c.g(r10, r11)
            r1 = 300(0x12c, float:4.2E-43)
            pkm.e r4 = pkm.e.MILLISECONDS
            long r6 = kotlin.time.c.g(r1, r4)
            r2.<init>(r10, r6)
            r10 = r3
            inh.g r3 = new inh.g
            r11 = 18
            r1 = 0
            r3.<init>(r8, r9, r1, r11)
            ie6.q r4 = new ie6.q
            r9 = 6
            r4.<init>(r10, r9, r1)
            r5.u = r1
            r5.f175642x = r10
            te8.y r1 = r8.f175644b
            r6 = 8
            java.lang.Object r9 = te8.y.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L94
        L93:
            return r0
        L94:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L97:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "The API is not supposed to be used in production"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jl8.e.a(java.lang.String, dl8.a, gim.c):java.lang.Object");
    }
}
