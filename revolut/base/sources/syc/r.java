package syc;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.SotDocumentListFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pyc.h0;
import pyc.t;
import te0.w;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends bsi.a implements m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.f f266659j;
    public final l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final pyc.h f266660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f266661m;

    public r(pyc.f presentationModel, l mapper, pyc.h router, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f266659j = presentationModel;
        this.k = mapper;
        this.f266660l = router;
        this.f266661m = progressView;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        Iterable documentGroups;
        DocumentType documentType;
        rri.a view = (n) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.b bVarSwitchMapCompletable = ((SelectableDelegate) ((SotDocumentListFragment) view).g0.getValue()).r().switchMapCompletable(new sx4.c(new sx8.a(this, 7), 4));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        ogm.i iVar = new ogm.i(new ry7.j(new BreadcrumbException(), 21), (byte) 0);
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, iVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        q function = q.f266658a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new ly7.g(17, this.i), new a1l.c(18));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
        ((p) this.k).getClass();
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.document_selection_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434);
        t tVar = (t) this.f266659j;
        IncomeSource incomeSource = (IncomeSource) ((od0.i) ((h0) tVar.f240799b).C0().get()).g();
        if (incomeSource == null || (documentGroups = incomeSource.e) == null) {
            documentGroups = f0.f322471a;
        }
        od0.i selectedGroup = (od0.i) ((h0) tVar.f240799b).F0().get();
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        Intrinsics.checkNotNullParameter(selectedGroup, "selectedGroup");
        Iterable<List> iterable = documentGroups;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        for (List list : iterable) {
            DocumentType documentType2 = (DocumentType) d0.b0(list);
            String strQ = j6.a.q("INCOME_SOURCE_LIST_ID", documentType2.f85860b);
            String strQ2 = j6.a.q("INCOME_SOURCE_ROW_LIST_ID", documentType2.f85860b);
            TextClause textClause = new TextClause(documentType2.f85860b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i = R$attr.uikit_dp0;
            RowDelegate.Model model2 = new RowDelegate.Model(strQ2, null, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, list, null, i, i, 0, 0, 482344954);
            String str = documentType2.f85859a;
            List list2 = (List) selectedGroup.g();
            arrayList.add(new SelectableDelegate.Model(strQ, model2, Intrinsics.f(str, (list2 == null || (documentType = (DocumentType) d0.d0(list2)) == null) ? null : documentType.f85859a), null, null, 131064));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        ((BaseLayoutBuilderFragment) view).setItems(ue0.e.J(model, arrayList));
    }
}
