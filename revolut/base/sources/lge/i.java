package lge;

import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f195105a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.FLAT_ROOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.ACCOUNTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.BEREAVEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v.POCKETS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[v.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[v.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f195105a = iArr;
    }
}
