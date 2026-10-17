package j7i;

import c7i.f;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f171920a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.Exceeds.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.DropsBelow.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f171920a = iArr;
    }
}
