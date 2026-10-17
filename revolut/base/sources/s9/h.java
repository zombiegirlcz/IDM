package s9;

import d9.r0;
import d9.s0;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261077b;

    static {
        int[] iArr = new int[s0.values().length];
        f261077b = iArr;
        try {
            iArr[s0.DEDUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f261077b[s0.CLASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f261077b[s0.MINIMAL_CLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f261077b[s0.NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f261077b[s0.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f261077b[s0.CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[r0.values().length];
        f261076a = iArr2;
        try {
            iArr2[r0.WRAPPER_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f261076a[r0.PROPERTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f261076a[r0.WRAPPER_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f261076a[r0.EXTERNAL_PROPERTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f261076a[r0.EXISTING_PROPERTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
