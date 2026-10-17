package vn5;

import com.fasterxml.jackson.core.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290753a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.VALUE_EMBEDDED_OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.VALUE_NUMBER_INT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f290753a = iArr;
    }
}
