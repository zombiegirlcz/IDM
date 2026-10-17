package h7j;

import wd6.e;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f149899b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f149898a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f149899b = iArr2;
    }
}
