package q4;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraExtensionSession;
import android.media.MediaDrm;
import android.os.OutcomeReceiver;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ boolean C(View view) {
        return view instanceof SplashScreenView;
    }

    public static /* synthetic */ Font.Builder i(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ CameraExtensionSession l(Object obj2) {
        return (CameraExtensionSession) obj2;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent n(Object obj2) {
        return (MediaDrm.PlaybackComponent) obj2;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver o(Object obj2) {
        return (OutcomeReceiver) obj2;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession p(Object obj2) {
        return (ScrollCaptureSession) obj2;
    }

    public static /* synthetic */ ScrollCaptureTarget q(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return CameraExtensionSession.class;
    }
}
