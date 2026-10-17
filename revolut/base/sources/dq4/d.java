package dq4;

import hl4.e;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116911a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CANCELLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f116911a = iArr;
    }
}
