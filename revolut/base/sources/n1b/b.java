package n1b;

import com.appsflyer.deeplink.DeepLinkResult;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211306b;

    static {
        int[] iArr = new int[DeepLinkResult.Status.values().length];
        try {
            iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f211305a = iArr;
        int[] iArr2 = new int[DeepLinkResult.Error.values().length];
        try {
            iArr2[DeepLinkResult.Error.TIMEOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DeepLinkResult.Error.NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DeepLinkResult.Error.HTTP_STATUS_CODE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeepLinkResult.Error.UNEXPECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeepLinkResult.Error.DEVELOPER_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f211306b = iArr2;
    }
}
