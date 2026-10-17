package bw;

import android.graphics.Rect;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class r {
    public static final xv.u a(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        if (imageProxy.getFormat() != 35) {
            throw new IllegalArgumentException(a0.d.n("Captured frame requires a compatible image source, got format=", imageProxy.getFormat()).toString());
        }
        ImageProxy.PlaneProxy[] planes = imageProxy.getPlanes();
        Intrinsics.checkNotNullExpressionValue(planes, "getPlanes(...)");
        if (planes.length != 3) {
            throw new IllegalArgumentException(a0.d.n("Captured frame requires three image planes, got ", planes.length).toString());
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        Rect rect = new Rect(imageProxy.getCropRect());
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        long timestamp = imageProxy.getImageInfo().getTimestamp();
        ArrayList arrayList = new ArrayList(planes.length);
        for (ImageProxy.PlaneProxy planeProxy : planes) {
            ByteBuffer buffer = planeProxy.getBuffer();
            Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
            int iPosition = buffer.position();
            int iLimit = buffer.limit();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.duplicate().get(bArr);
            arrayList.add(new xv.t(bArr, planeProxy.getRowStride(), planeProxy.getPixelStride(), iPosition, iLimit));
        }
        return new xv.u(width, height, rect, rotationDegrees, timestamp, arrayList);
    }
}
