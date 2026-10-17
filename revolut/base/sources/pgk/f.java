package pgk;

import android.accounts.Account;
import android.app.NotificationManager;
import android.graphics.Paint;
import aw0.o9;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedPieSmallView;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.payinstore.impl.ui.flow.PayInStoreFlow;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameScreen;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreen;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsActivity;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import com.revolut.feature.view.image.impl.ui.PreviewImageScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlow;
import cwi.f0;
import dw3.f2;
import ehl.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nkm.y;
import org.joda.time.DateTime;
import pcd.s;
import pjl.z0;
import pkf.d2;
import pkf.n2;
import pmk.v;
import po9.t;
import pqg.i0;
import ql7.h0;
import ql7.i1;
import qv0.c;
import yhm.m;
import yhm.n;
import yhm.o;
import zh9.u0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f235988b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f235987a = i;
        this.f235988b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        TextLocalisedClause textLocalisedClause;
        int i = this.f235987a;
        int i2 = 0;
        int i3 = 4;
        Continuation continuation = null;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.f235988b;
        switch (i) {
            case 0:
                return (FeatureCommand) obj2;
            case 1:
                return ((k) obj2).e.b();
            case 2:
                return gc0.c.f((MainScreenFeatureConfig.WithInnerConfiguration) obj2);
            case 3:
                ph0.h hVar = ((ph0.f) obj2).f236194a;
                GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestId().requestProfile().requestEmail().requestServerAuthCode(hVar.f236197b).build();
                Intrinsics.checkNotNullExpressionValue(googleSignInOptionsBuild, "build(...)");
                GoogleSignInClient client = GoogleSignIn.getClient(hVar.f236196a, googleSignInOptionsBuild);
                Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
                return client;
            case 4:
                return (List) ((phl.j) obj2).f236355a.get("UPCOMING_EVENTS_MEMORY_KEY");
            case 5:
                List listC = ((bhl.f) obj2).c();
                ArrayList arrayList = new ArrayList();
                Iterator it8 = listC.iterator();
                while (it8.hasNext()) {
                    iel.i iVarD = ihl.c.d((x) it8.next());
                    if (iVarD != null) {
                        arrayList.add(iVarD);
                    }
                }
                return arrayList;
            case 6:
                return new z4l.j(7, u.c((CellDetailsDelegate) ((TrustedMerchantDetailsActivity) obj2).f94436v0.getValue()), false);
            case 7:
                z0 z0Var = (z0) obj2;
                ih0.b bVar = z0Var.f;
                pjl.d dVar = z0Var.f236873b;
                if (!((ii0.b) bVar).b("EID_REVOLUT_SSO_ACCOUNTS_FALLBACK_ENABLED")) {
                    return dVar;
                }
                try {
                    m.Companion companion = m.INSTANCE;
                    z0Var.f236876h.getPassword(new Account("any_name_only_to_check_access", "com.revolut.sso"));
                    objA = Boolean.TRUE;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Object obj3 = Boolean.FALSE;
                if (objA instanceof n) {
                    objA = obj3;
                }
                return ((Boolean) objA).booleanValue() ? dVar : z0Var.f236874c;
            case 8:
                ((pkf.h) obj2).f237056m.getClass();
                return vlf.b.g(4, "CryptoCommodityExchangeDetails");
            case 9:
                ((d2) obj2).f237040m.getClass();
                return vlf.b.g(2, "CryptoWithdrawDetails");
            case 10:
                ((n2) obj2).f237100m.getClass();
                return vlf.b.g(2, "CryptoWithdrawTracking");
            case 11:
                ((pmi.g) obj2).f237593a.getClass();
                return 65536;
            case 12:
                v vVar = (v) obj2;
                vVar.C1(u0.b(vVar.v.d()));
                return Unit.f186387a;
            case 13:
                return (pn9.a) ((kn9.b) ((PayInStoreFlow) obj2).P.getValue()).d.get();
            case 14:
                KProperty[] kPropertyArr = EstimatedCarValuePickerScreen.f75552b0;
                return (po7.h) ((h0) ((EstimatedCarValuePickerScreen) obj2).X.getValue()).i.get();
            case 15:
                com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar2 = (com.revolut.feature.payments.air.widget.impl.ui.chat.b) obj2;
                return mra.d.c(bVar2, new t(bVar2.c3().f310974a, new po9.g(new Data(null, null, true, 3, null))), bVar2.f79118p);
            case 16:
                KProperty[] kPropertyArr2 = SmartDrivingScreen.f75663d0;
                return (pq7.j) ((i1) ((SmartDrivingScreen) obj2).f75664a0.getValue()).f247336h.get();
            case 17:
                i0 i0Var = (i0) obj2;
                long jA = ((pqg.o) i0Var.t2()).a(i0Var.z);
                xi0.b currency = ((pqg.o) i0Var.t2()).f238749a;
                AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = i0Var.u;
                s vault = addMoneyScreenContract$InputData.f94775a;
                ((pqg.b) i0Var.B).getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(vault, "vault");
                MoneyClause moneyClause = new MoneyClause(new dj0.d(jA, currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
                switch (pqg.a.f238732a[vault.e.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        textLocalisedClause = new TextLocalisedClause(R$string.savings_add_money_success_screen_title, zhm.v.k(moneyClause, new TextClause(vault.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.subaccount_single_transfer_success_screen_title, u.c(moneyClause), null, 12);
                        break;
                    case 8:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_action_topup_success, u.c(moneyClause), null, 12);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                if (addMoneyScreenContract$InputData.i) {
                    i0Var.v2(new jpg.d(new jpg.a(vault.f234881a), textLocalisedClause2));
                } else {
                    yji.l.a1(i0Var, i0Var.X1(new mii.k("vault_add_money_success", textLocalisedClause2, null, null, null, 28)), null, null, new pqc.k(i0Var, textLocalisedClause2, continuation, i6), 3);
                }
                return Unit.f186387a;
            case 18:
                int i21 = PreviewImageScreen.S;
                return (hrg.b) ((mrg.b) ((PreviewImageScreen) obj2).Q.getValue()).f208124c.get();
            case 19:
                psd.j jVar = (psd.j) obj2;
                return boh.f.e(rd0.e.b(pd.b.r(pd.b.r(osg.b.d(jVar.f239478a), new psd.h(jVar, i2)), new psd.h(jVar, i6))), new psd.h(jVar, i5));
            case 20:
                SegmentedGaugeChartView.Companion aVar = SegmentedGaugeChartView.INSTANCE;
                return Boolean.valueOf(!((SegmentedGaugeChartView) obj2).q());
            case 21:
                SegmentedPieSmallView.Companion aVar2 = SegmentedPieSmallView.INSTANCE;
                Paint.Style style = Paint.Style.FILL;
                Paint paint = new Paint(1);
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setStrokeWidth(((SegmentedPieSmallView) obj2).f57157h);
                return paint;
            case 22:
                KProperty[] kPropertyArr3 = GroupSettingsNameScreen.f0;
                return (pt9.i) ((kr9.s) ((GroupSettingsNameScreen) obj2).f79490b0.getValue()).d.get();
            case 23:
                int i22 = RevPointsExclusiveStoreProductStatusScreen.U;
                return (pvb.c) ((kvb.e) ((RevPointsExclusiveStoreProductStatusScreen) obj2).S.getValue()).f190080c.get();
            case 24:
                Object systemService = ((pvf.c) obj2).f240060a.getContext().getSystemService("notification");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                return (NotificationManager) systemService;
            case 25:
                ((pwf.g) obj2).C2(pwf.d.f240442a);
                return Unit.f186387a;
            case 26:
                return (pwi.a) ((f0) ((AirportLoungeSearchFlow) obj2).P.getValue()).d.get();
            case 27:
                CalendarPickerRangeView calendarPickerRangeView = (CalendarPickerRangeView) obj2;
                List<DateTime> listJ = y.J(nkm.t.g(calendarPickerRangeView.i, new g6j.t(calendarPickerRangeView.f59033j, i3)));
                ArrayList arrayList2 = new ArrayList(w.t(listJ, 10));
                for (DateTime dateTime : listJ) {
                    arrayList2.add(new tq0.a(a0.d.n("ITEM_ID_WEEKDAY_CELL-", dateTime.getDayOfWeek()), new TimeClause(dateTime.getMillis(), TimeClause.Format.ShortDayOfWeek.f57976b, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, false, false, false, null, null, 484));
                }
                tq0.k kVar = new tq0.k(7, 496, Integer.valueOf(R$drawable.internal_calendar_header_background), "ITEM_ID_WEEKDAY_HEADER", arrayList2);
                yp0.b.l(kVar, 0, 0, 0, 0, null, false, 63);
                c.f fVar = new c.f((qv0.h) null, 3);
                Intrinsics.checkNotNullParameter(fVar, "<set-?>");
                kVar.e = fVar;
                kVar.f273473j = new sq0.b(R$attr.uikit_dp0);
                return kVar;
            case 28:
                KProperty[] kPropertyArr4 = DirectDebitAccountDetailsScreen.c0;
                f2 f2Var = (f2) ((DirectDebitAccountDetailsScreen) obj2).X.getValue();
                switch (f2Var.f118706a) {
                    case 0:
                        return (py4.f) f2Var.f.get();
                    case 1:
                        return (py4.f) f2Var.f.get();
                    case 2:
                        return (py4.f) f2Var.f.get();
                    default:
                        return (py4.f) f2Var.f.get();
                }
            default:
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) obj2).B2();
                return Unit.f186387a;
        }
    }
}
