package tb4;

import xu3.p0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269458a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.LINKED_ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.DOCUMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.REVOLUT_TRANSACTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f269458a = iArr;
    }
}
