package x2f;

import bfl.g;
import k4l.r0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f302549b;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f302548a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f302549b = iArr2;
    }
}
