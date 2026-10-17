package ip8;

import dp8.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167681a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.PLANNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f167681a = iArr;
    }
}
