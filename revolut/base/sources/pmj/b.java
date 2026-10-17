package pmj;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.family.FamilyPlanState;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import ip0.b8;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import pmk.q;
import pmk.x;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237597a;

    public /* synthetic */ b(int i) {
        this.f237597a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f237597a;
        boolean z = true;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanSummaryScreen.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f52715m;
                if (obj3 instanceof EsimCoverage.Regional) {
                    return (EsimCoverage.Regional) obj3;
                }
                return null;
            case 1:
                CellDetailsDelegate.Model model2 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = EsimMobilePlanSummaryScreen.T;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.o;
                if (obj4 instanceof h) {
                    return (h) obj4;
                }
                return null;
            case 2:
                CellDetailsDelegate.Model model3 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = EsimMobilePlanSummaryScreen.T;
                Intrinsics.checkNotNullParameter(model3, "model");
                Object obj5 = model3.o;
                if (obj5 instanceof h) {
                    return (h) obj5;
                }
                return null;
            case 3:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return FamilyPlanState.Empty.f81188a;
            case 4:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return f0.f322471a;
            case 5:
                nha.c it10 = (nha.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 6:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 7:
                pmk.k updateState = (pmk.k) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                od0.i.Companion.getClass();
                return pmk.k.a(updateState, null, null, null, null, null, null, new Data(od0.i.f224256b, null, false, 6, null), 63);
            case 8:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new q(new TextLocalisedClause(R$string.plan_manage_screen_billing_title, null, null, 14), f0.f322471a);
            case 9:
                MoneyClause it13 = (MoneyClause) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13;
            case 10:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new pn6.i((List) getDefaultLoadingItems.invoke(), false);
            case 11:
                Function0 getLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getLoadingItems, "getLoadingItems");
                return (List) getLoadingItems.invoke();
            case 12:
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
                if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                AnalyticsAccount analyticsAccount2 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(analyticsAccount2, "analyticsAccount");
                if (!(analyticsAccount2 instanceof AnalyticsAccount.Savings.PersonalAll) && !(analyticsAccount2 instanceof AnalyticsAccount.Savings.PersonalIndividual)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                AnalyticsAccount it14 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14 instanceof AnalyticsAccount.Joint);
            case 15:
                AnalyticsAccount it15 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15 instanceof AnalyticsAccount.Personal);
            case 16:
                AnalyticsAccount it16 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 instanceof AnalyticsAccount.Pro);
            case 17:
                AnalyticsAccount it17 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.TRUE;
            case 18:
                b8 it18 = (b8) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                File file = it18.f;
                if (file != null) {
                    return file;
                }
                return null;
            case 19:
                List receiptFilePaths = (List) obj2;
                Intrinsics.checkNotNullParameter(receiptFilePaths, "receiptFilePaths");
                List<File> list = receiptFilePaths;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (File file2 : list) {
                    String name = file2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    b8 b8Var = new b8(name, new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_receipt, null, null, 14), new TextLocalisedClause(R.string.common_action_remove, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new FileImage(file2, (FileImage.Placeholder) null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), 10), file2);
                    yp0.b.l(b8Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(b8Var);
                }
                return arrayList;
            case 20:
                Data it19 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                List list2 = (List) it19.getContent();
                return list2 == null ? f0.f322471a : list2;
            case 21:
                b8 it20 = (b8) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                File file3 = it20.f;
                if (file3 != null) {
                    return file3;
                }
                return null;
            case 22:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 23:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                od0.i.Companion.getClass();
                return iVar;
            case 24:
                ChargeBreakdown chargeBreakdown = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(chargeBreakdown, "chargeBreakdown");
                od0.i.Companion.getClass();
                return od0.h.a(chargeBreakdown);
            case 25:
                Throwable it22 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 26:
                iel.i it23 = (iel.i) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return u.c(it23);
            case 27:
                List it24 = (List) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return (kp3.b) d0.d0(it24);
            case 28:
                Pair it25 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it25);
            default:
                return zi0.c.O((Throwable) obj2);
        }
    }

    public /* synthetic */ b(x xVar) {
        this.f237597a = 8;
    }
}
