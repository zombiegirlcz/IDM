package tcl;

import fdl.f3;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f269892b;

    static {
        int[] iArr = new int[efl.h.values().length];
        try {
            iArr[efl.h.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[efl.h.SUBSTANTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[efl.h.SELL_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f269891a = iArr;
        int[] iArr2 = new int[f3.values().length];
        try {
            iArr2[f3.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f3.SUBSTANTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f3.SELL_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f269892b = iArr2;
    }
}
