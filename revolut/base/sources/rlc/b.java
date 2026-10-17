package rlc;

import slc.c;
import slc.d;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f255012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f255013c;

    static {
        int[] iArr = new int[c.b.EnumC1471c.values().length];
        try {
            iArr[c.b.EnumC1471c.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.b.EnumC1471c.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.b.EnumC1471c.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.b.EnumC1471c.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f255011a = iArr;
        int[] iArr2 = new int[d.e.values().length];
        try {
            iArr2[d.e.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[d.e.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[d.e.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[d.e.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[d.e.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f255012b = iArr2;
        int[] iArr3 = new int[d.EnumC1474d.values().length];
        try {
            iArr3[d.EnumC1474d.PORTFOLIO_TEMPLATE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[d.EnumC1474d.PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[d.EnumC1474d.WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[d.EnumC1474d.FUNDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[d.EnumC1474d.INITIAL_FUNDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        f255013c = iArr3;
    }
}
