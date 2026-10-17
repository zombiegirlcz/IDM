package sbb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.AppUpdateActionExtensionPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends yji.n implements etb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cq.g f261553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cq.b f261554m;

    public m(cq.g appUpdater, cq.b activityDelegate) {
        Intrinsics.checkNotNullParameter(appUpdater, "appUpdater");
        Intrinsics.checkNotNullParameter(activityDelegate, "activityDelegate");
        this.f261553l = appUpdater;
        this.f261554m = activityDelegate;
    }

    @Override // yji.n
    public final void D2() {
        this.f261554m.onCreate(null);
    }

    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        T2(new s09.c(this, actionData, null, 27), new yi5.b(27));
    }

    @Override // yji.n
    public final void E2() {
        this.f261554m.onDestroy();
    }

    @Override // yji.n
    public final void F2() {
        this.f261554m.onStop();
    }

    @Override // yji.n
    public final void H2() {
        this.f261554m.onStart();
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof AppUpdateActionExtensionPayload;
    }
}
