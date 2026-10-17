package ip0;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class x00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f167079b;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f167078a = iArr;
        int[] iArr2 = new int[u00.values().length];
        try {
            iArr2[u00.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u00.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f167079b = iArr2;
    }
}
