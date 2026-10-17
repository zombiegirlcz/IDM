package fv0;

import rp0.b2;
import rp0.c2;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138304a;

    static {
        int[] iArr = new int[b2.values().length];
        try {
            iArr[b2.DYNAMIC_MORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b2.SCROLLABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f138304a = iArr;
        int[] iArr2 = new int[c2.values().length];
        try {
            iArr2[c2.SHORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c2.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c2.INDEFINITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
