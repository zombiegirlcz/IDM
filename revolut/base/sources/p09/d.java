package p09;

import u09.j;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f231483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f231484b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.LIST_SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.LIST_LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.GRID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f231483a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v.APP_TIPS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v.FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v.TRADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[v.YOUTH_TRADING.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[v.PRO.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f231484b = iArr2;
    }
}
