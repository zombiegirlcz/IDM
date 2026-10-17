package com.revolut.feature.staking.impl.flow.stake.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StakingDetails", "Stake", "Blocked", "MaticBlocked", "Confirmation", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$Blocked;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$Confirmation;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$MaticBlocked;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$Stake;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$StakingDetails;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StakingControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$Blocked;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step;", "<init>", "()V", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Blocked implements StakingControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Blocked f88128a = new Blocked();

        @NotNull
        public static final Parcelable.Creator<Blocked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Blocked.f88128a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Blocked[i];
            }
        }

        private Blocked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$Confirmation;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements StakingControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f88129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StakingPocket f88131c;
        public final StakingProduct d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((d) parcel.readSerializable(), parcel.readString(), (StakingPocket) parcel.readParcelable(Confirmation.class.getClassLoader()), (StakingProduct) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(d amount, String sourcePocketId, StakingPocket stakingPocket, StakingProduct stakingProduct) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f88129a = amount;
            this.f88130b = sourcePocketId;
            this.f88131c = stakingPocket;
            this.d = stakingProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f88129a, confirmation.f88129a) && Intrinsics.f(this.f88130b, confirmation.f88130b) && Intrinsics.f(this.f88131c, confirmation.f88131c) && Intrinsics.f(this.d, confirmation.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f88129a.hashCode() * 31, 31, this.f88130b);
            StakingPocket stakingPocket = this.f88131c;
            return this.d.hashCode() + ((iC + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88129a);
            dest.writeString(this.f88130b);
            dest.writeParcelable(this.f88131c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$MaticBlocked;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step;", "<init>", "()V", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MaticBlocked implements StakingControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MaticBlocked f88132a = new MaticBlocked();

        @NotNull
        public static final Parcelable.Creator<MaticBlocked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MaticBlocked.f88132a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaticBlocked[i];
            }
        }

        private MaticBlocked() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$Stake;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step;", "<init>", "()V", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stake implements StakingControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stake f88133a = new Stake();

        @NotNull
        public static final Parcelable.Creator<Stake> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stake.f88133a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stake[i];
            }
        }

        private Stake() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step$StakingDetails;", "Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StakingDetails implements StakingControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<StakingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingProduct f88134a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StakingDetails((StakingProduct) parcel.readParcelable(StakingDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StakingDetails[i];
            }
        }

        public StakingDetails(StakingProduct stakingProduct) {
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f88134a = stakingProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StakingDetails) && Intrinsics.f(this.f88134a, ((StakingDetails) obj2).f88134a);
        }

        public final int hashCode() {
            return this.f88134a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88134a, i);
        }
    }
}
