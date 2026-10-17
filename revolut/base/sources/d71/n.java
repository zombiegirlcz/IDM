package d71;

import com.revolut.domain.models.support.TroubleshootingCardDeliveryState;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111773a;

    static {
        int[] iArr = new int[TroubleshootingCardDeliveryState.values().length];
        try {
            iArr[TroubleshootingCardDeliveryState.BEING_POSTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TroubleshootingCardDeliveryState.TRACKED_ON_WAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TroubleshootingCardDeliveryState.TRACKED_SHOULD_DELIVERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f111773a = iArr;
    }
}
