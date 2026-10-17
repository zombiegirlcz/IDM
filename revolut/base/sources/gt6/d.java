package gt6;

import tof.m5;
import tof.v6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f146559b;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v6.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v6.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f146558a = iArr;
        int[] iArr2 = new int[m5.values().length];
        try {
            iArr2[m5.AMERICAN_EXPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[m5.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[m5.JCB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[m5.MASTERCARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[m5.PRIVATE_LABEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[m5.VISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f146559b = iArr2;
    }
}
