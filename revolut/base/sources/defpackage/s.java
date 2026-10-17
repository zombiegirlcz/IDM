package defpackage;

import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258701a;

    static {
        int[] iArr = new int[TaskEvent.values().length];
        f258701a = iArr;
        try {
            iArr[TaskEvent.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f258701a[TaskEvent.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f258701a[TaskEvent.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
