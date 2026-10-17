package pu6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239833a;

    static {
        int[] iArr = new int[ou6.a.values().length];
        try {
            iArr[ou6.a.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ou6.a.IN_PERSON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ou6.a.E_COMMERCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f239833a = iArr;
    }
}
