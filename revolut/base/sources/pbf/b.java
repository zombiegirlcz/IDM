package pbf;

import lbf.l;
import qbf.n;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f234680b;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.NOT_ONBOARDED_FOR_TRADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.BUY_ORDER_BLOCK_ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.ACCOUNT_IS_RESTRICTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f234679a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.NOT_ONBOARDED_FOR_TRADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l.BUY_ORDER_BLOCK_ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l.ACCOUNT_IS_RESTRICTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f234680b = iArr2;
    }
}
