package txh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.d;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2i.a f275431a;

    public b(r2i.a settlementDelayBannerMapper) {
        Intrinsics.checkNotNullParameter(settlementDelayBannerMapper, "settlementDelayBannerMapper");
        this.f275431a = settlementDelayBannerMapper;
    }

    public static z a() {
        return new z("ACTIONS_ID", u.c(new ActionsView.Item("CANCEL_ACTION_ID", d.NEGATIVE, false, null, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)), false, 0, 0, Constants.TAG_F4);
    }
}
