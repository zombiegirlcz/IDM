package c69;

import java.time.DayOfWeek;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21744b;

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
        f21743a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h.ADJUST_LIMITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f21744b = iArr2;
    }
}
