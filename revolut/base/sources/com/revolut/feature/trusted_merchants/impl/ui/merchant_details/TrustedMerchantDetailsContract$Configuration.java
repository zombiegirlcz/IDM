package com.revolut.feature.trusted_merchants.impl.ui.merchant_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trusted_merchants/impl/ui/merchant_details/TrustedMerchantDetailsContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrustedMerchantDetailsContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrustedMerchantDetailsContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchant.Approved f94439a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrustedMerchantDetailsContract$Configuration((TrustedMerchant.Approved) parcel.readParcelable(TrustedMerchantDetailsContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrustedMerchantDetailsContract$Configuration[i];
        }
    }

    public TrustedMerchantDetailsContract$Configuration(TrustedMerchant.Approved merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f94439a = merchant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TrustedMerchantDetailsContract$Configuration) && Intrinsics.f(this.f94439a, ((TrustedMerchantDetailsContract$Configuration) obj2).f94439a);
    }

    public final int hashCode() {
        return this.f94439a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94439a, i);
    }
}
