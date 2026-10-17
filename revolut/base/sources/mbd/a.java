package mbd;

import lcd.d;
import lcd.e;
import ncd.g;
import pcd.h0;
import pcd.i0;
import pcd.o;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f204197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f204198c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f204199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int[] f204200h;
    public static final /* synthetic */ int[] i;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PENDING_ACTIVATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f204196a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.AWAITING_CUSTOMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.AWAITING_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f204197b = iArr2;
        int[] iArr3 = new int[g.values().length];
        try {
            iArr3[g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[g.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f204198c = iArr3;
        int[] iArr4 = new int[lcd.a.values().length];
        try {
            iArr4[lcd.a.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[lcd.a.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[lcd.a.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[lcd.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[lcd.a.TEEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[lcd.b.values().length];
        try {
            iArr5[lcd.b.AWAITING_TAX_INFORMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        e = iArr5;
        int[] iArr6 = new int[h0.values().length];
        try {
            iArr6[h0.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[h0.PENDING_ACTIVATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[h0.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[h0.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        f = iArr6;
        int[] iArr7 = new int[i0.values().length];
        try {
            iArr7[i0.AWAITING_CUSTOMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr7[i0.AWAITING_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        f204199g = iArr7;
        int[] iArr8 = new int[pcd.b.values().length];
        try {
            iArr8[pcd.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr8[pcd.b.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr8[pcd.b.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr8[pcd.b.PERSONAL_UNDER_18.ordinal()] = 4;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr8[pcd.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused26) {
        }
        f204200h = iArr8;
        int[] iArr9 = new int[o.values().length];
        try {
            iArr9[o.AWAITING_TAX_INFORMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr9[o.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        i = iArr9;
    }
}
