package ksd;

import com.revolut.core.model.account.AccountId;
import efm.r;
import ffk.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s6e.z;
import vkm.q;
import wa7.m;
import wsg.n;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd3.a f189429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f189430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f189431c;
    public final n d;
    public final g6e.b e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ldi.f f189432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p38.a f189433h;
    public final twg.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ang.f f189434j;
    public final m k;

    public g(bd3.a cashbackInteractor, t pricingPlanInteractor, ppk.f ratesInteractor, n walletInteractor, g6e.b subAccountBackgroundInteractor, i pocketsNetworthProductsMapper, ldi.f revPointsPocketInteractor, p38.a jointAccountsProductFeatureChecker, twg.c totalWealthPocketsInteractor, ang.f userInteractor, m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subAccountBackgroundInteractor, "subAccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(pocketsNetworthProductsMapper, "pocketsNetworthProductsMapper");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(totalWealthPocketsInteractor, "totalWealthPocketsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f189429a = cashbackInteractor;
        this.f189430b = pricingPlanInteractor;
        this.f189431c = ratesInteractor;
        this.d = walletInteractor;
        this.e = subAccountBackgroundInteractor;
        this.f = pocketsNetworthProductsMapper;
        this.f189432g = revPointsPocketInteractor;
        this.f189433h = jointAccountsProductFeatureChecker;
        this.i = totalWealthPocketsInteractor;
        this.f189434j = userInteractor;
        this.k = hiddenAccountsInteractor;
    }

    public final r a(ArrayList arrayList, xi0.b bVar) {
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (!Intrinsics.f((xi0.b) it8.next(), bVar)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        xi0.b bVar2 = (xi0.b) it9.next();
                        Pair pair = Intrinsics.f(bVar2, bVar) ? null : new Pair(bVar2, bVar);
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    return this.f189431c.b(arrayList2, false);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            arrayList3.add(new n9l.a(bVar, bVar, 1.0d, null, null, null));
        }
        return zi0.c.j(arrayList3);
    }

    public final Flow b(h6e.f filter) {
        AccountId.Personal personal = AccountId.Personal.f51414a;
        n nVar = this.d;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = rd0.e.b(nVar.J(personal, hVar));
        Intrinsics.checkNotNullParameter(filter, "filter");
        twg.c cVar = this.i;
        return xam.a.h(new f(this, null, 1), u0.i(dVarB, new t38.e(((z) ((g6e.d) cVar.f275018b)).w(filter, hVar), 24, ((m) cVar.d).k(), new gsd.d(3, 1, null)), q.q(this.f189434j.j(hVar))));
    }
}
