package b0d;

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
import gzc.l;
import gzc.m;
import ip0.iq;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ozc.k;
import ozc.s0;
import ozc.t;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11653b;

    public /* synthetic */ g(i iVar, int i) {
        this.f11652a = i;
        this.f11653b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f11652a) {
            case 0:
                InputChecklistDelegate.Model frequencyInput = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(frequencyInput, "selected");
                i iVar = this.f11653b;
                ozc.d dVar = iVar.f11655j;
                ((k) iVar.k).getClass();
                Intrinsics.checkNotNullParameter(frequencyInput, "frequencyInput");
                Object obj3 = frequencyInput.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj3;
                Clause clause = frequencyInput.f52520b;
                TextClause textClause = clause instanceof TextClause ? (TextClause) clause : null;
                String str2 = textClause != null ? textClause.f57936a : null;
                b frequency = new b(str, str2);
                t tVar = (t) dVar;
                ozc.g gVar = tVar.f231329b;
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                s0 s0Var = (s0) gVar;
                pfm.a aVarE = tVar.j3(str2 == null ? "" : str2).e(w.A0(s0Var.M0(), str));
                te0.e eVarL0 = s0Var.L0();
                od0.i.Companion.getClass();
                pfm.a aVarE2 = aVarE.e(w.z0(eVarL0, od0.h.a(str2)));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2.e(((qri.b) iVar.f11656l).m());
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                String str3 = (String) ((od0.i) pair.f186386b).g();
                c cVar = this.f11653b.k;
                if (data.getContent() == null) {
                    if (!data.getLoading()) {
                        return f0.f322471a;
                    }
                    IntRange intRange = new IntRange(0, 7, 1);
                    ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                    vim.f it8 = intRange.iterator();
                    while (it8.f289625c) {
                        arrayList.add(new pb0(a0.d.n("LOADING_ITEM_LIST_ID", it8.nextInt())));
                    }
                    return arrayList;
                }
                Object content = data.getContent();
                Intrinsics.h(content);
                l lVar = (l) content;
                ((k) cVar).getClass();
                List listC = u.c(new ListSubheaderDelegate.Model("HEADER_SELECT_FREQUENCY_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.sof_periods_picker_section_title, null, null, 14), (ResourceImage) null, false, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
                ArrayList<m> incomeFrequencies = lVar.f148010b;
                if (str3 == null) {
                    str3 = lVar.f148009a.f148011a;
                }
                Intrinsics.checkNotNullParameter(incomeFrequencies, "incomeFrequencies");
                ArrayList arrayList2 = new ArrayList(zhm.w.t(incomeFrequencies, 10));
                for (m mVar : incomeFrequencies) {
                    arrayList2.add(new InputChecklistDelegate.Model(j6.a.q("SELECTABLE_EVIDENCE_SUBTYPE_LIST_ITEM_ID", mVar.f148011a), new TextClause(mVar.f148012b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(str3, mVar.f148011a), false, null, iq.RADIO_BUTTON, null, null, mVar.f148011a, null, 0, 0, 0, 523992));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return d0.E0(arrayList2, listC);
            default:
                List list = (List) obj2;
                rri.a aVar = (e) this.f11653b.L();
                if (aVar != null) {
                    Intrinsics.h(list);
                    ((BaseLayoutBuilderFragment) aVar).setItems(list);
                }
                return Unit.f186387a;
        }
    }
}
