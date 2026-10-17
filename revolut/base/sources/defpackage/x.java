package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f301435a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f301435a = iArr;
        try {
            iArr[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f301435a[TaskEvent.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f301435a[TaskEvent.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f301435a[TaskEvent.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
