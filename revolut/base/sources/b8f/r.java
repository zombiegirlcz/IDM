package b8f;

import com.revolut.core.ui_kit.delegates.rh;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13249a;

    static {
        int[] iArr = new int[rh.values().length];
        try {
            iArr[rh.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rh.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13249a = iArr;
    }
}
