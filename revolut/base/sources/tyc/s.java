package tyc;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.document.other.SotOtherDocumentFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pyc.h0;
import pyc.t;
import te0.w;
import tx0.p4;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.f f275552j;
    public final n k;

    public s(pyc.f presentationModel, n mapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f275552j = presentationModel;
        this.k = mapper;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (o) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        String str = (String) ((od0.i) ((h0) ((t) this.f275552j).f240799b).H0().get()).g();
        if (str == null) {
            str = "";
        }
        String text = str;
        ((q) this.k).getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        TextClause textClause = new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sot_source_create_source, null, null, 14);
        int i = R$attr.uikit_dp4;
        InputTextDelegate.Model model = new InputTextDelegate.Model("USER_TYPE_INPUT_TEXT_ID", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i, i, -49160, 16383);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ((BaseLayoutBuilderFragment) view).setItems(u.c(model));
        efm.r map = ((InputTextDelegate) ((SotOtherDocumentFragment) view).f0.getValue()).e.f121375b.map(new ty1.c(new tx.f(23), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarSwitchMapCompletable = map.switchMapCompletable(new ty1.c(new p4(this, 5), 12));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        tsk.t tVar = new tsk.t(new t33.r(new BreadcrumbException(), 20));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, tVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        r function = r.f275551a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new o9h.d(19, this.i), new a1l.c(19));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
