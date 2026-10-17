package iie;

import hcj.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfe.i;
import vge.t3;
import vge.z2;
import vkm.q;
import wkm.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f161609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z2 f161610m;

    public b(List footerCoordinators, z2 accountsInteractor) {
        Intrinsics.checkNotNullParameter(footerCoordinators, "footerCoordinators");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        this.f161609l = footerCoordinators;
        this.f161610m = accountsInteractor;
    }

    @Override // iie.a
    public final l Z2() {
        return q.Q(q.q(mo3.a.g(((t3) this.f161610m).g(), null, null, 3)), new o((Continuation) null, this, 25));
    }

    @Override // iie.a
    public final boolean b3(yx4.b data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List list = this.f161609l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((i) it8.next()).F(data.f317544a)) {
                return true;
            }
        }
        return false;
    }
}
