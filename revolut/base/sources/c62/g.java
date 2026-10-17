package c62;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import i02.j;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21589b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21588a = iArr;
        int[] iArr2 = new int[ApmPaymentProfile.values().length];
        try {
            iArr2[ApmPaymentProfile.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ApmPaymentProfile.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f21589b = iArr2;
    }
}
