package rqc;

import aqc.j;
import cli.y;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements f {
    public final CancelSalarySwitchScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f256518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f256519q;

    public h(i stateMapper, CancelSalarySwitchScreenContract$InputData inputData, j interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f256518p = interactor;
        this.f256519q = mra.d.b(this, d.f256514a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f256519q;
    }
}
