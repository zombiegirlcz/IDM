package jpl;

import amd.a0;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.credit.core.R$string;
import eoi.r;
import h30.l;
import io3.g;
import io3.k;
import ip0.br;
import ip0.cr;
import ip0.cs;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.s7;
import ip0.t10;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jq4.j;
import jqg.i;
import jsl.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import lqa.y;
import pdh.h;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177327a;

    public /* synthetic */ e(int i) {
        this.f177327a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k kVar;
        switch (this.f177327a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB = u.b();
                v7.C("SECTION_CONNECTED_APPS_LOADING", 0, 0, 30, eVarB);
                eVarB.addAll(iii.c.c(3));
                break;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_cashback_cashback, null, null, 14);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                f0 f0Var = f0.f322471a;
                j jVar = new j(textLocalisedClause, null, resourceImage, f0Var, f0Var);
                CounterTextDelegate.Model model = new CounterTextDelegate.Model("id_counter_cashback", new TextLocalisedClause(R$string.credit_cashback_cashback_earned_title, null, null, 14), CounterTextDelegate.c.a.f52173a, null, false, null, null, 0, 0, 0, 0, 2040);
                ListSubheaderDelegate.Model modelA = lq4.e.a(false);
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, j6.a.l(it10.nextInt() - 1, "id_row_loading_", "_transaction"), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                ArrayList arrayListG = yp0.b.g(arrayList, modelA, null, 0, 0, 126);
                yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                break;
            case 2:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            case 3:
                break;
            case 4:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data content = new Data(null, null, true, 3, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                break;
            case 5:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                break;
            case 6:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                break;
            case 7:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                break;
            case 8:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                break;
            case 9:
                AtomicReference atomicReference = r.f127969a;
                r.e("observeTransactionsFinished", false);
                break;
            case 10:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                break;
            case 11:
                AtomicReference atomicReference2 = r.f127969a;
                r.e("observeTransactionsStarted", false);
                break;
            case 12:
                y properties = (y) obj2;
                Intrinsics.checkNotNullParameter(properties, "properties");
                Intrinsics.checkNotNullParameter(properties, "<this>");
                boolean isDecimalsAllowed = properties.getIsDecimalsAllowed();
                dj0.d dVarO = mo3.a.o(properties.getTransferLimits().getLower());
                jo3.a upper = properties.getTransferLimits().getUpper();
                break;
            case 13:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                aim.e eVarB2 = u.b();
                cr crVar = new cr("id_instalment_term_slider", br.CENTER);
                yp0.b.l(crVar, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(crVar);
                List listK = v.k(new s7("id_loading_cell_1", 0, 0, 0, 0, false, null, 126), new s7("id_loading_cell_2", 0, 0, 0, 0, false, null, 126), new s7("id_loading_cell_3", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                s7 s7Var = new s7("id_loading_cell_1", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(s7Var);
                break;
            case 14:
                xr7.f it17 = (xr7.f) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                break;
            case 15:
                xr7.f it18 = (xr7.f) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                break;
            case 16:
                Pair pair = (Pair) obj2;
                List pocketBalances = (List) pair.f186385a;
                dj0.d dVarX = yoj.b.x(pocketBalances, (xi0.b) pair.f186386b);
                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : pocketBalances) {
                    if (((g) obj3).f163163a.i >= 0) {
                        arrayList2.add(obj3);
                    }
                }
                List listP0 = d0.P0(arrayList2, new jsd.b());
                ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                Iterator it19 = listP0.iterator();
                while (it19.hasNext()) {
                    io3.d dVar = ((g) it19.next()).f163163a;
                    xi0.a aVar = xi0.b.Companion;
                    String str = dVar.f163147c;
                    String str2 = dVar.f163147c;
                    aVar.getClass();
                    arrayList3.add(new amd.f(new CurrencyClause(xi0.a.a(str), null, null, 6), null, new MoneyClause(new dj0.d(dVar.i, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, new a0(dVar), 160));
                }
                break;
            case 17:
                amd.d group = (amd.d) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                if (group.d.f115082a >= 0 && !group.f6313b.isEmpty()) {
                    break;
                }
                break;
            case 18:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : pockets) {
                    io3.d dVar2 = (io3.d) obj4;
                    if (l.D(xi0.b.Companion, dVar2.f163147c) && ((kVar = dVar2.f) == k.ACTIVE || kVar == k.INACTIVE)) {
                        if (!Intrinsics.f(dVar2.f163147c, xi0.b.f306279q.f306286a) || dVar2.i != 0) {
                            arrayList4.add(obj4);
                        }
                    }
                }
                break;
            case 19:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                t10 t10Var = new t10("investment-notice-loading-dialog-header-list-id", p10.f165755a);
                cs csVar = new cs("investment-notice-loading-dialog-button-list-id");
                yp0.b.l(csVar, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                break;
            case 20:
                h it21 = (h) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                break;
            case 21:
                p update3 = (p) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                break;
            case 22:
                break;
            case 23:
                Boolean it22 = (Boolean) obj2;
                int i = AmountForDualEditView.C;
                Intrinsics.checkNotNullParameter(it22, "it");
                it22.booleanValue();
                break;
            case 24:
                Boolean it23 = (Boolean) obj2;
                int i2 = AmountForDualEditView.C;
                Intrinsics.checkNotNullParameter(it23, "it");
                break;
            case 25:
                CenteredAmountDelegate.Model it24 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                Intrinsics.checkNotNullParameter(it24, "it");
                Object obj5 = it24.f51981p;
                if (obj5 instanceof yof.b) {
                }
                break;
            case 26:
                jt1.a updateState = (jt1.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                break;
            case 27:
                Function0 it25 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                break;
            case 28:
                Function0 it26 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                break;
            default:
                Function0 it27 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                break;
        }
        return null;
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f177327a = i;
    }
}
