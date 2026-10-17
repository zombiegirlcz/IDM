package com.revolut.feature.donations.api.model.quote;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/donations/api/model/quote/DonationQuoteRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DonationQuoteRequest implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71966b;

    @NotNull
    public static final Parcelable.Creator<DonationQuoteRequest> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DonationQuoteRequest((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonationQuoteRequest[i];
        }
    }

    public DonationQuoteRequest(d amount, String charityId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f71965a = amount;
        this.f71966b = charityId;
    }

    public final String a() {
        d dVar = this.f71965a;
        return a.s("DonationQuoteRequest(amount=", "Money(amount=" + dVar.f115082a + ", currency=Currency(code=" + dVar.f115083b.f306286a + ", fractionDigits=null, displayFractionDigits=null))", ", charityId=", this.f71966b, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DonationQuoteRequest)) {
            return false;
        }
        DonationQuoteRequest donationQuoteRequest = (DonationQuoteRequest) obj2;
        return Intrinsics.f(this.f71965a, donationQuoteRequest.f71965a) && Intrinsics.f(this.f71966b, donationQuoteRequest.f71966b);
    }

    public final int hashCode() {
        return this.f71966b.hashCode() + (this.f71965a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71965a);
        dest.writeString(this.f71966b);
    }
}
