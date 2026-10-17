package l5i;

import nel.z;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192274b;

    static {
        int[] iArr = new int[c4i.a.values().length];
        try {
            iArr[c4i.a.TRADING_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f192273a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[z.STRUCTURED_NOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f192274b = iArr2;
    }
}
