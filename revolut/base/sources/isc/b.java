package isc;

import com.revolut.core.ui_kit.delegates.id;
import vrc.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f168173c;

    static {
        int[] iArr = new int[id.values().length];
        try {
            iArr[id.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[id.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168171a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.OPTIONAL_TO_SKIP_2FA.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k.MANDATORY_TO_TRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.TRADE_WITH_WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f168172b = iArr2;
        int[] iArr3 = new int[vrc.d.values().length];
        try {
            iArr3[vrc.d.RDAEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[vrc.d.RSEUAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[vrc.d.REVOLUT_LTD.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[vrc.d.REVOLUT_TRADING_LTD.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[vrc.d.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f168173c = iArr3;
    }
}
