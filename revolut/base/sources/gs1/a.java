package gs1;

import b02.h;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146271a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f146271a = iArr;
    }
}
