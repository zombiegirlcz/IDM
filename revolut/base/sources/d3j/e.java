package d3j;

import f5j.l;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111215a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.INTERNATIONAL_BENEFICIARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.BENEFICIARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.CHAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f111215a = iArr;
    }
}
