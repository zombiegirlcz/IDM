package xzc;

import akl.s;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sow.impl.ui.document.other.SowOtherDocumentFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import te0.w;
import xy7.j;
import xy7.l;
import xy7.n;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f309925j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f309926l;

    public i(ozc.d presentationModel, b mapper, ozc.f router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f309925j = presentationModel;
        this.k = mapper;
        this.f309926l = router;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f309925j;
        String str = (String) ((od0.i) ((s0) tVar.f231329b).O0().get()).g();
        if (str == null) {
            str = "";
        }
        String text = str;
        ((e) this.k).getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        TextClause textClause = new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sot_source_create_source, null, null, 14);
        int i = R$attr.uikit_dp4;
        InputTextDelegate.Model model = new InputTextDelegate.Model("USER_TYPE_INPUT_TEXT_ID", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i, i, -49160, 16383);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ((BaseLayoutBuilderFragment) view).setItems(u.c(model));
        r map = ((InputTextDelegate) ((SowOtherDocumentFragment) view).f0.getValue()).e.f121375b.map(new j(6, new xx9.f(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarSwitchMapCompletable = map.switchMapCompletable(new j(7, new f(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        l lVar = new l(1, new n(new BreadcrumbException(), 11));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, lVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        t1i.n nVar = new t1i.n(26, g.f309923a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new n1i.b(28, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = tVar.w3().switchMapCompletable(new j(8, new f(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        l lVar2 = new l(1, new n(new BreadcrumbException(), 12));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, lVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(28, sVar), new t1i.n(26, h.f309924a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
