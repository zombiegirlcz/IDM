package rna;

import t70.v;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255540a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.SYSTEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.SYSTEM_AND_PER_APP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f255540a = iArr;
    }
}
