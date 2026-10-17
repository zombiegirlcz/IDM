package com.revolut.feature.rev_points.impl.ui.trophy_room.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TotalSaved", "BottomSheet", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep$BottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep$TotalSaved;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsTrophyRoomHomeScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep$BottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheet extends RevPointsTrophyRoomHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83922a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public BottomSheet(String product) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.f83922a = product;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheet) && Intrinsics.f(this.f83922a, ((BottomSheet) obj2).f83922a);
        }

        public final int hashCode() {
            return this.f83922a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83922a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep$TotalSaved;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreenContract$ModalStep;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalSaved extends RevPointsTrophyRoomHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TotalSaved f83923a = new TotalSaved();

        @NotNull
        public static final Parcelable.Creator<TotalSaved> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TotalSaved.f83923a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalSaved[i];
            }
        }

        private TotalSaved() {
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

    private RevPointsTrophyRoomHomeScreenContract$ModalStep() {
    }
}
