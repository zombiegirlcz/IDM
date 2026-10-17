package tzc;

import akl.s;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sow.impl.ui.description.SowDescriptionFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import t1i.n;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f275920j;
    public final ozc.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f275921l;

    public j(ozc.d presentationModel, ozc.f router, b mapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f275920j = presentationModel;
        this.k = router;
        this.f275921l = mapper;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f275920j;
        String text = (String) ((s0) tVar.f231329b).B0().get();
        ((f) this.f275921l).getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        TextClause textClause = new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sow_source_create_source, null, null, 14);
        int i = R$attr.uikit_dp4;
        InputTextDelegate.Model model = new InputTextDelegate.Model("DESCRIPTION_INPUT_TEXT_ID", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i, i, -49160, 16383);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ((BaseLayoutBuilderFragment) view).setItems(u.c(model));
        r map = ((InputTextDelegate) ((SowDescriptionFragment) view).f0.getValue()).e.f121375b.map(new ty1.c(new tyg.g(5), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarSwitchMapCompletable = map.switchMapCompletable(new ty1.c(new g(this, 0), 22));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        ly7.g gVar = new ly7.g(20, new t33.r(new BreadcrumbException(), 22));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        n nVar = new n(5, h.f275918a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new n1i.b(19, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = tVar.w3().switchMapCompletable(new ty1.c(new g(this, 1), 23));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        ly7.g gVar2 = new ly7.g(20, new t33.r(new BreadcrumbException(), 23));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(19, sVar), new n(5, i.f275919a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
