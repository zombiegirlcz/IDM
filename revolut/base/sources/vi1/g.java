package vi1;

import com.revolut.feature.address.models.AddressFormat;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289500a;

    static {
        int[] iArr = new int[AddressFormat.values().length];
        try {
            iArr[AddressFormat.DETAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressFormat.INTERNATIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f289500a = iArr;
    }
}
