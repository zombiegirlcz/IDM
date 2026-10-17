package com.revolut.feature.store.impl.ui.brand_detail.screen.earn;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/store/impl/ui/brand_detail/screen/earn/StoreBrandDetailEarnScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreBrandDetailEarnScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StoreBrandDetailEarnScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreMegaOffer f88675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88676c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreBrandDetailEarnScreenContract$InputData(parcel.readString(), (StoreMegaOffer) parcel.readParcelable(StoreBrandDetailEarnScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreBrandDetailEarnScreenContract$InputData[i];
        }
    }

    public StoreBrandDetailEarnScreenContract$InputData(String offerId, StoreMegaOffer storeMegaOffer, String str) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        this.f88674a = offerId;
        this.f88675b = storeMegaOffer;
        this.f88676c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreBrandDetailEarnScreenContract$InputData)) {
            return false;
        }
        StoreBrandDetailEarnScreenContract$InputData storeBrandDetailEarnScreenContract$InputData = (StoreBrandDetailEarnScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88674a, storeBrandDetailEarnScreenContract$InputData.f88674a) && Intrinsics.f(this.f88675b, storeBrandDetailEarnScreenContract$InputData.f88675b) && Intrinsics.f(this.f88676c, storeBrandDetailEarnScreenContract$InputData.f88676c);
    }

    public final int hashCode() {
        int iHashCode = this.f88674a.hashCode() * 31;
        StoreMegaOffer storeMegaOffer = this.f88675b;
        int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
        String str = this.f88676c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88674a);
        dest.writeParcelable(this.f88675b, i);
        dest.writeString(this.f88676c);
    }
}
