package z4e;

import jel.t2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319383a;

    static {
        int[] iArr = new int[t2.values().length];
        try {
            iArr[t2.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t2.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t2.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f319383a = iArr;
    }
}
