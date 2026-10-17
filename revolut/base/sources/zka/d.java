package zka;

import bka.q;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322929a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f322929a = iArr;
    }
}
