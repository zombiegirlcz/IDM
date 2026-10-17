package g5a;

import com.revolut.domain.models.moneyrequest.TransferLinkDirection;
import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f140699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f140700c;

    static {
        int[] iArr = new int[dv9.n.values().length];
        try {
            iArr[dv9.n.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dv9.n.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f140698a = iArr;
        int[] iArr2 = new int[TransferLinkDirection.values().length];
        try {
            iArr2[TransferLinkDirection.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransferLinkDirection.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f140699b = iArr2;
        int[] iArr3 = new int[v6.values().length];
        try {
            iArr3[v6.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[v6.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[v6.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[v6.RECORDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[v6.REVERTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[v6.DECLINED.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[v6.CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[v6.FAILED.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[v6.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        f140700c = iArr3;
    }
}
