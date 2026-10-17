package fu7;

import gu7.v4;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138109a;

    static {
        int[] iArr = new int[v4.values().length];
        try {
            iArr[v4.DIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v4.WEBPAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v4.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v4.CLAIMS_VIA_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f138109a = iArr;
    }
}
