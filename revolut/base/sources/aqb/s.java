package aqb;

import android.os.Parcelable;
import androidx.room.RoomDatabase;
import aqd.j0;
import aqd.n0;
import aqd.q0;
import ard.e0;
import ard.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import com.revolut.feature.spending_analytics.api.R$string;
import efm.d0;
import ip0.is;
import ip0.nb0;
import ip0.pb0;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8298a;

    public /* synthetic */ s(int i) {
        this.f8298a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        ZonedDateTime zonedDateTime;
        switch (this.f8298a) {
            case 0:
                f updateState = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return f.a(updateState, TransferWidgetCustomisationScreenContract$BottomSheetState.Customise.f83388a, null, false, null, null, 30);
            case 1:
                f updateState2 = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return f.a(updateState2, TransferWidgetCustomisationScreenContract$BottomSheetState.Customise.f83388a, null, false, null, null, 30);
            case 2:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b.c();
            case 3:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b.c();
            case 4:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b.c();
            case 5:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return f0.f322471a;
            case 6:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                od0.h hVar = od0.i.Companion;
                Address address = user.k;
                String country = address != null ? address.getCountry() : null;
                hVar.getClass();
                return od0.h.a(country);
            case 7:
                aqd.c transactionWithPocketBalance = (aqd.c) obj2;
                Intrinsics.checkNotNullParameter(transactionWithPocketBalance, "transactionWithPocketBalance");
                od0.i.Companion.getClass();
                return new aqd.b(od0.i.f224256b, transactionWithPocketBalance.f8329a, transactionWithPocketBalance.f8330b, null);
            case 8:
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 9:
                aqd.t it12 = (aqd.t) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (aqd.m) it12.f8402a.getContent();
            case 10:
                aqd.t update = (aqd.t) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return aqd.t.a(update, null, null, null, null, false, null, null, 63);
            case 11:
                aqd.t update2 = (aqd.t) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return aqd.t.a(update2, null, null, null, null, false, null, null, 63);
            case 12:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                nb0 nb0Var = pb0.Companion;
                return new q0(yp0.b.g(zhm.v.k(nb0.b(nb0Var, "DESTINATION_LOADING_ITEM_ID1", false, 0, false, 30), nb0.b(nb0Var, "DESTINATION_LOADING_ITEM_ID2", false, 0, false, 30), nb0.b(nb0Var, "DESTINATION_LOADING_ITEM_ID3", false, 0, false, 30)), new ListSubheaderDelegate.Model("SORT_TO_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), n0.f8377a, j0.f8354a);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return zhm.u.c(new is("FILTER_CALIBRATOR_LOADING_ITEM"));
            case 14:
                aqh.i it14 = (aqh.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f8438c;
            case 15:
                aqi.g it15 = (aqi.g) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.f8466a == 1001);
            case 16:
                fo3.c it16 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.d;
            case 17:
                xi0.b it17 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new dj0.d(0L, it17);
            case 18:
                xq6.a dto = (xq6.a) obj2;
                Intrinsics.checkNotNullParameter(dto, "it");
                Intrinsics.checkNotNullParameter(dto, "dto");
                ufm.b bVarM = d0.m(Boolean.valueOf(dto.getSubmitAllowed()));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 19:
                q90.m backendFlowFileUploadValidationResult = (q90.m) obj2;
                Intrinsics.checkNotNullParameter(backendFlowFileUploadValidationResult, "backendFlowFileUploadValidationResult");
                boolean validated = backendFlowFileUploadValidationResult.getValidated();
                List issues = backendFlowFileUploadValidationResult.getIssues();
                if (issues != null) {
                    List list = issues;
                    arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it18 = list.iterator();
                    while (it18.hasNext()) {
                        arrayList.add(((q90.n) it18.next()).getValue());
                    }
                } else {
                    arrayList = null;
                }
                return new xl2.k(arrayList, validated);
            case 20:
                q90.t result = (q90.t) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return Boolean.valueOf(result.getIsValid());
            case 21:
                q90.t result2 = (q90.t) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                return Boolean.valueOf(result2.getIsValid());
            case 22:
                ara.i it19 = (ara.i) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                CardOwnerInfoState cardOwnerInfoState = it19.f8601a;
                return new bra.f(cardOwnerInfoState.f81550b, cardOwnerInfoState.f81549a);
            case 23:
                ard.a update3 = (ard.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ard.a.a(update3, null, h0.f322473a, false, null, null, null, null, null, 1013);
            case 24:
                k71.q it20 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new Data(it20, null, false, 6, null);
            case 25:
                xi0.b it21 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return zi0.c.P(it21, false, null, 3);
            case 26:
                ard.a update4 = (ard.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ard.a.a(update4, null, null, false, null, null, null, null, null, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            case 27:
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                e0.Companion.getClass();
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                if (lowerPage.e == null && lowerPage.d != null) {
                    y yVar = (y) lowerPage.f196172b;
                    if (yVar.d == null || (zonedDateTime = yVar.e) == null) {
                        ZonedDateTime zonedDateTime2 = yVar.f8684a;
                        ZonedDateTime zonedDateTimeMinusMonths = zonedDateTime2.minusMonths(1L);
                        Intrinsics.h(zonedDateTimeMinusMonths);
                        return y.b(yVar, zonedDateTimeMinusMonths, zonedDateTime2);
                    }
                    if (zonedDateTime == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ZonedDateTime zonedDateTime3 = yVar.f8685b;
                    if (zonedDateTime3.compareTo((ChronoZonedDateTime<?>) zonedDateTime) < 0) {
                        ZonedDateTime zonedDateTimePlusMonths = zonedDateTime3.plusMonths(1L);
                        if (zonedDateTimePlusMonths.compareTo((ChronoZonedDateTime<?>) zonedDateTime) < 0) {
                            zonedDateTime = zonedDateTimePlusMonths;
                        }
                        return y.b(yVar, zonedDateTime3, zonedDateTime);
                    }
                }
                return null;
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new arf.e(null, (List) getDefaultLoadingItems.invoke(), false);
            default:
                List it22 = (List) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                j61.c cVar = (j61.c) zhm.d0.d0(it22);
                if (cVar != null) {
                    return cVar.f171656a;
                }
                return null;
        }
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f8298a = i;
    }
}
