package eoa;

import foa.z;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f127875b;

    static {
        int[] iArr = new int[soa.c.values().length];
        try {
            iArr[soa.c.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[soa.c.REVOLUT_X_MARKETING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[soa.c.PERSONALIZED_THIRD_PARTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f127874a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.CREDIT_COLLECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f127875b = iArr2;
    }
}
