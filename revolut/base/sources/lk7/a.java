package lk7;

import com.revolut.feature.insurance.api.models.details.CFACCoverageType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196272a;

    static {
        int[] iArr = new int[CFACCoverageType.values().length];
        try {
            iArr[CFACCoverageType.TRANSPORTATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CFACCoverageType.ACCOMMODATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CFACCoverageType.TRANSPORTATION_BOOKINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CFACCoverageType.SPORT_RENTALS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CFACCoverageType.EVENTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CFACCoverageType.SPORT_RENTALS_AND_EVENTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CFACCoverageType.ATTRACTIONS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CFACCoverageType.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f196272a = iArr;
    }
}
