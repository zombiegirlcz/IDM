package yji;

import aii.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314515a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f314515a = iArr;
    }
}
