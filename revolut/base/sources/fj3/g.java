package fj3;

import aw0.v1;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135525a;

    static {
        int[] iArr = new int[v1.values().length];
        try {
            iArr[v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f135525a = iArr;
    }
}
