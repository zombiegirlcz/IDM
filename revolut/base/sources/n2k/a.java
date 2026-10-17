package n2k;

import kq2.m;
import m2k.t;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211581a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.PERSONAL_ACC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[m.values().length];
        try {
            iArr2[m.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f211581a = iArr2;
    }
}
