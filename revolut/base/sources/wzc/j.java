package wzc;

import akl.s;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sow.impl.ui.document.list.SowDocumentListFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ozc.t;
import t1i.n;
import te0.w;
import wrj.p;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f301411j;
    public final ozc.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f301412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f301413m;

    public j(ozc.d presentationModel, ozc.f router, b mapper, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f301411j = presentationModel;
        this.k = router;
        this.f301412l = mapper;
        this.f301413m = progressView;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        gzc.i iVar;
        rri.a view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.b bVarSwitchMapCompletable = ((InputChecklistDelegate) ((SowDocumentListFragment) view).f0.getValue()).f52518c.switchMapCompletable(new wx9.b(new g(this, 0), 7));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        o9h.d dVar = new o9h.d(27, new p(new BreadcrumbException(), 7));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        n nVar = new n(17, h.f301409a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new nw8.d(20, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        t tVar = (t) this.f301411j;
        efm.b bVarSwitchMapCompletable2 = tVar.w3().switchMapCompletable(new wx9.b(new g(this, 1), 8));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        o9h.d dVar2 = new o9h.d(27, new p(new BreadcrumbException(), 8));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(20, sVar), new n(17, i.f301410a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        ((f) this.f301412l).getClass();
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.document_selection_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434);
        ArrayList<List> documentGroups = ((gzc.n) tVar.r3().c()).f;
        od0.i selectedGroup = tVar.q3();
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        Intrinsics.checkNotNullParameter(selectedGroup, "selectedGroup");
        ArrayList arrayList = new ArrayList(zhm.w.t(documentGroups, 10));
        for (List list : documentGroups) {
            gzc.i iVar2 = (gzc.i) d0.b0(list);
            String strQ = j6.a.q("INCOME_SOURCE_LIST_ID", iVar2.f148004b);
            iq iqVar = iq.RADIO_BUTTON;
            TextClause textClause = new TextClause(iVar2.f148004b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = iVar2.f148003a;
            List list2 = (List) selectedGroup.g();
            arrayList.add(new InputChecklistDelegate.Model(strQ, textClause, Intrinsics.f(str, (list2 == null || (iVar = (gzc.i) d0.d0(list2)) == null) ? null : iVar.f148003a), false, null, iqVar, null, null, list, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        ((BaseLayoutBuilderFragment) view).setItems(ue0.e.J(model, arrayList));
    }
}
