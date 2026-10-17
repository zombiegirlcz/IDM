package zsc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f324875a;

    public i(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f324875a = query;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        dj0.d dVar = (dj0.d) obj2;
        String strValueOf = null;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
        xi0.b bVar = dVar != null ? dVar.f115083b : null;
        if (lValueOf != null && bVar != null) {
            int iP = cp5.d.p(bVar);
            strValueOf = String.valueOf(lValueOf.longValue());
            if (strValueOf.length() <= iP) {
                strValueOf = "0".concat(strValueOf);
            }
        }
        if (strValueOf == null) {
            strValueOf = "";
        }
        return this.f324875a.a(strValueOf);
    }
}
