package ild;

import fkd.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f162223b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.HIGH_ALERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f162222a = iArr;
        int[] iArr2 = new int[fkd.k.values().length];
        try {
            iArr2[fkd.k.SECONDARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[fkd.k.PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f162223b = iArr2;
    }
}
