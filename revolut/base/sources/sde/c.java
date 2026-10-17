package sde;

import kq2.l;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261867a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.LOCAL_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.CROSS_BORDER_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.INTERNATIONAL_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.SWIFT_USD_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.SWIFT_NON_USD_TRANSFER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f261867a = iArr;
    }
}
