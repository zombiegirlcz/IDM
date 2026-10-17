package aea;

import io3.i;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3522a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f3522a = iArr;
    }
}
