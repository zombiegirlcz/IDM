package qu6;

import pr6.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249260a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.CARD_PRESENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.PAY_WITH_REVOLUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f249260a = iArr;
    }
}
