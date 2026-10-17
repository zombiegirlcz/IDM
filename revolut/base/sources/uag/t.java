package uag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278656a;

    static {
        int[] iArr = new int[TravelHotelsHomeFlowContract$PagerItem.values().length];
        try {
            iArr[TravelHotelsHomeFlowContract$PagerItem.DISCOVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TravelHotelsHomeFlowContract$PagerItem.FAVORITES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TravelHotelsHomeFlowContract$PagerItem.BOOKINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TravelHotelsHomeFlowContract$PagerItem.TRANSFERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f278656a = iArr;
    }
}
