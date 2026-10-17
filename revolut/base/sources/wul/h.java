package wul;

import dfl.q0;
import k4l.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300235b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q0.COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f300234a = iArr;
        int[] iArr2 = new int[o0.values().length];
        try {
            iArr2[o0.RECEIVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[o0.PARTIALLY_FILLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[o0.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[o0.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[o0.DECLINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[o0.FILLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f300235b = iArr2;
    }
}
