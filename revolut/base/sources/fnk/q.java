package fnk;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreenContract$InputData;
import fk4.r;
import fmc.z;
import ip0.zj;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPreviewScreenContract$InputData f136717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f136718b;

    public q(PlanPreviewScreenContract$InputData inputData, z viewModelsMapper, gnk.d configurationMapper, gnk.a footerTermsClauseMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(viewModelsMapper, "viewModelsMapper");
        Intrinsics.checkNotNullParameter(configurationMapper, "configurationMapper");
        Intrinsics.checkNotNullParameter(footerTermsClauseMapper, "footerTermsClauseMapper");
        this.f136717a = inputData;
        this.f136718b = viewModelsMapper;
    }

    public static k a(Function1 function1) {
        List list;
        if (function1 == null || (list = (List) function1.invoke(new iii.d(12, null, true, true, null))) == null) {
            List listC = u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31172));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
        }
        return new k(null, null, null, list);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(t1.t(domainState.f136697a, domainState.f136698b), new fkh.f(this, 28), new r(this, 22), new o(this, 0));
    }
}
