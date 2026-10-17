package s29;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import ryd.i;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f259273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u29.g f259274b;

    public b(m navigator, u29.g lifestyleTabAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(lifestyleTabAvailabilityInteractor, "lifestyleTabAvailabilityInteractor");
        this.f259273a = navigator;
        this.f259274b = lifestyleTabAvailabilityInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "lifestyle");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof s29.a
            if (r4 == 0) goto L13
            r4 = r5
            s29.a r4 = (s29.a) r4
            int r0 = r4.f259272w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f259272w = r0
            goto L1a
        L13:
            s29.a r4 = new s29.a
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f259272w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L56
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            u29.g r5 = r3.f259274b
            rv6.e r5 = r5.b()
            zfd.e r5 = zi0.c.w(r5)
            kotlin.coroutines.g r1 = kotlin.coroutines.g.f186406a
            efm.r r5 = rd0.e.c(r5, r1)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r4.f259272w = r2
            java.lang.Object r5 = nim.a.b(r5, r4)
            if (r5 != r0) goto L56
            return r0
        L56:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r4 = r5.getContent()
            v19.a r4 = (v19.a) r4
            r5 = 0
            if (r4 != 0) goto L62
            goto L6c
        L62:
            v19.a r0 = v19.a.NOT_AVAILABLE
            if (r4 != r0) goto L68
            r4 = r5
            goto L6a
        L68:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r4 = ibb.c.e
        L6a:
            if (r4 != 0) goto L6d
        L6c:
            return r5
        L6d:
            q06.i r0 = new q06.i
            q06.b r1 = new q06.b
            r1.<init>(r4, r5)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s29.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarFirstOrError = rd0.e.c(nim.a.v(zi0.c.w(this.f259274b.b()), new i(this, 11)), kotlin.coroutines.g.f186406a).firstOrError();
        s08.g gVar = new s08.g(16, new s1c.a(12));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
