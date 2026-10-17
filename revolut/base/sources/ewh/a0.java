package ewh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_autoinvest_api.R$string;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveScreenContract$InputData;
import eu4.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f130263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoInvestMoveScreenContract$InputData f130264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f130265c;

    public a0(d itemMapper, AutoInvestMoveScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f130263a = itemMapper;
        this.f130264b = inputData;
        this.f130265c = featureToggleInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("MOVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.auto_invest_common_action_move, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.auto_invest_common_action_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        qv0.i[] elements = {iii.c.f(domainState.f130267a, new eu7.c(this, 15), new b0(29), new w(this, 0)), model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new p(kotlin.collections.d.L(elements), (lw0.m) iii.c.f(domainState.f130267a, new x(0), new y(0), new a0i.a(this, 15, this.f130264b.f96625b, domainState.f130268b)));
    }
}
