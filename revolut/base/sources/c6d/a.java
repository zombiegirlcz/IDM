package c6d;

import d6d.d;
import yvh.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21776b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.SPARE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.DAILY_SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.SPENDING_PERCENTAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.BALANCE_ROUNDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21775a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.SPARE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f.DAILY_SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.SPENDING_PERCENTAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.BALANCE_ROUNDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f21776b = iArr2;
    }
}
