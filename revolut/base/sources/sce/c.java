package sce;

import ibd.h;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261721a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.BIZUM_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.CARD_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.PREDEFINED_CARD_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.MANUAL_CARD_MANDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f261721a = iArr;
    }
}
