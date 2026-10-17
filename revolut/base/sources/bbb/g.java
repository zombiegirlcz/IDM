package bbb;

import com.revolut.domain.models.login.ChannelType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f14227b;

    static {
        int[] iArr = new int[ChannelType.values().length];
        try {
            iArr[ChannelType.PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChannelType.SMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChannelType.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChannelType.CALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChannelType.PASSCODE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChannelType.SESSION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChannelType.CHAT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChannelType.SECURITY_QUESTIONS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f14226a = iArr;
        int[] iArr2 = new int[tjg.e.values().length];
        try {
            iArr2[tjg.e.PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[tjg.e.SMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[tjg.e.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[tjg.e.CALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[tjg.e.PASSCODE.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[tjg.e.SESSION.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        f14227b = iArr2;
    }
}
