package yrk;

import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f316330b;

    static {
        int[] iArr = new int[uqk.e.values().length];
        try {
            iArr[uqk.e.ANNUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uqk.e.QUARTERLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316329a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.INCOME_STATEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l.BALANCE_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l.CASH_FLOWS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f316330b = iArr2;
    }
}
