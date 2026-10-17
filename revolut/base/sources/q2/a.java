package q2;

import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.media.MediaCodecInfo;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ RenderNode A() {
        return new RenderNode("blur");
    }

    public static /* synthetic */ RenderNode B() {
        return new RenderNode("blurSrc");
    }

    public static /* synthetic */ RenderNode C() {
        return new RenderNode("node");
    }

    public static /* synthetic */ RenderNode D() {
        return new RenderNode("BlurEffect");
    }

    public static /* synthetic */ HardwareRenderer d() {
        return new HardwareRenderer();
    }

    public static /* synthetic */ RenderNode f() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder g(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder k(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint n() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession p(Object obj2) {
        return (ContentCaptureSession) obj2;
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ RenderNode v() {
        return new RenderNode("OffscreenLayer.shadow");
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ RenderNode y() {
        return new RenderNode("background");
    }

    public static /* synthetic */ RenderNode z() {
        return new RenderNode("foreground");
    }
}
