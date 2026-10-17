package vr2;

import tof.j1;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291460a;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j1.DISALLOWED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f291460a = iArr;
    }
}
