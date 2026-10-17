package o2g;

import android.content.Context;
import androidx.content.ActivityNavigator;
import androidx.content.AnimBuilder;
import androidx.content.NavController;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import do3.n;
import do3.q;
import efm.r;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import n36.l;
import o3b.t;
import o44.i;
import org.joda.time.DateTime;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221623a;

    public /* synthetic */ f(int i) {
        this.f221623a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f221623a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 1:
                CellDetailsActionDelegate.Model it8 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f51781a, "ITEM_ID_REPEATS_PERIOD"));
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 3:
                Intrinsics.checkNotNullParameter((l) obj2, "it");
                return null;
            case 4:
                PaymentVendorCorridor corridor = (PaymentVendorCorridor) obj2;
                Intrinsics.checkNotNullParameter(corridor, "corridor");
                return com.google.android.gms.internal.mlkit_vision_face.a.t(v0.a.m("PaymentVendorCorridor(country=", corridor.f64082a.f297794a, ", currency=", corridor.f64083b.f306286a, ", default="), corridor.f64084c, ")");
            case 5:
                t it9 = (t) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9.i, it9.f221769j);
            case 6:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Integer num = (Integer) it10.getContent();
                if (num != null) {
                    return Boolean.valueOf(num.intValue() > 0);
                }
                return null;
            case 7:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (Boolean) it11.getContent();
            case 8:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(!it12.isEmpty());
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 10:
                Date it13 = (Date) obj2;
                KProperty[] kPropertyArr = TravelExperiencesDatesSelectionScreen.S;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new DateTime(it13.getTime());
            case 11:
                o3g.f updateState = (o3g.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return o3g.f.a(updateState, TravelExperienceDatesSelection.NoDatesSelection.f92906a);
            case 12:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                z1k.e eVar = (z1k.e) it14.getContent();
                List listD = eVar != null ? eVar.getOptions() : null;
                return listD == null ? f0.f322471a : listD;
            case 13:
                o42.e update = (o42.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f221979a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new o42.e(data);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0VarB);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 10);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it15 = intRangeO.iterator();
                while (it15.f289625c) {
                    arrayList.add(new pb0(a0.d.n("ID_LOADING_ITEM", it15.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new i(arrayList);
            case 16:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Data(new o44.d(it16, true, true), null, false, 6, null);
            case 17:
                cu3.b it17 = (cu3.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                if (it17.f108805b) {
                    return te0.w.h(it17.f108804a);
                }
                r rVarError = r.error(new IllegalStateException());
                Intrinsics.checkNotNullExpressionValue(rVarError, "error(...)");
                return rVarError;
            case 18:
                r errors = (r) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                return errors.delay(1000L, TimeUnit.MILLISECONDS).take(10L);
            case 19:
                LocalDate it18 = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.plusMonths(1L);
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 21:
                n it19 = (n) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return q.y(it19);
            case 22:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(r0.g(), error, false, 4, null);
            case 23:
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 25:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 2);
                for (int i = 0; i < 2; i++) {
                    arrayListP.add(new s7(a0.d.n("CELL_LOADING_DETAILS_LIST_ID_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                ArrayList arrayList2 = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList2.add(new s7(a0.d.n("CELL_LOADING_PNL_LIST_ID_", i2), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return d0.E0(arrayList2, arrayListP);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return o4h.i.f222280a;
            case 27:
                return ActivityNavigator.hostActivity$lambda$0((Context) obj2);
            case 28:
                return NavController.activity$lambda$1((Context) obj2);
            default:
                return NavController.handleDeepLink$lambda$21$lambda$18((AnimBuilder) obj2);
        }
    }
}
