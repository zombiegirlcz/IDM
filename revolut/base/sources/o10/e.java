package o10;

import cr0.h;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221263a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f221263a = iArr;
    }
}
