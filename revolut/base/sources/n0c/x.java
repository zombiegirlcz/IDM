package n0c;

import m1c.f1;
import m1c.s1;
import m1c.t1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f211007c;

    static {
        int[] iArr = new int[s1.values().length];
        try {
            iArr[s1.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s1.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s1.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s1.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f211005a = iArr;
        int[] iArr2 = new int[t1.values().length];
        try {
            iArr2[t1.REWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[t1.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f211006b = iArr2;
        int[] iArr3 = new int[f1.values().length];
        try {
            iArr3[f1.DONATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        f211007c = iArr3;
    }
}
