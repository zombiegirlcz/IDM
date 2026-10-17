package h0e;

import com.revolut.feature.statements.api.models.StatementsFormat;
import lyd.t;
import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f148378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f148379c;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.HIDE_BALANCES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.ACCOUNTS_FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.FORMAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z.LANGUAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z.SHOW_AMOUNTS_IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f148377a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.CURRENCIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[t.ASSETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[t.ACCOUNTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f148378b = iArr2;
        int[] iArr3 = new int[StatementsFormat.values().length];
        try {
            iArr3[StatementsFormat.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[StatementsFormat.EXCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f148379c = iArr3;
    }
}
