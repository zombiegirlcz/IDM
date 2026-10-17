package vlh;

import del.d;
import del.e;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f290448b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.Ascending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.Descending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f290447a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.TotalValue.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d.Performance.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.Alphabetical.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[d.Products.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f290448b = iArr2;
    }
}
