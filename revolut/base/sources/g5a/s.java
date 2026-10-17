package g5a;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.xh0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f140714a;

    public s(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f140714a = featureToggleInteractor;
    }

    public static SwipeToActionDelegate.SwipeAction a(g gVar) {
        return new SwipeToActionDelegate.SwipeAction("ACTION_ID_DELETE", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_delete, null, null, 14), xh0.NEGATIVE, null, gVar, null, 80);
    }

    public static SwipeToActionDelegate.SwipeAction b(jq9.s sVar) {
        return new SwipeToActionDelegate.SwipeAction("ACTION_ID_GROUP_ADD_BILL", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.payments_swipe_action_add_bill, null, null, 14), xh0.PRIMARY, null, new l(sVar), null, 80);
    }

    public static SwipeToActionDelegate.SwipeAction c(jq9.k kVar) {
        return new SwipeToActionDelegate.SwipeAction("ACTION_ID_SEND", new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_send, null, null, 14), xh0.PRIMARY, null, new p(kVar), null, 80);
    }
}
