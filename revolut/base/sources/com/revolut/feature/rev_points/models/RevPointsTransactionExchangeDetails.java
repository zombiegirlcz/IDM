package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsTransactionExchangeDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTransactionExchangeDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsTransactionExchangeDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransactionExchangeRate f84067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsTransactionExchangeAmount f84068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsTransactionExchangeAmount f84069c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsTransactionExchangeDetails(RevPointsTransactionExchangeRate.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RevPointsTransactionExchangeAmount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RevPointsTransactionExchangeAmount.CREATOR.createFromParcel(parcel) : null, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTransactionExchangeDetails[i];
        }
    }

    public RevPointsTransactionExchangeDetails(RevPointsTransactionExchangeRate rate, RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount, RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount2, d dVar) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f84067a = rate;
        this.f84068b = revPointsTransactionExchangeAmount;
        this.f84069c = revPointsTransactionExchangeAmount2;
        this.d = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsTransactionExchangeDetails)) {
            return false;
        }
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails = (RevPointsTransactionExchangeDetails) obj2;
        return Intrinsics.f(this.f84067a, revPointsTransactionExchangeDetails.f84067a) && Intrinsics.f(this.f84068b, revPointsTransactionExchangeDetails.f84068b) && Intrinsics.f(this.f84069c, revPointsTransactionExchangeDetails.f84069c) && Intrinsics.f(this.d, revPointsTransactionExchangeDetails.d);
    }

    public final int hashCode() {
        int iHashCode = this.f84067a.hashCode() * 31;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = this.f84068b;
        int iHashCode2 = (iHashCode + (revPointsTransactionExchangeAmount == null ? 0 : revPointsTransactionExchangeAmount.hashCode())) * 31;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount2 = this.f84069c;
        int iHashCode3 = (iHashCode2 + (revPointsTransactionExchangeAmount2 == null ? 0 : revPointsTransactionExchangeAmount2.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84067a.writeToParcel(dest, i);
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = this.f84068b;
        if (revPointsTransactionExchangeAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionExchangeAmount.writeToParcel(dest, i);
        }
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount2 = this.f84069c;
        if (revPointsTransactionExchangeAmount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionExchangeAmount2.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.d);
    }
}
