package vb6;

import com.revolut.domain.models.user.UserCompanyRegion;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287431a;

    static {
        int[] iArr = new int[UserCompanyRegion.values().length];
        try {
            iArr[UserCompanyRegion.LT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserCompanyRegion.IE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserCompanyRegion.CH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserCompanyRegion.EEA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f287431a = iArr;
    }
}
