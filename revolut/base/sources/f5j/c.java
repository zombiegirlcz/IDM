package f5j;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final String a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Map map = aVar.u;
        if (map != null) {
            return (String) map.get("ALIAS_VALUE");
        }
        return null;
    }

    public static final String b(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.o;
        return str == null ? aVar.f132340r : str;
    }

    public static final boolean c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        r[] elements = {r.BR, r.PIX_ALIAS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.T(kotlin.collections.d.y0(elements), aVar.f132335l);
    }

    public static final boolean d(a aVar, wi0.b country) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(country, "country");
        return Intrinsics.f(b(aVar), country.f297794a);
    }

    public static final wi0.b e(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        wi0.a aVar2 = wi0.b.Companion;
        String strB = b(aVar);
        if (strB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVar2.getClass();
        return wi0.a.a(strB);
    }

    public static final xi0.b f(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        xi0.a aVar2 = xi0.b.Companion;
        String str = aVar.f132337n;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVar2.getClass();
        return xi0.a.a(str);
    }
}
