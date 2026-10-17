package kcg;

import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f182732a;

    public h(p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f182732a = travelHotelsFeatureInteractor;
    }

    public static HotelsPointsRedeemOption a(Pricing pricing) {
        List list = pricing.f;
        Object next = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                long j2 = ((HotelsPointsRedeemOption) next).f97977c.f115082a;
                do {
                    Object next2 = it8.next();
                    long j3 = ((HotelsPointsRedeemOption) next2).f97977c.f115082a;
                    if (j2 < j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it8.hasNext());
            }
        }
        return (HotelsPointsRedeemOption) next;
    }
}
