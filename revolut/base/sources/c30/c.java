package c30;

import v30.x0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20839a;

    static {
        int[] iArr = new int[x0.values().length];
        try {
            iArr[x0.Scheduled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x0.Generated.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20839a = iArr;
    }
}
