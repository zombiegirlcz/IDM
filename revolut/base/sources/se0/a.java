package se0;

import aii.q;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import ggk.j;
import ggk.w1;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qf1.f;
import qf1.t;
import s1c.d;
import se4.e;
import sec.g;
import tlm.h;
import uha.b0;
import yy3.x;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262076a;

    public /* synthetic */ a(int i) {
        this.f262076a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f262076a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return new d(6);
            case 1:
                ActionsView.Item it9 = (ActionsView.Item) it8;
                KProperty[] kPropertyArr = SaleScreen.P;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f58316a, "ADD_TAX_LIST_ID"));
            case 2:
                ActionsView.Item it10 = (ActionsView.Item) it8;
                KProperty[] kPropertyArr2 = SaleScreen.P;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f58316a, "ADD_NOTE_LIST_ID"));
            case 3:
                ActionsView.Item it11 = (ActionsView.Item) it8;
                KProperty[] kPropertyArr3 = SaleScreen.P;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(Intrinsics.f(it11.f58316a, "ADD_DESCRIPTION_LIST_ID"));
            case 4:
                e update = (e) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, null, null, null, x.FAILED, null, 47);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return new g(null, u.c(nb0.b(pb0.Companion, "DELIVERY_METHODS_LOADING_LIST_ID", false, 0, false, 30)), false);
            case 6:
                Intrinsics.checkNotNullParameter((q) it8, "it");
                return Unit.f186387a;
            case 7:
                Intrinsics.checkNotNullParameter((q) it8, "it");
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return f0.f322471a;
            case 9:
                tf1.u AddNewProductStructure = (tf1.u) it8;
                Intrinsics.checkNotNullParameter(AddNewProductStructure, "$this$AddNewProductStructure");
                c6d.b.e(AddNewProductStructure, qf1.c.ACCOUNTS, new a(12));
                c6d.b.e(AddNewProductStructure, qf1.c.SAVE, new a(13));
                c6d.b.e(AddNewProductStructure, qf1.c.ORGANISE, new a(14));
                c6d.b.e(AddNewProductStructure, qf1.c.BORROW, new a(15));
                c6d.b.e(AddNewProductStructure, qf1.c.INVEST, new a(16));
                c6d.b.e(AddNewProductStructure, qf1.c.CRYPTO, new a(17));
                c6d.b.e(AddNewProductStructure, qf1.c.TRAVEL, new a(18));
                c6d.b.e(AddNewProductStructure, qf1.c.LIFESTYLE, new a(19));
                return Unit.f186387a;
            case 10:
                tf1.d itemGroup = (tf1.d) it8;
                Intrinsics.checkNotNullParameter(itemGroup, "$this$itemGroup");
                itemGroup.a(f.PERSONAL_POCKET);
                itemGroup.a(f.GROUP_POCKET);
                itemGroup.a(f.JOINT_POCKET);
                itemGroup.a(f.JUNIOR_POCKET);
                itemGroup.a(f.PRO_POCKET);
                itemGroup.a(f.PRO_TAX_POCKET);
                itemGroup.a(f.REV_POINTS_POCKET);
                return Unit.f186387a;
            case 11:
                rlm.f Json = (rlm.f) it8;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e = true;
                Json.f255101c = true;
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                jt0.b bVar = new jt0.b(o0.f186429a.b(qf1.d.class));
                Iterator<E> it12 = f.a().iterator();
                while (it12.hasNext()) {
                    switch (sf1.a.f262258a[((f) it12.next()).ordinal()]) {
                        case 1:
                            bVar.G0(o0.f186429a.b(uy5.c.class), uy5.c.Companion.serializer());
                            break;
                        case 2:
                            bVar.G0(o0.f186429a.b(t.class), t.Companion.serializer());
                            break;
                        case 3:
                            bVar.G0(o0.f186429a.b(n38.d.class), n38.d.Companion.serializer());
                            break;
                        case 4:
                        case 5:
                        case 6:
                            bVar.G0(o0.f186429a.b(hjb.x.class), hjb.x.Companion.serializer());
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            bVar.G0(o0.f186429a.b(t.class), t.Companion.serializer());
                            break;
                        case 22:
                            bVar.G0(o0.f186429a.b(qzi.d.class), qzi.d.Companion.serializer());
                            break;
                        case 23:
                            bVar.G0(o0.f186429a.b(fmd.f.class), fmd.f.Companion.serializer());
                            break;
                        case 24:
                            bVar.G0(o0.f186429a.b(nn2.c.class), nn2.c.Companion.serializer());
                            break;
                        case 25:
                            bVar.G0(o0.f186429a.b(uha.c.class), uha.c.Companion.serializer());
                            break;
                        case 26:
                        case 27:
                            bVar.G0(o0.f186429a.b(b0.class), b0.Companion.serializer());
                            break;
                        case 28:
                            bVar.G0(o0.f186429a.b(t.class), t.Companion.serializer());
                            break;
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                            bVar.G0(o0.f186429a.b(tih.c.class), tih.c.Companion.serializer());
                            break;
                        case 42:
                            bVar.G0(o0.f186429a.b(t68.c.class), t68.c.Companion.serializer());
                            break;
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            bVar.G0(o0.f186429a.b(mp3.d.class), mp3.d.Companion.serializer());
                            break;
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                            bVar.G0(o0.f186429a.b(mp3.g.class), mp3.g.Companion.serializer());
                            break;
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            bVar.G0(o0.f186429a.b(bje.c.class), bje.c.Companion.serializer());
                            break;
                        case 59:
                            bVar.G0(o0.f186429a.b(ddi.c.class), ddi.c.Companion.serializer());
                            break;
                        case 60:
                            bVar.G0(o0.f186429a.b(j.class), j.Companion.serializer());
                            break;
                        case 61:
                            bVar.G0(o0.f186429a.b(w1.class), w1.Companion.serializer());
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                bVar.G0(o0.f186429a.b(wf1.c.class), wf1.c.Companion.serializer());
                bVar.O(fVar);
                Unit unit = Unit.f186387a;
                tlm.d dVarA = h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 12:
                tf1.c category = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category, "$this$category");
                category.b(f.CURRENCY_ACCOUNT);
                category.b(f.JOINT_ACCOUNT);
                category.b(f.JUNIOR_ACCOUNT);
                category.b(f.PRO_ACCOUNT);
                category.b(f.LINKED_ACCOUNT);
                return Unit.f186387a;
            case 13:
                tf1.c category2 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category2, "$this$category");
                c6d.b.r(category2, qf1.e.SAVINGS, new a(20));
                return Unit.f186387a;
            case 14:
                tf1.c category3 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category3, "$this$category");
                c6d.b.r(category3, qf1.e.POCKETS, new a(10));
                category3.b(f.BUDGET);
                category3.b(f.SWITCH_SALARY);
                category3.b(f.INCOME_SORTER);
                category3.b(f.ACCOUNT_SWITCH);
                return Unit.f186387a;
            case 15:
                tf1.c category4 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category4, "$this$category");
                category4.b(f.CREDIT_CARD);
                category4.b(f.SECURED_CREDIT_CARD);
                category4.b(f.CREDIT_BUILDER_CARD);
                category4.b(f.BALANCE_TRANSFER_CREDIT_CARD);
                category4.b(f.LOAN);
                category4.b(f.REFINANCING_LOAN);
                category4.b(f.HOME_IMPROVEMENT_LOAN);
                category4.b(f.MORTGAGE);
                category4.b(f.REFINANCING_MORTGAGE);
                category4.b(f.PAY_LATER);
                category4.b(f.OVERDRAFT);
                return Unit.f186387a;
            case 16:
                tf1.c category5 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category5, "$this$category");
                category5.a(f.INVEST_SECURITIES);
                category5.a(f.INVEST_ETFS);
                category5.a(f.INVEST_BONDS);
                category5.a(f.INVEST_ROBO);
                category5.a(f.INVEST_SECURITIES_JOINT);
                category5.a(f.INVEST_PRIVATE_MARKETS);
                category5.a(f.INVEST_CFD);
                category5.a(f.INVEST_GIA_MARGIN);
                category5.a(f.INVEST_COMMODITIES);
                category5.a(f.INVEST_TAA_ISA);
                category5.a(f.INVEST_TAA_PEA);
                category5.a(f.INVEST_TAA_CUSTODIAN_JISA);
                category5.a(f.INVEST_TAA_PERSONAL_JISA);
                return Unit.f186387a;
            case 17:
                tf1.c category6 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category6, "$this$category");
                category6.a(f.CRYPTO_TRADING);
                category6.a(f.CRYPTO_EARN);
                category6.a(f.CRYPTO_LEARN);
                category6.a(f.CRYPTO_STRATEGIES);
                category6.a(f.CRYPTO_REVOLUT_X);
                return Unit.f186387a;
            case 18:
                tf1.c category7 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category7, "$this$category");
                category7.a(f.TRAVEL_MILES);
                category7.a(f.TRAVEL_STAYS);
                category7.a(f.TRAVEL_LOUNGES);
                category7.a(f.TRAVEL_ASFT);
                category7.a(f.TRAVEL_EXPERIENCES);
                category7.a(f.TRANSPORT);
                return Unit.f186387a;
            case 19:
                tf1.c category8 = (tf1.c) it8;
                Intrinsics.checkNotNullParameter(category8, "$this$category");
                category8.a(f.STUDENT);
                category8.a(f.ESIM);
                category8.a(f.LIFESTYLE_GIFT_CARDS);
                category8.a(f.LIFESTYLE_PARTNERS);
                category8.a(f.LIFESTYLE_INSURANCES);
                category8.a(f.LIFESTYLE_SHOPS);
                category8.a(f.DONATIONS);
                return Unit.f186387a;
            case 20:
                tf1.d itemGroup2 = (tf1.d) it8;
                Intrinsics.checkNotNullParameter(itemGroup2, "$this$itemGroup");
                itemGroup2.a(f.PERSONAL_SAVINGS_ACCOUNT);
                itemGroup2.a(f.JOINT_SAVINGS_ACCOUNT);
                itemGroup2.a(f.JUNIOR_SAVINGS_ACCOUNT);
                return Unit.f186387a;
            case 21:
                Set it13 = (Set) it8;
                Intrinsics.checkNotNullParameter(it13, "it");
                return d0.d1(it13);
            case 22:
                Set it14 = (Set) it8;
                Intrinsics.checkNotNullParameter(it14, "it");
                return d0.d1(it14);
            case 23:
                List plans = (List) it8;
                Intrinsics.checkNotNullParameter(plans, "plans");
                return Boolean.valueOf(plans.size() == 2 && !Intrinsics.f(((hha.d) plans.get(0)).f152287a, ((hha.d) plans.get(1)).f152287a));
            case 24:
                List plans2 = (List) it8;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                Object obj2 = plans2.get(0);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                Object obj3 = plans2.get(1);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                return new fha.a((hha.d) obj2, (hha.d) obj3);
            case 25:
                Intrinsics.checkNotNullParameter((String) it8, "it");
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) it8, "<unused var>");
                gu guVar = new gu("TAA_SETTINGS_HEADER_LOADING_LIST_ID", 0, 0, 30);
                s7 s7Var = new s7("TAA_SETTINGS_CLOSE_ACCOUNT_BUTTON_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, s7Var);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return u.c(new s("ONBOARDING_BANNER_LOADING_LIST_ID"));
            case 28:
                List components = (List) it8;
                Intrinsics.checkNotNullParameter(components, "components");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : components) {
                    tj1.c cVar = (tj1.c) obj4;
                    if (cVar.f271597b != tj1.e.UNKNOWN && cVar.f271598c != tj1.d.UNKNOWN) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            default:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                ArrayList arrayList2 = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList2.add(new s7(a0.d.n("ID_LOADING_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return new sj6.e(arrayList2, null, true);
        }
    }
}
