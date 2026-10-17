package kwe;

import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190329a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.CARD_CHECKOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.THREE_DS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f190329a = iArr;
    }
}
