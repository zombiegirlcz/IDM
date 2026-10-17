package jgh;

import jel.u0;
import jel.z0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f174054b;

    static {
        int[] iArr = new int[z0.values().length];
        try {
            iArr[z0.POWER_AND_ENERGY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z0.RENEWABLES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z0.TRANSPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z0.DIGITAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z0.ENVIRONMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[z0.OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f174053a = iArr;
        int[] iArr2 = new int[u0.values().length];
        try {
            iArr2[u0.CONSUMER_DISCRETIONARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[u0.CONSUMER_STAPLES.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[u0.ENERGY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[u0.FINANCIALS.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[u0.HEALTH_CARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[u0.INDUSTRIALS.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[u0.TECHNOLOGY.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[u0.MATERIALS.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[u0.COMMUNICATION_SERVICES.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[u0.REAL_ESTATE.ordinal()] = 10;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[u0.UTILITIES.ordinal()] = 11;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[u0.INFRASTRUCTURE.ordinal()] = 12;
        } catch (NoSuchFieldError unused18) {
        }
        f174054b = iArr2;
    }
}
