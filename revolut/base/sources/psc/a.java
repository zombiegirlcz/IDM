package psc;

import vrc.d;
import vrc.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f239469b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.RDAEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.RSEUAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.REVOLUT_LTD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.REVOLUT_TRADING_LTD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f239468a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.OPTIONAL_TO_SKIP_2FA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k.MANDATORY_TO_TRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[k.TRADE_WITH_WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f239469b = iArr2;
    }
}
