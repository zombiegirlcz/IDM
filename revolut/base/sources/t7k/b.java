package t7k;

import com.revolut.domain.models.moneyrequest.TransferLinkDirection;
import com.revolut.domain.models.moneyrequest.TransferLinkState;
import do3.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f268745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f268746c;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.YOUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f268744a = iArr;
        int[] iArr2 = new int[TransferLinkDirection.values().length];
        try {
            iArr2[TransferLinkDirection.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransferLinkDirection.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f268745b = iArr2;
        int[] iArr3 = new int[TransferLinkState.values().length];
        try {
            iArr3[TransferLinkState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[TransferLinkState.REDEEMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[TransferLinkState.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TransferLinkState.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[TransferLinkState.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f268746c = iArr3;
    }
}
