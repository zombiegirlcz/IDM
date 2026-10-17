package com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.u;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/screen/amount_suggestion/AmountSuggestionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountSuggestionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AmountSuggestionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f72060b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountSuggestionScreenContract$InputData(parcel.readString(), u.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountSuggestionScreenContract$InputData[i];
        }
    }

    public AmountSuggestionScreenContract$InputData(String charityId, u donationMode) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        this.f72059a = charityId;
        this.f72060b = donationMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountSuggestionScreenContract$InputData)) {
            return false;
        }
        AmountSuggestionScreenContract$InputData amountSuggestionScreenContract$InputData = (AmountSuggestionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f72059a, amountSuggestionScreenContract$InputData.f72059a) && this.f72060b == amountSuggestionScreenContract$InputData.f72060b;
    }

    public final int hashCode() {
        return this.f72060b.hashCode() + (this.f72059a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72059a);
        dest.writeString(this.f72060b.name());
    }
}
