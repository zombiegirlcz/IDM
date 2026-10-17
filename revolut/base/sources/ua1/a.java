package ua1;

import ta1.e;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278515a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.SAME_FILE_VERSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SOMETHING_WENT_WRONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.RESOURCE_FILE_NOT_IMPLEMENTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f278515a = iArr;
    }
}
