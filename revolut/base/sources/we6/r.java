package we6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopUpContext f296670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData f296671c;
    public final boolean d;
    public final AnalyticsProduct.Retail e;

    public r(dj0.d amount, TopUpContext topUpContext, CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) {
        k9 value = k9.OpenBanking;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f296669a = amount;
        this.f296670b = topUpContext;
        this.f296671c = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
        this.d = true;
        this.e = analyticsProduct;
    }

    public final dj0.d b() {
        return this.f296669a;
    }

    public final AnalyticsProduct c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData e() {
        return this.f296671c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f296669a, rVar.f296669a) && Intrinsics.f(this.f296670b, rVar.f296670b) && Intrinsics.f(this.f296671c, rVar.f296671c) && this.d == rVar.d && Intrinsics.f(this.e, rVar.e);
    }

    public final TopUpContext f() {
        return this.f296670b;
    }

    public final int hashCode() {
        int iHashCode = (this.f296670b.hashCode() + (this.f296669a.hashCode() * 31)) * 31;
        CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData = this.f296671c;
        return this.e.f50300a.hashCode() + j6.a.c((iHashCode + (crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData == null ? 0 : crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.hashCode())) * 31, 31, this.d);
    }
}
