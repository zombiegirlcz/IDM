package adh;

import zzg.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3352a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.ASC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.DESC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f3352a = iArr;
    }
}
