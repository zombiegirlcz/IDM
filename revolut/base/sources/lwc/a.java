package lwc;

import cuc.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200439a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.VOLUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.TRANSACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f200439a = iArr;
    }
}
