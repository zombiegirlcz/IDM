package ozc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.network.models.topup.McyAllowedTravelCountries;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestinationBrief;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231298a;

    public /* synthetic */ n(int i) {
        this.f231298a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        gzc.a aVar;
        gzc.a aVar2;
        switch (this.f231298a) {
            case 0:
                od0.i type = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(type, "type");
                String str = (String) type.g();
                return str == null ? "" : str;
            case 1:
                od0.i document = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(document, "document");
                od0.h hVar = od0.i.Companion;
                Object objG = document.g();
                h0d.h hVar2 = objG instanceof h0d.h ? (h0d.h) objG : null;
                gzc.a aVar3 = hVar2 != null ? hVar2.d.f147997b.f : null;
                hVar.getClass();
                return od0.h.a(aVar3);
            case 2:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(it8, false, null, 3);
            case 3:
                return h30.l.q("documents", (od0.i) obj2);
            case 4:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                xi0.a aVar4 = xi0.b.Companion;
                String str2 = (String) it9.c();
                aVar4.getClass();
                return xi0.a.a(str2);
            case 5:
                gzc.n value = (gzc.n) obj2;
                Intrinsics.checkNotNullParameter(value, "value");
                return zi0.c.P(value, false, null, 3);
            case 6:
                vf0.e eVar = (vf0.e) obj2;
                Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                od0.i iVar = (od0.i) eVar.f288410a;
                long jLongValue = ((Number) eVar.f288411b).longValue();
                od0.i iVar2 = (od0.i) eVar.f288412c;
                od0.i iVar3 = (od0.i) eVar.d;
                od0.i iVar4 = (od0.i) eVar.e;
                String str3 = (String) eVar.f;
                String str4 = (String) eVar.f288413g;
                od0.i iVar5 = (od0.i) eVar.f288414h;
                List<f0d.d> list = (List) eVar.i;
                String str5 = ((gzc.n) iVar.c()).f148015b;
                gzc.k kVar = (gzc.k) iVar4.g();
                if (kVar == null) {
                    kVar = gzc.k.EXTERNAL;
                }
                String str6 = (String) iVar2.g();
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = (String) iVar3.g();
                String str8 = str7 == null ? "" : str7;
                gzc.q qVar = (gzc.q) iVar5.g();
                String str9 = (qVar == null || (aVar = qVar.f148030h) == null) ? null : aVar.f147985a;
                ArrayList arrayList = new ArrayList();
                for (f0d.d dVar : list) {
                    if (dVar.f131086c != f0d.e.EVIDENCE) {
                        dVar = null;
                    }
                    gzc.c cVar = dVar != null ? dVar.f131085b : null;
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((gzc.c) obj3).f147989b.length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                return new gzc.e(str5, kVar, jLongValue, str6, str8, str4, str3, str9, arrayList2);
            case 7:
                gzc.y config = (gzc.y) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return config.f148046c;
            case 8:
                od0.i submission = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(submission, "submission");
                od0.h hVar3 = od0.i.Companion;
                gzc.q qVar2 = (gzc.q) submission.g();
                String str10 = (qVar2 == null || (aVar2 = qVar2.f148030h) == null) ? null : aVar2.d;
                hVar3.getClass();
                return od0.h.a(str10);
            case 9:
                od0.i sourceType = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                return zi0.c.j(sourceType.c());
            case 10:
                List files = (List) obj2;
                Intrinsics.checkNotNullParameter(files, "files");
                return new c(!files.isEmpty(), new TextLocalisedClause(R$string.common_action_confirm, null, null, 14), 2);
            case 11:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!it10.isEmpty());
            case 12:
                k3l.j result = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return Boolean.valueOf(result instanceof k3l.g);
            case 13:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new c(true, it11.length() == 0 || it11.length() >= 3, (Clause) new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
            case 14:
                String it12 = (String) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new c(true, it12.length() >= 3, (Clause) new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
            case 15:
                String type2 = (String) obj2;
                Intrinsics.checkNotNullParameter(type2, "type");
                return new c(true, type2.length() > 0, (Clause) new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
            case 16:
                return h30.l.q("answer", (od0.i) obj2);
            case 17:
                List questions = (List) obj2;
                Intrinsics.checkNotNullParameter(questions, "questions");
                return Boolean.valueOf(!questions.isEmpty());
            case 18:
                return h30.l.q("question", (od0.i) obj2);
            case 19:
                List answers = (List) obj2;
                Intrinsics.checkNotNullParameter(answers, "answers");
                return Boolean.valueOf(!answers.isEmpty());
            case 20:
                Boolean isOtherSourceSelected = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOtherSourceSelected, "isOtherSourceSelected");
                return isOtherSourceSelected.booleanValue() ? h.DESCRIPTION : h.FREQUENCY;
            case 21:
                Boolean isOtherSourceSelected2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOtherSourceSelected2, "isOtherSourceSelected");
                return isOtherSourceSelected2.booleanValue() ? h.DESCRIPTION : h.EVIDENCE_TYPES;
            case 22:
                Boolean shouldVerifyIncomeDestination = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldVerifyIncomeDestination, "shouldVerifyIncomeDestination");
                return te0.w.f(shouldVerifyIncomeDestination.booleanValue() ? h.INCOME_DESTINATION : h.NOTE);
            case 23:
                Boolean shouldVerifyIncomeDestination2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldVerifyIncomeDestination2, "shouldVerifyIncomeDestination");
                return te0.w.f(shouldVerifyIncomeDestination2.booleanValue() ? h.INCOME_DESTINATION : h.EVIDENCE_LIST);
            case 24:
                od0.i incomeSource = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
                od0.h hVar4 = od0.i.Companion;
                gzc.n nVar = (gzc.n) incomeSource.g();
                String str11 = nVar != null ? nVar.f148015b : null;
                hVar4.getClass();
                return od0.h.a(str11);
            case 25:
                od0.i incomeSourceType = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(incomeSourceType, "incomeSourceType");
                return Boolean.valueOf(Intrinsics.f(incomeSourceType.g(), "OTHER"));
            case 26:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean z = ((Boolean) pair.f186385a).booleanValue() && ((od0.i) pair.f186386b).d();
                h hVar5 = h.STATE;
                h hVar6 = h.EVIDENCE_TYPES;
                if (!z) {
                    hVar5 = hVar6;
                }
                return te0.w.f(hVar5);
            case 27:
                NaviCommand it13 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return ngm.n.g((FragmentNavigateCommand) it13);
            case 28:
                McyAllowedTravelCountries content = (McyAllowedTravelCountries) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                List<String> countries = content.getCountries();
                wi0.a aVar5 = wi0.b.Companion;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(countries, 10));
                Iterator<T> it14 = countries.iterator();
                while (it14.hasNext()) {
                    kii.e.B(aVar5, (String) it14.next(), arrayList3);
                }
                return arrayList3;
            default:
                c0g.b it15 = (c0g.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                return new TravelSearchDestinationBrief(it15.getId(), it15.getName());
        }
    }
}
