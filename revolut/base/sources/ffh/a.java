package ffh;

import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowContract$Page;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134804a;

    static {
        int[] iArr = new int[PrivateCompanyDetailsFlowContract$Page.values().length];
        try {
            iArr[PrivateCompanyDetailsFlowContract$Page.OVERVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PrivateCompanyDetailsFlowContract$Page.FINANCIALS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PrivateCompanyDetailsFlowContract$Page.FEED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f134804a = iArr;
    }
}
