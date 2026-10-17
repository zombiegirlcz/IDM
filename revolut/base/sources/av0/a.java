package av0;

import vu0.s;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9865a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.FROM_START_TO_END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.FROM_END_TO_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9865a = iArr;
    }
}
