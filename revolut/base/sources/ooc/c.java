package ooc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227027a;

    static {
        int[] iArr = new int[xdh.a.values().length];
        try {
            iArr[xdh.a.CONSERVATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xdh.a.CAUTIOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xdh.a.BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xdh.a.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xdh.a.AGGRESSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f227027a = iArr;
    }
}
