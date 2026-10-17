package ci8;

import bj0.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24430a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.MALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.FEMALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24430a = iArr;
    }
}
