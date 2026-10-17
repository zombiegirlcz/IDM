package ful;

import cul.b0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f138282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f138283c;

    static {
        int[] iArr = new int[bfl.g.values().length];
        try {
            iArr[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f138281a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f138282b = iArr2;
        int[] iArr3 = new int[b0.values().length];
        try {
            iArr3[b0.MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[b0.QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[b0.LOTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[b0.NOTES.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f138283c = iArr3;
    }
}
