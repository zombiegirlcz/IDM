package m1a;

import com.revolut.domain.models.moneyrequest.SplitPayerType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201316a;

    static {
        int[] iArr = new int[SplitPayerType.values().length];
        try {
            iArr[SplitPayerType.CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SplitPayerType.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SplitPayerType.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SplitPayerType.USER_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SplitPayerType.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f201316a = iArr;
    }
}
