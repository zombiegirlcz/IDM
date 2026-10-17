package com.revolut.feature.rev_points.impl.ui.terms_review.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.rev_points.models.TermsToReview;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/terms_review/screen/RevPointsReadTermsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsReadTermsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsReadTermsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsToReview f83849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f83850b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsReadTermsControllerContract$InputData((TermsToReview) parcel.readParcelable(RevPointsReadTermsControllerContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(RevPointsReadTermsControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsReadTermsControllerContract$InputData[i];
        }
    }

    public RevPointsReadTermsControllerContract$InputData(TermsToReview termsToReview, Clause actionButtonText) {
        Intrinsics.checkNotNullParameter(termsToReview, "termsToReview");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.f83849a = termsToReview;
        this.f83850b = actionButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsReadTermsControllerContract$InputData)) {
            return false;
        }
        RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData = (RevPointsReadTermsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f83849a, revPointsReadTermsControllerContract$InputData.f83849a) && Intrinsics.f(this.f83850b, revPointsReadTermsControllerContract$InputData.f83850b);
    }

    public final int hashCode() {
        return this.f83850b.hashCode() + (this.f83849a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83849a, i);
        dest.writeParcelable(this.f83850b, i);
    }
}
