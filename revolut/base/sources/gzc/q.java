package gzc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f148026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f148027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148028c;
    public final ArrayList d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f148029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f148030h;

    public q(x state, s reviewState, boolean z, ArrayList incomeSources, Long l2, Long l3, Long l4, a aVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        Intrinsics.checkNotNullParameter(incomeSources, "incomeSources");
        this.f148026a = state;
        this.f148027b = reviewState;
        this.f148028c = z;
        this.d = incomeSources;
        this.e = l2;
        this.f = l3;
        this.f148029g = l4;
        this.f148030h = aVar;
    }

    public final boolean a() {
        if (this.f148030h != null) {
            return true;
        }
        ArrayList<p> arrayList = this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        for (p pVar : arrayList) {
            if (pVar.i != null) {
                return true;
            }
            List list = pVar.f148024g;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    o oVar = ((f) it8.next()).f147997b;
                    if (oVar.f != null) {
                        return true;
                    }
                    ArrayList arrayList2 = oVar.e;
                    if (!arrayList2.isEmpty()) {
                        Iterator it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            if (((g) it9.next()).f != null) {
                                return true;
                            }
                        }
                    }
                }
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
        return this.f148026a == qVar.f148026a && this.f148027b.equals(qVar.f148027b) && this.f148028c == qVar.f148028c && this.d.equals(qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f148029g, qVar.f148029g) && Intrinsics.f(this.f148030h, qVar.f148030h);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.c((this.f148027b.hashCode() + (this.f148026a.hashCode() * 31)) * 31, 31, this.f148028c), 31);
        Long l2 = this.e;
        int iHashCode = (iB + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f148029g;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        a aVar = this.f148030h;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
