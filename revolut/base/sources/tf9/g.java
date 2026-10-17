package tf9;

import cli.j;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f270278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f270279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f270280c;
    public final String d;

    public g() {
        this(0);
    }

    public static g a(g gVar, Biller biller, List definitions, Map values, String str, int i) {
        if ((i & 1) != 0) {
            biller = gVar.f270278a;
        }
        gVar.getClass();
        if ((i & 4) != 0) {
            definitions = gVar.f270279b;
        }
        if ((i & 8) != 0) {
            values = gVar.f270280c;
        }
        if ((i & 16) != 0) {
            str = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        Intrinsics.checkNotNullParameter(values, "values");
        return new g(biller, definitions, values, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f270278a, gVar.f270278a) && Intrinsics.f(this.f270279b, gVar.f270279b) && Intrinsics.f(this.f270280c, gVar.f270280c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        Biller biller = this.f270278a;
        int iE = p.a.e(p.a.d((biller == null ? 0 : biller.hashCode()) * 961, 31, this.f270279b), 31, this.f270280c);
        String str = this.d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public g(Biller biller, List definitions, Map values, String str) {
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f270278a = biller;
        this.f270279b = definitions;
        this.f270280c = values;
        this.d = str;
    }

    public g(int i) {
        this(null, f0.f322471a, r0.g(), null);
    }
}
