package no5;

import efm.r;
import hp5.e;
import hp5.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import w4l.h;
import w4l.i;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f217919a;

    static r a(b bVar, boolean z, ho5.a mergeBy, boolean z3, int i) {
        if ((i & 2) != 0) {
            mergeBy = ho5.a.BLOCKCHAIN;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        boolean z4 = (i & 8) == 0;
        o oVar = (o) bVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(mergeBy, "mergeBy");
        return w.f0(nim.a.w(oVar.o.e(new e(z3, z4), z ? i.f294643c : h.f294642c), new hm3.b(mergeBy, oVar, 15)));
    }
}
