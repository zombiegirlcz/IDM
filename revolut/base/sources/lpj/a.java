package lpj;

import yfa.c;
import zr6.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f199144b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.DOMESTIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.REGIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.INTERNATIONAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f199143a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.DOMESTIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c.REGIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.INTERNATIONAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f199144b = iArr2;
    }
}
