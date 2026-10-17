package t50;

import com.revolut.chat.ui.flow.RatingSupportType;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268023a;

    static {
        int[] iArr = new int[RatingSupportType.values().length];
        try {
            iArr[RatingSupportType.CHAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RatingSupportType.CALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RatingSupportType.CALL_AND_CHAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f268023a = iArr;
    }
}
