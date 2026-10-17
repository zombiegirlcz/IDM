package com.revolut.feature.donations.impl.ui.kompot.screen.charity.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DonateWithRevPointsBottomSheet", "SpareChange", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step$DonateWithRevPointsBottomSheet;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step$SpareChange;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CharityDetailsScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step$DonateWithRevPointsBottomSheet;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DonateWithRevPointsBottomSheet implements CharityDetailsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DonateWithRevPointsBottomSheet f72064a = new DonateWithRevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<DonateWithRevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DonateWithRevPointsBottomSheet.f72064a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DonateWithRevPointsBottomSheet[i];
            }
        }

        private DonateWithRevPointsBottomSheet() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step$SpareChange;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpareChange implements CharityDetailsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<SpareChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final yvh.b f72066b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpareChange(parcel.readString(), (yvh.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpareChange[i];
            }
        }

        public SpareChange(String charityId, yvh.b bVar) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f72065a = charityId;
            this.f72066b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpareChange)) {
                return false;
            }
            SpareChange spareChange = (SpareChange) obj2;
            return Intrinsics.f(this.f72065a, spareChange.f72065a) && Intrinsics.f(this.f72066b, spareChange.f72066b);
        }

        public final int hashCode() {
            int iHashCode = this.f72065a.hashCode() * 31;
            yvh.b bVar = this.f72066b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72065a);
            dest.writeSerializable(this.f72066b);
        }
    }
}
