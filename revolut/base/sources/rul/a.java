package rul;

import bfl.g;
import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f257626b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f257625a = iArr;
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.RECURRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r0.MARKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r0.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r0.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f257626b = iArr2;
    }
}
