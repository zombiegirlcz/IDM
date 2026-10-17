package vlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import ulm.l;
import ulm.m;
import ulm.n;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f {
    public static final n a(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return new n(lVar.f281102a, false, -1, -1, false, false, false, lVar.f281103b, -1, lVar.f281104c, false, false, null);
    }

    public static final void b(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        l lVar = new l();
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.f281104c = true;
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.SECONDS;
        long jN = kotlin.time.b.n(kotlin.time.c.g(Integer.MAX_VALUE, eVar), eVar);
        if (jN < 0) {
            throw new IllegalArgumentException(p.a.m(jN, "maxStale < 0: ").toString());
        }
        lVar.f281103b = jN <= 2147483647L ? (int) jN : Integer.MAX_VALUE;
        a(lVar);
    }

    public static final n c(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        l lVar = new l();
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.f281102a = true;
        return a(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ulm.n d(ulm.m r27, ulm.u0 r28) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vlm.f.d(ulm.m, ulm.u0):ulm.n");
    }

    public static final String e(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        String str = nVar.f281115m;
        int i = nVar.i;
        int i2 = nVar.f281112h;
        int i3 = nVar.d;
        int i5 = nVar.f281110c;
        if (str != null) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        if (nVar.f281108a) {
            sb6.append("no-cache, ");
        }
        if (nVar.f281109b) {
            sb6.append("no-store, ");
        }
        if (i5 != -1) {
            sb6.append("max-age=");
            sb6.append(i5);
            sb6.append(", ");
        }
        if (i3 != -1) {
            sb6.append("s-maxage=");
            sb6.append(i3);
            sb6.append(", ");
        }
        if (nVar.e) {
            sb6.append("private, ");
        }
        if (nVar.f) {
            sb6.append("public, ");
        }
        if (nVar.f281111g) {
            sb6.append("must-revalidate, ");
        }
        if (i2 != -1) {
            sb6.append("max-stale=");
            sb6.append(i2);
            sb6.append(", ");
        }
        if (i != -1) {
            sb6.append("min-fresh=");
            sb6.append(i);
            sb6.append(", ");
        }
        if (nVar.f281113j) {
            sb6.append("only-if-cached, ");
        }
        if (nVar.k) {
            sb6.append("no-transform, ");
        }
        if (nVar.f281114l) {
            sb6.append("immutable, ");
        }
        if (sb6.length() == 0) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(sb6.delete(sb6.length() - 2, sb6.length()), "delete(...)");
        String string = sb6.toString();
        nVar.f281115m = string;
        return string;
    }
}
