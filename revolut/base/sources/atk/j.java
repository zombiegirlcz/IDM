package atk;

import jel.l1;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9090a;

    static {
        int[] iArr = new int[l1.values().length];
        try {
            iArr[l1.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l1.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l1.NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9090a = iArr;
    }
}
