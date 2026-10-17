package itk;

import a2b.j;
import com.revolut.kompot.common.ModalDestination;
import is6.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gdh.a f168418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.b f168419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kdh.b f168420n;

    public e(gdh.a actionsPanelNavigationExtension, ybl.b instrumentTickerInteractor, kdh.b instrumentActionsInteractor) {
        Intrinsics.checkNotNullParameter(actionsPanelNavigationExtension, "actionsPanelNavigationExtension");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        this.f168418l = actionsPanelNavigationExtension;
        this.f168419m = instrumentTickerInteractor;
        this.f168420n = instrumentActionsInteractor;
    }

    @Override // itk.a
    public final void Z2(bfl.g tradeSide, hdh.e instrumentActions) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrumentActions, "instrumentActions");
        this.f168418l.b3(tradeSide, instrumentActions, false);
    }

    @Override // itk.a
    public final void b3() {
        n.P2(this, o2(j.f727a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // itk.a
    public final Flow c3(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return boh.f.e(rd0.e.b(ybl.b.c(this.f168419m)), new t(this, ref2, 11));
    }
}
