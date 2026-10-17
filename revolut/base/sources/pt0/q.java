package pt0;

import aw0.o4;
import aw0.t4;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f239583b;

    static {
        int[] iArr = new int[t4.values().length];
        try {
            iArr[t4.SEGMENTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t4.PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f239582a = iArr;
        int[] iArr2 = new int[o4.values().length];
        try {
            iArr2[o4.FULL_CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[o4.SEMI_CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o4.HALF_CIRCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f239583b = iArr2;
    }
}
