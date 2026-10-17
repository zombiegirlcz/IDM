package u22;

import com.revolut.feature.apm.core.models.recipients.IdentityType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276543a;

    static {
        int[] iArr = new int[IdentityType.values().length];
        try {
            iArr[IdentityType.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IdentityType.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f276543a = iArr;
    }
}
