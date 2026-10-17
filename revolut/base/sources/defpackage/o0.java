package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221096a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f221096a = iArr;
        try {
            iArr[TaskEvent.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f221096a[TaskEvent.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
