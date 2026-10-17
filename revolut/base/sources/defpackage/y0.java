package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310095a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f310095a = iArr;
        try {
            iArr[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f310095a[TaskEvent.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f310095a[TaskEvent.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
