package azi;

import cli.n;
import cli.y;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements d {
    public final xyi.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final czi.e f11471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f11472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f11473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f11474s;

    public j(n stateMapper, SchemeLoungesHowToAccessScreenContract$InputData inputData, xyi.b actionHandlerControllerExtension, czi.e copyToClipboardHelper, l93.f revolutCardsInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionHandlerControllerExtension, "actionHandlerControllerExtension");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = actionHandlerControllerExtension;
        this.f11471p = copyToClipboardHelper;
        this.f11472q = revolutCardsInteractor;
        this.f11473r = deeplinkHandler;
        this.f11474s = mra.d.b(this, new c(inputData.f99158b, inputData.f99159c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f11474s;
    }
}
