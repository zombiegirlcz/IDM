package mll;

import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import jkl.a3;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f207065b;

    static {
        int[] iArr = new int[a3.values().length];
        try {
            iArr[a3.CHAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f207064a = iArr;
        int[] iArr2 = new int[RevolutSsoApi$InputData$CombinedAuthentication.b.values().length];
        try {
            iArr2[RevolutSsoApi$InputData$CombinedAuthentication.b.TWO_BUTTONS_UI.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[RevolutSsoApi$InputData$CombinedAuthentication.b.UNIFIED_UI.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f207065b = iArr2;
    }
}
