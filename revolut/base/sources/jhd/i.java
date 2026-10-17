package jhd;

import ogd.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f174214b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.ALPHABETICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.PRICE_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.VOLUME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.CHANGE_24H.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m.PRICE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f174213a = iArr;
        int[] iArr2 = new int[ogd.l.values().length];
        try {
            iArr2[ogd.l.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ogd.l.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f174214b = iArr2;
    }
}
