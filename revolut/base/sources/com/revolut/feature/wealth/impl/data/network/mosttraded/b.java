package com.revolut.feature.wealth.impl.data.network.mosttraded;

import com.revolut.feature.wealth.impl.data.network.mosttraded.a;
import xzg.b0;
import xzg.x;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f95495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f95496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f95497c;

    static {
        int[] iArr = new int[a.d.values().length];
        try {
            iArr[a.d.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.d.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.d.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.d.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f95495a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b0.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b0.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[b0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f95496b = iArr2;
        int[] iArr3 = new int[x.values().length];
        try {
            iArr3[x.CFD.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        f95497c = iArr3;
    }
}
