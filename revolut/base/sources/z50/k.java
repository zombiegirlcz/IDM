package z50;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.io.File;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jmrtd.lds.LDSFile;
import zhm.y0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private k() {
    }

    public static Image a(String str, String str2, Map thumbnailUrlHeaders, i preference, boolean z) {
        Intrinsics.checkNotNullParameter(thumbnailUrlHeaders, "thumbnailUrlHeaders");
        Intrinsics.checkNotNullParameter(preference, "preference");
        if (str2 == null || d0.W(str2)) {
            str2 = null;
        }
        if (str == null || d0.W(str)) {
            str = null;
        }
        int i = j.f319408a[preference.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (str2 != null) {
                return e(str2, thumbnailUrlHeaders, z);
            }
            if (str != null) {
                return c(str, z);
            }
        } else {
            if (str != null) {
                return c(str, z);
            }
            if (str2 != null) {
                return e(str2, thumbnailUrlHeaders, z);
            }
        }
        return null;
    }

    public static FileImage c(String str, boolean z) {
        return new FileImage(new File(str), z ? FileImage.Placeholder.Shimmering.f59921a : null, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), 8);
    }

    public static boolean d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a0.H(str, "image/", false);
    }

    public static UrlImage e(String str, Map map, boolean z) {
        return new UrlImage(str, (String) null, (UrlImageDrawable) (z ? UrlImageDrawable.Shimmering.INSTANCE : null), 0L, 0L, (UrlImage.CustomHeaders) new UrlImage.SimpleCustomHeaders(y0.b("X-Device-Id"), map), (Integer) null, (Integer) null, (ez0.h) null, (Image) (z ? ShimmerImage.f60002a : null), true, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 514522);
    }
}
