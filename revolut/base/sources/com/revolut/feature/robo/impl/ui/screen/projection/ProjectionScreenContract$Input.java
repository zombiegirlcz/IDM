package com.revolut.feature.robo.impl.ui.screen.projection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProjectionScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProjectionScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioGoal f85181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f85182c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProjectionScreenContract$Input(parcel.readString(), (PortfolioGoal) parcel.readParcelable(ProjectionScreenContract$Input.class.getClassLoader()), (Clause) parcel.readParcelable(ProjectionScreenContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProjectionScreenContract$Input[i];
        }
    }

    public ProjectionScreenContract$Input(String portfolioId, PortfolioGoal portfolioGoal, Clause ctaButtonText) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ctaButtonText, "ctaButtonText");
        this.f85180a = portfolioId;
        this.f85181b = portfolioGoal;
        this.f85182c = ctaButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProjectionScreenContract$Input)) {
            return false;
        }
        ProjectionScreenContract$Input projectionScreenContract$Input = (ProjectionScreenContract$Input) obj2;
        return Intrinsics.f(this.f85180a, projectionScreenContract$Input.f85180a) && Intrinsics.f(this.f85181b, projectionScreenContract$Input.f85181b) && Intrinsics.f(this.f85182c, projectionScreenContract$Input.f85182c);
    }

    public final int hashCode() {
        int iHashCode = this.f85180a.hashCode() * 31;
        PortfolioGoal portfolioGoal = this.f85181b;
        return this.f85182c.hashCode() + ((iHashCode + (portfolioGoal == null ? 0 : portfolioGoal.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85180a);
        dest.writeParcelable(this.f85181b, i);
        dest.writeParcelable(this.f85182c, i);
    }
}
