package bn6;

import com.revolut.domain.models.user.UserCompanyRegion;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17120a;

    static {
        int[] iArr = new int[UserCompanyRegion.values().length];
        try {
            iArr[UserCompanyRegion.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f17120a = iArr;
    }
}
