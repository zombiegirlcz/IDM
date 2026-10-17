package o11;

import com.revolut.domain.models.security_settings.SecuritySettingType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221265a;

    static {
        int[] iArr = new int[SecuritySettingType.values().length];
        try {
            iArr[SecuritySettingType.INCOGNITO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecuritySettingType.ANALYTICS_EVENTS_TRACKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecuritySettingType.CREDIT_DATA_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SecuritySettingType.THIRD_PARTY_PROMOTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SecuritySettingType.TRANSACTIONS_USAGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SecuritySettingType.REVOLUT_PRODUCTS_USAGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SecuritySettingType.REVPOINTS_PROFILE_USAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f221265a = iArr;
    }
}
