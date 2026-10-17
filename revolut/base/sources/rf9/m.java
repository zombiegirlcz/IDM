package rf9;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f253734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f253735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f253736c;
    public final boolean d;

    public m(wi0.b bVar, List definitions, Map values, boolean z) {
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f253734a = bVar;
        this.f253735b = definitions;
        this.f253736c = values;
        this.d = z;
    }

    public static m a(m mVar, wi0.b bVar, List definitions, Map values, boolean z, int i) {
        if ((i & 1) != 0) {
            bVar = mVar.f253734a;
        }
        if ((i & 2) != 0) {
            definitions = mVar.f253735b;
        }
        if ((i & 4) != 0) {
            values = mVar.f253736c;
        }
        if ((i & 8) != 0) {
            z = mVar.d;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        Intrinsics.checkNotNullParameter(values, "values");
        return new m(bVar, definitions, values, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f253734a, mVar.f253734a) && Intrinsics.f(this.f253735b, mVar.f253735b) && Intrinsics.f(this.f253736c, mVar.f253736c) && this.d == mVar.d;
    }

    public final int hashCode() {
        wi0.b bVar = this.f253734a;
        return Boolean.hashCode(this.d) + p.a.e(p.a.d((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31, 31, this.f253735b), 31, this.f253736c);
    }
}
