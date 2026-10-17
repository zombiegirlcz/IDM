package com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/card_claims/CardClaimsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardClaimsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardClaimsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeInsurancePortal f76153b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardClaimsScreenContract$InputData(parcel.createStringArrayList(), SchemeInsurancePortal.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardClaimsScreenContract$InputData[i];
        }
    }

    public CardClaimsScreenContract$InputData(List eligibleCardsIds, SchemeInsurancePortal website) {
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f76152a = eligibleCardsIds;
        this.f76153b = website;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardClaimsScreenContract$InputData)) {
            return false;
        }
        CardClaimsScreenContract$InputData cardClaimsScreenContract$InputData = (CardClaimsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76152a, cardClaimsScreenContract$InputData.f76152a) && Intrinsics.f(this.f76153b, cardClaimsScreenContract$InputData.f76153b);
    }

    public final int hashCode() {
        return this.f76153b.hashCode() + (this.f76152a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f76152a);
        this.f76153b.writeToParcel(dest, i);
    }
}
