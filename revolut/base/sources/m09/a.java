package m09;

import efm.r;
import efm.w;
import efm.x;
import kotlin.jvm.internal.Intrinsics;
import lxb.c;
import lyd.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements x {
    @Override // efm.x
    public final w apply(r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        r map = upstream.map(new c(23, new b(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
