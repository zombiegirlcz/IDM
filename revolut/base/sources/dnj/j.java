package dnj;

import aw0.n6;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreenContract$InputData;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimAlreadyInstalledBottomSheetScreenContract$InputData f116354a;

    public j(EsimAlreadyInstalledBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f116354a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_refund_reason_esim_installed_title, null, null, 14), null, null, null, false, 30);
        List listC = u.c(new TextDelegate.Model("ID_ESIM_ACTIVATION", new TextLocalisedClause(R$string.esim_refund_continue_with_refund_subtitle, u.c(new TextLocalisedClause(R$string.esim_refund_continue_with_refund_subtitle_link, null, new Click(30, (Integer) null, (Object) null, "ID_ESIM_ACTIVATION", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
        int i = i.f116353a[this.f116354a.f101435a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_refund_reason_continue_with_refund_action, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_bottom_sheet_cta_proceed, null, null, 14);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listC, aVar);
    }
}
