package qbe;

import com.revolut.feature.apm.core.models.payments_authorisations.DeactivationReason;
import ibd.f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f244230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f244231b;

    static {
        int[] iArr = new int[DeactivationReason.values().length];
        try {
            iArr[DeactivationReason.CANCELED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeactivationReason.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f244230a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f244231b = iArr2;
    }
}
