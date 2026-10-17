package yi1;

import com.revolut.feature.address.models.AddressFormat;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314213a;

    static {
        int[] iArr = new int[AddressFormat.values().length];
        try {
            iArr[AddressFormat.INTERNATIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressFormat.DETAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f314213a = iArr;
    }
}
