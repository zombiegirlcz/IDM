package com.revolut.feature.card_design.impl.card_limit_controller;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.common.IOData$Input;
import e93.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_design/impl/card_limit_controller/CardLimitControllerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardLimitControllerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardLimitControllerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f64737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBankingProfile f64738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f64739c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardLimitControllerScreenContract$InputData((f) parcel.readSerializable(), (JuniorBankingProfile) parcel.readParcelable(CardLimitControllerScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CardLimitControllerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardLimitControllerScreenContract$InputData[i];
        }
    }

    public CardLimitControllerScreenContract$InputData(f cardDesign, JuniorBankingProfile juniorBankingProfile, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f64737a = cardDesign;
        this.f64738b = juniorBankingProfile;
        this.f64739c = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardLimitControllerScreenContract$InputData)) {
            return false;
        }
        CardLimitControllerScreenContract$InputData cardLimitControllerScreenContract$InputData = (CardLimitControllerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64737a, cardLimitControllerScreenContract$InputData.f64737a) && Intrinsics.f(this.f64738b, cardLimitControllerScreenContract$InputData.f64738b) && Intrinsics.f(this.f64739c, cardLimitControllerScreenContract$InputData.f64739c);
    }

    public final int hashCode() {
        int iHashCode = this.f64737a.hashCode() * 31;
        JuniorBankingProfile juniorBankingProfile = this.f64738b;
        return this.f64739c.hashCode() + ((iHashCode + (juniorBankingProfile == null ? 0 : juniorBankingProfile.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64737a);
        dest.writeParcelable(this.f64738b, i);
        dest.writeParcelable(this.f64739c, i);
    }
}
