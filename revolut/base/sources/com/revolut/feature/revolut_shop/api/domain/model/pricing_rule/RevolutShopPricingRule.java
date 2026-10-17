package com.revolut.feature.revolut_shop.api.domain.model.pricing_rule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricing_plans.shared.models.PricingRule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/domain/model/pricing_rule/RevolutShopPricingRule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutShopPricingRule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutShopPricingRule> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingRule f84203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutShopPricingRuleMappingPayload f84204b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutShopPricingRule((PricingRule) parcel.readParcelable(RevolutShopPricingRule.class.getClassLoader()), parcel.readInt() == 0 ? null : RevolutShopPricingRuleMappingPayload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutShopPricingRule[i];
        }
    }

    public RevolutShopPricingRule(PricingRule pricingRule, RevolutShopPricingRuleMappingPayload revolutShopPricingRuleMappingPayload) {
        Intrinsics.checkNotNullParameter(pricingRule, "pricingRule");
        this.f84203a = pricingRule;
        this.f84204b = revolutShopPricingRuleMappingPayload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutShopPricingRule)) {
            return false;
        }
        RevolutShopPricingRule revolutShopPricingRule = (RevolutShopPricingRule) obj2;
        return Intrinsics.f(this.f84203a, revolutShopPricingRule.f84203a) && Intrinsics.f(this.f84204b, revolutShopPricingRule.f84204b);
    }

    public final int hashCode() {
        int iHashCode = this.f84203a.hashCode() * 31;
        RevolutShopPricingRuleMappingPayload revolutShopPricingRuleMappingPayload = this.f84204b;
        return iHashCode + (revolutShopPricingRuleMappingPayload == null ? 0 : Double.hashCode(revolutShopPricingRuleMappingPayload.f84205a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84203a, i);
        RevolutShopPricingRuleMappingPayload revolutShopPricingRuleMappingPayload = this.f84204b;
        if (revolutShopPricingRuleMappingPayload == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revolutShopPricingRuleMappingPayload.writeToParcel(dest, i);
        }
    }
}
