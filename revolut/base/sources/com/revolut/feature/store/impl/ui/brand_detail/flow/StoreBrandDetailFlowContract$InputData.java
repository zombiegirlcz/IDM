package com.revolut.feature.store.impl.ui.brand_detail.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreBrandDetailFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StoreBrandDetailFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreMegaOffer f88652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BrandDetailTab f88653c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreBrandDetailFlowContract$InputData(parcel.readString(), (StoreMegaOffer) parcel.readParcelable(StoreBrandDetailFlowContract$InputData.class.getClassLoader()), (BrandDetailTab) parcel.readParcelable(StoreBrandDetailFlowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreBrandDetailFlowContract$InputData[i];
        }
    }

    public StoreBrandDetailFlowContract$InputData(String offerId, StoreMegaOffer storeMegaOffer, BrandDetailTab brandDetailTab, String str) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        this.f88651a = offerId;
        this.f88652b = storeMegaOffer;
        this.f88653c = brandDetailTab;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreBrandDetailFlowContract$InputData)) {
            return false;
        }
        StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = (StoreBrandDetailFlowContract$InputData) obj2;
        return Intrinsics.f(this.f88651a, storeBrandDetailFlowContract$InputData.f88651a) && Intrinsics.f(this.f88652b, storeBrandDetailFlowContract$InputData.f88652b) && Intrinsics.f(this.f88653c, storeBrandDetailFlowContract$InputData.f88653c) && Intrinsics.f(this.d, storeBrandDetailFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f88651a.hashCode() * 31;
        StoreMegaOffer storeMegaOffer = this.f88652b;
        int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
        BrandDetailTab brandDetailTab = this.f88653c;
        int iHashCode3 = (iHashCode2 + (brandDetailTab == null ? 0 : brandDetailTab.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88651a);
        dest.writeParcelable(this.f88652b, i);
        dest.writeParcelable(this.f88653c, i);
        dest.writeString(this.d);
    }
}
