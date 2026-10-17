package ok;

import com.meshconnect.link.entity.Type;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225852a;

    static {
        int[] iArr = new int[Type.values().length];
        try {
            iArr[Type.close.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Type.done.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Type.showClose.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Type.loaded.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Type.brokerageAccountAccessToken.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Type.transferFinished.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Type.delayedAuthentication.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Type.error.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Type.openTrueAuth.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f225852a = iArr;
    }
}
