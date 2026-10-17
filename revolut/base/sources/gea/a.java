package gea;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import wda.d;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C0827a Companion = new C0827a();

    /* JADX INFO: renamed from: gea.a$a, reason: collision with other inner class name */
    public static final class C0827a {
        private C0827a() {
        }
    }

    public static j0 a(boolean z) {
        return new j0((Clause) new TextLocalisedClause(z ? R$string.revolut_accounts_account_details_section_change_state_action_status_account_activated : R$string.revolut_accounts_account_details_section_change_state_action_status_account_deactivated, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }

    public static y b(d popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        t tVar = new t(new TextClause(popup.f296474a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ifk.b.K("ID_CLAUSE_ITEM", popup.f296475b, popup.f296476c), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14);
        LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain plain = LargeActionButton.ButtonStyle.e;
        int i = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("ID_GOT_IT_BTN", plain, null, textLocalisedClause, false, null, null, 0, R$attr.uikit_dp8, i, i, 1008)), tVar, null, null, null, null, 1020);
    }
}
