package r9;

import d9.r0;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252473a;

    static {
        int[] iArr = new int[r0.values().length];
        f252473a = iArr;
        try {
            iArr[r0.EXISTING_PROPERTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f252473a[r0.EXTERNAL_PROPERTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f252473a[r0.PROPERTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f252473a[r0.WRAPPER_ARRAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f252473a[r0.WRAPPER_OBJECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
