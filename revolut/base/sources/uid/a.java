package uid;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f280378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f280380c;
    public final double d;
    public final boolean e;

    public a(Double d, List suggestedValues, double d5, double d6, boolean z) {
        Intrinsics.checkNotNullParameter(suggestedValues, "suggestedValues");
        this.f280378a = d;
        this.f280379b = suggestedValues;
        this.f280380c = d5;
        this.d = d6;
        this.e = z;
    }

    public static a a(a aVar, Double d, int i) {
        if ((i & 1) != 0) {
            d = aVar.f280378a;
        }
        Double d5 = d;
        List suggestedValues = aVar.f280379b;
        double d6 = aVar.f280380c;
        double d10 = aVar.d;
        boolean z = (i & 16) != 0 ? aVar.e : true;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(suggestedValues, "suggestedValues");
        return new a(d5, suggestedValues, d6, d10, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f280378a, aVar.f280378a) && Intrinsics.f(this.f280379b, aVar.f280379b) && Double.compare(this.f280380c, aVar.f280380c) == 0 && Double.compare(this.d, aVar.d) == 0 && this.e == aVar.e;
    }

    public final int hashCode() {
        Double d = this.f280378a;
        return Boolean.hashCode(this.e) + m72.b.c(m72.b.c(p.a.d((d == null ? 0 : d.hashCode()) * 31, 31, this.f280379b), this.f280380c, 31), this.d, 31);
    }
}
