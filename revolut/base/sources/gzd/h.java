package gzd;

import cli.n;
import cli.y;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreenContract$InputData;
import fzd.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {
    public final z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f148060p;

    public h(n stateMapper, AllCategoriesScreenContract$InputData inputData, z selectableOptionExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectableOptionExtension, "selectableOptionExtension");
        this.o = selectableOptionExtension;
        this.f148060p = mra.d.b(this, new e(inputData.f88304b, inputData.f88305c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f148060p;
        List list = ((e) ((j2) yVar.f22677a).getValue()).f148053a;
        z zVar = this.o;
        zVar.e3(list);
        zVar.f3(((e) ((j2) yVar.f22677a).getValue()).f148054b);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.b3(), null, new gul.n(this, null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f148060p;
    }
}
