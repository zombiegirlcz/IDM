package sr8;

import ij8.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265141a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.OFFBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f265141a = iArr;
    }
}
