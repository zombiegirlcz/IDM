package com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/screens/feature_rating/AccountClosureFeatureRatingScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "FeatureRatingFeedback", "Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/feature_rating/AccountClosureFeatureRatingScreenContract$Step$FeatureRatingFeedback;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AccountClosureFeatureRatingScreenContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/feature_rating/AccountClosureFeatureRatingScreenContract$Step$FeatureRatingFeedback;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/feature_rating/AccountClosureFeatureRatingScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeatureRatingFeedback extends AccountClosureFeatureRatingScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeatureRatingFeedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountClosureFeedbackFeature f94947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94948b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeatureRatingFeedback((AccountClosureFeedbackFeature) parcel.readParcelable(FeatureRatingFeedback.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeatureRatingFeedback[i];
            }
        }

        public FeatureRatingFeedback(AccountClosureFeedbackFeature feature, String str) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.f94947a = feature;
            this.f94948b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeatureRatingFeedback)) {
                return false;
            }
            FeatureRatingFeedback featureRatingFeedback = (FeatureRatingFeedback) obj2;
            return Intrinsics.f(this.f94947a, featureRatingFeedback.f94947a) && Intrinsics.f(this.f94948b, featureRatingFeedback.f94948b);
        }

        public final int hashCode() {
            int iHashCode = this.f94947a.hashCode() * 31;
            String str = this.f94948b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94947a, i);
            dest.writeString(this.f94948b);
        }
    }

    private AccountClosureFeatureRatingScreenContract$Step() {
    }
}
