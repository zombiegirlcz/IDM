package so0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f264665a = q2.a.C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f264666b = new c();

    @Override // so0.b
    public final void a(int i) {
        this.f264665a.setAlpha(i / 255.0f);
    }

    @Override // so0.b
    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        c cVar = this.f264666b;
        Bitmap bitmapA = cVar.a(width, height);
        Canvas canvas = new Canvas(bitmapA);
        int iSave = canvas.save();
        try {
            canvas.scale(1.0f / cVar.f264663b, 1.0f / cVar.f264664c);
            view.draw(canvas);
            canvas.restoreToCount(iSave);
            this.f264665a.setPosition(0, 0, bitmapA.getWidth(), bitmapA.getHeight());
            RecordingCanvas recordingCanvasBeginRecording = this.f264665a.beginRecording();
            Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "beginRecording(...)");
            recordingCanvasBeginRecording.drawBitmap(bitmapA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            this.f264665a.endRecording();
            RenderNode renderNode = this.f264665a;
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(25.0f, 25.0f, Shader.TileMode.MIRROR));
        } catch (Throwable th10) {
            canvas.restoreToCount(iSave);
            throw th10;
        }
    }

    @Override // so0.b
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        c cVar = this.f264666b;
        if (((cVar.f264663b == BitmapDescriptorFactory.HUE_RED || cVar.f264664c == BitmapDescriptorFactory.HUE_RED) ? null : cVar.f264662a) != null && canvas.isHardwareAccelerated()) {
            int iSave = canvas.save();
            try {
                canvas.scale(cVar.f264663b, cVar.f264664c);
                canvas.drawRenderNode(this.f264665a);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
