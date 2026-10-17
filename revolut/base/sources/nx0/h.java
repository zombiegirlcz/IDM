package nx0;

import bw0.l;
import bw0.n;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f220048c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.ACTION_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.ACTION_INFO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.ACTION_ACCENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f220046a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f220047b = iArr2;
        int[] iArr3 = new int[g.values().length];
        try {
            iArr3[g.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[g.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[g.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        f220048c = iArr3;
        int[] iArr4 = new int[f.values().length];
        try {
            iArr4[f.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[f.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
