package cqd;

import aqd.i0;
import aqd.n;
import aqd.o;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f108086c;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.REMOVE_DESTINATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108084a = iArr;
        int[] iArr2 = new int[i0.values().length];
        try {
            iArr2[i0.AUTOMATICALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i0.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i0.ONE_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f108085b = iArr2;
        int[] iArr3 = new int[o.values().length];
        try {
            iArr3[o.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[o.FORCE_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[o.FORCE_ONE_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f108086c = iArr3;
    }
}
