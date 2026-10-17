package t9;

import d9.o;
import d9.y;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f268909b;

    static {
        int[] iArr = new int[y.values().length];
        f268909b = iArr;
        try {
            iArr[y.NON_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f268909b[y.NON_ABSENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f268909b[y.NON_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f268909b[y.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f268909b[y.NON_NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f268909b[y.USE_DEFAULTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[o.values().length];
        f268908a = iArr2;
        try {
            iArr2[o.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f268908a[o.OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f268908a[o.ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
