package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberOption;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_featured_number_selection/EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f101220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimFeaturedPhoneNumberOption f101221c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData(parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData.class.getClassLoader()), (EsimFeaturedPhoneNumberOption) parcel.readParcelable(EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData(String mobilePlanId, EsimGiftRecipient esimGiftRecipient, EsimFeaturedPhoneNumberOption featuredOption) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(featuredOption, "featuredOption");
        this.f101219a = mobilePlanId;
        this.f101220b = esimGiftRecipient;
        this.f101221c = featuredOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = (EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101219a, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.f101219a) && Intrinsics.f(this.f101220b, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.f101220b) && Intrinsics.f(this.f101221c, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.f101221c);
    }

    public final int hashCode() {
        int iHashCode = this.f101219a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f101220b;
        return this.f101221c.f100256a.hashCode() + ((iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101219a);
        dest.writeParcelable(this.f101220b, i);
        dest.writeParcelable(this.f101221c, i);
    }
}
