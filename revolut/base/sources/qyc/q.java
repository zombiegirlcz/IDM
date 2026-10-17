package qyc;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.description.AddDescriptionFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import pyc.h0;
import pyc.t;
import qp5.x;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends bsi.a implements b {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.f f250280j;

    public q(pyc.f presentationModel, t70.g localization) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f250280j = presentationModel;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextClause textClause = new TextClause((String) ((h0) ((t) this.f250280j).f240799b).y0().get(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sot_source_create_source, null, null, 14);
        int i = R$attr.uikit_dp4;
        InputTextDelegate.Model model = new InputTextDelegate.Model("DESCRIPTION_INPUT_TEXT_ID", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i, i, -49160, 16383);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ((BaseLayoutBuilderFragment) view).setItems(u.c(model));
        r map = ((InputTextDelegate) ((AddDescriptionFragment) view).f0.getValue()).e.f121375b.map(new qsa.a(20, new qwd.o(29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        qtb.c cVar = new qtb.c(this, 16);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new ogm.i(new x(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(13, cVar), new ly7.g(13, this.i), new z(23, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
