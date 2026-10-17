package oag;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f223631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f223632b;

    static {
        int[] iArr = new int[ffi.a.values().length];
        try {
            iArr[ffi.a.COUNTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ffi.a.REGION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ffi.a.CITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ffi.a.NEIGHBORHOOD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ffi.a.AIRPORT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ffi.a.PLACE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ffi.a.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f223631a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.SEARCHED_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[c.POPULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c.RECENT_LOCATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[c.SEARCHED_PROPERTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[c.RECENT_PROPERTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[c.RECENT_SMART_SEARCH.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        f223632b = iArr2;
    }
}
