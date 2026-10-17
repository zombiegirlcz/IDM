package f33;

import h93.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131906a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.SMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f131906a = iArr;
    }
}
