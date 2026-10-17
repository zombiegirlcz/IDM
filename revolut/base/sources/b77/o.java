package b77;

import java.time.DayOfWeek;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12934b;

    static {
        int[] iArr = new int[DayOfWeek.values().length];
        try {
            iArr[DayOfWeek.SATURDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DayOfWeek.SUNDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12933a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f12934b = iArr2;
    }
}
