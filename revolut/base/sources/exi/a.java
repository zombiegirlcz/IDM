package exi;

import svi.y;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130451a;

    static {
        int[] iArr = new int[y.values().length];
        try {
            iArr[y.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y.LIMITED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y.UNLIMITED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f130451a = iArr;
    }
}
