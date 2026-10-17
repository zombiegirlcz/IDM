package zab;

import com.revolut.domain.models.login.ChannelType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f320617a;

    static {
        int[] iArr = new int[ChannelType.values().length];
        try {
            iArr[ChannelType.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChannelType.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChannelType.CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f320617a = iArr;
    }
}
