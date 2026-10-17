package t42;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267867b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SUBMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.DRAFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.SETTINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.SCHEDULE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f267866a = iArr;
        int[] iArr2 = new int[ApmPaymentProfile.values().length];
        try {
            iArr2[ApmPaymentProfile.PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ApmPaymentProfile.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f267867b = iArr2;
    }
}
