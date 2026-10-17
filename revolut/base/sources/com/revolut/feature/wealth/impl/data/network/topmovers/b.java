package com.revolut.feature.wealth.impl.data.network.topmovers;

import com.revolut.feature.wealth.impl.data.network.topmovers.a;
import xzg.j0;
import xzg.l0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f95505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f95506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f95507c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[a.c.values().length];
        try {
            iArr[a.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.c.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.c.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.c.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.c.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f95505a = iArr;
        int[] iArr2 = new int[a.EnumC0585a.values().length];
        try {
            iArr2[a.EnumC0585a.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[a.EnumC0585a.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f95506b = iArr2;
        int[] iArr3 = new int[j0.values().length];
        try {
            iArr3[j0.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[j0.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f95507c = iArr3;
        int[] iArr4 = new int[l0.values().length];
        try {
            iArr4[l0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[l0.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[l0.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[l0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[l0.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
