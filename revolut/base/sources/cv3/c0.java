package cv3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f109245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f109246c;
    public final Integer d;
    public final fu3.a e;
    public final String f;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [zhm.f0] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
        public static c0 a(d0 d0Var) {
            ?? arrayList;
            List list;
            if (d0Var == null || (list = d0Var.e) == null) {
                arrayList = f0.f322471a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((mv3.f) obj2).f209122c) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((mv3.f) it8.next()).f209120a);
                }
            }
            ?? r72 = arrayList;
            Long l2 = d0Var != null ? d0Var.f109249a : null;
            Long l3 = d0Var != null ? d0Var.f109250b : null;
            return new c0(d0Var != null ? d0Var.d : null, d0Var != null ? d0Var.f109251c : null, l2, l3, d0Var != null ? d0Var.f : null, r72);
        }
    }

    public c0() {
        this(null, null, null, null, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f109244a, c0Var.f109244a) && Intrinsics.f(this.f109245b, c0Var.f109245b) && Intrinsics.f(this.f109246c, c0Var.f109246c) && Intrinsics.f(this.d, c0Var.d) && this.e == c0Var.e && Intrinsics.f(this.f, c0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f109244a.hashCode() * 31;
        Long l2 = this.f109245b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f109246c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        fu3.a aVar = this.e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public c0(fu3.a aVar, Integer num, Long l2, Long l3, String str, List selectedCredits) {
        Intrinsics.checkNotNullParameter(selectedCredits, "selectedCredits");
        this.f109244a = selectedCredits;
        this.f109245b = l2;
        this.f109246c = l3;
        this.d = num;
        this.e = aVar;
        this.f = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(List list, Long l2, Long l3, fu3.a aVar, int i) {
        List list2 = (i & 1) != 0 ? f0.f322471a : list;
        this((i & 16) != 0 ? null : aVar, null, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, null, list2);
    }
}
