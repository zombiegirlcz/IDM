package ydd;

import pcd.a0;
import pcd.l0;
import pcd.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f312678c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[a0.values().length];
        try {
            iArr[a0.INVITED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a0.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a0.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a0.REFUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a0.LEFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a0.REMOVED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f312676a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.MEMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[z.ADMIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f312677b = iArr2;
        int[] iArr3 = new int[pcd.b.values().length];
        try {
            iArr3[pcd.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[pcd.b.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[pcd.b.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[pcd.b.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[pcd.b.PERSONAL_UNDER_18.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f312678c = iArr3;
        int[] iArr4 = new int[l0.values().length];
        try {
            iArr4[l0.PRO_REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[l0.PRO_TAX.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[l0.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[l0.SAVINGS_FIXED_TERM.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[l0.REGULAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[l0.GROUP.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[l0.MONEY_MARKET_FUND_SAVINGS.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[l0.UNDETERMINED.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        d = iArr4;
    }
}
