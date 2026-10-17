package ps0;

import ip0.c3;
import ip0.w3;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f239366b;

    static {
        int[] iArr = new int[c3.values().length];
        try {
            iArr[c3.CENTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c3.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c3.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c3.SPREAD_WITH_DYNAMIC_PADDINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c3.SPREAD_WITH_FIXED_PADDINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f239365a = iArr;
        int[] iArr2 = new int[w3.values().length];
        try {
            iArr2[w3.DIMMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w3.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f239366b = iArr2;
    }
}
