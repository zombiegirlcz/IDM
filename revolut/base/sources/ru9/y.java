package ru9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257503a;

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
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.c.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.c.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.c.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f257503a = iArr;
    }
}
