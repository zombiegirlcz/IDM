package cjk;

import lha.o;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24702a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.MANAGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.MEMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24702a = iArr;
    }
}
