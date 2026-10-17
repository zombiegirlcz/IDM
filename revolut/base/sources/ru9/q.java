package ru9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f257496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f257497c;

    static {
        int[] iArr = new int[com.revolut.feature.payments.messaging.data.api.model.c.values().length];
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.c.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.c.CLAIMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f257495a = iArr;
        int[] iArr2 = new int[com.revolut.feature.payments.messaging.data.api.model.a.values().length];
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.a.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.a.CLAIMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f257496b = iArr2;
        int[] iArr3 = new int[com.revolut.feature.payments.messaging.data.api.model.b.values().length];
        try {
            iArr3[com.revolut.feature.payments.messaging.data.api.model.b.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[com.revolut.feature.payments.messaging.data.api.model.b.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[com.revolut.feature.payments.messaging.data.api.model.b.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f257497c = iArr3;
    }
}
