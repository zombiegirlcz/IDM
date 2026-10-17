package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f151851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelMilesNumberRangeFilter f151852c;
    public final TravelMilesMoneyRangeFilter d;
    public final ArrayList e;
    public final ArrayList f;

    public j(ArrayList numberOfStops, ArrayList cabin, TravelMilesNumberRangeFilter priceInPoints, TravelMilesMoneyRangeFilter fees, ArrayList airlines, ArrayList milesProgrammes) {
        Intrinsics.checkNotNullParameter(numberOfStops, "numberOfStops");
        Intrinsics.checkNotNullParameter(cabin, "cabin");
        Intrinsics.checkNotNullParameter(priceInPoints, "priceInPoints");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(milesProgrammes, "milesProgrammes");
        this.f151850a = numberOfStops;
        this.f151851b = cabin;
        this.f151852c = priceInPoints;
        this.d = fees;
        this.e = airlines;
        this.f = milesProgrammes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f151850a.equals(jVar.f151850a) && this.f151851b.equals(jVar.f151851b) && this.f151852c.equals(jVar.f151852c) && this.d.equals(jVar.d) && this.e.equals(jVar.e) && this.f.equals(jVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((this.f151852c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f151851b, this.f151850a.hashCode() * 31, 31)) * 31)) * 31, 31);
    }
}
