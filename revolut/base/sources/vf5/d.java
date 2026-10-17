package vf5;

import akg.n;
import boh.f;
import ffk.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import w4l.k;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f288508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf5.d f288509b;

    public d(t pricingPlanInteractor, nf5.d cryptoExchangeFeesRepository) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesRepository, "cryptoExchangeFeesRepository");
        this.f288508a = pricingPlanInteractor;
        this.f288509b = cryptoExchangeFeesRepository;
    }

    public final n a(k loadingStrategy, List list, hha.d dVar) {
        List list2 = list;
        ArrayList pricingPlanIds = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            pricingPlanIds.add(((hha.d) it8.next()).f152287a);
        }
        nf5.d dVar2 = this.f288509b;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(pricingPlanIds, "pricingPlanIds");
        return nim.a.v(dVar2.d.b(pricingPlanIds, loadingStrategy), new uyh.w(this, 14, list, dVar));
    }

    public final Flow b(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        t tVar = this.f288508a;
        return f.e(e.b(kli.a.h(tVar.q(), tVar.o())), new a(this, loadingStrategy, 0));
    }
}
