package com.revolut.feature.credit.card.impl.widget.collateral;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.creditcard.WithdrawalAvailability;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ll4.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/widget/collateral/WithdrawalWidgetParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WithdrawalWidgetParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawalWidgetParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WithdrawalAvailability f69784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f69785c;
    public final b0 d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawalWidgetParcel(parcel.readString(), (WithdrawalAvailability) parcel.readParcelable(WithdrawalWidgetParcel.class.getClassLoader()), parcel.readLong(), b0.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WithdrawalWidgetParcel[i];
        }
    }

    public WithdrawalWidgetParcel(String facilityId, WithdrawalAvailability withdrawalAvailability, long j2, b0 securityCoverage, d spent) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(withdrawalAvailability, "withdrawalAvailability");
        Intrinsics.checkNotNullParameter(securityCoverage, "securityCoverage");
        Intrinsics.checkNotNullParameter(spent, "spent");
        this.f69783a = facilityId;
        this.f69784b = withdrawalAvailability;
        this.f69785c = j2;
        this.d = securityCoverage;
        this.e = spent;
    }

    public final boolean a() {
        return this.e.f115082a > this.f69784b.f68760b.f115082a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WithdrawalWidgetParcel)) {
            return false;
        }
        WithdrawalWidgetParcel withdrawalWidgetParcel = (WithdrawalWidgetParcel) obj2;
        return Intrinsics.f(this.f69783a, withdrawalWidgetParcel.f69783a) && Intrinsics.f(this.f69784b, withdrawalWidgetParcel.f69784b) && this.f69785c == withdrawalWidgetParcel.f69785c && this.d == withdrawalWidgetParcel.d && Intrinsics.f(this.e, withdrawalWidgetParcel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a0.d.c((this.f69784b.hashCode() + (this.f69783a.hashCode() * 31)) * 31, 31, this.f69785c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69783a);
        dest.writeParcelable(this.f69784b, i);
        dest.writeLong(this.f69785c);
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
    }
}
