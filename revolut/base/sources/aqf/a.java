package aqf;

import prf.h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8425a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.Submission.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.FincrimeChecks.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8425a = iArr;
    }
}
