package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.TerminalStatus;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f318151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f318152b;

    static {
        int[] iArr = new int[TerminalStatus.values().length];
        f318152b = iArr;
        try {
            iArr[TerminalStatus.processOnGoing.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f318152b[TerminalStatus.noProcessOnGoing.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f318152b[TerminalStatus.unknown.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[TaskEvent.values().length];
        f318151a = iArr2;
        try {
            iArr2[TaskEvent.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f318151a[TaskEvent.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f318151a[TaskEvent.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
