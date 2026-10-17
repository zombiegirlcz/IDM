package nd8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsPropertyDetailsDestination;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import com.revolut.feature_travel_hotels_models.property.room.Rates;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.gu;
import ip0.pb0;
import ip0.s1;
import ip0.t1;
import ip0.w60;
import ip0.x60;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nhg.s;
import retrofit2.HttpException;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214339a;

    public /* synthetic */ i(int i) {
        this.f214339a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214339a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return u.c(new x60("BLANK_CARD_DELIVERY_LOADING_STATE_ID", w60.BACKGROUND_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            case 1:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data juniorName = new Data(null, null, true, 3, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(juniorName, "juniorName");
                return new f(juniorName);
            case 2:
                JuniorBankingProfile it8 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f77099b;
            case 3:
                ne0.m it9 = (ne0.m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f214393a;
            case 4:
                lef.f dto = (lef.f) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return oef.b.a(dto);
            case 5:
                neg.l it10 = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f214514a;
            case 6:
                neg.l update2 = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return neg.l.a(update2, null, null, null, null, null, null, null, null, new Data(null, null, true, 3, null), false, null, 0L, 3839);
            case 7:
                neg.l update3 = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return neg.l.a(update3, null, null, null, new zfi.a(0), new zfi.a(0), null, null, null, null, false, null, 0L, 4071);
            case 8:
                neg.l update4 = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                od0.i.Companion.getClass();
                return neg.l.a(update4, null, null, null, null, null, null, null, null, new Data(od0.i.f224256b, null, false, 6, null), false, null, 0L, 3839);
            case 9:
                neg.l update5 = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                od0.i.Companion.getClass();
                return neg.l.a(update5, null, null, null, null, null, null, null, null, new Data(od0.i.f224256b, null, false, 6, null), false, null, 0L, 3839);
            case 10:
                return new Data(null, (Throwable) obj2, false, 5, null);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                eVarB.add(new gu("POPULAR_FILTER_SUBHEADER_LOADING", 0, 0, 30));
                ArrayList arrayList = new ArrayList(6);
                for (int i = 0; i < 6; i++) {
                    t1 t1Var = new t1(a0.d.n("POPULAR_FILTER_", i), s1.ICON, 4);
                    yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(t1Var);
                }
                int i2 = R$attr.uikit_dp0;
                int i3 = R$attr.uikit_dp4;
                eVarB.add(new xk("POPULAR_FILTER_GRID_LOADING", arrayList, 3, null, null, i2, 0, i3, i3, 63864));
                eVarB.add(new gu("CHECK_BOX_SUBHEADER__LOADING", 0, 0, 30));
                ArrayList arrayList2 = new ArrayList(3);
                for (int i5 = 0; i5 < 3; i5++) {
                    arrayList2.add(t61.a.o("CHECK_BOX_", i5, pb0.Companion, false, 4));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                return new neg.o(u.a(eVarB), neg.k.GONE);
            case 12:
                HotelsProperty property = (HotelsProperty) obj2;
                Intrinsics.checkNotNullParameter(property, "property");
                rfm.u uVarG = efm.k.g(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TravelHotelsPropertyDetailsDestination(new HotelsPropertyInputData.BookableProperty(property, null, null, null, null, 30), null, false, false, 14), false, (Integer) null, 0, 61)));
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 13:
                List roomsList = (List) obj2;
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                List list = roomsList;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(((HotelsPropertyRoom) it11.next()).e);
                }
                ArrayList arrayListU = w.u(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayListU) {
                    if (((Rates) obj3).f98117c != 0) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 14:
                FeatureCommand it12 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12;
            case 15:
                nf4.e update6 = (nf4.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return nf4.e.a(update6, null, Data.copy$default(update6.f214806b, null, null, true, 3, null), 1);
            case 16:
                ax4.b updateConstructorState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                return new ax4.b(0);
            case 17:
                nfc.e updateState = (nfc.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                m70.a.c(t0.f186434a);
                return nfc.e.a(updateState, new VatSelection.Registered(""));
            case 18:
                nfc.e updateState2 = (nfc.e) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return nfc.e.a(updateState2, VatSelection.NotRegistered.f60584a);
            case 19:
                HttpException it13 = (HttpException) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 21:
                jel.c it14 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (it14 instanceof b0) {
                    return (b0) it14;
                }
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 23:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update7 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update7, null, null, null, null, null, null, null, a.b.f94319a, false, null, null, false, null, 8063);
            case 24:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update8 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update8, null, null, null, null, null, null, null, null, false, null, null, true, null, 6143);
            case 25:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update9 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update9, null, null, null, null, null, null, s.EXPANDED, null, false, null, null, false, null, 8127);
            case 26:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update10 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update10, update10.f94323b, update10.f94322a, null, null, null, null, null, null, false, null, null, false, null, 8188);
            case 27:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update11 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update11, null, null, null, null, null, null, null, null, false, null, null, false, null, 7903);
            case 28:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update12 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update12, null, null, null, null, null, null, s.COLLAPSED, null, false, null, null, false, null, 8127);
            default:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update13 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update13, null, null, null, null, null, null, null, a.d.f94321a, false, null, null, false, null, 8063);
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f214339a = i;
    }
}
