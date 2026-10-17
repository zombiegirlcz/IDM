package y7d;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.faq.domain.model.ai.SearchResult;
import com.revolut.core.faq.domain.model.ai.Summarisation;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.shared.help_centre.impl.R$string;
import ip0.ug0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import mx0.s5;
import mx0.u5;
import mx0.v5;
import org.jmrtd.lds.LDSFile;
import qv0.c;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8d.f f311489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8d.d f311490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lde.n f311491c;
    public final Set d;

    public t(a8d.f askAiScreenErrorMapper, a8d.d askAiScreenContentMapper, lde.n sharedHelpWidgetsInteractor) {
        Intrinsics.checkNotNullParameter(askAiScreenErrorMapper, "askAiScreenErrorMapper");
        Intrinsics.checkNotNullParameter(askAiScreenContentMapper, "askAiScreenContentMapper");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f311489a = askAiScreenErrorMapper;
        this.f311490b = askAiScreenContentMapper;
        this.f311491c = sharedHelpWidgetsInteractor;
        k[] elements = {k.ENTRY, k.THINKING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        o oVar;
        q qVar;
        boolean z;
        k kVar;
        int i;
        List listE0;
        TextLocalisedClause textLocalisedClause;
        AnalyticsContext analyticsContext;
        AnalyticsContext analyticsContext2;
        ArrayList arrayList;
        Summarisation summarisation;
        Summarisation summarisation2;
        ArrayList arrayList2;
        Iterable iterableA;
        l domainState = (l) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lde.n nVar = this.f311491c;
        k7d.a aVarA = nVar.a();
        int[] iArr = s.f311487a;
        int i2 = iArr[aVarA.ordinal()];
        if (i2 == 1) {
            oVar = domainState.f311474c == k.ENTRY ? o.TOP_TO_BOTTOM_WITH_DELAY : o.TOP_TO_BOTTOM;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unexpected search mode: " + aVarA);
            }
            oVar = this.d.contains(domainState.f311474c) ? o.BOTTOM_TO_TOP_WITH_DELAY : o.TOP_TO_BOTTOM;
        }
        o oVar2 = oVar;
        Data data = domainState.i;
        boolean z3 = domainState.f311476h;
        String str = domainState.f311472a;
        SearchResult searchResult = domainState.d;
        k kVar2 = domainState.f311474c;
        boolean z4 = kVar2 == k.THINKING && nVar.a() == k7d.a.AiV2;
        k7d.a aVarA2 = nVar.a();
        int i3 = iArr[aVarA2.ordinal()];
        if (i3 == 1) {
            qVar = q.TOP;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unexpected search mode: " + aVarA2);
            }
            qVar = q.BOTTOM;
        }
        p pVar = new p(qVar, str);
        int i5 = s.f311488b[kVar2.ordinal()];
        ArrayList arrayList3 = null;
        if (i5 != 1) {
            if (i5 == 2) {
                z = z3;
                kVar = kVar2;
                if (nVar.a() == k7d.a.AiV3) {
                    Intrinsics.checkNotNullParameter("THINKING_ITEM_ID", "listId");
                    int i6 = R$attr.uikit_dp16;
                    ug0 ug0Var = new ug0();
                    ug0Var.f166660a = c.d.f249513a;
                    ug0Var.f166661b = null;
                    ug0Var.f166662c = null;
                    ug0Var.d = null;
                    ug0Var.e = null;
                    ug0Var.f = i6;
                    ug0Var.f166663g = i6;
                    ug0Var.f166664h = i6;
                    ug0Var.i = i6;
                    List listC = zhm.u.c(ug0Var);
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    listE0 = listC;
                } else {
                    listE0 = f0.f322471a;
                }
            } else if (i5 == 3) {
                z = z3;
                kVar = kVar2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                aim.e eVarB = zhm.u.b();
                Regex regex = p9d.g.f234298a;
                String originHtml = domainState.f;
                Intrinsics.checkNotNullParameter(originHtml, "originHtml");
                HtmlClause htmlClause = new HtmlClause(0, 14, (Integer) null, a8d.c.f2179a, p9d.g.f234298a.replace(originHtml, p9d.g.f234299b));
                v5 u5Var = domainState.f311475g ? new u5(2, new TextLocalisedClause(R$string.help_center_ask_ai_content_collapse, null, null, 14)) : new s5(15, new TextLocalisedClause(R$string.help_center_ask_ai_content_expand, null, null, 14));
                String str2 = domainState.f311472a;
                String str3 = searchResult != null ? searchResult.f51382a : null;
                if (searchResult != null) {
                    ArrayList arrayList4 = searchResult.f51384c;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                    Iterator it8 = arrayList4.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(((FaqMetaData) it8.next()).f51419a);
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                eVarB.add(new PlainTextDelegate.Model("ask_ai_content_state_content_list_id", (Clause) null, (Clause) htmlClause, u5Var, (UrlImage) null, false, (pa) null, (Object) null, new AnalyticsContext(l7d.a.a(str2, str3, null, null, arrayList2, null, null, Boolean.valueOf(data.getContent() != null), Boolean.valueOf(z), LDSFile.EF_DG12_TAG)), R$attr.uikit_dp16, (data.getContent() == null || !z) ? R$attr.uikit_dp16 : R$attr.uikit_dp0, 0, 0, 51150));
                eVarB.addAll(!z ? f0.f322471a : (List) iii.c.f(data, new a82.l(14), new a5g.l(24), new a15.n(this.f311490b, domainState, 8)));
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                if (z) {
                    x7d.a aVar = new x7d.a(str, searchResult != null ? searchResult.f51382a : null);
                    List list = searchResult != null ? searchResult.f51384c : null;
                    if (list == null) {
                        list = f0.f322471a;
                    }
                    iterableA = a8d.a.a(list, aVar);
                } else {
                    iterableA = f0.f322471a;
                }
                listE0 = d0.E0(iterableA, eVarA);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                listE0 = new ArrayList();
                AnalyticsContext analyticsContext3 = new AnalyticsContext(l7d.a.a(domainState.f311472a, searchResult != null ? searchResult.f51382a : null, null, null, null, null, null, null, null, 508));
                PlainTextDelegate.Model model = new PlainTextDelegate.Model("NOTIFICATION_ITEM_ID", (UrlImage) null, (Clause) null, new TextLocalisedClause(R$string.help_center_ask_ai_content_error_text, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, R$attr.uikit_dp0, 0, 0, 28650);
                z = z3;
                kVar = kVar2;
                List listC2 = zhm.u.c(new TextLocalisedClause(R$string.help_center_common_error_action_try_again, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10));
                m70.a.t(t0.f186434a);
                List listK = zhm.v.k(model, new PlainTextDelegate.Model("TRY_AGAIN_ITEM_ID", (UrlImage) null, (Clause) null, new CompositeClause(listC2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "TRY_AGAIN_ITEM_ID", false), null, 8), (v5) null, (List) null, (String) null, (Object) null, analyticsContext3, 0, 0, 0, 0, 31722));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                zhm.a0.x(listK, listE0);
                x7d.a aVar2 = new x7d.a(str, searchResult != null ? searchResult.f51382a : null);
                List list2 = searchResult != null ? searchResult.f51384c : f0.f322471a;
                zhm.a0.x(a8d.a.a(list2, aVar2), listE0);
                if (list2.isEmpty()) {
                    Data data2 = domainState.e;
                    a8d.f fVar = this.f311489a;
                    zhm.a0.x((List) iii.c.f(data2, new a82.l(fVar, 15), new a5g.l(25), new a15.n(fVar, aVar2, 9)), listE0);
                }
            }
            i = 1;
        } else {
            z = z3;
            kVar = kVar2;
            i = 1;
            listE0 = (List) iii.c.f(domainState.f311473b, new y66.p(11), new y65.n(6), new y66.q(this, domainState, i));
        }
        int[] iArr2 = s.f311488b;
        int i21 = iArr2[kVar.ordinal()];
        if (i21 == i) {
            textLocalisedClause = new TextLocalisedClause(R$string.help_center_ask_ai_entrypoint_accessibility_label, null, null, 14);
        } else if (i21 == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.help_center_ask_ai_in_progress_accessibility_label, null, null, 14);
        } else if (i21 == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.help_center_ask_ai_results_successfull_accessibility_label, null, null, 14);
        } else {
            if (i21 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = searchResult == null ? new TextLocalisedClause(R$string.help_center_ask_ai_total_failure_accessibility_label, null, null, 14) : new TextLocalisedClause(R$string.help_center_ask_ai_llm_failure_accessibility_label, null, null, 14);
        }
        long j2 = domainState.f311477j;
        int i22 = iArr2[kVar.ordinal()];
        if (i22 != 1) {
            if (i22 == 2) {
                analyticsContext2 = new AnalyticsContext(l7d.a.a(domainState.f311472a, null, null, null, null, null, null, null, null, 510));
            } else if (i22 == 3) {
                String str4 = domainState.f311472a;
                String str5 = searchResult != null ? searchResult.f51382a : null;
                if (searchResult != null) {
                    ArrayList arrayList6 = searchResult.f51384c;
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                    Iterator it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        arrayList7.add(((FaqMetaData) it9.next()).f51419a);
                    }
                    arrayList = arrayList7;
                } else {
                    arrayList = null;
                }
                String str6 = (searchResult == null || (summarisation2 = searchResult.d) == null) ? null : summarisation2.f51385a;
                String str7 = (searchResult == null || (summarisation = searchResult.d) == null) ? null : summarisation.f51386b;
                Object content = data.getContent();
                Feedback.INSTANCE.getClass();
                analyticsContext2 = new AnalyticsContext(l7d.a.a(str4, str5, null, null, arrayList, str6, str7, Boolean.valueOf(Intrinsics.f(content, Feedback.f73124g)), Boolean.valueOf(z), 12));
            } else {
                if (i22 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                String str8 = domainState.f311472a;
                String str9 = searchResult != null ? searchResult.f51382a : null;
                if (searchResult != null) {
                    ArrayList arrayList8 = searchResult.f51384c;
                    arrayList3 = new ArrayList(zhm.w.t(arrayList8, 10));
                    Iterator it10 = arrayList8.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(((FaqMetaData) it10.next()).f51419a);
                    }
                }
                analyticsContext2 = new AnalyticsContext(l7d.a.a(str8, str9, null, null, arrayList3, null, null, null, null, 492));
            }
            analyticsContext = analyticsContext2;
        } else {
            analyticsContext = null;
        }
        return new r(oVar2, z4, pVar, listE0, analyticsContext, textLocalisedClause, j2);
    }
}
