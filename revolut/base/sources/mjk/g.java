package mjk;

import bjk.v0;
import ggk.b0;
import ljk.j;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f206059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f206060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f206061c;

    static {
        int[] iArr = new int[v0.c.values().length];
        try {
            iArr[v0.c.CENTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v0.c.FULLSCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f206059a = iArr;
        int[] iArr2 = new int[j.c.values().length];
        try {
            iArr2[j.c.CENTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j.c.FULLSCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f206060b = iArr2;
        int[] iArr3 = new int[b0.values().length];
        try {
            iArr3[b0.CENTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[b0.FULLSCREEN_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f206061c = iArr3;
    }
}
