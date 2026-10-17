package i1c;

import m1c.f1;
import m1c.s1;
import m1c.t1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f157605c;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.EXPERIENCES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.STAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f1.SHOPS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f1.MILES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f1.REVPOINTS_POCKET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f157603a = iArr;
        int[] iArr2 = new int[t1.values().length];
        try {
            iArr2[t1.REWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[t1.REWARD_RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[t1.REDEMPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[t1.REDEMPTION_REVERT.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[t1.EXPIRATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[t1.TRANSFER.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f157604b = iArr2;
        int[] iArr3 = new int[s1.values().length];
        try {
            iArr3[s1.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[s1.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[s1.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        f157605c = iArr3;
    }
}
