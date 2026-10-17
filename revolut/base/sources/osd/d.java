package osd;

import yw4.l;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f229316a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.SPEND_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.FULL_ACCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f229316a = iArr;
    }
}
