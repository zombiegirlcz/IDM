package ltk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f199963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kdh.b f199964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gdh.a f199965n;

    public d(b inputData, kdh.b instrumentActionsInteractor, gdh.a actionsPanelNavigationExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(actionsPanelNavigationExtension, "actionsPanelNavigationExtension");
        this.f199963l = inputData;
        this.f199964m = instrumentActionsInteractor;
        this.f199965n = actionsPanelNavigationExtension;
    }

    @Override // yji.n
    public final void D2() {
        if (this.f199963l.f199962b != null) {
            T2(new c(this, null), new yi5.b(27));
        }
    }
}
