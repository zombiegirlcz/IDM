package u7k;

import com.revolut.domain.models.moneyrequest.TransferLinkState;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f277962a;

    static {
        int[] iArr = new int[TransferLinkState.values().length];
        try {
            iArr[TransferLinkState.REDEEMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferLinkState.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferLinkState.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferLinkState.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransferLinkState.ACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f277962a = iArr;
    }
}
