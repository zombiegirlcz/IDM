package nl;

import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RuntimePermissionsManager f216963b;

    public x0(Navigator navigator, RuntimePermissionsManager permissionsManager) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        this.f216962a = navigator;
        this.f216963b = permissionsManager;
    }

    public final Observable a(Observable uiEvents, CaptureStepDataBundle captureStepDataBundle, boolean z) {
        Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        Observable observableDefer = Observable.defer(new com.onfido.android.sdk.capture.detector.rectangle.a(this, captureStepDataBundle, uiEvents, z));
        Intrinsics.checkNotNullExpressionValue(observableDefer, "defer(...)");
        return observableDefer;
    }
}
