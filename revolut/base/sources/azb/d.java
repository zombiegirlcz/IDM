package azb;

import m1c.a0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11424a;

    static {
        int[] iArr = new int[a0.values().length];
        try {
            iArr[a0.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a0.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a0.TERTIARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11424a = iArr;
    }
}
