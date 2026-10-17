package com.revolut.feature.credit.loan.api.models.rev10;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f70206a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.DirectDebit.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.Wallet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f70206a = iArr;
    }
}
