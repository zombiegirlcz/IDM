package ixe;

import hha.u0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f169560b;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.VAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.CENTRAL_GOOD_AND_SERVICES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u0.INTEGRATED_GOOD_AND_SERVICES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u0.STATE_GOOD_AND_SERVICES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u0.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f169559a = iArr;
        int[] iArr2 = new int[c93.o.values().length];
        try {
            iArr2[c93.o.VAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c93.o.CGST.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[c93.o.IGST.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[c93.o.SGST.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c93.o.GMF.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[c93.o.STAMP_DUTY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[c93.o.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        f169560b = iArr2;
    }
}
