package soc;

import ip0.mj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static mj a(flc.a projection, int i, boolean z) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        dj0.d dVar = projection.f135941a;
        dj0.d dVar2 = projection.f135942b;
        dj0.d dVar3 = projection.d;
        dj0.d dVar4 = projection.f135943c;
        return new mj(i, dVar, dVar4, z ? pyd.c.O(dVar4, pyd.c.k(pyd.c.H(dVar3, dVar4), 2L)) : dVar3, dVar3, z ? pyd.c.O(dVar2, pyd.c.k(pyd.c.H(dVar4, dVar2), 2L)) : dVar2, dVar2);
    }
}
