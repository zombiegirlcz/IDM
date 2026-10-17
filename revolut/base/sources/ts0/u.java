package ts0;

import aw0.d5;
import aw0.o5;
import aw0.z4;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f273910c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[d5.values().length];
        try {
            iArr[d5.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d5.TALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d5.MATCH_PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f273908a = iArr;
        int[] iArr2 = new int[o5.values().length];
        try {
            iArr2[o5.VERTICAL_LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o5.TOOLTIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o5.COLOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f273909b = iArr2;
        int[] iArr3 = new int[z4.values().length];
        try {
            iArr3[z4.TRANSPARENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[z4.DASHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[z4.SOLID.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f273910c = iArr3;
        int[] iArr4 = new int[aw0.k0.values().length];
        try {
            iArr4[aw0.k0.SOLID.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[aw0.k0.GRADIENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
    }
}
