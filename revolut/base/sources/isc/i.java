package isc;

import vrc.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168181b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.OPTIONAL_TO_SKIP_2FA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.MANDATORY_TO_TRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.TRADE_WITH_WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f168180a = iArr;
        int[] iArr2 = new int[vrc.h.values().length];
        try {
            iArr2[vrc.h.SCA_LEGAL_ENTITY_DESCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vrc.h.HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f168181b = iArr2;
    }
}
