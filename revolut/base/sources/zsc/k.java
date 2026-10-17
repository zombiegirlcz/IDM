package zsc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324877a;

    public k(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f324877a = filters;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        List list = this.f324877a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((d) it8.next()).a(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f324877a, ((k) obj2).f324877a);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f324877a.hashCode();
    }
}
