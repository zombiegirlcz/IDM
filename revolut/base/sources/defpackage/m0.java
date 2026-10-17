package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201029a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f201029a = iArr;
        try {
            iArr[TaskEvent.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f201029a[TaskEvent.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
