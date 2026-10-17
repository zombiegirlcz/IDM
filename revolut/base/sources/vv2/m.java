package vv2;

import cli.y;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements dli.b {
    public final OldOrNewPinDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rv2.a f292446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f292447q;

    public m(n stateMapper, OldOrNewPinDialogContract$InputData inputData, rv2.a viewCardPinInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(viewCardPinInteractor, "viewCardPinInteractor");
        this.o = inputData;
        this.f292446p = viewCardPinInteractor;
        this.f292447q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f292447q;
    }
}
