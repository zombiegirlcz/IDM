package x6i;

import v6i.g;
import v6i.h;
import v6i.k;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f303107c;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f303105a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f303106b = iArr2;
        int[] iArr3 = new int[h.values().length];
        try {
            iArr3[h.PRICE_CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[h.PRICE_SHOULD_BE_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[h.PRICE_SHOULD_BE_HIGHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f303107c = iArr3;
    }
}
