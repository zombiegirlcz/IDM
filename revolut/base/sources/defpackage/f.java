package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130984a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f130984a = iArr;
        try {
            iArr[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f130984a[TaskEvent.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f130984a[TaskEvent.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f130984a[TaskEvent.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
