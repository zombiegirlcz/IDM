package r1g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f251006a;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f251006a = dateProvider;
    }

    public final List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ID", new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32708);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
