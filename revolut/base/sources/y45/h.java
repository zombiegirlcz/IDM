package y45;

import com.revolut.data.model.Data;
import ft3.d1;
import ft3.j1;
import grl.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends qx4.f implements qx4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f310800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.j f310801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final up3.b f310802c;
    public final vie.h d;

    public h(i loanProductInteractor, xq3.j creditApplicationInteractor, up3.b creditFeatureAvailabilityInteractor, vie.h tabCreditAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f310800a = loanProductInteractor;
        this.f310801b = creditApplicationInteractor;
        this.f310802c = creditFeatureAvailabilityInteractor;
        this.d = tabCreditAvailabilityInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(vkm.q.Q(h(loadingStrategy), new x18.e((Continuation) null, this, 26)), new y25.d(15)));
    }

    @Override // qx4.i
    public final Flow d() {
        return vkm.q.q(nim.a.v(m(), new y25.d(16)));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return n14.k.p(z ? nim.a.v(u0.m(m(), l()), new y25.d(17)) : new go.g(new Data(l35.d.f191853a, null, false, 6, null), 2), new y25.d(18));
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        j1 j1Var = j1.FIXED_TERM_CREDIT;
        List listK = v.k(new d1(j1Var, gt3.d.LOAN), new d1(j1Var, gt3.d.REFINANCING), new d1(j1Var, gt3.d.HOME_IMPROVEMENT));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f310801b.k((d1) it8.next()));
        }
        return nim.a.v(u0.k(arrayList), new o95.f(origin, 6));
    }

    public final Flow l() {
        return nim.a.v(u0.m(vkm.q.q(this.f310801b.i(w4l.h.f294642c)), this.d.a() ? d() : k(r2.DISCOVER)), new y25.d(20));
    }

    public final Flow m() {
        j1 j1Var = j1.FIXED_TERM_CREDIT;
        d1 d1Var = new d1(j1Var, gt3.d.LOAN);
        xq3.q qVar = (xq3.q) this.f310802c;
        return vkm.q.q(nim.a.v(u0.i(qVar.f(d1Var), qVar.f(new d1(j1Var, gt3.d.REFINANCING)), qVar.f(new d1(j1Var, gt3.d.HOME_IMPROVEMENT))), new y25.d(19)));
    }
}
