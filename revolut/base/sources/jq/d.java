package jq;

import yt8.i;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f177331a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.PASSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f177331a = iArr;
    }
}
