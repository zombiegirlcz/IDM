package hmc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements dlc.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f153653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f153654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f153655c;
    public final k d;
    public final gte.a e;

    public o(n templateChangeRequestedCellMapper, j changeTemplateCellBuilder, m retakeAssessmentCellBuilder, k closeAccountCellBuilder, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(templateChangeRequestedCellMapper, "templateChangeRequestedCellMapper");
        Intrinsics.checkNotNullParameter(changeTemplateCellBuilder, "changeTemplateCellBuilder");
        Intrinsics.checkNotNullParameter(retakeAssessmentCellBuilder, "retakeAssessmentCellBuilder");
        Intrinsics.checkNotNullParameter(closeAccountCellBuilder, "closeAccountCellBuilder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153653a = templateChangeRequestedCellMapper;
        this.f153654b = changeTemplateCellBuilder;
        this.f153655c = retakeAssessmentCellBuilder;
        this.d = closeAccountCellBuilder;
        this.e = featureToggleInteractor;
    }

    public final ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("robo-header-list-id", (Image) null, (Clause) new TextLocalisedClause(((jte.d) this.e).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.accountHome_tab_strategies_title : R$string.accountHome_tab_robo_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp16, 0, 0, 57338);
    }
}
