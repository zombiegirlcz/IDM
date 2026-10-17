package yjl;

import jkl.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314542a;

    static {
        int[] iArr = new int[w.a.values().length];
        try {
            iArr[w.a.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.a.UNDER_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.a.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f314542a = iArr;
        int[] iArr2 = new int[gkl.k.values().length];
        try {
            iArr2[gkl.k.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[gkl.k.UNDER_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
