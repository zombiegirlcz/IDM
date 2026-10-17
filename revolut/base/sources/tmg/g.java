package tmg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import fmg.b0;
import fmg.k0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.g f272214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9l.a f272215b;

    public g(l resourceProvider, m93.g cardsMapper, u9l.a sharedTransactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(cardsMapper, "cardsMapper");
        Intrinsics.checkNotNullParameter(sharedTransactionIconResourcesMapper, "sharedTransactionIconResourcesMapper");
        this.f272214a = cardsMapper;
        this.f272215b = sharedTransactionIconResourcesMapper;
    }

    public static RowDelegate.Model.MainImage.Image24 a(Image image) {
        if (image == null) {
            return null;
        }
        boolean z = false;
        return new RowDelegate.Model.MainImage.Image24(image, z, z, 6);
    }

    public final ResourceImage b(b0 b0Var) {
        int i;
        if (b0Var == null) {
            return null;
        }
        int i2 = b0Var.f136412a;
        k0 color = b0Var.f136413b;
        Intrinsics.checkNotNullParameter(color, "color");
        int i3 = k.f272219c[color.ordinal()];
        if (i3 == 1) {
            i = R$attr.uikit_colorForeground;
        } else if (i3 == 2) {
            i = R$attr.uikit_colorRed;
        } else if (i3 == 3) {
            i = R$attr.uikit_colorOrange;
        } else if (i3 == 4) {
            i = R$attr.uikit_colorGreen;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorGrey50;
        }
        return new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }
}
