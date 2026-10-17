package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_common.data.model.Document;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MtaQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f75256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f75257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FuturePriceChange f75258c;
    public final OneTimePayment d;
    public final Document e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaQuote((ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : FuturePriceChange.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OneTimePayment.CREATOR.createFromParcel(parcel) : null, (Document) parcel.readParcelable(MtaQuote.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaQuote[i];
        }
    }

    public MtaQuote(ZonedDateTime effectiveFromDateTime, ZonedDateTime zonedDateTime, FuturePriceChange futurePriceChange, OneTimePayment oneTimePayment, Document suitabilityStatement) {
        Intrinsics.checkNotNullParameter(effectiveFromDateTime, "effectiveFromDateTime");
        Intrinsics.checkNotNullParameter(suitabilityStatement, "suitabilityStatement");
        this.f75256a = effectiveFromDateTime;
        this.f75257b = zonedDateTime;
        this.f75258c = futurePriceChange;
        this.d = oneTimePayment;
        this.e = suitabilityStatement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaQuote)) {
            return false;
        }
        MtaQuote mtaQuote = (MtaQuote) obj2;
        return Intrinsics.f(this.f75256a, mtaQuote.f75256a) && Intrinsics.f(this.f75257b, mtaQuote.f75257b) && Intrinsics.f(this.f75258c, mtaQuote.f75258c) && Intrinsics.f(this.d, mtaQuote.d) && Intrinsics.f(this.e, mtaQuote.e);
    }

    public final int hashCode() {
        int iHashCode = this.f75256a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f75257b;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        FuturePriceChange futurePriceChange = this.f75258c;
        int iHashCode3 = (iHashCode2 + (futurePriceChange == null ? 0 : futurePriceChange.hashCode())) * 31;
        OneTimePayment oneTimePayment = this.d;
        return this.e.hashCode() + ((iHashCode3 + (oneTimePayment != null ? oneTimePayment.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f75256a);
        dest.writeSerializable(this.f75257b);
        FuturePriceChange futurePriceChange = this.f75258c;
        if (futurePriceChange == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            futurePriceChange.writeToParcel(dest, i);
        }
        OneTimePayment oneTimePayment = this.d;
        if (oneTimePayment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            oneTimePayment.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
    }
}
