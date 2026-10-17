package wbk;

import kbk.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296248a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.BIRTHDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f296248a = iArr;
    }
}
