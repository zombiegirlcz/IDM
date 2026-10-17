package cgh;

import jel.a0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23967a;

    static {
        int[] iArr = new int[a0.values().length];
        try {
            iArr[a0.SINGLE_MANAGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a0.MULTI_MANAGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f23967a = iArr;
    }
}
