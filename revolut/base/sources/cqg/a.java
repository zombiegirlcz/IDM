package cqg;

import ipa.h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108098a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.SHARED_VAULT_INVITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.SHARED_VAULT_MEMBER_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108098a = iArr;
    }
}
