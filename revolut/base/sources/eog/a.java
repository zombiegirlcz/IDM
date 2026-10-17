package eog;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jbi.i;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127905a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f127906b;

    public /* synthetic */ a(Set set) {
        this.f127906b = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object content, Object obj2, Object obj3) {
        List listC;
        switch (this.f127905a) {
            case 0:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List list = content instanceof List ? (List) content : null;
                if (list == null) {
                    list = f0.f322471a;
                }
                List<c> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (c cVar : list2) {
                    gog.b bVar = cVar.f127908a;
                    arrayList.add(new RowDelegate.Model(bVar.name(), null, new TextLocalisedClause(bVar.a(), (List) null, (Style) null, (Clause) null, 30), null, 0, null, null, null, 0, null, false, null, this.f127906b.contains(bVar.name()), null, null, null, null, null, null, cVar.f127908a, null, 0, 0, 0, 0, 532668410));
                }
                return arrayList;
            default:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof jbi.a) {
                    List list3 = ((jbi.a) content).f172636a;
                    if (list3.isEmpty()) {
                        listC = u.c(new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", new TextLocalisedClause(R$string.search_empty_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, null, new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.onboarding_employer_selection_enter_manually, null, null, 14), false, null, null, false, R$attr.uikit_dp8, 0, 30684));
                    } else {
                        e eVarB = u.b();
                        eVarB.add(new SingleChoiceDelegate.Model("EMPLOYER_NOT_HERE_ID", new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.onboarding_employer_selection_employer_not_here, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), false, null, null, 2040));
                        List<String> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        for (String str : list4) {
                            arrayList2.add(new SingleChoiceDelegate.Model(str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), this.f127906b.contains(str), null, null, 2040));
                        }
                        eVarB.addAll(arrayList2);
                        listC = u.a(eVarB);
                    }
                } else {
                    listC = u.c(new FullScreenStateDelegate.Model("SEARCH_RESULT_PLACEHOLDER_ID", new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.onboarding_employer_selection_search_initial_placeholder, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, null, null, false, null, null, false, R$attr.uikit_dp8, 0, 30716));
                }
                List list5 = listC;
                yp0.b.k(list5, 0, 0, 0, 0, 31);
                return list5;
        }
    }

    public /* synthetic */ a(i iVar, Set set) {
        this.f127906b = set;
    }
}
