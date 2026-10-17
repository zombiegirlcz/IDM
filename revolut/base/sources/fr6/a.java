package fr6;

import cs6.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137395a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.PAYMENT_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.INVOICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.CARD_READER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f137395a = iArr;
    }
}
