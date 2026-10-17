package ial;

import gal.h;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f160058b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.TM_DECLINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.OTHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f160057a = iArr;
        int[] iArr2 = new int[com.revolut.shared.feature.suspicious_transaction.api.models.a.values().length];
        try {
            iArr2[com.revolut.shared.feature.suspicious_transaction.api.models.a.POST.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.shared.feature.suspicious_transaction.api.models.a.PUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.shared.feature.suspicious_transaction.api.models.a.PATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.shared.feature.suspicious_transaction.api.models.a.DELETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f160058b = iArr2;
    }
}
