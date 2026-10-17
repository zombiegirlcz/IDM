package ylc;

import alc.k;
import alc.m;
import zlc.b;
import zlc.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f314686c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[b.a.values().length];
        try {
            iArr[b.a.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.a.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.a.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.a.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f314684a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[k.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f314685b = iArr2;
        int[] iArr3 = new int[c.EnumC1794c.values().length];
        try {
            iArr3[c.EnumC1794c.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[c.EnumC1794c.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[c.EnumC1794c.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[c.EnumC1794c.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[c.EnumC1794c.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f314686c = iArr3;
        int[] iArr4 = new int[xdh.c.values().length];
        try {
            iArr4[xdh.c.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[xdh.c.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[xdh.c.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[xdh.c.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[xdh.c.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        d = iArr4;
        int[] iArr5 = new int[m.values().length];
        try {
            iArr5[m.PORTFOLIO_TEMPLATE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[m.PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[m.WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[m.FUNDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[m.INITIAL_FUNDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        e = iArr5;
        int[] iArr6 = new int[c.b.values().length];
        try {
            iArr6[c.b.PORTFOLIO_TEMPLATE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[c.b.PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[c.b.WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[c.b.FUNDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[c.b.INITIAL_FUNDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused28) {
        }
        f = iArr6;
    }
}
