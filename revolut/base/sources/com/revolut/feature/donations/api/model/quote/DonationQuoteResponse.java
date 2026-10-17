package com.revolut.feature.donations.api.model.quote;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/donations/api/model/quote/DonationQuoteResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DonationQuoteResponse implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f71968b;

    @NotNull
    public static final Parcelable.Creator<DonationQuoteResponse> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DonationQuoteResponse((d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonationQuoteResponse[i];
        }
    }

    public DonationQuoteResponse(d charityCreditAmount, BigDecimal charityCreditRate) {
        Intrinsics.checkNotNullParameter(charityCreditAmount, "charityCreditAmount");
        Intrinsics.checkNotNullParameter(charityCreditRate, "charityCreditRate");
        this.f71967a = charityCreditAmount;
        this.f71968b = charityCreditRate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DonationQuoteResponse)) {
            return false;
        }
        DonationQuoteResponse donationQuoteResponse = (DonationQuoteResponse) obj2;
        return Intrinsics.f(this.f71967a, donationQuoteResponse.f71967a) && Intrinsics.f(this.f71968b, donationQuoteResponse.f71968b);
    }

    public final int hashCode() {
        return this.f71968b.hashCode() + (this.f71967a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71967a);
        dest.writeSerializable(this.f71968b);
    }
}
