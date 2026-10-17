package v84;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ip0.z;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtDetailsScreenContract$InputData f286716a;

    public j(DebtDetailsScreenContract$InputData inputData, z84.a mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f286716a = inputData;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        pu3.b bVar = this.f286716a.f67440a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(cp5.c.w(bVar.c4()), null, null, 14);
        TextClause textClause = new TextClause(bVar.P5(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LayeredImage layeredImageA = z84.a.a(cp5.c.r(bVar.c4()));
        List listC = u.c(new z("ID_ACTIONS_ITEM", u.c(new ActionsView.Item("ACTION_DELETE", null, false, null, null, new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_delete, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)), true, R$attr.uikit_dp0, R$attr.uikit_dp8, 52));
        List listK = v.k(new CellDetailsDelegate.Model("ID_PROVIDER_ITEM", new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_provider, null, null, 14), new TextClause(bVar.P5(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_VALUE_ITEM", new TextLocalisedClause(cp5.c.x(cp5.c.y(bVar.c4())), null, null, 14), new MoneyClause(bVar.getValue(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new f(d0.E0(listK, listC), textLocalisedClause, textClause, layeredImageA);
    }
}
