package nz8;

import jz8.b1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221003a;

    static {
        int[] iArr = new int[b1.values().length];
        try {
            iArr[b1.TO_POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b1.TO_INVEST_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b1.NO_REWARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f221003a = iArr;
    }
}
