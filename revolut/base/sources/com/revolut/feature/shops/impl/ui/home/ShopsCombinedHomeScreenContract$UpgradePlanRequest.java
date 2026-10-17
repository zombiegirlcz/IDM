package com.revolut.feature.shops.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$UpgradePlanRequest", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsCombinedHomeScreenContract$UpgradePlanRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsCombinedHomeScreenContract$UpgradePlanRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f87194c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsCombinedHomeScreenContract$UpgradePlanRequest(parcel.readString(), parcel.readString(), w0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsCombinedHomeScreenContract$UpgradePlanRequest[i];
        }
    }

    public ShopsCombinedHomeScreenContract$UpgradePlanRequest(String productId, String str, w0 requiredPlan) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(requiredPlan, "requiredPlan");
        this.f87192a = productId;
        this.f87193b = str;
        this.f87194c = requiredPlan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsCombinedHomeScreenContract$UpgradePlanRequest)) {
            return false;
        }
        ShopsCombinedHomeScreenContract$UpgradePlanRequest shopsCombinedHomeScreenContract$UpgradePlanRequest = (ShopsCombinedHomeScreenContract$UpgradePlanRequest) obj2;
        return Intrinsics.f(this.f87192a, shopsCombinedHomeScreenContract$UpgradePlanRequest.f87192a) && Intrinsics.f(this.f87193b, shopsCombinedHomeScreenContract$UpgradePlanRequest.f87193b) && this.f87194c == shopsCombinedHomeScreenContract$UpgradePlanRequest.f87194c;
    }

    public final int hashCode() {
        int iHashCode = this.f87192a.hashCode() * 31;
        String str = this.f87193b;
        return this.f87194c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87192a);
        dest.writeString(this.f87193b);
        dest.writeString(this.f87194c.name());
    }
}
