package rdg;

import cgi.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f253453a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.KING_BED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.QUEEN_BED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.SLEEP_SOFA_FUTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.TWIN_SINGLE_BED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.BUNK_BED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.DOUBLE_BED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s.CHILD_BED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[s.MURPHY_BE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[s.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f253453a = iArr;
    }
}
