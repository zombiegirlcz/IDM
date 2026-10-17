package s6i;

import b6i.j;
import b6i.l;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f260366b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f260365a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.TOP_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l.BOTTOM_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f260366b = iArr2;
    }
}
