package mx4;

import dx4.p1;
import dx4.q1;
import dx4.s1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f210179c;

    static {
        int[] iArr = new int[p1.values().length];
        try {
            iArr[p1.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p1.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f210177a = iArr;
        int[] iArr2 = new int[q1.values().length];
        try {
            iArr2[q1.PREFIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q1.SUFFIX.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f210178b = iArr2;
        int[] iArr3 = new int[s1.values().length];
        try {
            iArr3[s1.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[s1.ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f210179c = iArr3;
    }
}
