package dv9;

import com.revolut.domain.models.moneyrequest.TransferLinkDirection;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118060a;

    static {
        int[] iArr = new int[TransferLinkDirection.values().length];
        try {
            iArr[TransferLinkDirection.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferLinkDirection.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118060a = iArr;
    }
}
