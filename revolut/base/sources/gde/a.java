package gde;

import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143172a;

    static {
        int[] iArr = new int[CardDeliveryTroubleshootingFeatureFlow.values().length];
        try {
            iArr[CardDeliveryTroubleshootingFeatureFlow.CARD_TROUBLESHOOTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardDeliveryTroubleshootingFeatureFlow.JUNIOR_CARD_TROUBLESHOOTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f143172a = iArr;
    }
}
