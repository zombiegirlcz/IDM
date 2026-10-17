package we6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopUpContext f296686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo f296687c;
    public final boolean d;
    public final AnalyticsProduct.Retail e;

    public w(dj0.d amount, TopUpContext topUpContext, EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo) {
        k9 value = k9.OpenBanking;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f296685a = amount;
        this.f296686b = topUpContext;
        this.f296687c = easyBankTransferDescriptor$PreselectedInstitutionInfo;
        this.d = true;
        this.e = analyticsProduct;
    }

    public final dj0.d b() {
        return this.f296685a;
    }

    public final AnalyticsProduct c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo e() {
        return this.f296687c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f296685a, wVar.f296685a) && Intrinsics.f(this.f296686b, wVar.f296686b) && Intrinsics.f(this.f296687c, wVar.f296687c) && this.d == wVar.d && Intrinsics.f(this.e, wVar.e);
    }

    public final TopUpContext f() {
        return this.f296686b;
    }

    public final int hashCode() {
        int iHashCode = (this.f296686b.hashCode() + (this.f296685a.hashCode() * 31)) * 31;
        EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo = this.f296687c;
        return this.e.f50300a.hashCode() + j6.a.c((iHashCode + (easyBankTransferDescriptor$PreselectedInstitutionInfo == null ? 0 : easyBankTransferDescriptor$PreselectedInstitutionInfo.hashCode())) * 31, 31, this.d);
    }
}
