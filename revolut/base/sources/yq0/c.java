package yq0;

import xq0.l;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315958a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.DISTRIBUTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.INNER_AND_FILL_LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.FILL_FIRST_AND_LAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f315958a = iArr;
    }
}
