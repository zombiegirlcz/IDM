package aqj;

import lzi.b;
import lzi.d;
import lzi.f;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f8470c;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f8468a = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[b.BEFORE_WEEKEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[b.AFTER_WEEKEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f8469b = iArr2;
        int[] iArr3 = new int[d.values().length];
        try {
            iArr3[d.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[d.LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f8470c = iArr3;
    }
}
