package xgk;

import lha.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f305764a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.INELIGIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f305764a = iArr;
    }
}
