package qoa;

import do3.t;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248091a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.VERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.NOT_VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.GRADUATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f248091a = iArr;
    }
}
