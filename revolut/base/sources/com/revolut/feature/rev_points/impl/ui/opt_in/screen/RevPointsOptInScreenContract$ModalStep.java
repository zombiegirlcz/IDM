package com.revolut.feature.rev_points.impl.ui.opt_in.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/rev_points/impl/ui/opt_in/screen/RevPointsOptInScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TermsReview", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/screen/RevPointsOptInScreenContract$ModalStep$TermsReview;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsOptInScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/screen/RevPointsOptInScreenContract$ModalStep$TermsReview;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/screen/RevPointsOptInScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsReview extends RevPointsOptInScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTermsReviewInputData f83819a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsReview((RevPointsTermsReviewInputData) parcel.readParcelable(TermsReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsReview[i];
            }
        }

        public TermsReview(RevPointsTermsReviewInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f83819a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsReview) && Intrinsics.f(this.f83819a, ((TermsReview) obj2).f83819a);
        }

        public final int hashCode() {
            return this.f83819a.f83546a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83819a, i);
        }
    }

    private RevPointsOptInScreenContract$ModalStep() {
    }
}
