package nsh;

import dsh.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218869a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.ADD_NEW_WIDGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f218869a = iArr;
    }
}
