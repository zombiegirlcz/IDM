package n50;

import i20.h0;
import v20.b1;
import v20.q2;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f212516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f212517c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[q2.values().length];
        try {
            iArr[q2.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q2.UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q2.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f212515a = iArr;
        int[] iArr2 = new int[h0.values().length];
        try {
            iArr2[h0.CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f212516b = iArr2;
        int[] iArr3 = new int[c.values().length];
        try {
            iArr3[c.SENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[c.COMPOSER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f212517c = iArr3;
        int[] iArr4 = new int[b1.values().length];
        try {
            iArr4[b1.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[b1.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[b1.COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
    }
}
