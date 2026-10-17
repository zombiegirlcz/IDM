package sr7;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f265136a;

    public i(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f265136a = uiKitResources;
    }

    public static LayeredImage a(i iVar, String str, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = R$attr.uikit_colorAccent;
        }
        if ((i3 & 4) != 0) {
            i2 = R$attr.uikit_colorAccent_10;
        }
        Integer numC = iVar.c(str);
        if (numC == null) {
            return null;
        }
        return LayeredImage.Companion.a(LayeredImage.INSTANCE, numC.intValue(), new Color.Solid(i), new Color.Solid(i2), 8.0f, null, 48);
    }

    public final ResourceImage b(Integer num, String str) {
        Integer numC = c(str);
        if (numC != null) {
            return new ResourceImage(numC.intValue(), (Integer) null, (Integer) null, num, (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        return null;
    }

    public final Integer c(String str) {
        if (str == null) {
            return null;
        }
        int iA = this.f265136a.a(str);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            return null;
        }
        return numValueOf;
    }
}
