package b4i;

import f8l.b;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12381a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12381a = iArr;
    }
}
