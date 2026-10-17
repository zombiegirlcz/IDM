package cqd;

import aqd.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108080a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.MANUAL_EXECUTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f108080a = iArr;
    }
}
