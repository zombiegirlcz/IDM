package xfj;

import pij.x;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f305438a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.AUTO_ROUTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.USER_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f305438a = iArr;
    }
}
