package hzh;

import f8l.c;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157192b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f157191a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c.FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f157192b = iArr2;
    }
}
