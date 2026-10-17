package i62;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158854a;

    static {
        int[] iArr = new int[ApmPaymentProfile.values().length];
        try {
            iArr[ApmPaymentProfile.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApmPaymentProfile.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f158854a = iArr;
    }
}
