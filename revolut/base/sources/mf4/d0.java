package mf4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f204849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f204850c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[cv3.h.values().length];
        try {
            iArr[cv3.h.BNPL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cv3.h.LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cv3.h.REFINANCING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f204848a = iArr;
        int[] iArr2 = new int[yja.b.values().length];
        try {
            iArr2[yja.b.NEXT_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yja.b.ALREADY_SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yja.b.CLOSE_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yja.b.NOT_FOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f204849b = iArr2;
        int[] iArr3 = new int[cv3.i.values().length];
        try {
            iArr3[cv3.i.CREDITS_TO_SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[cv3.i.CALCULATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[cv3.i.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f204850c = iArr3;
        int[] iArr4 = new int[hs3.j0.values().length];
        try {
            iArr4[hs3.j0.WITH_IMAGE_HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[hs3.j0.TOP_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[hs3.j0.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
        int[] iArr5 = new int[hs3.l0.values().length];
        try {
            iArr5[hs3.l0.CALCULATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[hs3.l0.CREDITS_TO_REFINANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[hs3.l0.INTRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
    }
}
