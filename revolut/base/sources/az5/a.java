package az5;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import efm.r;
import gim.c;
import io3.l;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pfe.f;
import tof.i1;
import uy5.d;
import uy5.e;
import vy5.p0;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uy5.f f11392a;

    public a(uy5.f interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f11392a = interactor;
    }

    @Override // pfe.f
    public final Object a(Set set, c cVar) {
        return y0.b(i1.f272794a);
    }

    @Override // pfe.f
    public final Object b(Set set, c cVar) {
        Object next;
        r rVarC;
        Iterator it8 = set.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String str = ((ProductAccountId) next).f89729a;
            e.Companion.getClass();
            if (Intrinsics.f(str, d.f284077b)) {
                break;
            }
        }
        ProductAccountId accountId = (ProductAccountId) next;
        uy5.f fVar = this.f11392a;
        if (accountId != null) {
            e.Companion.getClass();
            String allPocketsId = d.f284077b;
            l type = l.CURRENT;
            p0 p0Var = (p0) fVar;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(allPocketsId, "allPocketsId");
            Intrinsics.checkNotNullParameter(type, "type");
            rVarC = p0Var.c(type, allPocketsId, y0.b(accountId));
        } else {
            e.Companion.getClass();
            rVarC = ((p0) fVar).c(l.CURRENT, d.f284077b, set);
        }
        return nim.a.e(m70.a.g(rVarC, null, null, 3), cVar);
    }
}
