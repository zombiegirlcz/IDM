package id;

import md.i1;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f160368b;

    static {
        int[] iArr = new int[w2.values().length];
        f160368b = iArr;
        try {
            iArr[w2.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f160368b[w2.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f160368b[w2.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f160368b[w2.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[i1.values().length];
        f160367a = iArr2;
        try {
            iArr2[i1.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f160367a[i1.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f160367a[i1.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f160367a[i1.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f160367a[i1.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
