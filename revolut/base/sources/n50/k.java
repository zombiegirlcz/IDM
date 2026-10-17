package n50;

import k50.v0;
import v30.c0;
import v30.s0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f212489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f212490c;

    static {
        int[] iArr = new int[v0.values().length];
        try {
            iArr[v0.MESSAGES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v0.PROMPT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f212488a = iArr;
        int[] iArr2 = new int[c0.values().length];
        try {
            iArr2[c0.ASSISTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c0.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f212489b = iArr2;
        int[] iArr3 = new int[s0.values().length];
        try {
            iArr3[s0.OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[s0.ASSIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[s0.AWAITING_RESPONSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[s0.RESOLVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[s0.CLOSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[s0.CLOSED_AND_RATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[s0.CANCELED.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        f212490c = iArr3;
    }
}
