package yu0;

import ip0.xh0;
import vu0.i;
import vu0.n;
import vu0.s;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f316852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f316853c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.FROM_END_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.FROM_START_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f316851a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f316852b = iArr2;
        int[] iArr3 = new int[i.values().length];
        try {
            iArr3[i.LEGACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[i.CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f316853c = iArr3;
        int[] iArr4 = new int[xh0.values().length];
        try {
            iArr4[xh0.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
    }
}
