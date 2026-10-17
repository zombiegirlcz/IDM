package ip0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xq extends zq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f167204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f167205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq(ArrayList items) {
        super(ou0.e.DOT);
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167204b = items;
        ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((wq) it8.next()).f167056a));
        }
        this.f167205c = arrayList;
    }

    @Override // ip0.zq
    public final List a() {
        return this.f167205c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xq) && Intrinsics.f(this.f167204b, ((xq) obj2).f167204b);
    }

    public final int hashCode() {
        return this.f167204b.hashCode();
    }
}
