package db4;

import cli.k;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ft3.j1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.m;
import rp0.t;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends oki.h implements c {

    @NotNull
    public static final g Companion = new g();
    public final ExpiredPopupControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f112667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c84.b f112668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f112669r;

    public i(ExpiredPopupControllerContract$InputData inputData, j60.a bottomDialogExtension, c84.b analyticsPluginScreenControllerModelExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(analyticsPluginScreenControllerModelExtension, "analyticsPluginScreenControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f112667p = bottomDialogExtension;
        this.f112668q = analyticsPluginScreenControllerModelExtension;
        this.f112669r = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        j60.a aVar = this.f112667p;
        l.a1(this, rd0.e.b(aVar.E()), null, null, new co7.c(this, null, 24), 3);
        m.b bVar = m.Companion;
        t tVar = new t(new TextLocalisedClause(R$string.credit_application_expired_dialog_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_expired_dialog_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BUTTON_START_NEW_APPLICATION", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_application_expired_dialog_button_primary, null, null, 14), false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = this.o.f67654a;
        if (creditApplicationPluginFlowContract$Configuration.d == j1.CREDIT_CARD_LIMIT_DECREASE && creditApplicationPluginFlowContract$Configuration.e == gt3.b.USER_INITIATED) {
            model = null;
        }
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.credit_application_expired_dialog_button_secondary, null, null, 14), false, null, null, 0, R$attr.uikit_dp16, 0, 0, 7152);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        LargeActionButtonDelegate.Model[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        aVar.x(dy4.b.b(bVar, kotlin.collections.d.L(elements), tVar, null, "EXPIRED_DELEGATES_KEY", this.f112668q.f22074l, null, 636));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112669r;
    }
}
