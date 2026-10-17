package nz8;

import u09.y;
import uz8.p;
import uz8.r;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f220997c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[y.values().length];
        try {
            iArr[y.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y.NOT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y.CONTENT_STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y.CONTENT_FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y.QUIZ_STARTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[y.COMPLETED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f220995a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p.CONTENT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p.CONTENT_FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[p.QUIZ_STARTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[p.COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[p.LOCKED.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        f220996b = iArr2;
        int[] iArr3 = new int[r.values().length];
        try {
            iArr3[r.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[r.PAYABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[r.PAYMENT_PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[r.PAID.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[r.INCENTIVE_ENDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        f220997c = iArr3;
        int[] iArr4 = new int[uz8.d.values().length];
        try {
            iArr4[uz8.d.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[uz8.d.FAILED_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[uz8.d.FAILED_BLOCKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        d = iArr4;
        int[] iArr5 = new int[uz8.k.values().length];
        try {
            iArr5[uz8.k.US_LOCATION_POPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
    }
}
