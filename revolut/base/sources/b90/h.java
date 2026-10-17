package b90;

import ipa.l;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13531b;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13530a = iArr;
        int[] iArr2 = new int[ipa.a.values().length];
        try {
            iArr2[ipa.a.GROUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ipa.a.P2P.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ipa.a.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f13531b = iArr2;
    }
}
