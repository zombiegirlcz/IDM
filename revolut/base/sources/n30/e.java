package n30;

import v30.u0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211621b;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.Mass.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.Chat.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u0.CallRequest.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u0.InAppCallRequest.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u0.InboundInAppCall.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[u0.Unknown.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[u0.Assistant.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f211620a = iArr;
        int[] iArr2 = new int[v30.c0.values().length];
        try {
            iArr2[v30.c0.ASSISTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[v30.c0.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[v30.c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f211621b = iArr2;
    }
}
