package com.revolut.feature.staking.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class StakingApi$FeatureToggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/api/StakingApi$FeatureToggles$FlexibleStaking;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlexibleStaking extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FlexibleStaking f88055c = new FlexibleStaking();

        @NotNull
        public static final Parcelable.Creator<FlexibleStaking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlexibleStaking.f88055c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlexibleStaking[i];
            }
        }

        private FlexibleStaking() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoFlexibleStaking");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/api/StakingApi$FeatureToggles$PocketPicker;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PocketPicker extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PocketPicker f88056c = new PocketPicker();

        @NotNull
        public static final Parcelable.Creator<PocketPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PocketPicker.f88056c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketPicker[i];
            }
        }

        private PocketPicker() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("stakingWithExchange");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/api/StakingApi$FeatureToggles$StakeBlocked;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StakeBlocked extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StakeBlocked f88057c = new StakeBlocked();

        @NotNull
        public static final Parcelable.Creator<StakeBlocked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StakeBlocked.f88057c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StakeBlocked[i];
            }
        }

        private StakeBlocked() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoStakingBlocked");
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

    private StakingApi$FeatureToggles() {
    }

    public static List a() {
        return v.k(StakeBlocked.f88057c, PocketPicker.f88056c, FlexibleStaking.f88055c);
    }
}
