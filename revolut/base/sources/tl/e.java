package tl;

import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnknownCameraException f271983a;

    public e(UnknownCameraException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f271983a = cause;
    }
}
