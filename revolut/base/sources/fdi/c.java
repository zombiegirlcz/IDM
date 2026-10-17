package fdi;

import com.revolut.core.model.account.AccountId;
import dfj.f;
import fca.d;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n1g.p;
import n38.q;
import q97.g3;
import rd0.e;
import rea.g;
import s6e.z;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133936a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f133937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f133938c;

    public c(a31.a donationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        this.f133937b = donationsAvailabilityInteractor;
        this.f133938c = "DONATIONS";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(fdi.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof njk.c
            if (r0 == 0) goto L13
            r0 = r6
            njk.c r0 = (njk.c) r0
            int r1 = r0.f216598w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216598w = r1
            goto L18
        L13:
            njk.c r0 = new njk.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216598w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L4d
        L28:
            r5 = move-exception
            goto L5c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            java.lang.Object r5 = r5.f133937b     // Catch: java.lang.Throwable -> L28
            a61.a r5 = (a61.a) r5     // Catch: java.lang.Throwable -> L28
            kotlinx.coroutines.flow.Flow r5 = a61.a.S(r5)     // Catch: java.lang.Throwable -> L28
            r6 = 3
            jhi.b r5 = mo3.a.g(r5, r4, r4, r6)     // Catch: java.lang.Throwable -> L28
            r0.f216598w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = vkm.q.x(r5, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L4d
            return r1
        L4d:
            hha.e0 r6 = (hha.e0) r6     // Catch: java.lang.Throwable -> L28
            dj0.d r5 = r6.f152301c     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L58
            jo3.a r5 = mo3.a.p(r5)     // Catch: java.lang.Throwable -> L28
            goto L59
        L58:
            r5 = r4
        L59:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L62
        L5c:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L62:
            java.lang.Throwable r6 = yhm.m.a(r5)
            if (r6 == 0) goto L75
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Unable to fetch partner subscriptions - return maxSubscriptionsMarketValue = null"
            java.lang.String r2 = "PartnersAddNewProductCategoryItemSource"
            rd0.d.a(r0, r2, r1, r4, r6)
        L75:
            boolean r6 = r5 instanceof yhm.n
            if (r6 == 0) goto L7a
            goto L7b
        L7a:
            r4 = r5
        L7b:
            jo3.a r4 = (jo3.a) r4
            ggk.j r5 = new ggk.j
            qf1.f r6 = qf1.f.LIFESTYLE_PARTNERS
            java.lang.String r6 = r6.getId()
            r5.<init>(r4, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fdi.c.c(fdi.c, gim.c):java.lang.Object");
    }

    @Override // mf1.a
    public final Flow a() {
        switch (this.f133936a) {
            case 0:
                ldi.a aVar = (ldi.a) this.f133937b;
                return new f(boh.f.e(boh.f.e(((nyb.b) aVar.f194130b).d(), new laj.b(aVar, 12)), new d(this, 3)), 22);
            case 1:
                return e.e(new p(mo3.a.g(e.b(bgc.e.c((bgc.e) this.f133938c, null, 3)), null, new nij.d(22), 1), this, 17), h0.f322473a, new n28.b(3, 10, null));
            case 2:
                return e.e(new g3(mo3.a.g(((a31.a) this.f133937b).j(), null, new tc6.b(0), 1), 16), h0.f322473a, new tc6.d(3, 0, null));
            case 3:
                g gVar = (g) this.f133938c;
                return new wvl.b(e.b(zi0.c.J(kli.a.i(gVar.c(AccountId.Personal.f51414a), gVar.d(), ((ang.f) this.f133937b).k(false)))), 7);
            default:
                zfd.e eVarW = zi0.c.w(((z) ((g6e.d) this.f133937b)).g());
                r0 r0Var = (r0) this.f133938c;
                q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new t38.e(eVarW, 24, k38.c.a(r0Var, null, kotlin.collections.d.y0(elements), 1), new y6e.c(3, null));
        }
    }

    @Override // mf1.a
    public final String b() {
        switch (this.f133936a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return (String) this.f133938c;
            case 3:
                return null;
            default:
                return null;
        }
    }

    public c(ang.f userInteractor, g newPocketAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(newPocketAvailabilityChecker, "newPocketAvailabilityChecker");
        this.f133937b = userInteractor;
        this.f133938c = newPocketAvailabilityChecker;
    }

    public c(g6e.d subaccountInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f133937b = subaccountInteractor;
        this.f133938c = jointAccountsInteractor;
    }

    public c(a61.a pricingPlanPartnerSubscriptionsInteractor, bgc.e rewardsInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanPartnerSubscriptionsInteractor, "pricingPlanPartnerSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        this.f133937b = pricingPlanPartnerSubscriptionsInteractor;
        this.f133938c = rewardsInteractor;
    }

    public c(ldi.a availabilityInteractor, ldi.f revPointsPocketInteractor) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        this.f133937b = availabilityInteractor;
        this.f133938c = revPointsPocketInteractor;
    }
}
