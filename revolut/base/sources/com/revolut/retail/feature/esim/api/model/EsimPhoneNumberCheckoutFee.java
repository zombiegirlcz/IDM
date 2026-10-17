package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.Period;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberCheckoutFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberCheckoutFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberCheckoutFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f100321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f100322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimMobilePlanPointsOption f100323c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberCheckoutFee((d) parcel.readSerializable(), (Period) parcel.readSerializable(), parcel.readInt() == 0 ? null : EsimMobilePlanPointsOption.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberCheckoutFee[i];
        }
    }

    public EsimPhoneNumberCheckoutFee(d amount, Period period, EsimMobilePlanPointsOption esimMobilePlanPointsOption) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f100321a = amount;
        this.f100322b = period;
        this.f100323c = esimMobilePlanPointsOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberCheckoutFee)) {
            return false;
        }
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = (EsimPhoneNumberCheckoutFee) obj2;
        return Intrinsics.f(this.f100321a, esimPhoneNumberCheckoutFee.f100321a) && Intrinsics.f(this.f100322b, esimPhoneNumberCheckoutFee.f100322b) && Intrinsics.f(this.f100323c, esimPhoneNumberCheckoutFee.f100323c);
    }

    public final int hashCode() {
        int iHashCode = this.f100321a.hashCode() * 31;
        Period period = this.f100322b;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = this.f100323c;
        return iHashCode2 + (esimMobilePlanPointsOption != null ? esimMobilePlanPointsOption.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100321a);
        dest.writeSerializable(this.f100322b);
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = this.f100323c;
        if (esimMobilePlanPointsOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanPointsOption.writeToParcel(dest, i);
        }
    }
}
