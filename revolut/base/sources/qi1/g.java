package qi1;

import com.revolut.feature.address.models.AddressVerificationFailureReason;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246625a;

    static {
        int[] iArr = new int[AddressVerificationFailureReason.values().length];
        try {
            iArr[AddressVerificationFailureReason.NON_RESIDENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f246625a = iArr;
    }
}
