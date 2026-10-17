package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201171a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f201171a = iArr;
        try {
            iArr[TaskEvent.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f201171a[TaskEvent.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
