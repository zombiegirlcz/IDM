package com.revolut.feature.rev_points.impl.ui.wrapped.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/wrapped/cards/RevPointsWrappedCardsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsWrappedCardsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsWrappedCardsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f83933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f83934b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsWrappedCardsScreenContract$InputData((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsWrappedCardsScreenContract$InputData[i];
        }
    }

    public RevPointsWrappedCardsScreenContract$InputData(LocalDate localDate, LocalDate localDate2) {
        this.f83933a = localDate;
        this.f83934b = localDate2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsWrappedCardsScreenContract$InputData)) {
            return false;
        }
        RevPointsWrappedCardsScreenContract$InputData revPointsWrappedCardsScreenContract$InputData = (RevPointsWrappedCardsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f83933a, revPointsWrappedCardsScreenContract$InputData.f83933a) && Intrinsics.f(this.f83934b, revPointsWrappedCardsScreenContract$InputData.f83934b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f83933a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f83934b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f83933a);
        dest.writeSerializable(this.f83934b);
    }
}
