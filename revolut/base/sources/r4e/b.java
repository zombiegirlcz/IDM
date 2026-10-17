package r4e;

import jel.j2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f251443a;

    static {
        int[] iArr = new int[j2.values().length];
        try {
            iArr[j2.FULL_LOSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j2.LOSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j2.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j2.PROFIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j2.CALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f251443a = iArr;
    }
}
