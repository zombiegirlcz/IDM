package t9b;

import ba6.l;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.property.search.LocationMapBoundaries;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import d9.e1;
import ip0.gu;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.q;
import kel.n;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import m1c.h1;
import m1c.r0;
import m1c.x0;
import mx0.u5;
import qv0.i;
import ta8.m;
import taf.f;
import tb6.s;
import tb6.z;
import vel.g;
import whf.p;
import zel.h;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268969a;

    public /* synthetic */ a(int i) {
        this.f268969a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f268969a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 1:
                JuniorBankingProfile it9 = (JuniorBankingProfile) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f77099b;
            case 2:
                return ((p) it8).f297646a;
            case 3:
                Function0 defaultFactory = (Function0) it8;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 4:
                h result = (h) it8;
                Intrinsics.checkNotNullParameter(result, "result");
                ArrayList arrayList = result.f321803b;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(new g(((ScreenerInstrument) it10.next()).f105162a, vel.h.STOCK, (dj0.d) null, 12));
                }
                return arrayList2;
            case 5:
                Pair pair = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj2 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj2, "component1(...)");
                Object obj3 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                return new t9l.b((List) obj2, (q) obj3);
            case 6:
                List it11 = (List) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                return w.u(it11);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                InputTextDelegate.Model model = new InputTextDelegate.Model("NINO_LOADING_INPUT_LIST_ID", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new m(u.c(model));
            case 8:
                f update = (f) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, zi0.c.P(Boolean.TRUE, false, null, 3));
            case 9:
                f update2 = (f) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return f.a(update2, zi0.c.P(Boolean.FALSE, false, null, 3));
            case 10:
                wel.e portfolio = (wel.e) it8;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                ArrayList arrayList3 = portfolio.e;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (obj4 instanceof n) {
                        arrayList4.add(obj4);
                    }
                }
                if (arrayList4.isEmpty()) {
                    z = false;
                } else {
                    Iterator it12 = arrayList4.iterator();
                    while (it12.hasNext()) {
                        if (e1.G(((n) it12.next()).f183174b)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return Boolean.FALSE;
            case 12:
                Function0 getDefaultLoadingItems2 = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return Boolean.FALSE;
            case 14:
                Function0 getDefaultLoadingItems3 = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 15:
                l71.d userCompany = (l71.d) it8;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                UserCompanyRegion userCompanyRegionA = userCompany.a();
                Intrinsics.checkNotNullParameter(userCompanyRegionA, "<this>");
                int i = vb6.f.f287431a[userCompanyRegionA.ordinal()];
                return Boolean.valueOf((i == 1 || i == 2 || i == 3 || i == 4) && !d0.J(userCompany.f192498a, "Revolut LTD", false));
            case 16:
                ActionsView.Item it13 = (ActionsView.Item) it8;
                KProperty[] kPropertyArr = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f58316a, "ACTION_ID_DONATE"));
            case 17:
                ActionsView.Item it14 = (ActionsView.Item) it8;
                KProperty[] kPropertyArr2 = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj5 = it14.f58324n;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.donations.api.model.Charity");
                return (l) obj5;
            case 18:
                PlainTextDelegate.Model it15 = (PlainTextDelegate.Model) it8;
                KProperty[] kPropertyArr3 = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f52926a, "ITEM_ID_DESCRIPTION_CELL"));
            case 19:
                PlainTextDelegate.Model item = (PlainTextDelegate.Model) it8;
                KProperty[] kPropertyArr4 = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(item, "item");
                return Boolean.valueOf(!(item.f instanceof u5));
            case 20:
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Data(it8, null, false, 6, null);
            case 21:
                Throwable throwable = (Throwable) it8;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return z9h.n.f(null, throwable, false, 4, null);
            case 22:
                Pair pair2 = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return Boolean.valueOf(((r0) pair2.f186385a).f201447a == x0.OPTED_IN && ((h1) pair2.f186386b).f201377c);
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                return Boolean.FALSE;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                List listC = u.c(new gu("item_id_title", R$attr.uikit_dp32, 0, 28));
                List listK = v.k(new pb0("ITEM_ID_LOADING_PREFIX0"), new pb0("ITEM_ID_LOADING_PREFIX1"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                List listO = i2b.a.o(i2b.a.o(listC, listK), u.c(new gu("ITEM_ID_DESCRIPTION_SUBHEADER", R$attr.uikit_dp32, 0, 28)));
                t10 t10Var = new t10("ITEM_ID_LOADING_TEXT", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                return new s(i2b.a.p(listO, t10Var));
            case 25:
                Function0 getDefaultLoadingItems4 = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems4, "getDefaultLoadingItems");
                i iVar = (i) zhm.d0.b0((List) getDefaultLoadingItems4.invoke());
                yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
                return iVar;
            case 26:
                Function0 getDefaultLoadingItems5 = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems5, "getDefaultLoadingItems");
                i iVar2 = (i) zhm.d0.b0((List) getDefaultLoadingItems5.invoke());
                yp0.b.l(iVar2, 0, 0, 0, 0, null, false, 63);
                return iVar2;
            case 27:
                String it16 = (String) it8;
                KProperty[] kPropertyArr5 = TravelHotelsLocationPickerScreen.S;
                Intrinsics.checkNotNullParameter(it16, "it");
                return d0.F0(it16).toString();
            case 28:
                Throwable error = (Throwable) it8;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.TRUE;
            default:
                LocationDomain locationDomain = (LocationDomain) it8;
                Intrinsics.checkNotNullParameter(locationDomain, "locationDomain");
                double d = locationDomain.f78066a;
                double d5 = locationDomain.f78067b;
                return new LocationMapBoundaries(new Coordinates(d + 0.1d, d5 + 0.1d, null), new Coordinates(d - 0.1d, d5 - 0.1d, null));
        }
    }

    public /* synthetic */ a(z zVar) {
        this.f268969a = 24;
    }
}
