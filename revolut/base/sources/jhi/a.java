package jhi;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.impl.error.InvalidPostCodeError;
import com.revolut.feature.address.common.impl.flow.screen.find.a;
import com.revolut.feature.address.models.AddressSearchListResult;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.retail.core.navigation.NaviCommand;
import fed.c0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import m1c.x;
import m1c.y;
import m1c.z;
import mid.o;
import yp0.e0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174254a;

    public /* synthetic */ a(int i) {
        this.f174254a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        x xVar;
        RevPoints revPoints;
        int i = this.f174254a;
        a.C0454a c0454a = a.C0454a.f61015a;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new Pair((Pair) pair.f186385a, (Pair) pair.f186386b);
            case 1:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = jhl.a.f174314a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                tlm.f fVar = new tlm.f();
                jt0.b bVar = new jt0.b(o0.f186429a.b(fed.f.class));
                bVar.b0(new a(2));
                bVar.O(fVar);
                tlm.d dVarA = fVar.a();
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 2:
                Lazy lazy2 = jhl.a.f174314a;
                return c0.INSTANCE.serializer();
            case 3:
                ji1.e update = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ji1.e.a(update, null, c0454a, null, 5);
            case 4:
                ji1.e update2 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ji1.e.a(update2, null, new ji1.h(new Data(f0.f322471a, null, false, 6, null)), null, 5);
            case 5:
                ji1.e update3 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ji1.e.a(update3, null, c0454a, null, 5);
            case 6:
                ji1.e update4 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ji1.e.a(update4, null, c0454a, null, 5);
            case 7:
                ji1.e update5 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ji1.e.a(update5, null, new ji1.g(zi0.c.P(new AddressSearchListResult(f0.f322471a, null), false, null, 3), null), null, 5);
            case 8:
                ji1.e update6 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ji1.e.a(update6, null, c0454a, null, 5);
            case 9:
                ji1.e update7 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ji1.e.a(update7, null, new ji1.g(new Data(null, InvalidPostCodeError.f60963a, false, 5, null), null), null, 5);
            case 10:
                ji1.e update8 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return ji1.e.a(update8, null, new ji1.h(new Data(null, null, true, 3, null)), null, 5);
            case 11:
                return ji1.e.a((ji1.e) obj2, null, new ji1.h(new Data(f0.f322471a, null, false, 6, null)), null, 5);
            case 12:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ListSubheaderDelegate.Model modelB = com.revolut.feature.address.common.impl.flow.screen.find.c.b();
                List listA = xi1.a.a();
                yp0.b.k(listA, 0, 0, 0, 0, 31);
                return ue0.e.J(modelB, listA);
            case 13:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List listA2 = xi1.a.a();
                yp0.b.k(listA2, 0, 0, 0, 0, 31);
                return listA2;
            case 14:
                yoj.a cryptoFeature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(cryptoFeature, "cryptoFeature");
                return yoj.b.k(cryptoFeature) ? yh5.a.ENABLED_AND_ONBOARDED : yoj.b.l(cryptoFeature) ? yh5.a.ONBOARDING_REQUIRED : yh5.a.FEATURE_UNAVAILABLE;
            case 15:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (NaviCommand) it10.f224257a;
            case 16:
                ec5.c it11 = (ec5.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ec5.j jVar = it11.f124432a;
                if (jVar != ec5.j.NOT_ELIGIBLE && it11.f124433b && jVar != ec5.j.COMPLETED) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                ec5.b it12 = (ec5.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ec5.c cVar = it12.f124430b;
                return cVar == null ? new ec5.c(ec5.j.UNKNOWN, false, null, null) : cVar;
            case 18:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 10, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it13 = intRangeU.iterator();
                while (it13.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("INSTRUMENTS_TREND_COLLECTIONS_LOADING_INSTRUMENT_", it13.nextInt()), false, 0, false, 30));
                }
                return arrayList;
            case 19:
                qi7.c customAttributes = (qi7.c) obj2;
                Intrinsics.checkNotNullParameter(customAttributes, "customAttributes");
                return Boolean.valueOf(customAttributes.f246664c >= BitmapDescriptorFactory.HUE_RED);
            case 20:
                qi7.c customAttributes2 = (qi7.c) obj2;
                Intrinsics.checkNotNullParameter(customAttributes2, "customAttributes");
                return Boolean.valueOf(customAttributes2.f246664c < BitmapDescriptorFactory.HUE_RED);
            case 21:
                lk0.e it14 = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return null;
            case 22:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                List list = previousPage.f196171a;
                if (list.isEmpty() || list.size() < 12) {
                    return null;
                }
                return new mid.l(list.size() + ((mid.l) previousPage.f196172b).f205723a);
            case 23:
                z status = (z) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                y yVar = status instanceof y ? (y) status : null;
                return Double.valueOf((yVar == null || (xVar = yVar.f201475a) == null || (revPoints = xVar.f201472c) == null) ? 0.0d : revPoints.J());
            case 24:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.SHOPS) : b39.b.f12015a;
            case 25:
                LocationDomain lastLocation = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
                od0.h hVar = od0.i.Companion;
                co3.a aVar = new co3.a(lastLocation.f78066a, lastLocation.f78067b);
                hVar.getClass();
                return od0.h.a(aVar);
            case 26:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 27:
                o response = (o) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return new rhd.b(response.f205736a, response.f205737b, response.f205738c);
            case 28:
                AccountContent accountContent = (AccountContent) obj2;
                Intrinsics.checkNotNullParameter(accountContent, "accountContent");
                return accountContent.f89475b.getF89505g();
            default:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i2 = 0; i2 < 5; i2++) {
                    arrayListP.add(nb0.b(pb0.Companion, String.valueOf(i2), false, 0, false, 30));
                }
                return yp0.b.h(arrayListP, new gu("AVAILABLE_SUB_HEADER_LIST_ID", 0, 0, 30), e0.INSIDE_BOX, 0, 124);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f174254a = i;
    }
}
