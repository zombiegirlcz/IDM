package fy4;

import dx4.n2;
import dx4.t2;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f138903b;

    static {
        int[] iArr = new int[t2.values().length];
        try {
            iArr[t2.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t2.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t2.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f138902a = iArr;
        int[] iArr2 = new int[n2.values().length];
        try {
            iArr2[n2.GREY_TONE_20.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f138903b = iArr2;
    }
}
