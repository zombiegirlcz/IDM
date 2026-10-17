package x15;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302297b;

    public q(List products, List applicationAccounts) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(applicationAccounts, "applicationAccounts");
        this.f302296a = products;
        this.f302297b = applicationAccounts;
    }

    public final o a() {
        Object next;
        Iterator it8 = this.f302296a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof o) {
                break;
            }
        }
        o oVar = (o) next;
        return oVar == null ? i.f302276a : oVar;
    }

    public final x b() {
        Object next;
        Iterator it8 = this.f302296a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof x) {
                break;
            }
        }
        x xVar = (x) next;
        return xVar == null ? r.f302298a : xVar;
    }

    public final boolean c() {
        List list = this.f302296a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((p) it8.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f302296a, qVar.f302296a) && Intrinsics.f(this.f302297b, qVar.f302297b);
    }

    public final int hashCode() {
        return this.f302297b.hashCode() + (this.f302296a.hashCode() * 31);
    }
}
