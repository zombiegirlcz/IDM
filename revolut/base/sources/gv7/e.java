package gv7;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(n stateMapper, SimpleTextDocumentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f76098b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
