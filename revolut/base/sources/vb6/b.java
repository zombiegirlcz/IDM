package vb6;

import ba6.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287426a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.NOT_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.NOT_AVAILABLE_IN_USER_COUNTRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f287426a = iArr;
    }
}
