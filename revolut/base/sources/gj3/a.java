package gj3;

import hj3.e;
import hj3.f;
import ij3.k;
import ij3.p;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f144234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f144235c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.FIN_CRIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f144233a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k.ALL_SCREENS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.END_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f144234b = iArr2;
        int[] iArr3 = new int[f.values().length];
        try {
            iArr3[f.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[f.FIN_CRIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f144235c = iArr3;
        int[] iArr4 = new int[e.values().length];
        try {
            iArr4[e.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[e.ALL_SCREENS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[e.END_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
