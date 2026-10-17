package nz8;

import jz8.o0;
import u09.e0;
import wz8.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f221001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f221002c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.MULTIPLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f221000a = iArr;
        int[] iArr2 = new int[wz8.d.values().length];
        try {
            iArr2[wz8.d.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wz8.d.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f221001b = iArr2;
        int[] iArr3 = new int[o0.values().length];
        try {
            iArr3[o0.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[o0.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f221002c = iArr3;
        int[] iArr4 = new int[e0.values().length];
        try {
            iArr4[e0.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[e0.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
    }
}
