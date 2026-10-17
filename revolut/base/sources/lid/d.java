package lid;

import com.revolut.feature.shops.api.model.ShopsOutlet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f195476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f195477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f195478c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Double.compare(this.f195476a, aVar.f195476a) == 0 && Double.compare(this.f195477b, aVar.f195477b) == 0 && Double.compare(this.f195478c, aVar.f195478c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f195478c) + m72.b.c(Double.hashCode(this.f195476a) * 31, this.f195477b, 31);
        }

        public a(int i) {
            this.f195476a = 0.25d;
            this.f195477b = 0.05d;
            this.f195478c = 0.05d;
        }
    }

    private d() {
    }

    public static List a(List list, bo3.a boundaries) {
        a multipliers = new a(0);
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        Intrinsics.checkNotNullParameter(multipliers, "multipliers");
        co3.a aVar = boundaries.f17282a;
        double d = aVar.f25486a;
        co3.a aVar2 = boundaries.f17283b;
        double d5 = aVar2.f25486a;
        double dAbs = Math.abs(d - d5);
        double d6 = aVar2.f25487b;
        double d10 = aVar.f25487b;
        double d15 = d6 >= d10 ? d6 - d10 : (360.0d + d6) - d10;
        double d41 = aVar.f25486a - (0.25d * dAbs);
        double d51 = (dAbs * 0.05d) + d5;
        double d68 = d15 * 0.05d;
        double d81 = d10 + d68;
        double d82 = d6 - d68;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            co3.a aVar3 = ((ShopsOutlet) obj2).d;
            double d95 = aVar3.f25486a;
            double d100 = d51;
            double d101 = aVar3.f25487b;
            boolean z = true;
            boolean z3 = d100 <= d95 && d95 <= d41;
            if (d81 > d82 ? !(d101 >= d81 || d101 <= d82) : !(d81 <= d101 && d101 <= d82)) {
                z = false;
            }
            if (z3 && z) {
                arrayList.add(obj2);
            }
            d51 = d100;
        }
        return d0.P0(arrayList, new f());
    }
}
