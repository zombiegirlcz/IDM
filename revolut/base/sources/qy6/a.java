package qy6;

import sr6.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250157a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f250157a = iArr;
    }
}
