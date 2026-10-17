package e9f;

import g9f.g0;
import g9f.l0;
import g9f.v;
import u8f.e;
import u8f.f;
import u8f.g;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f123983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f123984c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g0.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g0.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f123982a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[v.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f123983b = iArr2;
        int[] iArr3 = new int[l0.values().length];
        try {
            iArr3[l0.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[l0.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[l0.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[l0.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[l0.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f123984c = iArr3;
        int[] iArr4 = new int[f.values().length];
        try {
            iArr4[f.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[f.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[f.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[f.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[f.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[f.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        d = iArr4;
        int[] iArr5 = new int[e.values().length];
        try {
            iArr5[e.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[e.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
        int[] iArr6 = new int[g.values().length];
        try {
            iArr6[g.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[g.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[g.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[g.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[g.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused26) {
        }
        f = iArr6;
    }
}
