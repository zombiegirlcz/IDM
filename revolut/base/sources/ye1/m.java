package ye1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.shared.feature.wealth.models.config.Links;
import egb.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import z0h.b0;
import z0h.p1;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312756a;

    public /* synthetic */ m(int i) {
        this.f312756a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.k kVar;
        switch (this.f312756a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, 0L, null, null, null, null, null, null, null, !update.f312751l, 2047);
            case 1:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i.a(update2, null, null, 0L, null, null, null, null, null, null, null, false, 3071);
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 3:
                e7l.f it8 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                LinkedHashSet linkedHashSet = it8.M;
                ArrayList arrayList = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it9 = linkedHashSet.iterator();
                while (it9.hasNext()) {
                    arrayList.add(new xi0.b(6, (String) it9.next(), null));
                }
                return arrayList;
            case 4:
                t1 it10 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Links links = it10.f318563a;
                hel.b bVar = it10.f318564b;
                return new p1(u.c(new b0(links, bVar)), bVar);
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 6:
                yed.o updateState = (yed.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yed.o.a(updateState, null, null, null, null, false, false, null, null, null, null, false, null, false, null, null, null, 1048543);
            case 7:
                xi0.b it11 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f306286a;
            case 8:
                return yed.o.a((yed.o) obj2, null, null, null, null, true, false, null, null, null, null, false, null, false, null, null, null, 1048543);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                bw0.h.Companion.getClass();
                bw0.h hVarA = bw0.b.a();
                bw0.m.Companion.getClass();
                AmountEditDelegate.Model model = new AmountEditDelegate.Model("amount_id_loading", textClause, hVarA, null, null, bw0.k.a(), null, false, null, null, 1816);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                return model;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, f0.f322471a, yeg.h.a());
            case 11:
                yf1.m update3 = (yf1.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return yf1.m.a(update3, null, null, null, null, null, null, 47);
            case 12:
                yf1.q qVar = (yf1.q) obj2;
                if (qVar != null) {
                    return qVar.f313130a;
                }
                return null;
            case 13:
                yfd.m updateState2 = (yfd.m) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return yfd.m.a(updateState2, null, null, "", false, null, 39);
            case 14:
                yfd.m updateState3 = (yfd.m) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return yfd.m.a(updateState3, null, f0.f322471a, null, false, null, 61);
            case 15:
                yfd.m updateState4 = (yfd.m) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return yfd.m.a(updateState4, null, null, "", true, null, 39);
            case 16:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet<String> linkedHashSet2 = config.M;
                ArrayList arrayList2 = new ArrayList();
                for (String str : linkedHashSet2) {
                    xi0.b.Companion.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    if (!cp5.d.z(bVarA) || cp5.d.D(bVarA)) {
                        bVarA = null;
                    }
                    if (bVarA != null) {
                        arrayList2.add(bVarA);
                    }
                }
                return d0.i1(arrayList2);
            case 17:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    if (h30.l.D(xi0.b.Companion, dVar.f163147c) && ((kVar = dVar.f) == io3.k.ACTIVE || kVar == io3.k.INACTIVE)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 18:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : pockets2) {
                    if (h30.l.D(xi0.b.Companion, ((io3.d) obj4).f163147c)) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 19:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : pockets3) {
                    if (v.k(io3.k.ACTIVE, io3.k.INACTIVE).contains(((io3.d) obj5).f)) {
                        arrayList5.add(obj5);
                    }
                }
                return arrayList5;
            case 20:
                ListSubheaderDelegate.Model it12 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr = SubformScreen.V;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.f52715m instanceof BillFormFieldV2);
            case 21:
                InputTextDelegate.TextData it13 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr2 = SubformScreen.V;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(!a0.H(it13.f52597a, "MONEY_ITEM_ID_", false));
            case 22:
                return egb.f0.INSTANCE.serializer();
            case 23:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                fVar.b(o0.f186429a.b(g0.class), new m(22));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 25:
                rc.i response = (rc.i) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                String str2 = response.f253154a;
                Intrinsics.checkNotNullExpressionValue(str2, "token(...)");
                Intrinsics.checkNotNullParameter(response, "response");
                return new yg0.e(str2, new yh0.e());
            case 26:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new yh4.a((dz3.c) pair.f186385a, (x35.e) pair.f186386b);
            case 27:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems2.invoke();
                m70.a.c(t0.f186434a);
                return new yh4.o(list, new TextLocalisedClause(R$string.credit_application_sepa_direct_debit_set_up_title, u.c(""), null, 12), null, null, null);
            case 28:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new yh7.c(it14);
            default:
                return new yh7.c((List) obj2);
        }
    }

    public /* synthetic */ m(cli.n nVar, int i) {
        this.f312756a = i;
    }
}
