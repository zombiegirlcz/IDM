package wx1;

import com.revolut.feature.apm.core.models.recipients.IdentityType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f300735c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.NOT_REGISTERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f300733a = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f300734b = iArr2;
        int[] iArr3 = new int[a.values().length];
        try {
            iArr3[a.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[a.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f300735c = iArr3;
        int[] iArr4 = new int[IdentityType.values().length];
        try {
            iArr4[IdentityType.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[IdentityType.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
    }
}
