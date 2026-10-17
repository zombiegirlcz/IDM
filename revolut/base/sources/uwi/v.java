package uwi;

import android.os.Parcelable;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.barcode.screen.BarcodeReaderScreen;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.statements.api.models.AnnualStatementDateRange;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.impl.userauth.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.d0;
import grl.k9;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import o97.h0;
import ux0.a;
import yhm.m;
import zh9.u0;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283695a;

    public /* synthetic */ v(int i) {
        this.f283695a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        switch (this.f283695a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return null;
            case 1:
                Boolean isTopUpAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isTopUpAvailable, "isTopUpAvailable");
                CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)));
                if (!isTopUpAvailable.booleanValue()) {
                    return compositeCommandC;
                }
                com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.add_money_prompt_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.topup_first_topup_body_new, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.common_action_top_up, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_notnow, null, null, 14);
                CompositeCommand compositeCommandC2 = com.revolut.retail.core.navigation.a.c(compositeCommandC, u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31))));
                k9 k9Var = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, textLocalisedClause4, compositeCommandC2, compositeCommandC, null, null, compositeCommandC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33193009);
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ufm.b bVarM = d0.m(gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 3:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10.getError() == null) {
                    return it10;
                }
                List listK = (List) it10.getContent();
                if (listK == null) {
                    listK = zhm.v.k(uwl.d.n(0, 0, false), h0.f223107a);
                }
                return Data.copy$default(it10, listK, null, false, 6, null);
            case 4:
                String id10 = (String) obj2;
                KProperty[] kPropertyArr = BarcodeReaderScreen.S;
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.hashCode() == -1796421207 && id10.equals("SCREEN_FLASH_MENU_ITEM_ID")) {
                    return ux.e.f283708a;
                }
                throw new IllegalStateException("Unknown menu item: ".concat(id10).toString());
            case 5:
                Unit it11 = (Unit) obj2;
                KProperty[] kPropertyArr2 = BarcodeReaderScreen.S;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ux.d.f283707a;
            case 6:
                ux0.i iVar = (ux0.i) obj2;
                a.C1569a c1569a = ux0.a.Companion;
                ux0.e eVar = iVar instanceof ux0.e ? (ux0.e) iVar : null;
                if (eVar == null) {
                    return null;
                }
                Throwable th10 = eVar.f283743b;
                if (th10 != null) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                } else {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = Unit.f186387a;
                }
                return new yhm.m(objA);
            case 7:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM blik_contacts_temp");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 8:
                n61.m groups = (n61.m) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                aim.e eVarB = zhm.u.b();
                eVarB.addAll(groups.f212691a);
                eVarB.addAll(groups.f212692b);
                aim.e eVarA = zhm.u.a(eVarB);
                ArrayList arrayList = new ArrayList(zhm.w.t(eVarA, 10));
                ListIterator listIterator = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar = (aim.b) listIterator;
                    if (!bVar.hasNext()) {
                        return arrayList;
                    }
                    arrayList.add(new gw6.a((f5j.a) bVar.next()));
                }
                break;
            case 9:
                List customers = (List) obj2;
                Intrinsics.checkNotNullParameter(customers, "customers");
                List list = customers;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                Iterator it12 = list.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(new gw6.c((FreelancerCustomer) it12.next()));
                }
                return arrayList2;
            case 10:
                zm3.b groups2 = (zm3.b) obj2;
                Intrinsics.checkNotNullParameter(groups2, "groups");
                aim.e eVarB2 = zhm.u.b();
                List list2 = groups2.f323334c;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    arrayList3.add(new gw6.b((zm3.a) it13.next()));
                }
                eVarB2.addAll(arrayList3);
                List list3 = groups2.d;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    arrayList4.add(new gw6.b((zm3.a) it14.next()));
                }
                eVarB2.addAll(arrayList4);
                return zhm.u.a(eVarB2);
            case 11:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 12:
                InputTextDelegate.TextData it15 = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f52597a, "INPUT_TEXT_NAME_LIST_ID"));
            case 13:
                InputChecklistDelegate.Model it16 = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(a0.H(it16.f52519a, "INPUT_RADIO_GENDER_LIST_ID_", false));
            case 14:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new vx7.b((String) hVar.d, (c0) hVar.f288433a, (List) hVar.f288434b, (z) hVar.f288435c);
            case 15:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List listK2 = zhm.v.k(new s7("ID_LOADING_ITEM_1", 0, 0, 0, 0, false, null, 126), new s7("ID_LOADING_ITEM_2", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return listK2;
            case 16:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 17:
                RowDelegate.Model it18 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f53228a, "ADD_FILE_MODEL_ID"));
            case 18:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 19:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 20:
                oyd.a annualStatementDateRangeDto = (oyd.a) obj2;
                Intrinsics.checkNotNullParameter(annualStatementDateRangeDto, "it");
                Intrinsics.checkNotNullParameter(annualStatementDateRangeDto, "annualStatementDateRangeDto");
                return new AnnualStatementDateRange(annualStatementDateRangeDto.getFrom(), annualStatementDateRangeDto.getTo());
            case 21:
                StatementUrlState it19 = (StatementUrlState) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zi0.c.P(it19, false, null, 3);
            case 22:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 23:
                ste.u result = (ste.u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof ste.s) || (result instanceof ste.t)) {
                    return Unit.f186387a;
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                ste.u result2 = (ste.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if ((result2 instanceof ste.s) || (result2 instanceof ste.t)) {
                    return Unit.f186387a;
                }
                throw new NoWhenBranchMatchedException();
            case 25:
                TopupFlowContract$Step it20 = (TopupFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20 instanceof TopupFlowContract$Step.Amount);
            case 26:
                TopupFlowContract$Step it21 = (TopupFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(it21 instanceof TopupFlowContract$Step.SelectTopupMethod);
            case 27:
                List it22 = (List) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22;
            case 28:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 1, 3, 1);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it23 = intRangeU.iterator();
                while (it23.f289625c) {
                    arrayList5.add(nb0.b(pb0.Companion, a0.d.n("CURRENT_ALLOCATION_LIST_ID_", it23.nextInt()), false, 0, false, 28));
                }
                return arrayList5;
            default:
                uyh.j it24 = (uyh.j) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f284369a;
        }
    }

    public /* synthetic */ v(Object obj2, int i) {
        this.f283695a = i;
    }
}
