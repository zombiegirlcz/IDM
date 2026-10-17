package c4j;

import u2j.d;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21302a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21302a = iArr;
    }
}
