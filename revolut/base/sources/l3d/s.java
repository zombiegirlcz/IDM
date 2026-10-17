package l3d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191931b;

    static {
        int[] iArr = new int[ogd.d.values().length];
        try {
            iArr[ogd.d.LAST_ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ogd.d.ALPHABETICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ogd.m.values().length];
        try {
            iArr2[ogd.m.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ogd.m.PRICE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ogd.m.ALPHABETICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ogd.m.VOLUME.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ogd.m.PRICE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ogd.m.CHANGE_24H.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f191930a = iArr2;
        int[] iArr3 = new int[ogd.l.values().length];
        try {
            iArr3[ogd.l.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ogd.l.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f191931b = iArr3;
    }
}
