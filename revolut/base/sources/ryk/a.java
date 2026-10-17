package ryk;

import a2b.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258429a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.RISK_ACKNOWLEDGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.DISMISSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f258429a = iArr;
    }
}
