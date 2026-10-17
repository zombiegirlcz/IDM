package e29;

import java.util.concurrent.CopyOnWriteArrayList;
import k29.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import n29.g;
import n29.h;
import z19.b;
import z19.c;
import z19.d;
import z19.l;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final d a(k29.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            return new b(bVar.f180402a, bVar.f180403b);
        }
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            return new c(dVar.f180406a, dVar.f180407b);
        }
        if (aVar instanceof a.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d b(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof n29.d) {
            n29.d dVar = (n29.d) hVar;
            return new b(dVar.f211462a, dVar.f211463b);
        }
        if (!(hVar instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        g gVar = (g) hVar;
        return new c(gVar.f211468a, gVar.f211469b);
    }

    public static final l c(String str) {
        l lVar;
        l[] lVarArrValues = l.values();
        int length = lVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lVar = null;
                break;
            }
            lVar = lVarArrValues[i];
            if (a0.z(lVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (lVar != null) {
            return lVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown wrapped card ref: ", str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return l.UNKNOWN;
    }

    public static final h d(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            return new n29.d(bVar.f318763a, bVar.f318764b);
        }
        if (!(dVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        c cVar = (c) dVar;
        return new g(cVar.f318765a, cVar.f318766b);
    }
}
