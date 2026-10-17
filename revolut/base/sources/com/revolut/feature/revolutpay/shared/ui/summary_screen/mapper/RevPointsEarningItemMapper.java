package com.revolut.feature.revolutpay.shared.ui.summary_screen.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.EarningRepresentation;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RevPointsEarningItemMapper {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/summary_screen/mapper/RevPointsEarningItemMapper$RevPointsEarningParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsEarningParcel implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RevPointsEarningParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EarningRepresentation f84732b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsEarningParcel(((RevPoints) parcel.readParcelable(RevPointsEarningParcel.class.getClassLoader())).f84427a, (EarningRepresentation) parcel.readParcelable(RevPointsEarningParcel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsEarningParcel[i];
            }
        }

        public RevPointsEarningParcel(long j2, EarningRepresentation earningRepresentation) {
            Intrinsics.checkNotNullParameter(earningRepresentation, "earningRepresentation");
            this.f84731a = j2;
            this.f84732b = earningRepresentation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsEarningParcel)) {
                return false;
            }
            RevPointsEarningParcel revPointsEarningParcel = (RevPointsEarningParcel) obj2;
            return RevPoints.a(this.f84731a, revPointsEarningParcel.f84731a) && Intrinsics.f(this.f84732b, revPointsEarningParcel.f84732b);
        }

        public final int hashCode() {
            return this.f84732b.hashCode() + (Long.hashCode(this.f84731a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new RevPoints(this.f84731a), i);
            dest.writeParcelable(this.f84732b, i);
        }
    }
}
