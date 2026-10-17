package ved;

import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertItem f288267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tfd.b f288268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f288269c;
    public final boolean d;

    public g(AlertItem alertItem, tfd.b chart, List footer, boolean z) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f288267a = alertItem;
        this.f288268b = chart;
        this.f288269c = footer;
        this.d = z;
    }

    public static g a(g gVar, tfd.b chart, List footer, int i) {
        AlertItem alertItem = gVar.f288267a;
        if ((i & 2) != 0) {
            chart = gVar.f288268b;
        }
        if ((i & 4) != 0) {
            footer = gVar.f288269c;
        }
        boolean z = (i & 8) != 0 ? gVar.d : false;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new g(alertItem, chart, footer, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f288267a, gVar.f288267a) && Intrinsics.f(this.f288268b, gVar.f288268b) && Intrinsics.f(this.f288269c, gVar.f288269c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d((this.f288268b.hashCode() + (this.f288267a.hashCode() * 31)) * 31, 31, this.f288269c);
    }
}
