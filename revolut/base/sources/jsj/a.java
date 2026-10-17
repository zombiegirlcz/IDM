package jsj;

import uzi.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178182a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f178182a = iArr;
    }
}
