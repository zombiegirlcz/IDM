package to0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import ro0.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements a {
    @Override // to0.a
    public final Bitmap a(Context context, Bitmap bitmap, ro0.h style, float f) {
        Image imageAcquireNextImage;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(style, "style");
        RenderEffect renderEffect = d0.c(context, style, 1.0f, style.c() * f);
        if (renderEffect == null) {
            return bitmap;
        }
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(renderEffect, "renderEffect");
        ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
        RenderNode renderNodeC = is0.b.c();
        renderNodeC.setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        renderNodeC.setRenderEffect(renderEffect);
        renderNodeC.beginRecording().drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        renderNodeC.endRecording();
        HardwareRenderer hardwareRendererD = q2.a.d();
        try {
            hardwareRendererD.setSurface(imageReaderNewInstance.getSurface());
            hardwareRendererD.setContentRoot(renderNodeC);
            hardwareRendererD.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
        } finally {
        }
        if (imageAcquireNextImage == null) {
            throw new RuntimeException("Failed to acquire Image");
        }
        try {
            HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
            if (hardwareBuffer == null) {
                throw new RuntimeException("No HardwareBuffer");
            }
            try {
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                if (bitmapWrapHardwareBuffer == null) {
                    throw new RuntimeException("Buffer Wrap Error");
                }
                Bitmap bitmapCopy = bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                bitmapWrapHardwareBuffer.recycle();
                mra.d.l(hardwareBuffer, null);
                mra.d.l(imageAcquireNextImage, null);
                Intrinsics.h(bitmapCopy);
                return bitmapCopy;
            } finally {
            }
        } finally {
        }
        hardwareRendererD.destroy();
        imageReaderNewInstance.close();
        renderNodeC.discardDisplayList();
    }
}
