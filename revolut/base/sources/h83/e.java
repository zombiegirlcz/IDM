package h83;

import cli.g;
import cli.k;
import cli.y;
import com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen.PhysicalCardReplacementDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements dli.b {
    public final PhysicalCardReplacementDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f149944p;

    public e(f stateMapper, PhysicalCardReplacementDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f149944p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f149944p;
    }
}
