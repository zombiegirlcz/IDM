package zq0;

import qv0.k;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324345a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.Middle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.Single.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.Bottom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.Top.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.Header.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k.OutOfGroup.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f324345a = iArr;
    }
}
