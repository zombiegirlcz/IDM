package sa1;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.RPCCommandStatus;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261257b;

    static {
        int[] iArr = new int[RPCCommandStatus.values().length];
        try {
            iArr[RPCCommandStatus.SENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f261256a = iArr;
        int[] iArr2 = new int[TaskEvent.values().length];
        try {
            iArr2[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[TaskEvent.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TaskEvent.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TaskEvent.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        f261257b = iArr2;
    }
}
