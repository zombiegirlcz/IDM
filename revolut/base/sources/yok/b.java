package yok;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qc0.e1;
import skm.e0;
import skm.p0;
import vkm.y;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements tla.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f315690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qie.f f315691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f315692c;
    public final ResourceImage d;

    public b(gte.a featureToggleInteractor, qie.f tabCreditVisibilityPreferences) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tabCreditVisibilityPreferences, "tabCreditVisibilityPreferences");
        this.f315690a = featureToggleInteractor;
        this.f315691b = tabCreditVisibilityPreferences;
        this.f315692c = new TextLocalisedClause(R$string.profileHome_settings_item_credit_tab_title, null, null, 14);
        this.d = new ResourceImage(R$drawable.uikit_icn_24_credit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    @Override // tla.a
    public final Flow a() {
        return new go.g(Boolean.valueOf(((jte.d) this.f315690a).c(TabCreditApi$Toggles$CreditTab.f89768c)), 2);
    }

    @Override // tla.a
    public final Object b(boolean z, e1 e1Var) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new mt8.b(this.f315691b, z, null, 5), e1Var);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    @Override // tla.a
    public final y c() {
        return this.f315691b.b();
    }

    @Override // tla.a
    public final TextLocalisedClause d(boolean z) {
        return new TextLocalisedClause(z ? R$string.profileHome_settings_item_credit_tab_visible : R$string.profileHome_settings_item_credit_tab_hidden, null, null, 14);
    }

    @Override // tla.a
    public final ResourceImage getIcon() {
        return this.d;
    }

    @Override // tla.a
    public final String getId() {
        return "credit";
    }

    @Override // tla.a
    public final TextLocalisedClause getTitle() {
        return this.f315692c;
    }
}
