package rbf;

import com.google.gson.reflect.TypeToken;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pbf.e;
import qbf.j;
import qbf.l;
import qbf.m;
import qbf.o;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f253038b;

    public /* synthetic */ a(d dVar, int i) {
        this.f253037a = i;
        this.f253038b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f253037a) {
            case 0:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                List<o> list = plans;
                e eVar = this.f253038b.f253045c;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (o oVar : list) {
                    eVar.getClass();
                    arrayList.add(e.a(oVar));
                }
                return arrayList;
            case 1:
                List plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                List<o> list2 = plans2;
                e eVar2 = this.f253038b.f253045c;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (o oVar2 : list2) {
                    eVar2.getClass();
                    arrayList2.add(e.a(oVar2));
                }
                return arrayList2;
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                d dVar = this.f253038b;
                d0<List<o>> addOnsForGroup = dVar.f253043a.getAddOnsForGroup("TRADING");
                r83.d dVar2 = new r83.d(28, new a(dVar, 0));
                addOnsForGroup.getClass();
                i iVar = new i(addOnsForGroup, dVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 3:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f253038b.f253043a.getDowngradeSurveyConfig("ADD_ON");
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (j) this.f253038b.f253044b.get("trading_add_on_downgrade_survey_config");
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                ue0.c cVar = this.f253038b.d;
                Type type = new TypeToken<j>() { // from class: com.revolut.feature.trading_add_ons.impl.data.repositories.TradingAddOnsRepositoryImpl$downgradeSurveyConfig$4$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return (j) cVar.T2("trading_add_on_downgrade_survey_config", type);
            case 6:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                d dVar3 = this.f253038b;
                d0<l> eligibility = dVar3.f253043a.getEligibility(id10);
                c cVar2 = new c(new qi3.i(1, dVar3.f, pbf.c.class, "map", "map(Lcom/revolut/feature/trading_add_ons/impl/data/models/TradingAddOnEligibilityDto;)Lcom/revolut/feature/trading_add_ons/domain/model/addon/TradingAddOnEligibility;", 0, 26), 0);
                eligibility.getClass();
                i iVar2 = new i(eligibility, cVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 7:
                String id11 = (String) obj2;
                Intrinsics.checkNotNullParameter(id11, "id");
                return (lbf.i) this.f253038b.f253044b.get(czi.c.f(id11));
            case 8:
                String id12 = (String) obj2;
                Intrinsics.checkNotNullParameter(id12, "id");
                ue0.c cVar3 = this.f253038b.d;
                String strF = czi.c.f(id12);
                Type type2 = new TypeToken<j>() { // from class: com.revolut.feature.trading_add_ons.impl.data.repositories.TradingAddOnsRepositoryImpl$eligibilityDod$4$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                return (lbf.i) cVar3.T2(strF, type2);
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) this.f253038b.f253044b.get("trading_add_ons_trading");
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                d dVar4 = this.f253038b;
                ue0.c cVar4 = dVar4.d;
                Type type3 = new TypeToken<List<? extends o>>() { // from class: com.revolut.feature.trading_add_ons.impl.data.repositories.TradingAddOnsRepositoryImpl$addOnsDod$4$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                List list3 = (List) cVar4.T2("trading_add_ons_trading", type3);
                if (list3 == null) {
                    return null;
                }
                List<o> list4 = list3;
                e eVar3 = dVar4.f253045c;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                for (o oVar3 : list4) {
                    eVar3.getClass();
                    arrayList3.add(e.a(oVar3));
                }
                return arrayList3;
            case 11:
                List plans3 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans3, "plans");
                List<m> list5 = plans3;
                pbf.d dVar5 = this.f253038b.e;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                for (m mVar : list5) {
                    dVar5.getClass();
                    arrayList4.add(pbf.d.a(mVar));
                }
                return arrayList4;
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                d dVar6 = this.f253038b;
                d0<List<m>> enabledAddOns = dVar6.f253043a.getEnabledAddOns("TRADING");
                r83.d dVar7 = new r83.d(29, new a(dVar6, 11));
                enabledAddOns.getClass();
                i iVar3 = new i(enabledAddOns, dVar7, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) this.f253038b.f253044b.get("trading_add_ons_enabled_trading");
            case 14:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                d dVar8 = this.f253038b;
                ue0.c cVar5 = dVar8.d;
                Type type4 = new TypeToken<List<? extends m>>() { // from class: com.revolut.feature.trading_add_ons.impl.data.repositories.TradingAddOnsRepositoryImpl$addOnsEnabledDod$4$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                List list6 = (List) cVar5.T2("trading_add_ons_enabled_trading", type4);
                if (list6 == null) {
                    return null;
                }
                List<m> list7 = list6;
                pbf.d dVar9 = dVar8.e;
                ArrayList arrayList5 = new ArrayList(w.t(list7, 10));
                for (m mVar2 : list7) {
                    dVar9.getClass();
                    arrayList5.add(pbf.d.a(mVar2));
                }
                return arrayList5;
            default:
                List data = (List) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List<m> list8 = data;
                pbf.d dVar10 = this.f253038b.e;
                ArrayList arrayList6 = new ArrayList(w.t(list8, 10));
                for (m mVar3 : list8) {
                    dVar10.getClass();
                    arrayList6.add(pbf.d.a(mVar3));
                }
                return arrayList6;
        }
    }
}
