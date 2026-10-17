package tgf;

import cli.y;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tgf.g;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements j {
    public final y o;

    public l(cli.n stateMapper, TransactionsFilterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new h(inputData.f91924a), stateMapper, null, false, 12);
    }

    public final void I2(g gVar) {
        boolean z = gVar instanceof f;
        y yVar = this.o;
        if (z) {
            H2(yVar, new t8e.c(this, (f) gVar, 17));
        } else if (gVar instanceof g.b) {
            C2(new i(((h) ((j2) yVar.f22677a).getValue()).f271175a));
        } else if (gVar instanceof g.a) {
            H2(yVar, new td1.f(this, 17));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
