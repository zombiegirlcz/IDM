package a0d;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import gzc.n;
import ip0.dg;
import ip0.iq;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ozc.t;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f323b;

    public /* synthetic */ e(k kVar, int i) {
        this.f322a = i;
        this.f323b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f322a) {
            case 0:
                dg model = (dg) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f163888a, "ERROR_ITEM_LIST_ID")) {
                    return this.f323b.Q();
                }
                throw new UnsupportedOperationException(j6.a.q("No click handler found for the item listId=", model.f163888a));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qri.b) this.f323b.f331l).m();
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                n nVar = (n) ((od0.i) pair.f186386b).g();
                String str = nVar != null ? nVar.f148015b : null;
                k kVar = this.f323b;
                ozc.a aVar = kVar.k;
                if (data.getContent() == null) {
                    if (!data.getLoading()) {
                        gom.e.f145194a.e(data.getError());
                        return ((mxc.c) kVar.f332m).a();
                    }
                    IntRange intRange = new IntRange(0, 7, 1);
                    ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                    vim.f it9 = intRange.iterator();
                    while (it9.f289625c) {
                        arrayList.add(new pb0(a0.d.n("LOADING_ITEM_LIST_ID", it9.nextInt())));
                    }
                    return arrayList;
                }
                Object content = data.getContent();
                Intrinsics.h(content);
                List incomeSources = (List) content;
                ((ozc.k) aVar).getClass();
                List listC = u.c(new ListSubheaderDelegate.Model("HEADER_SOURCES_OF_INCOME_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.sow_source_section_title, null, null, 14), (ResourceImage) null, false, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
                Intrinsics.checkNotNullParameter(incomeSources, "incomeSources");
                List<n> list = incomeSources;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (n nVar2 : list) {
                    arrayList2.add(new InputChecklistDelegate.Model(j6.a.q("SELECTABLE_EVIDENCE_TYPE_LIST_ITEM_ID", nVar2.f148015b), new TextClause(nVar2.f148014a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(nVar2.f148015b, str), false, null, iq.RADIO_BUTTON, null, null, nVar2, null, 0, 0, 0, 523992));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return d0.E0(arrayList2, listC);
            case 3:
                List list2 = (List) obj2;
                rri.a aVar2 = (c) this.f323b.L();
                if (aVar2 != null) {
                    Intrinsics.h(list2);
                    ((BaseLayoutBuilderFragment) aVar2).setItems(list2);
                }
                return Unit.f186387a;
            default:
                InputChecklistDelegate.Model selection = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(selection, "selection");
                Object obj3 = selection.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.selfserve.sow.api.models.IncomeSource");
                n nVar3 = (n) obj3;
                ArrayList arrayList3 = nVar3.f;
                int size = arrayList3.size();
                k kVar2 = this.f323b;
                if (size != 1) {
                    return kVar2.R(nVar3);
                }
                pfm.a aVarE = ((t) kVar2.f330j).B3(nVar3, (List) d0.b0(arrayList3)).e(kVar2.R(nVar3));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return mo3.a.u(o70.a.g(aVarE), kVar2.f333n, true);
        }
    }
}
