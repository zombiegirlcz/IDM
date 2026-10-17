package j33;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ieg.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f170958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170959b;

    public t(c90.a colorProvider, c90.c uiResources, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f170958a = productCatalogueInteractor;
        int i = s.f170957b[uiResources.a().ordinal()];
        this.f170959b = i != 1 ? (i == 2 || i == 3) ? "@2x" : "@3x" : "@1x";
    }

    public final Image a(String str) {
        if (str == null) {
            return new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        return new UrlImage(a0.D(str, ".png", this.f170959b + ".png", false), null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(-90, null, null, null, null, null, null, 126), null, null, false, false, 507902);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f, new j1.e(20), new j0g.b(15), new z(this, domainState, 17)));
    }
}
