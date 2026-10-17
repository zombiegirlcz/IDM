package io;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162982a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f162982a = iArr;
    }
}
