package h18;

import e18.f;
import x08.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f148476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f148477c;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.REV_INSIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.PRICE_ALERT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f148475a = iArr;
        int[] iArr2 = new int[l2l.a.values().length];
        try {
            iArr2[l2l.a.PORTFOLIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l2l.a.WATCHLIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f148476b = iArr2;
        int[] iArr3 = new int[c.values().length];
        try {
            iArr3[c.REV_INSIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[c.PRICE_ALERT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f148477c = iArr3;
    }
}
