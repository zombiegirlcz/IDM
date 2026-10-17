package vjc;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterDetailsItem;
import com.revolut.feature.rewards.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f289705a;

    public i(a inputData, sic.a attributedTextClauseMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(attributedTextClauseMapper, "attributedTextClauseMapper");
        this.f289705a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = this.f289705a;
        TextClause textClause = new TextClause(aVar.f289700b.f84855b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RewardFooterAction.Cancel cancel = aVar.f289700b;
        lw0.a aVar2 = new lw0.a(textClause, sic.a.b(6, cancel.f84856c), new lw0.b(new UrlImage(cancel.f84854a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), new WarningCircleBadge(dw0.a.Info)), null, false, 24);
        ArrayList arrayList = cancel.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            RewardFooterDetailsItem rewardFooterDetailsItem = (RewardFooterDetailsItem) obj2;
            String strN = a0.d.n("DETAILS_ROW_ID_", i);
            TextClause textClause2 = new TextClause(rewardFooterDetailsItem.f84870a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            CompositeClause compositeClauseB = sic.a.b(6, rewardFooterDetailsItem.f84871b);
            arrayList2.add(new RowDelegate.Model(strN, null, textClause2, null, 0, null, null, null, 0, compositeClauseB != null ? new RowDelegate.Model.c.b(compositeClauseB, null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        m6 m6Var = n6.Companion;
        return new cii.b(new aw0.h(false, m6.c(m6Var, new TextClause(cancel.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.perks_rewards_subscription_cancellation_cancel_cta_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "SECONDARY_BUTTON_LOADING_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 121), arrayList2, aVar2);
    }
}
