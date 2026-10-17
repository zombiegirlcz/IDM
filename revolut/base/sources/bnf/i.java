package bnf;

import com.revolut.domain.models.joint.InternalJointTransferType;
import tof.v6;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17145c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v6.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17143a = iArr;
        int[] iArr2 = new int[y6.values().length];
        try {
            iArr2[y6.REWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f17144b = iArr2;
        int[] iArr3 = new int[g.values().length];
        try {
            iArr3[g.MONEY_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[g.MONEY_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[g.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[g.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[g.REFUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[g.RECURRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[g.SPARE_CHANGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[g.PLUS.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[g.WARNING.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[g.CANCELLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        f17145c = iArr3;
        int[] iArr4 = new int[InternalJointTransferType.values().length];
        try {
            iArr4[InternalJointTransferType.TOP_UP_FROM_PEER.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[InternalJointTransferType.WITHDRAW_TO_PEER.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
    }
}
