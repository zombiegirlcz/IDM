package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes15.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    public Size getAlternativeResolution(int i) {
        if (i == 4) {
            return new Size(640, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
        }
        if (i == 5) {
            return new Size(960, 720);
        }
        if (i != 6) {
            return null;
        }
        return new Size(DateTimeConstants.MINUTES_PER_DAY, 1080);
    }
}
