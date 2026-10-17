package com.revolut.feature.rewards.impl.ui.details.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel", "Landroid/os/Parcelable;", "Primary", "Secondary", "Lcom/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel$Primary;", "Lcom/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel$Secondary;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RewardBottomSheetContract$ButtonParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel$Primary;", "Lcom/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Primary implements RewardBottomSheetContract$ButtonParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Primary f84913a = new Primary();

        @NotNull
        public static final Parcelable.Creator<Primary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Primary.f84913a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Primary[i];
            }
        }

        private Primary() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel$Secondary;", "Lcom/revolut/feature/rewards/impl/ui/details/bottomsheet/RewardBottomSheetContract$ButtonParcel;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Secondary implements RewardBottomSheetContract$ButtonParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Secondary f84914a = new Secondary();

        @NotNull
        public static final Parcelable.Creator<Secondary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Secondary.f84914a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Secondary[i];
            }
        }

        private Secondary() {
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
