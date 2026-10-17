package erd;

import lzi.d;
import lzi.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f128643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f128644c;

    static {
        int[] iArr = new int[lzi.b.values().length];
        try {
            iArr[lzi.b.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lzi.b.BEFORE_WEEKEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lzi.b.AFTER_WEEKEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f128642a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f128643b = iArr2;
        int[] iArr3 = new int[f.values().length];
        try {
            iArr3[f.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[f.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[f.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[f.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[f.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[f.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[f.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        f128644c = iArr3;
    }
}
