package f0a;

import zz9.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131067a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.USER_IS_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.DISABLED_BY_PRIVACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.DISABLED_BY_CONTACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.TEXT_NOT_SUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.EMPTY_REMOTE_CONTACT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s.CHAT_IS_NOT_SUPPORTED_BY_CONTACT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[s.BLOCKED_BY_TOO_MANY_USERS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[s.NON_REVOLUT_CONTACT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[s.ENABLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[s.USER_IS_COMPLETELY_BLOCKED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f131067a = iArr;
    }
}
