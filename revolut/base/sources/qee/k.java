package qee;

import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f245127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f245128b;

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
        f245127a = iArr;
        int[] iArr2 = new int[l93.d.values().length];
        try {
            iArr2[l93.d.NOT_ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l93.d.SELF_EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f245128b = iArr2;
    }
}
