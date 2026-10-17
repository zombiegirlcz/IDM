package nnj;

import dej.e3;
import dej.p0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f217705b;

    static {
        int[] iArr = new int[e3.values().length];
        try {
            iArr[e3.NOT_ABLE_TO_INSTALL_ESIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e3.ESIM_INSTALLED_BUT_NOT_WORKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e3.DEVICE_IS_CARRIER_BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e3.ACCIDENTAL_PURCHASE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e3.OTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e3.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f217704a = iArr;
        int[] iArr2 = new int[p0.values().length];
        try {
            iArr2[p0.NOT_ABLE_TO_INSTALL_ESIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p0.ESIM_INSTALLED_BUT_NOT_WORKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p0.CAN_NOT_TRANSFER_MY_NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[p0.POOR_NETWORK_QUALITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[p0.TOO_EXPENSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[p0.OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[p0.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f217705b = iArr2;
    }
}
