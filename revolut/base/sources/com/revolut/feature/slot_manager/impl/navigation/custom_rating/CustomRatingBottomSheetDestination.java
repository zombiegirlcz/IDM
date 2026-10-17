package com.revolut.feature.slot_manager.impl.navigation.custom_rating;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/navigation/custom_rating/CustomRatingBottomSheetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomRatingBottomSheetDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CustomRatingBottomSheetDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedbackBundle f87352a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomRatingBottomSheetDestination(FeedbackBundle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomRatingBottomSheetDestination[i];
        }
    }

    public CustomRatingBottomSheetDestination(FeedbackBundle feedbackBundle) {
        Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
        this.f87352a = feedbackBundle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FeedbackBundle getF87352a() {
        return this.f87352a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CustomRatingBottomSheetDestination) && Intrinsics.f(this.f87352a, ((CustomRatingBottomSheetDestination) obj2).f87352a);
    }

    public final int hashCode() {
        return this.f87352a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87352a.writeToParcel(dest, i);
    }
}
