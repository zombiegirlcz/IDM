package l4g;

import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192120a;

    static {
        int[] iArr = new int[TravelFlightsHomeFlowContract$PagerItem.values().length];
        try {
            iArr[TravelFlightsHomeFlowContract$PagerItem.DISCOVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TravelFlightsHomeFlowContract$PagerItem.BOOKINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f192120a = iArr;
    }
}
