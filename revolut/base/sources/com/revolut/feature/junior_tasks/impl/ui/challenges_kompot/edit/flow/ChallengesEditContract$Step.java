package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Details", "Reward", "Frequency", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step$Details;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step$Frequency;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step$Reward;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChallengesEditContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step$Details;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step;", "<init>", "()V", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details implements ChallengesEditContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f77364a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f77364a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step$Frequency;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step;", "<init>", "()V", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Frequency implements ChallengesEditContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Frequency f77365a = new Frequency();

        @NotNull
        public static final Parcelable.Creator<Frequency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Frequency.f77365a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Frequency[i];
            }
        }

        private Frequency() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step$Reward;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$Step;", "<init>", "()V", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reward implements ChallengesEditContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Reward f77366a = new Reward();

        @NotNull
        public static final Parcelable.Creator<Reward> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Reward.f77366a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reward[i];
            }
        }

        private Reward() {
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
}
