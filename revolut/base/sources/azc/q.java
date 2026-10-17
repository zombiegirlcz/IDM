package azc;

import a08.s;
import au6.z0;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.note.AddNoteFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pyc.h0;
import pyc.t;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends bsi.a implements b {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.f f11438j;

    public q(pyc.f presentationModel, t70.g localization) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f11438j = presentationModel;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f11438j;
        String strL = m70.a.l((String) ((h0) tVar.f240799b).D0().get());
        if (strL == null) {
            strL = (String) ((h0) tVar.f240799b).A0().get();
        }
        TextClause textClause = new TextClause(strL, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sot_note_caption, null, null, 14);
        int i = R$attr.uikit_dp4;
        InputTextDelegate.Model model = new InputTextDelegate.Model("NOTE_INPUT_TEXT_ID", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i, i, -49160, 16383);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ((BaseLayoutBuilderFragment) view).setItems(u.c(model));
        r map = ((InputTextDelegate) ((AddNoteFragment) view).f0.getValue()).e.f121375b.map(new z0(new ax9.a(24), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        auj.o oVar = new auj.o(this, 24);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o7.d(new a2i.j(new BreadcrumbException(), 22), (byte) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new s(3, oVar), new s(3, this.i), new a08.q(7, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
