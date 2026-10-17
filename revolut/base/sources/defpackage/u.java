package defpackage;

import com.youTransactor.uCube.rpc.RPCCommandStatus;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275996a;

    static {
        int[] iArr = new int[RPCCommandStatus.values().length];
        f275996a = iArr;
        try {
            iArr[RPCCommandStatus.LOST_PACKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f275996a[RPCCommandStatus.CONNECT_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f275996a[RPCCommandStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f275996a[RPCCommandStatus.DISCONNECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f275996a[RPCCommandStatus.SHUTTING_DOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f275996a[RPCCommandStatus.CANCELED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f275996a[RPCCommandStatus.SUCCESS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f275996a[RPCCommandStatus.CONNECT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f275996a[RPCCommandStatus.SENDING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f275996a[RPCCommandStatus.SENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f275996a[RPCCommandStatus.RECEIVING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
