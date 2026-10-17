package pt0;

import aw0.n4;
import aw0.o4;
import aw0.t4;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f239572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f239573c;

    static {
        int[] iArr = new int[t4.values().length];
        try {
            iArr[t4.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t4.SEGMENTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f239571a = iArr;
        int[] iArr2 = new int[n4.values().length];
        try {
            iArr2[n4.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n4.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n4.NO_SORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f239572b = iArr2;
        int[] iArr3 = new int[o4.values().length];
        try {
            iArr3[o4.FULL_CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[o4.SEMI_CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[o4.HALF_CIRCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f239573c = iArr3;
    }
}
