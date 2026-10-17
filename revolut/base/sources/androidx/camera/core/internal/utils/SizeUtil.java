package androidx.camera.core.internal.utils;

import android.util.Size;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(320, 240);
    public static final Size RESOLUTION_VGA = new Size(640, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
    public static final Size RESOLUTION_480P = new Size(720, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
    public static final Size RESOLUTION_720P = new Size(1280, 720);
    public static final Size RESOLUTION_1080P = new Size(1920, 1080);
    public static final Size RESOLUTION_1440P = new Size(1920, DateTimeConstants.MINUTES_PER_DAY);
    public static final Size RESOLUTION_1440P_16_9 = new Size(2560, DateTimeConstants.MINUTES_PER_DAY);
    public static final Size RESOLUTION_UHD = new Size(3840, 2160);

    public static <T> T findNearestHigherFor(Size size, TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            return entryCeilingEntry.getValue();
        }
        Map.Entry<Size, T> entryFloorEntry = treeMap.floorEntry(size);
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    public static int getArea(int i, int i2) {
        return i * i2;
    }

    public static boolean isSmallerByArea(Size size, Size size2) {
        return getArea(size) < getArea(size2);
    }

    public static int getArea(Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }
}
