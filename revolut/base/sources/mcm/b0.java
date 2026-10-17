package mcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import ecm.v0;
import ecm.y0;
import gcm.q4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f204370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f204371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204372c;

    public b0(ArrayList arrayList, AtomicInteger atomicInteger) {
        Preconditions.checkArgument(!arrayList.isEmpty(), "empty list");
        this.f204370a = arrayList;
        this.f204371b = (AtomicInteger) Preconditions.checkNotNull(atomicInteger, "index");
        Iterator it8 = arrayList.iterator();
        int iHashCode = 0;
        while (it8.hasNext()) {
            iHashCode += ((y0) it8.next()).hashCode();
        }
        this.f204372c = iHashCode;
    }

    @Override // ecm.y0
    public final v0 a(q4 q4Var) {
        int andIncrement = this.f204371b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.f204370a;
        return ((y0) arrayList.get(andIncrement % arrayList.size())).a(q4Var);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        ArrayList arrayList = b0Var.f204370a;
        if (b0Var == this) {
            return true;
        }
        if (this.f204372c != b0Var.f204372c || this.f204371b != b0Var.f204371b) {
            return false;
        }
        ArrayList arrayList2 = this.f204370a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.f204372c;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Class<?>) b0.class).add("subchannelPickers", this.f204370a).toString();
    }
}
