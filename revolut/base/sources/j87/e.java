package j87;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f172136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f172137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f172138c;
    public final wi0.b d;
    public final boolean e;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data data, List list, List list2, wi0.b bVar, int i) {
        if ((i & 1) != 0) {
            data = eVar.f172136a;
        }
        Data html = data;
        if ((i & 2) != 0) {
            list = eVar.f172137b;
        }
        List activeCountries = list;
        if ((i & 4) != 0) {
            list2 = eVar.f172138c;
        }
        List markers = list2;
        if ((i & 8) != 0) {
            bVar = eVar.d;
        }
        wi0.b bVar2 = bVar;
        boolean z = (i & 16) != 0 ? eVar.e : true;
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(activeCountries, "activeCountries");
        Intrinsics.checkNotNullParameter(markers, "markers");
        return new e(html, activeCountries, markers, bVar2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f172136a, eVar.f172136a) && Intrinsics.f(this.f172137b, eVar.f172137b) && Intrinsics.f(this.f172138c, eVar.f172138c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f172136a.hashCode() * 31, 31, this.f172137b), 31, this.f172138c);
        wi0.b bVar = this.d;
        return Boolean.hashCode(this.e) + ((iD + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31);
    }

    public e(Data html, List activeCountries, List markers, wi0.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(activeCountries, "activeCountries");
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.f172136a = html;
        this.f172137b = activeCountries;
        this.f172138c = markers;
        this.d = bVar;
        this.e = z;
    }

    public e(int i) {
        Data data = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        this(data, f0Var, f0Var, null, false);
    }
}
