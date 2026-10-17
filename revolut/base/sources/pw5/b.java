package pw5;

import cw5.d;
import cw5.e;
import qw5.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f240336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f240337c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[b.c.values().length];
        try {
            iArr[b.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.c.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f240335a = iArr;
        int[] iArr2 = new int[b.EnumC1371b.values().length];
        try {
            iArr2[b.EnumC1371b.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b.EnumC1371b.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b.EnumC1371b.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f240336b = iArr2;
        int[] iArr3 = new int[e.values().length];
        try {
            iArr3[e.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[e.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[e.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[e.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f240337c = iArr3;
        int[] iArr4 = new int[d.values().length];
        try {
            iArr4[d.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[d.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[d.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
