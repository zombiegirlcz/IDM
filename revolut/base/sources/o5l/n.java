package o5l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f222472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f222473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222474c;
    public final ArrayList d;

    public n(m group, i selectedDesign) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(selectedDesign, "selectedDesign");
        this.f222472a = group;
        this.f222473b = selectedDesign;
        this.f222474c = group.f222470a;
        this.d = group.f222471b;
    }

    public final dj0.d a() {
        Object next;
        ArrayList arrayList = this.f222472a.f222471b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            j jVar = ((i) it8.next()).f222465h;
            next = jVar != null ? jVar.f222466a : null;
            if (next != null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((dj0.d) obj2).f(dj0.d.e)) {
                arrayList3.add(obj2);
            }
        }
        Iterator it9 = arrayList3.iterator();
        if (it9.hasNext()) {
            next = it9.next();
            if (it9.hasNext()) {
                long j2 = ((dj0.d) next).f115082a;
                do {
                    Object next2 = it9.next();
                    long j3 = ((dj0.d) next2).f115082a;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it9.hasNext());
            }
        }
        return (dj0.d) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f222472a, nVar.f222472a) && Intrinsics.f(this.f222473b, nVar.f222473b);
    }

    public final int hashCode() {
        return this.f222473b.hashCode() + (this.f222472a.hashCode() * 31);
    }
}
