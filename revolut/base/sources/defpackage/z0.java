package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f318153a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f318153a = iArr;
        try {
            iArr[TaskEvent.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f318153a[TaskEvent.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
