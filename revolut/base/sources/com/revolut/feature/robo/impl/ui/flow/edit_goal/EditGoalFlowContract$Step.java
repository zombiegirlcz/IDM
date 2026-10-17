package com.revolut.feature.robo.impl.ui.flow.edit_goal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EditGoalScreen", "Projections", "DeleteGoalConfirmation", "Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step$DeleteGoalConfirmation;", "Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step$EditGoalScreen;", "Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step$Projections;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EditGoalFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step$DeleteGoalConfirmation;", "Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step;", "<init>", "()V", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeleteGoalConfirmation implements EditGoalFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteGoalConfirmation f85101a = new DeleteGoalConfirmation();

        @NotNull
        public static final Parcelable.Creator<DeleteGoalConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeleteGoalConfirmation.f85101a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteGoalConfirmation[i];
            }
        }

        private DeleteGoalConfirmation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step$EditGoalScreen;", "Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step;", "<init>", "()V", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditGoalScreen implements EditGoalFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditGoalScreen f85102a = new EditGoalScreen();

        @NotNull
        public static final Parcelable.Creator<EditGoalScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditGoalScreen.f85102a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditGoalScreen[i];
            }
        }

        private EditGoalScreen() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step$Projections;", "Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/robo/impl/ui/flow/edit_goal/a", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Projections implements EditGoalFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Projections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortfolioGoal f85103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.robo.impl.ui.flow.edit_goal.a f85104b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Projections((PortfolioGoal) parcel.readParcelable(Projections.class.getClassLoader()), com.revolut.feature.robo.impl.ui.flow.edit_goal.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Projections[i];
            }
        }

        public Projections(PortfolioGoal goal, com.revolut.feature.robo.impl.ui.flow.edit_goal.a mode) {
            Intrinsics.checkNotNullParameter(goal, "goal");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f85103a = goal;
            this.f85104b = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Projections)) {
                return false;
            }
            Projections projections = (Projections) obj2;
            return Intrinsics.f(this.f85103a, projections.f85103a) && this.f85104b == projections.f85104b;
        }

        public final int hashCode() {
            return this.f85104b.hashCode() + (this.f85103a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85103a, i);
            dest.writeString(this.f85104b.name());
        }
    }
}
