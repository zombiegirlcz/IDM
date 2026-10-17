package i18;

import j18.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157590a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.ATTRIBUTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f157590a = iArr;
    }
}
