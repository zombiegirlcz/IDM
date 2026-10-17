package com.revolut.feature.wealth_discovery.impl.screener.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.screener.ScreenerBrand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/BrandOption;", "Lcom/revolut/feature/wealth_discovery/impl/screener/domain/model/ScreenerOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrandOption implements ScreenerOption {

    @NotNull
    public static final Parcelable.Creator<BrandOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerBrand f96150a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrandOption((ScreenerBrand) parcel.readParcelable(BrandOption.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrandOption[i];
        }
    }

    public BrandOption(ScreenerBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f96150a = brand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BrandOption) && Intrinsics.f(this.f96150a, ((BrandOption) obj2).f96150a);
    }

    @Override // com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerOption
    /* JADX INFO: renamed from: getName */
    public final String getF96152a() {
        return this.f96150a.f105151a;
    }

    public final int hashCode() {
        return this.f96150a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96150a, i);
    }
}
