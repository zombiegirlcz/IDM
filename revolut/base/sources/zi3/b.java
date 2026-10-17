package zi3;

import q70.d;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f322499b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CITY_MAPPER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.GOOGLE_MAPS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.WAZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.PETAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f322498a = iArr;
        int[] iArr2 = new int[gh0.d.values().length];
        try {
            iArr2[gh0.d.GOOGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[gh0.d.HUAWEI.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f322499b = iArr2;
    }
}
