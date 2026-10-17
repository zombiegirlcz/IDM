package c09;

import c03.u;
import efm.d0;
import efm.h0;
import efm.i0;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements i0 {
    @Override // efm.i0
    public final h0 i(d0 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        i iVar = new i(upstream, new u(4, new a(0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
