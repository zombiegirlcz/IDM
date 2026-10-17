package com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating_feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/screens/feature_rating_feedback/AccountClosureFeatureRatingFeedbackScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureFeatureRatingFeedbackScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountClosureFeatureRatingFeedbackScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedbackFeature f94951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94952b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureFeatureRatingFeedbackScreenContract$InputData((AccountClosureFeedbackFeature) parcel.readParcelable(AccountClosureFeatureRatingFeedbackScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureFeatureRatingFeedbackScreenContract$InputData[i];
        }
    }

    public AccountClosureFeatureRatingFeedbackScreenContract$InputData(AccountClosureFeedbackFeature feature, String str) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f94951a = feature;
        this.f94952b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureFeatureRatingFeedbackScreenContract$InputData)) {
            return false;
        }
        AccountClosureFeatureRatingFeedbackScreenContract$InputData accountClosureFeatureRatingFeedbackScreenContract$InputData = (AccountClosureFeatureRatingFeedbackScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94951a, accountClosureFeatureRatingFeedbackScreenContract$InputData.f94951a) && Intrinsics.f(this.f94952b, accountClosureFeatureRatingFeedbackScreenContract$InputData.f94952b);
    }

    public final int hashCode() {
        int iHashCode = this.f94951a.hashCode() * 31;
        String str = this.f94952b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94951a, i);
        dest.writeString(this.f94952b);
    }
}
