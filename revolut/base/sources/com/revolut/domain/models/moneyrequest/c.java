package com.revolut.domain.models.moneyrequest;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f60368a;

    static {
        int[] iArr = new int[TransferLinkDirection.values().length];
        try {
            iArr[TransferLinkDirection.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferLinkDirection.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f60368a = iArr;
    }
}
