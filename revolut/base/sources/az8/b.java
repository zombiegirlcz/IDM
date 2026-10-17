package az8;

import com.onfido.android.sdk.capture.ExitCode;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11404a;

    static {
        int[] iArr = new int[ExitCode.values().length];
        try {
            iArr[ExitCode.USER_LEFT_ACTIVITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExitCode.USER_CONSENT_DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExitCode.REQUIRED_NFC_FLOW_NOT_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11404a = iArr;
    }
}
