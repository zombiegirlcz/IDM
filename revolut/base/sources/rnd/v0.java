package rnd;

import djb.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final toh.d f255640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djb.n f255641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elb.b f255642c;
    public final hj8.a d;
    public final te8.r e;
    public final jla.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g48.r0 f255643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wa7.m f255644h;

    public v0(toh.d savingsAvailabilityInteractor, djb.n savingsAccountsDetailsInteractor, elb.b savingsFeatureConfigInteractor, hj8.a juniorProfileInteractor, te8.r juniorCoreSavingsProductInteractor, jla.h productCatalogueInteractor, g48.r0 jointAccountsInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorCoreSavingsProductInteractor, "juniorCoreSavingsProductInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f255640a = savingsAvailabilityInteractor;
        this.f255641b = savingsAccountsDetailsInteractor;
        this.f255642c = savingsFeatureConfigInteractor;
        this.d = juniorProfileInteractor;
        this.e = juniorCoreSavingsProductInteractor;
        this.f = productCatalogueInteractor;
        this.f255643g = jointAccountsInteractor;
        this.f255644h = hiddenAccountsInteractor;
    }

    public static a a(List list, uib.c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            dj0.d dVar = ((npg.a) it8.next()).f218205a;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? (dj0.d) obj2 : pyd.c.O(dVarO, (dj0.d) obj2);
            i = i2;
        }
        return new a(cVar, dVarO, list.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rnd.f0
            if (r0 == 0) goto L13
            r0 = r8
            rnd.f0 r0 = (rnd.f0) r0
            int r1 = r0.f255610w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255610w = r1
            goto L18
        L13:
            rnd.f0 r0 = new rnd.f0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255610w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L61
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            toh.d r8 = r6.f255640a
            r2 = 0
            r4 = 3
            cxe.u r8 = toh.d.g(r8, r2, r4)
            rnd.g0 r5 = new rnd.g0
            r5.<init>(r7, r6, r2)
            kotlinx.coroutines.flow.Flow r7 = xam.a.h(r5, r8)
            rnd.d0 r8 = new rnd.d0
            r5 = 0
            r8.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            rnd.h0 r8 = new rnd.h0
            r8.<init>(r4, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f255610w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            com.revolut.retail.feature.api.AnalyticsAccount r8 = (com.revolut.retail.feature.api.AnalyticsAccount) r8
            if (r8 != 0) goto L68
            com.revolut.retail.feature.api.AnalyticsAccount$Personal$All r7 = com.revolut.retail.feature.api.AnalyticsAccount.Personal.All.f99192a
            return r7
        L68:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rnd.v0.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final akg.n c() {
        return nim.a.v(zh9.u0.m(this.f255642c.a(w4l.j.f294644c), g(k.b.f115282a)), new e0(this, 0));
    }

    public final Flow d(String savingsAccountId) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        return xam.a.h(new l0(this, null, 0), zh9.u0.m(((rnb.i) this.f255641b).c(savingsAccountId), this.f255642c.a(w4l.j.f294644c)));
    }

    public final akg.n e() {
        return nim.a.v(zh9.u0.m(this.f255642c.a(w4l.j.f294644c), g(k.a.f115281a)), new e0(this, 1));
    }

    public final Flow f(String savingsAccountId) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        return xam.a.h(new l0(this, null, 2), zh9.u0.m(((rnb.i) this.f255641b).c(savingsAccountId), this.f255642c.a(w4l.j.f294644c)));
    }

    public final t38.e g(djb.k kVar) {
        return new t38.e(((rnb.i) this.f255641b).e(kVar), 24, this.f255644h.k(), new gsd.d(3, 5, null));
    }
}
