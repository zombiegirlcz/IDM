package jgh;

import jel.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174047a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.PRIVATE_COMPANIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.LIQUID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f174047a = iArr;
    }
}
