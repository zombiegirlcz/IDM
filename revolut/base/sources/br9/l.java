package br9;

import ar9.w;
import ar9.x;
import oq9.b0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17964c;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.MARK_AS_PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17962a = iArr;
        int[] iArr2 = new int[w.values().length];
        try {
            iArr2[w.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f17963b = iArr2;
        int[] iArr3 = new int[b0.values().length];
        try {
            iArr3[b0.MARK_AS_PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[b0.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f17964c = iArr3;
    }
}
