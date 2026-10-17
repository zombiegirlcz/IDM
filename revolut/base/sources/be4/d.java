package be4;

import c84.t;
import com.google.protobuf.w0;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import wr3.f;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f14676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f14677b;

    public d(f notificationSettingsProvider, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(notificationSettingsProvider, "notificationSettingsProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f14676a = notificationSettingsProvider;
        this.f14677b = intentProvider;
    }

    public final ActionsBottomSheetController a(t controller, WaitingPopupScreenConfig config, w0 w0Var, Function2 tillHide) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(tillHide, "tillHide");
        boolean zAreNotificationsEnabled = this.f14676a.f299516a.areNotificationsEnabled();
        ActionsBottomSheetController actionsBottomSheetControllerA = a.a(config, w0Var, zAreNotificationsEnabled);
        s.G(actionsBottomSheetControllerA, tillHide, new c(controller, null, 1), new b(zAreNotificationsEnabled, controller, this, 0));
        return actionsBottomSheetControllerA;
    }
}
