package ru9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f257499b;

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
        f257498a = iArr;
        int[] iArr2 = new int[com.revolut.feature.payments.messaging.data.api.model.b.values().length];
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.METAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.ULTRA.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.PRIVATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.STANDARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.ESSENTIALS.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[com.revolut.feature.payments.messaging.data.api.model.b.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        f257499b = iArr2;
    }
}
