package jg7;

import jf7.b1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f173934a;

    static {
        int[] iArr = new int[b1.values().length];
        try {
            iArr[b1.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b1.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f173934a = iArr;
    }
}
