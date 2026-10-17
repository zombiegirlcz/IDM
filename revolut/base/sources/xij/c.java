package xij;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f306414p;

    public c(EsimInfoBottomSheetScreenContract$InputData inputData, n stateMapper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f306414p = mra.d.b(this, inputData, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f306414p;
    }
}
