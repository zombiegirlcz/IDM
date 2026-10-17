package lf3;

import v30.c0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f194632a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.SUPPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.ASSISTANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f194632a = iArr;
    }
}
