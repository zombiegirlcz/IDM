package xu0;

import vu0.r;
import vu0.s;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f308853b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.START_TO_END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.END_TO_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f308852a = iArr;
        int[] iArr2 = new int[s.values().length];
        try {
            iArr2[s.FROM_END_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[s.FROM_START_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f308853b = iArr2;
    }
}
