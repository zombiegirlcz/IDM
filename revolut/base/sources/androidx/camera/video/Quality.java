package androidx.camera.video;

import android.util.Size;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import grl.b4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class Quality {
    public static final Quality FHD;
    public static final Quality HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;
    public static final Quality SD;
    public static final Quality UHD;

    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        public static ConstantQuality of(int i, int i2, String str, List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i, i2, str, list);
        }

        public abstract int getHighSpeedValue();

        public abstract String getName();

        public int getQualityValue(int i) {
            if (i == 1) {
                return getValue();
            }
            if (i == 2) {
                return getHighSpeedValue();
            }
            throw new AssertionError(a0.d.n("Unknown quality source: ", i));
        }

        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        ConstantQuality constantQualityOf = ConstantQuality.of(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, DefaultFrameSampler.DESIRED_FRAME_WIDTH), new Size(640, DefaultFrameSampler.DESIRED_FRAME_WIDTH))));
        SD = constantQualityOf;
        ConstantQuality constantQualityOf2 = ConstantQuality.of(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        HD = constantQualityOf2;
        ConstantQuality constantQualityOf3 = ConstantQuality.of(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityOf3;
        ConstantQuality constantQualityOf4 = ConstantQuality.of(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityOf4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityOf5 = ConstantQuality.of(0, b4.EXPIRED_OR_INVALID_KEY_VALUE, "LOWEST", list);
        LOWEST = constantQualityOf5;
        ConstantQuality constantQualityOf6 = ConstantQuality.of(1, 2001, "HIGHEST", list);
        HIGHEST = constantQualityOf6;
        NONE = ConstantQuality.of(-1, -1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityOf5, constantQualityOf6, constantQualityOf, constantQualityOf2, constantQualityOf3, constantQualityOf4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityOf4, constantQualityOf3, constantQualityOf2, constantQualityOf);
    }

    public static boolean containsQuality(Quality quality) {
        return QUALITIES.contains(quality);
    }

    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }

    private Quality() {
    }
}
