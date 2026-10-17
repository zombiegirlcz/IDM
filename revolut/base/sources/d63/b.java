package d63;

import com.github.devnied.emvnfccard.model.enums.CardStateEnum;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111442a;

    static {
        int[] iArr = new int[CardStateEnum.values().length];
        try {
            iArr[CardStateEnum.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardStateEnum.LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardStateEnum.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f111442a = iArr;
    }
}
