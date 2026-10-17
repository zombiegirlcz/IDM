package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157502a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f157502a = iArr;
        try {
            iArr[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f157502a[TaskEvent.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f157502a[TaskEvent.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f157502a[TaskEvent.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
