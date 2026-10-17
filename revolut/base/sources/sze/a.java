package sze;

import com.revolut.domain.models.topup.methods.TopupMethod;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f266802b;

    static {
        int[] iArr = new int[TopupMethod.StoredMethod.LogoBadge.Style.values().length];
        try {
            iArr[TopupMethod.StoredMethod.LogoBadge.Style.ACCENT_NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopupMethod.StoredMethod.LogoBadge.Style.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f266801a = iArr;
        int[] iArr2 = new int[TopupMethod.StoredMethod.LogoBadge.Icon.values().length];
        try {
            iArr2[TopupMethod.StoredMethod.LogoBadge.Icon.SUSPICIOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TopupMethod.StoredMethod.LogoBadge.Icon.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f266802b = iArr2;
    }
}
