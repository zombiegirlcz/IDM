package yc0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f312420a;

    public f(b0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f312420a = provider;
    }

    public final ResourceImage a(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        h hVar = (h) this.f312420a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        BackendFlowNavigationIcon backendFlowNavigationIconA = hVar.f312425a.J(screen) ? hVar.a() : BackendFlowNavigationIcon.BackArrow.f63285a;
        if (backendFlowNavigationIconA instanceof BackendFlowNavigationIcon.Cross) {
            return new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        if (backendFlowNavigationIconA instanceof BackendFlowNavigationIcon.BackArrow) {
            return new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        if (backendFlowNavigationIconA instanceof BackendFlowNavigationIcon.Hidden) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
