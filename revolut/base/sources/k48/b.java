package k48;

import com.revolut.domain.models.joint.InternalJointTransferType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180844a;

    static {
        int[] iArr = new int[InternalJointTransferType.values().length];
        try {
            iArr[InternalJointTransferType.TOP_UP_FROM_PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InternalJointTransferType.WITHDRAW_FROM_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InternalJointTransferType.TOP_UP_TO_JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InternalJointTransferType.WITHDRAW_TO_PERSONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InternalJointTransferType.TOP_UP_FROM_PEER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InternalJointTransferType.WITHDRAW_TO_PEER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f180844a = iArr;
    }
}
