package y10;

import i20.r0;
import v30.j0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310271a;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.ITALIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.BOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j0.NORMAL_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j0.HEADING_1.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j0.HEADING_2.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j0.HEADING_3.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.VERTICAL_BOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r0.HORIZONTAL_BOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f310271a = iArr2;
    }
}
