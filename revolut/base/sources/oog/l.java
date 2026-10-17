package oog;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227110a;

    static {
        int[] iArr = new int[mbl.a.values().length];
        try {
            iArr[mbl.a.SearchEnabledInSupportedCountries.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mbl.a.ManualInput.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f227110a = iArr;
    }
}
