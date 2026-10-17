package xuh;

import my8.t;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309071a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.SKIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f309071a = iArr;
    }
}
