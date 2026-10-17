package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsTransactionExchangeRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTransactionExchangeRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsTransactionExchangeRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransactionExchangeAmount f84070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsTransactionExchangeAmount f84071b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<RevPointsTransactionExchangeAmount> creator = RevPointsTransactionExchangeAmount.CREATOR;
            return new RevPointsTransactionExchangeRate(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTransactionExchangeRate[i];
        }
    }

    public RevPointsTransactionExchangeRate(RevPointsTransactionExchangeAmount fromValue, RevPointsTransactionExchangeAmount toValue) {
        Intrinsics.checkNotNullParameter(fromValue, "fromValue");
        Intrinsics.checkNotNullParameter(toValue, "toValue");
        this.f84070a = fromValue;
        this.f84071b = toValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsTransactionExchangeRate)) {
            return false;
        }
        RevPointsTransactionExchangeRate revPointsTransactionExchangeRate = (RevPointsTransactionExchangeRate) obj2;
        return Intrinsics.f(this.f84070a, revPointsTransactionExchangeRate.f84070a) && Intrinsics.f(this.f84071b, revPointsTransactionExchangeRate.f84071b);
    }

    public final int hashCode() {
        return this.f84071b.hashCode() + (this.f84070a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84070a.writeToParcel(dest, i);
        this.f84071b.writeToParcel(dest, i);
    }
}
