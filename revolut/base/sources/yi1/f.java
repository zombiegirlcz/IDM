package yi1;

import com.revolut.feature.address.models.AddressFormat;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314218a;

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
        f314218a = iArr;
    }
}
