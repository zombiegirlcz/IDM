package h18;

import e18.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f148474b;

    static {
        int[] iArr = new int[x08.a.values().length];
        try {
            iArr[x08.a.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x08.a.ATTRIBUTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f148473a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.ATTRIBUTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f148474b = iArr2;
    }
}
