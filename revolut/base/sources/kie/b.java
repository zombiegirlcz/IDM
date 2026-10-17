package kie;

import com.revolut.feature.tab.accounts.models.ProductId;
import xjg.m;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f184222b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.NIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f184221a = iArr;
        int[] iArr2 = new int[ProductId.values().length];
        try {
            iArr2[ProductId.CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ProductId.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProductId.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProductId.TEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ProductId.TOTAL_WEALTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ProductId.YOUTH.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ProductId.ON_HOLD.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ProductId.FAVORITE.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ProductId.SAVINGS.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ProductId.CREDIT.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ProductId.CREDIT_HUB.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ProductId.LINKED.ordinal()] = 12;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ProductId.BEREAVEMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ProductId.SUBACCOUNT.ordinal()] = 14;
        } catch (NoSuchFieldError unused17) {
        }
        f184222b = iArr2;
    }
}
