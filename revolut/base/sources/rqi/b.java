package rqi;

import gh0.d;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256547a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.GOOGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.HUAWEI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f256547a = iArr;
    }
}
