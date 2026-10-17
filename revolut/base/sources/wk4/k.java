package wk4;

import ch.qos.logback.core.CoreConstants;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterDurationRange;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterPriceRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mb5.u;
import x8h.j0;
import x8h.k0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f298245b;

    public /* synthetic */ k(int i, int i2) {
        this.f298244a = i2;
        this.f298245b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298244a) {
            case 0:
                a updateState = (a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Integer numValueOf = Integer.valueOf(this.f298245b + 1);
                List unavailableDays = updateState.f298234b;
                boolean z = updateState.f298235c;
                long j2 = updateState.d;
                u selectedPaymentType = updateState.e;
                Intrinsics.checkNotNullParameter(unavailableDays, "unavailableDays");
                Intrinsics.checkNotNullParameter(selectedPaymentType, "selectedPaymentType");
                return new a(numValueOf, unavailableDays, z, j2, selectedPaymentType);
            case 1:
                wv2.d update = (wv2.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wv2.d.a(update, this.f298245b, null, null, false, 30);
            case 2:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List listV0 = d0.V0(d0.P0(list, new k0()), this.f298245b);
                ArrayList arrayList = new ArrayList(w.t(listV0, 10));
                Iterator it8 = listV0.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((j0) it8.next()).f303352a);
                }
                return arrayList;
            case 3:
                xdi.g update2 = (xdi.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xdi.g.a(update2, null, null, this.f298245b, 3);
            case 4:
                y6g.k update3 = (y6g.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                FlightSearchFilterDurationRange flightSearchFilterDurationRange = update3.f311273a.f93574c;
                return y6g.k.a(update3, null, null, kotlin.ranges.f.g(this.f298245b, flightSearchFilterDurationRange.f93570a, flightSearchFilterDurationRange.f93571b), null, 23);
            case 5:
                y6g.k update4 = (y6g.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                FlightSearchFilterPriceRange flightSearchFilterPriceRange = update4.f311273a.f93573b;
                int iA = y6g.b.a(flightSearchFilterPriceRange.f93575a);
                dj0.d dVar = flightSearchFilterPriceRange.f93576b;
                int iG = kotlin.ranges.f.g(this.f298245b, iA, y6g.b.a(dVar));
                xi0.b currency = dVar.f115083b;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return y6g.k.a(update4, null, new dj0.d(cp5.d.k(currency) * ((long) iG), currency), 0, null, 27);
            case 6:
                yf4.e update5 = (yf4.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Data config = Data.copy$default(update5.f313173a, null, null, true, 3, null);
                Integer numValueOf2 = Integer.valueOf(this.f298245b);
                Intrinsics.checkNotNullParameter(config, "config");
                return new yf4.e(config, numValueOf2);
            case 7:
                ymk.l update6 = (ymk.l) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ymk.l.a(update6, null, null, false, this.f298245b, 7);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return Integer.valueOf(this.f298245b);
            case 9:
                yu4.d update7 = (yu4.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                int iIntValue = ((Number) update7.d.get(this.f298245b)).intValue();
                int i = update7.f316876a;
                List dueDateSelections = update7.f316878c;
                List days = update7.d;
                Intrinsics.checkNotNullParameter(dueDateSelections, "dueDateSelections");
                Intrinsics.checkNotNullParameter(days, "days");
                return new yu4.d(i, iIntValue, dueDateSelections, days);
            case 10:
                List data = (List) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return new zfd.i(this.f298245b, data, data.isEmpty());
            case 11:
                ((Integer) obj2).intValue();
                throw new IndexOutOfBoundsException(p.a.k(CoreConstants.DOT, "Collection doesn't contain element at index ", this.f298245b));
            case 12:
                znd.a update8 = (znd.a) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return znd.a.a(update8, null, null, null, null, null, null, 0, false, false, false, false, this.f298245b, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67106815);
            case 13:
                znd.a update9 = (znd.a) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return znd.a.a(update9, null, null, null, null, null, null, this.f298245b, false, false, false, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67108799);
            default:
                return (dj0.d) ((List) obj2).get(this.f298245b);
        }
    }
}
