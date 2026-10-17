package wka;

import xka.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298261a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.CLOSE_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.NEXT_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f298261a = iArr;
    }
}
