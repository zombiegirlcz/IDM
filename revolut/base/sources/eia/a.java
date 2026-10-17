package eia;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import d89.g;
import efm.r;
import gim.c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pfe.f;
import sha.b;
import vha.s;
import vkm.q;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126463a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f126464b;

    public a(x79.a onHoldAccountInteractor) {
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        this.f126464b = onHoldAccountInteractor;
    }

    @Override // pfe.f
    public final Object b(Set set, c cVar) {
        Object next;
        r rVarC;
        switch (this.f126463a) {
            case 0:
                s sVar = (s) this.f126464b;
                Iterator it8 = set.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        String str = ((ProductAccountId) next).f89729a;
                        b.Companion.getClass();
                        if (Intrinsics.f(str, sha.a.f263448b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ProductAccountId accountId = (ProductAccountId) next;
                if (accountId != null) {
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    rVarC = sVar.c(y0.b(accountId));
                } else {
                    rVarC = sVar.c(set);
                }
                return nim.a.e(m70.a.g(rVarC, null, null, 3), cVar);
            default:
                x79.a aVar = (x79.a) this.f126464b;
                ProductAccountId[] productAccountIdArr = (ProductAccountId[]) set.toArray(new ProductAccountId[0]);
                return q.z(mo3.a.g(((g) aVar).d((ProductAccountId[]) Arrays.copyOf(productAccountIdArr, productAccountIdArr.length)), null, new h43.q(9), 1), cVar);
        }
    }

    public a(s interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f126464b = interactor;
    }
}
