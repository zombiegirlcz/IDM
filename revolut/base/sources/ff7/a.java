package ff7;

import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.avatar.c;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import yy0.i;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf f134763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AvatarModel.Border.AnimatedGradient f134764b;

    static {
        i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        f134763a = new tf(i.a(resourceImage));
        f134764b = new AvatarModel.Border.AnimatedGradient(v.k(Integer.valueOf(R$attr.uikit_colorStatusInactive_20), Integer.valueOf(R$attr.uikit_colorStatusInactive_20), Integer.valueOf(R$attr.uikit_colorStatusInactive), Integer.valueOf(R$attr.uikit_colorStatusInactive_20), Integer.valueOf(R$attr.uikit_colorStatusInactive_20)), c.RECTANGLE);
    }

    private a() {
    }
}
