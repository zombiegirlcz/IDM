package com.revolut.feature.rev_points.impl.ui.wrapped.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/rev_points/impl/ui/wrapped/flow/RevPointsWrappedFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Cards", "Lcom/revolut/feature/rev_points/impl/ui/wrapped/flow/RevPointsWrappedFlowContract$Step$Cards;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsWrappedFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/wrapped/flow/RevPointsWrappedFlowContract$Step$Cards;", "Lcom/revolut/feature/rev_points/impl/ui/wrapped/flow/RevPointsWrappedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cards extends RevPointsWrappedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Cards> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f83937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f83938b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cards((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cards[i];
            }
        }

        public Cards(LocalDate localDate, LocalDate localDate2) {
            this.f83937a = localDate;
            this.f83938b = localDate2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cards)) {
                return false;
            }
            Cards cards = (Cards) obj2;
            return Intrinsics.f(this.f83937a, cards.f83937a) && Intrinsics.f(this.f83938b, cards.f83938b);
        }

        public final int hashCode() {
            LocalDate localDate = this.f83937a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f83938b;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f83937a);
            dest.writeSerializable(this.f83938b);
        }
    }

    private RevPointsWrappedFlowContract$Step() {
    }
}
