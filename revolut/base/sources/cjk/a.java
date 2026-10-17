package cjk;

import hha.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static dj0.d a(int i, ggk.a details) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(details, "details");
        hha.d dVar2 = details.f143698b;
        hha.i iVar = details.f143699c;
        if (iVar == null) {
            iVar = hha.i.MONTHLY;
        }
        hha.g gVarA = dok.g.a(dVar2, iVar);
        if (gVarA != null) {
            o oVar = gVarA.d;
            if (oVar == null || (dVar = oVar.f152326a) == null) {
                dVar = gVarA.f152308c;
            }
            return pyd.c.U(dVar, i);
        }
        throw new IllegalStateException((hha.i.MONTHLY + " not found for plan " + details.f143698b.f152289c).toString());
    }
}
