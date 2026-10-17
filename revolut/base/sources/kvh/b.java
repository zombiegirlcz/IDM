package kvh;

import til.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190122a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.CROSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.BACK_ARROW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f190122a = iArr;
    }
}
