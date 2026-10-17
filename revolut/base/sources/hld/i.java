package hld;

import ekd.l0;
import ekd.t;
import ekd.x;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f153447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f153448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f153449c;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f153447a = iArr;
        int[] iArr2 = new int[x.values().length];
        try {
            iArr2[x.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[x.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x.TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f153448b = iArr2;
        int[] iArr3 = new int[t.values().length];
        try {
            iArr3[t.COUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[t.AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f153449c = iArr3;
    }
}
