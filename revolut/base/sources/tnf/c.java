package tnf;

import cfl.j;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272440a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f272440a = iArr;
    }
}
