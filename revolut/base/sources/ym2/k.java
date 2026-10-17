package ym2;

import xjg.m;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314847b;

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
        f314846a = iArr;
        int[] iArr2 = new int[vjg.a.values().length];
        try {
            iArr2[vjg.a.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vjg.a.PLANS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vjg.a.ART.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vjg.a.FUN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vjg.a.REDEEMABLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[vjg.a.REWARDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f314847b = iArr2;
    }
}
