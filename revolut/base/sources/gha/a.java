package gha;

import hha.i;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143894a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f143894a = iArr;
    }
}
