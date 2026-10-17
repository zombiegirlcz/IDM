package jy9;

import iy9.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f179352b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.PEER_TO_PEER_CHAT_MESSAGING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.BLOCK_USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.TWO_FA_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.NOTIFICATIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.HIDE_P2P_CHAT_HISTORY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f179351a = iArr;
        int[] iArr2 = new int[iy9.a.values().length];
        try {
            iArr2[iy9.a.PEER_TO_PEER_CHAT_MESSAGING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[iy9.a.BLOCK_USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[iy9.a.TWO_FA_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[iy9.a.NOTIFICATIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[iy9.a.HIDE_P2P_CHAT_HISTORY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f179352b = iArr2;
    }
}
