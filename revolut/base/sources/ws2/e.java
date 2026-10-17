package ws2;

import ru.z;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299648a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f299648a = iArr;
    }
}
