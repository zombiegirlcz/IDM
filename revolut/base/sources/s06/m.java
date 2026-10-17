package s06;

import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258866a;

    static {
        int[] iArr = new int[RevolutSsoApi$InputData$CombinedAuthentication.b.values().length];
        try {
            iArr[RevolutSsoApi$InputData$CombinedAuthentication.b.TWO_BUTTONS_UI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RevolutSsoApi$InputData$CombinedAuthentication.b.UNIFIED_UI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f258866a = iArr;
    }
}
