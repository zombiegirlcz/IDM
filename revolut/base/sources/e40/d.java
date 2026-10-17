package e40;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f122343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f122344c;

    static {
        int[] iArr = new int[r40.j.values().length];
        try {
            iArr[r40.j.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r40.j.DISMISS_CHAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r40.j.DISMISS_CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f122342a = iArr;
        int[] iArr2 = new int[r40.i.values().length];
        try {
            iArr2[r40.i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r40.i.END_CHAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r40.i.OPEN_CALL_REQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r40.i.ACCEPT_CALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r40.i.RETURN_TO_CALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[r40.i.OPEN_CHAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[r40.i.RATE_CALL_REQUEST.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f122343b = iArr2;
        int[] iArr3 = new int[c0.values().length];
        try {
            iArr3[c0.SUPPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[c0.ASSISTANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f122344c = iArr3;
    }
}
