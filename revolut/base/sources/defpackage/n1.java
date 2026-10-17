package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211064a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f211064a = iArr;
        try {
            iArr[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f211064a[TaskEvent.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f211064a[TaskEvent.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f211064a[TaskEvent.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
