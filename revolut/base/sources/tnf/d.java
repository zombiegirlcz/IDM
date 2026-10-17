package tnf;

import io3.l;
import pcd.l0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f272442b;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l0.MONEY_MARKET_FUND_SAVINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l0.PRO_REGULAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l0.PRO_TAX.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f272441a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l.MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[l.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[l.SAVINGS_INTEREST_BEARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[l.CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[l.REVX_FIAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        f272442b = iArr2;
    }
}
