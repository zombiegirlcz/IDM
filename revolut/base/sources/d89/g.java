package d89;

import ch.qos.logback.core.CoreConstants;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import cxe.u;
import d7j.p0;
import efm.r;
import g48.r0;
import io3.i;
import io3.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import ne0.k;
import org.jetbrains.annotations.NotNull;
import tof.ua;
import tof.va;
import w4l.h;
import wsg.n;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements x79.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f112167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f112168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f112169c;
    public final psi.a d;
    public final k e;
    public final k f;

    public g(r0 jointAccountsInteractor, n walletInteractor, ppk.f ratesInteractor, psi.a comparator) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f112167a = jointAccountsInteractor;
        this.f112168b = walletInteractor;
        this.f112169c = ratesInteractor;
        this.d = comparator;
        this.e = new k(new a(this, 5), null);
        this.f = new k(new a(this, 6), null);
        a load = new a(this, 7);
        Intrinsics.checkNotNullParameter(load, "load");
        new HashMap();
    }

    public static boolean a(z79.b bVar, String str) {
        return d0.K(str, CoreConstants.COLON_CHAR) && d0.m0(str, new char[]{CoreConstants.COLON_CHAR}, 6).size() == 2 && Intrinsics.f(d0.m0(str, new char[]{CoreConstants.COLON_CHAR}, 6).get(0), bVar.a());
    }

    public final r b(w4l.k kVar) {
        l lVar = l.BLOCKING;
        i iVar = i.INTERNAL;
        n nVar = this.f112168b;
        return nim.a.w(nim.a.w(kli.a.i(osg.b.g(nVar, kVar, lVar, null, iVar, null, null, null, 116), pd.b.r(rd0.e.c(this.f112167a.h(kVar), kotlin.coroutines.g.f186406a), new d3i.k(this, kVar, 23)), nim.a.w(nVar.P(), new p0(21))), new p0(22)), new p0(15));
    }

    public final r c(List list, xi0.b bVar) {
        Pair pair;
        List<io3.d> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!Intrinsics.f(((io3.d) it8.next()).f163147c, bVar.f306286a)) {
                    ArrayList arrayList = new ArrayList();
                    for (io3.d dVar : list2) {
                        if (Intrinsics.f(dVar.f163147c, bVar.f306286a)) {
                            pair = null;
                        } else {
                            xi0.a aVar = xi0.b.Companion;
                            String str = dVar.f163147c;
                            aVar.getClass();
                            pair = new Pair(xi0.a.a(str), bVar);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    return this.f112169c.d(arrayList, age.c.f4818a);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (io3.d dVar2 : list2) {
            arrayList2.add(new n9l.a(bVar, bVar, 1.0d, null, null, null));
        }
        return zi0.c.j(arrayList2);
    }

    public final go.g d(ProductAccountId... accountId) {
        Data dataP;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (accountId.length == 0) {
            dataP = new Data(null, new IllegalStateException("AccountId must not be empty"), false, 5, null);
        } else if (accountId.length == 1) {
            dataP = zi0.c.P(new ua(((ProductAccountId) kotlin.collections.d.O(accountId)).f89729a), false, null, 3);
        } else {
            ArrayList arrayList = new ArrayList(accountId.length);
            for (ProductAccountId productAccountId : accountId) {
                arrayList.add(productAccountId.f89729a);
            }
            dataP = zi0.c.P(new va(zhm.d0.i1(arrayList)), false, null, 3);
        }
        return new go.g(dataP, 2);
    }

    public final u e(z79.b type) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(type, "type");
        int i = d.f112165a[type.ordinal()];
        n nVar = this.f112168b;
        h hVar = h.f294642c;
        if (i == 1 || i == 2) {
            flowV = nim.a.v(rd0.e.b(osg.b.g(nVar, hVar, l.BLOCKING, null, null, null, null, null, 124)), new d34.b(this, type));
        } else if (i == 3) {
            flowV = boh.f.e(this.f112167a.h(hVar), new a(this, 3));
        } else if (i == 4) {
            flowV = nim.a.v(rd0.e.b(nVar.P()), new p0(17));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = nim.a.v(rd0.e.b(osg.b.g(nVar, hVar, l.BLOCKING, null, null, null, null, null, 124)), new p0(18));
        }
        return nim.a.A(c6d.b.i(boh.f.e(u0.m(flowV, rd0.e.b(this.e.a(hVar))), new a(this, 1)), new a(this, 2)), new p0(16));
    }
}
