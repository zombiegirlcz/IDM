package vuk;

import jel.f;
import jel.g;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f292405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f292406b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.FLOATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.STEP_UP_STEP_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f292405a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.ANNUALY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f.SEMI_ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f.QUARTERLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f292406b = iArr2;
    }
}
