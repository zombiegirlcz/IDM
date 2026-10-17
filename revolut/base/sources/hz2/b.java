package hz2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardIssuanceAgreementsScreenContract$InputData f156986a;

    public b(CardIssuanceAgreementsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f156986a = inputData;
    }

    public static List a() {
        return zhm.u.c(new FullScreenStateDelegate.Model("ERROR_ITEM_ID", null, new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, true, 0, 0, 31698));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f156996a, new hy2.k(this, 10), new hy2.b(this), new hnc.a(this, 6));
    }
}
