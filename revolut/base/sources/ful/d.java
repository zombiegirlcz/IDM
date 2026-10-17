package ful;

import cul.b0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f138287b;

    static {
        int[] iArr = new int[bfl.g.values().length];
        try {
            iArr[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f138286a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b0.QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b0.LOTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b0.NOTES.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f138287b = iArr2;
    }
}
