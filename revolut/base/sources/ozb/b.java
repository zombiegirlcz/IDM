package ozb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ShapeTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.Logo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.l;
import org.jmrtd.cbeff.ISO781611;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f231254a;

    public b(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f231254a = uiKitResources;
    }

    public final Image a(Logo logo, ShapeTransformation shapeTransformation) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        l lVar = logo.f83955b;
        String str = logo.f83954a;
        int i = a.f231253a[lVar.ordinal()];
        if (i == 1) {
            return new UrlImage(logo.f83954a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, shapeTransformation, null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        }
        if (i != 2) {
            if (i == 3) {
                return new ResourceImage(R$drawable.uikit_icn_24_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            }
            throw new NoWhenBranchMatchedException();
        }
        int iA = this.f231254a.a(str);
        if (iA > 0) {
            return LayeredImage.INSTANCE.i(iA, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new ResourceImage(R$drawable.uikit_icn_24_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }
}
