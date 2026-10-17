package bhj;

import com.revolut.domain.models.user.UserCompanyRegion;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f15305b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.INSTALLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15304a = iArr;
        int[] iArr2 = new int[UserCompanyRegion.values().length];
        try {
            iArr2[UserCompanyRegion.MX.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f15305b = iArr2;
    }
}
