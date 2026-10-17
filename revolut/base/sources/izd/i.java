package izd;

import cli.n;
import cli.y;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreenContract$InputData;
import fzd.x;
import iug.j;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements dli.b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f169879p;

    public i(n stateMapper, AllProductsScreenContract$InputData inputData, x productSectionExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productSectionExtension, "productSectionExtension");
        this.o = productSectionExtension;
        this.f169879p = mra.d.b(this, new f(inputData.f88306a, inputData.f88307b, inputData.f88308c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f169879p;
        List list = ((f) ((j2) yVar.f22677a).getValue()).f169871a;
        x xVar = this.o;
        xVar.f3(list);
        j2 j2Var = (j2) yVar.f22677a;
        xVar.g3(new lzd.c(((f) j2Var.getValue()).f169872b, ((f) j2Var.getValue()).f169873c));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.b3(), null, new j(this, (Continuation) null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f169879p;
    }
}
