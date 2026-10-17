package com.revolut.feature.revolut_shop.api.domain.model.pricing_rule;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/domain/model/pricing_rule/RevolutShopPricingRuleMappingPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutShopPricingRuleMappingPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutShopPricingRuleMappingPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f84205a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutShopPricingRuleMappingPayload(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutShopPricingRuleMappingPayload[i];
        }
    }

    public RevolutShopPricingRuleMappingPayload(double d) {
        this.f84205a = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevolutShopPricingRuleMappingPayload) && Double.compare(this.f84205a, ((RevolutShopPricingRuleMappingPayload) obj2).f84205a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f84205a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f84205a);
    }
}
