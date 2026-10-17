package xyf;

import mzf.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309723a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.ATTRACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f309723a = iArr;
    }
}
