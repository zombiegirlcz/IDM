package cod;

import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lnd.o0;
import org.jetbrains.annotations.NotNull;
import yy0.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f25528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f25529b;

    public b(gte.a featureToggleInteractor, o0 categoriesSectionMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(categoriesSectionMapper, "categoriesSectionMapper");
        this.f25528a = featureToggleInteractor;
        this.f25529b = categoriesSectionMapper;
    }

    public static tf a() {
        yy0.i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new tf(yy0.i.a(resourceImage));
    }
}
