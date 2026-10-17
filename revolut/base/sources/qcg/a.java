package qcg;

import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import yy0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C1340a Companion = new C1340a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageTransformations f244778a = new ImageTransformations(null, new RoundedRectTransformation(12.0f), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tf f244779b;

    /* JADX INFO: renamed from: qcg.a$a, reason: collision with other inner class name */
    public static final class C1340a {
        private C1340a() {
        }
    }

    static {
        yy0.i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        f244779b = new tf(yy0.i.a(resourceImage));
    }
}
