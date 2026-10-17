package eyc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yxc.m f130669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9l.g f130670b;

    public r(yxc.m legacyEntityHomeMapper, z9l.g fincrimeHomeListItemsProvider) {
        Intrinsics.checkNotNullParameter(legacyEntityHomeMapper, "legacyEntityHomeMapper");
        Intrinsics.checkNotNullParameter(fincrimeHomeListItemsProvider, "fincrimeHomeListItemsProvider");
        this.f130669a = legacyEntityHomeMapper;
        this.f130670b = fincrimeHomeListItemsProvider;
    }

    public static ResourceImage a(n nVar) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        if (nVar.f130662a) {
            return resourceImage;
        }
        return null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f130663b, new eu7.c(this, domainState), new eul.f(this, domainState), new dn8.k(this, domainState, 28));
    }
}
