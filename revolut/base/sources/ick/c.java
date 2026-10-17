package ick;

import kbk.k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160295a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.CLAIM_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.CAN_DECLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f160295a = iArr;
    }
}
