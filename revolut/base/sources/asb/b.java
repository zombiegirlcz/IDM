package asb;

import bfl.g;
import dfl.r;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f8911c;

    static {
        int[] iArr = new int[qrb.b.values().length];
        try {
            iArr[qrb.b.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qrb.b.QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8909a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f8910b = iArr2;
        int[] iArr3 = new int[r.values().length];
        try {
            iArr3[r.STOCK_QUANTITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[r.MONEY_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f8911c = iArr3;
    }
}
