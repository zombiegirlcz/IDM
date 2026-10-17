package br9;

import ar9.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17956a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.TRANSACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17956a = iArr;
    }
}
