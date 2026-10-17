package xjj;

import dej.d2;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306531a;

    static {
        int[] iArr = new int[d2.values().length];
        try {
            iArr[d2.BILLING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d2.INVOICES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d2.INSTALL_ESIM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d2.SHARE_ESIM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d2.RESTART_PLAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d2.UNFREEZE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[d2.TRANSFER_TO_THIS_DEVICE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[d2.TRANSFER_NUMBER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[d2.ADD_NUMBER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[d2.REQUEST_PAC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[d2.UPGRADE_PLAN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[d2.CONFIRM_TRANSFER_DETAILS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[d2.PLAN_WITHDRAWAL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[d2.PLAN_CANCELLATION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[d2.ACTIVATE_PLAN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[d2.ACTIVATION_INSTRUCTIONS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[d2.INSTALLATION_TROUBLESHOOTER.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        f306531a = iArr;
    }
}
