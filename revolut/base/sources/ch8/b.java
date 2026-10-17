package ch8;

import ig8.e;
import yt8.i;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24145b;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f24144a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.INACTIVE_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.UNVERIFIED_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[e.NEGATIVE_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[e.DECLINED_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[e.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f24145b = iArr2;
    }
}
