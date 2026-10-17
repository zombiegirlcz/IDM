package sr7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import hx7.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final RowDelegate.Model.MainImage.Image24 a(nr7.b bVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        ResourceImage resourceImage = new ResourceImage(l.H(bVar), (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246);
        boolean z = false;
        return new RowDelegate.Model.MainImage.Image24(resourceImage, z, z, 6);
    }

    public static RowDelegate.Model.MainImage.Image40 b(nr7.b bVar, boolean z, LayeredImage layeredImage, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            layeredImage = null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return j.a(l.H(bVar), layeredImage, z);
    }
}
