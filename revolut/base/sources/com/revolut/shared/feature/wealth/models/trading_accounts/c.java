package com.revolut.shared.feature.wealth.models.trading_accounts;

import cfl.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f105338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f105339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f105340c;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.TERMINATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ONBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.SUSPENDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a.OFFBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f105338a = iArr;
        int[] iArr2 = new int[cfl.b.values().length];
        try {
            iArr2[cfl.b.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cfl.b.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cfl.b.TERMINATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[cfl.b.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[cfl.b.SUSPENDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[cfl.b.OFFBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        f105339b = iArr2;
        int[] iArr3 = new int[v.values().length];
        try {
            iArr3[v.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[v.REMEDIATION_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[v.OFFBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[v.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[v.AVAILABLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[v.ONBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[v.OFFBOARDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        f105340c = iArr3;
    }
}
