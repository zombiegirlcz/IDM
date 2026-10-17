package lq7;

import kl7.a1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199206a;

    static {
        int[] iArr = new int[a1.values().length];
        try {
            iArr[a1.VEHICLE_REPLACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a1.VEHICLE_SUBSTITUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a1.VEHICLE_ADD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a1.ADDITIONAL_DRIVER_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a1.ADDITIONAL_DRIVER_REMOVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a1.DRIVING_LICENCE_UPDATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[a1.CANCEL_MTA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[a1.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f199206a = iArr;
    }
}
