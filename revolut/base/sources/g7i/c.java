package g7i;

import c7i.f;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141203a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DropsBelow.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.Exceeds.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f141203a = iArr;
    }
}
